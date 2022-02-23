package activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ActivityDao {

    private DataSource ds;

    public ActivityDao(DataSource ds) {
        this.ds = ds;
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

    public Activity findActivityById(long id) {
        try (Connection conn = ds.getConnection();
             //language=sql
             PreparedStatement stmt = conn.prepareStatement(
                     "SELECT * FROM activities WHERE id = ?;"
             )) {
            stmt.setLong(1, id);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new Activity(id,
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"),
                        activity.ActivityType.valueOf(rs.getString("activity_type")));
            }

            throw new IllegalArgumentException("Cannot find activity with id " + id);

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
}
