package activitytracker;

import activity.ActivityType;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

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

        MariaDbDataSource ds = atm.connectMariaDB("activitytracker", "activitytracker");
        atm.insertActivityToDB(biking1, ds);
        atm.insertActivityToDB(running, ds);
        atm.insertActivityToDB(biking2, ds);
        atm.insertActivityToDB(basketBall, ds);

    }

    private MariaDbDataSource connectMariaDB(String user, String password) {
        MariaDbDataSource mdbDataSource = new MariaDbDataSource();
        try {
            mdbDataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            mdbDataSource.setUser(user);
            mdbDataSource.setPassword(password);
            return mdbDataSource;
        } catch (SQLException sqlE) {
            throw new IllegalStateException("Unable to connect with MariaDB", sqlE);
        }
    }

    private void insertActivityToDB(Activity activity, DataSource ds) {
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
}
