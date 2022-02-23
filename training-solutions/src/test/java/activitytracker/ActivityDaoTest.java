package activitytracker;

import activity.ActivityType;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;


import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ActivityDaoTest {

    private MariaDbDataSource ds;
    private ActivityDao activityDao;
    private List<Activity> activities;
    Flyway flyway;

    @BeforeEach
    void init() throws SQLException {
        ds = new MariaDbDataSource();
        ds.setUrl("jdbc:mariadb://localhost:3306/activitytracker_test?useUnicode=true");
        ds.setUser("activitytracker");
        ds.setPassword("activitytracker");

        activityDao = new ActivityDao(ds);
        flyway = Flyway.configure().dataSource(ds).load();
        flyway.clean();
        flyway.migrate();

        initActivities();
    }

    @Test
    void testSaveActivity() {
        Activity biking = new Activity(1, LocalDateTime.of(2021, 10, 22, 10, 30),
                "Pallag oda-vissza", ActivityType.BIKING);
        activityDao.saveActivity(biking);

        assertEquals(List.of(biking), activityDao.listActivities());
    }

    @Test
    void testFindActivityById() {
        for (Activity a: activities) {
            activityDao.saveActivity(a);
        }

        assertEquals(activities.get(2), activityDao.findActivityById(3));
        IllegalArgumentException iae = assertThrows(IllegalArgumentException.class,
                () -> activityDao.findActivityById(5));
        assertEquals("Cannot find activity with id 5", iae.getMessage());
    }

    @Test
    void testListActivities() {
        for (Activity a: activities) {
            activityDao.saveActivity(a);
        }

        assertEquals(activities, activityDao.listActivities());
    }

    private void initActivities() {
        activities = List.of(
                new Activity(1, LocalDateTime.of(2021, 10, 22, 10, 30),
                        "Pallag oda-vissza", ActivityType.BIKING),
                new Activity(2, LocalDateTime.of(2021, 10, 28, 16,0),
                        "Belvárosi kocogás", ActivityType.RUNNING),
                new Activity(3, LocalDateTime.of(2021, 11, 3, 11, 10),
                        "Józsa oda-vissza", ActivityType.BIKING),
                new Activity(4, LocalDateTime.of(2021, 12, 3, 16, 45),
                        "Csapat építés", ActivityType.BASKETBALL)
        );
    }
}