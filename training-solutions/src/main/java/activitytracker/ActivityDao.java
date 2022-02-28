package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    //language=sql
    private static final String FULL_INSERT_INTO_ACTIVITY_QUERY =
            "INSERT INTO activities (`start_time`, `description`, `activity_type`) VALUES (?, ?, ?);";

    private DataSource ds;

    public ActivityDao(DataSource ds) {
        this.ds = ds;
    }

    public Activity findActivityById(long id) {
        try (Connection conn = ds.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM activities WHERE id = ?;"
             )) {
            stmt.setLong(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                return getActivityByIdFromResultSet(rs, id);
            }

        } catch (SQLException sqle) {
            throw new IllegalStateException("Unable to execute query", sqle);
        }
    }

    public List<Activity> listActivities() {
        try (Connection conn = ds.getConnection();
            Statement stmt = conn.createStatement();
            //language=sql
            ResultSet rs = stmt.executeQuery(
                    "SELECT * FROM activities;"
            )) {

            return getActivities(rs);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Unable to read db", sqle);
        }
    }

    public List<Activity> listActivitiesWithTrackPoints() {
        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement();
             //language=sql
             ResultSet rs = stmt.executeQuery(
                     "SELECT * FROM activities;"
             )) {

            return getActivitiesWithTrackPoints(rs, conn);

        } catch (SQLException sqle) {
            throw new IllegalStateException("Unable to read db", sqle);
        }
    }

    public void saveActivity(Activity activity) {
        try (Connection conn = ds.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO activities (`start_time`, `description`, `activity_type`)" +
                             "VALUES (?, ?, ?);"
             )) {

            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDescription());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Unable to insert", sqle);
        }
    }

    public Activity saveActivityAndReturnNewWithGenId(Activity activity) {
        try (Connection conn = ds.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement(
                     FULL_INSERT_INTO_ACTIVITY_QUERY, Statement.RETURN_GENERATED_KEYS
             )) {

            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDescription());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

            return new Activity(getGeneratedId(stmt), activity);
        } catch (SQLException sqle) {
            throw new IllegalStateException("Unable to insert", sqle);
        }
    }

    public void saveActivityWithTrackPoints(Activity activity) {
        try (Connection conn = ds.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement(
                     FULL_INSERT_INTO_ACTIVITY_QUERY, Statement.RETURN_GENERATED_KEYS
             )) {
            conn.setAutoCommit(false);
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDescription());
            stmt.setString(3, activity.getType().toString());
            stmt.executeUpdate();

            try {
                saveTrackPoints(getGeneratedId(stmt), activity.getTrackPoints(), conn);
                conn.commit();
            } catch (IllegalStateException ise) {
                conn.rollback();
                throw ise;
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Unable to insert!", sqle);
        }
    }

    private List<Activity> getActivities(ResultSet rs) throws SQLException{
        List<Activity> results = new ArrayList<>();

        while (rs.next()) {
            results.add(new Activity(
                    rs.getLong("id"),
                    rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("description"),
                    activity.ActivityType.valueOf(rs.getString("activity_type"))
            ));
        }

        return results;
    }

    private List<Activity> getActivitiesWithTrackPoints(ResultSet rs, Connection conn) throws SQLException{
        List<Activity> results = new ArrayList<>();

        while (rs.next()) {
            long id = rs.getLong("id");
            try (//language=sql
                    PreparedStatement stmt = conn.prepareStatement(
                            "SELECT * FROM track_point WHERE id = ?"
                    )) {
                stmt.setLong(1, id);
                results.add(getActivityByIdWithTrackPointsFromResultSet(rs, id, stmt));
            }
        }

        return results;
    }

    private Activity getActivityByIdWithTrackPointsFromResultSet(ResultSet rs,  long id, PreparedStatement stmt) throws SQLException {
        try (ResultSet trackPointRS = stmt.executeQuery()) {
            return (new Activity(
                    id,
                    rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("description"),
                    activity.ActivityType.valueOf(rs.getString("activity_type")),
                    getTrackPoints(trackPointRS)
            ));
        }
    }

    private Activity getActivityByIdFromResultSet(ResultSet rs, long id) throws SQLException{
        if (rs.next()) {
            return new Activity(id,
                    rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("description"),
                    activity.ActivityType.valueOf(rs.getString("activity_type")));
        }

        throw new IllegalArgumentException("Cannot find activity with id " + id);
    }

    private long getGeneratedId(PreparedStatement pst) throws SQLException{
        try (ResultSet rs = pst.getGeneratedKeys()) {
            if (rs.next()) {
                return rs.getLong(1);
            } else {
                throw new IllegalStateException("Key has not generated.");
            }
        }
    }

    private List<TrackPoint> getTrackPoints(ResultSet rs) throws SQLException{
        List<TrackPoint> results = new ArrayList<>();
        while (rs.next()) {
            results.add(new TrackPoint(rs.getLong("id"),
                            rs.getDate("tp_time").toLocalDate(),
                            rs.getDouble("lat"),
                            rs.getDouble("lon")));
        }
        return results;
    }

    private void saveTrackPoints(long activityId, List<TrackPoint> trackPoints, Connection conn) throws SQLException{
        try (//language=sql
                PreparedStatement stmt = conn.prepareStatement(
                "INSERT INTO track_point VALUES (?, ?, ?, ?);"
        )) {
            for (TrackPoint tp : trackPoints) {
                if (!tp.isValid()) {
                    throw new IllegalStateException("Track point has invalid coordinates.");
                }
                stmt.setLong(1, activityId);
                stmt.setDate(2, Date.valueOf(tp.getTime()));
                stmt.setDouble(3, tp.getLat());
                stmt.setDouble(4, tp.getLon());
                stmt.executeUpdate();
            }
        }
    }
}
