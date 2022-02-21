package activitytracker;

import activity.ActivityType;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityTrackerMain {
    public static void main(String[] args) {
        Activity biking1 = new Activity(1, LocalDateTime.of(2021, 10, 22, 10, 30),
                "Pallag oda-vissza", ActivityType.BIKING);
        Activity running = new Activity(2, LocalDateTime.of(2021, 10, 28, 16,0),
                "Belvárosi kocogás", ActivityType.RUNNING);
        Activity biking2 = new Activity(3, LocalDateTime.of(2021, 11, 3, 11, 10),
                "Józsa oda-vissza", ActivityType.BIKING);
        Activity basketBall = new Activity(4, LocalDateTime.of(2021, 12, 3, 16, 45),
                "Csapat építés", ActivityType.BASKETBALL);
        ActivityTrackerMain atm = new ActivityTrackerMain();

        MariaDbDataSource ds = atm.connectMariaDB("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true", "activitytracker", "activitytracker");
        atm.insertActivityToDB(biking1, ds);
        atm.insertActivityToDB(running, ds);
        atm.insertActivityToDB(biking2, ds);
        atm.insertActivityToDB(basketBall, ds);

        System.out.println(atm.getActivitiesFromDB(ds));

    }

    public MariaDbDataSource connectMariaDB(String sqlUrl, String user, String password) {
        MariaDbDataSource mdbDataSource = new MariaDbDataSource();
        try {
            mdbDataSource.setUrl(sqlUrl);
            mdbDataSource.setUser(user);
            mdbDataSource.setPassword(password);
            return mdbDataSource;
        } catch (SQLException sqlE) {
            throw new IllegalStateException("Unable to connect with MariaDB", sqlE);
        }
    }

    public void insertActivityToDB(Activity activity, DataSource ds) {
        try (//language=sql
             Connection conn = ds.getConnection();
             PreparedStatement pStmt = conn.prepareStatement(
                     "INSERT INTO activities (start_time, `description`, activity_type) VALUES (?, ?, ?);"
             )) {
            pStmt.setTimestamp(1, java.sql.Timestamp.valueOf(activity.getStartTime()));
            pStmt.setString(2, activity.getDescription());
            pStmt.setString(3, activity.getType().toString());
            pStmt.executeUpdate();
        } catch (SQLException sqlE) {
            throw new IllegalStateException("Cannot make insert", sqlE);
        }
    }

    public List<Activity> getActivitiesFromDB(DataSource ds) {
        try (Connection conn = ds.getConnection();
             Statement stmt = conn.createStatement()) {//language=sql

            try (ResultSet rs = stmt.executeQuery("SELECT * FROM activities")) {
                return getActivitiesFromResultSet(rs);
            }

        } catch (SQLException sqle) {
            throw new IllegalStateException("Unable to read DB", sqle);
        }
    }

    private List<Activity> getActivitiesFromResultSet(ResultSet rs) throws SQLException{
        List<Activity> results = new ArrayList<>();
        while(rs.next()) {
            results.add(new Activity(rs.getInt("id"),
                    rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("description"),
                    ActivityType.valueOf(rs.getString("activity_type"))));
        }
        return results;
    }
}
