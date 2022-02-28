package activitytracker;

import activity.ActivityType;
import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityTemplateMain {
    public static void main(String[] args) {
        Activity biking1 = new Activity(LocalDateTime.of(2021, 10, 22, 10, 30),
                "Pallag oda-vissza", ActivityType.BIKING);
        Activity running = new Activity(LocalDateTime.of(2021, 10, 28, 16,0),
                "Belvárosi kocogás", ActivityType.RUNNING);
        Activity biking2 = new Activity(LocalDateTime.of(2021, 11, 3, 11, 10),
                "Józsa oda-vissza", ActivityType.BIKING);
        Activity basketBall = new Activity(LocalDateTime.of(2021, 12, 3, 16, 45),
                "Csapat építés", ActivityType.BASKETBALL);

        ActivityTemplateMain aTmplM = new ActivityTemplateMain();
        DataSource ds = aTmplM.connectMariaDB(
                "jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true",
                "activitytracker", "activitytracker");
        ActivityRepository activityRepo = new ActivityRepository(ds);
        Flyway flyway = Flyway.configure().dataSource(ds).load();
        flyway.clean();
        flyway.migrate();

        activityRepo.saveActivity(biking1);
        activityRepo.saveActivities(List.of(running, biking2, basketBall));

        System.out.println(activityRepo.findActivityById(2));
    }

    public MariaDbDataSource connectMariaDB(String sqlUrl, String user, String password) {
        MariaDbDataSource mdbDataSource = new MariaDbDataSource();
        try {
            mdbDataSource.setUrl(sqlUrl);
            mdbDataSource.setUser(user);
            mdbDataSource.setPassword(password);
            return mdbDataSource;
        } catch (SQLException sqlE) {
            throw new IllegalStateException("Can not connect to MariaDB", sqlE);
        }
    }
}
