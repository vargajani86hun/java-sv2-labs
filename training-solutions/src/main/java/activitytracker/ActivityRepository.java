package activitytracker;

import activity.ActivityType;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.List;

public class ActivityRepository {
    //language=sql
    private static final String FULL_INSERT_QUERY =
            "INSERT INTO activities (`start_time`, `description`, `activity_type`) VALUES (?, ?, ?);";

    private JdbcTemplate jdbcTemplate;

    public ActivityRepository(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }

    public void saveActivity(Activity activity) { //language=sql
        jdbcTemplate.update(FULL_INSERT_QUERY,
                activity.getStartTime(), activity.getDescription(), activity.getType().toString());
    }



    public long saveActivityAndGetGeneratedId(Activity activity) { //language=sql
        KeyHolder holder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(
                    FULL_INSERT_QUERY,
                    Statement.RETURN_GENERATED_KEYS);
            ps.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            ps.setString(2, activity.getDescription());
            ps.setString(3, activity.getType().toString());
            return ps;
        }, holder);

        return holder.getKey().longValue();
    }

    public void saveActivities(List<Activity> activities) {
        for(Activity actual: activities) {
            saveActivity(actual);
        }
    }

    public List<Activity> readActivities() {//language=sql
        return jdbcTemplate.query("SELECT * FROM activities", (rs, rowNum) ->
             new Activity(rs.getLong("id"), rs.getTimestamp("start_time").toLocalDateTime(),
                    rs.getString("description"), ActivityType.valueOf(rs.getString("activity_type"))));
    }

    public Activity findActivityById(long id) {//language=sql
        return jdbcTemplate.queryForObject("SELECT * FROM activities WHERE id = ?",
                (rs, rowNum) -> new Activity(rs.getLong("id"),
                        rs.getTimestamp("start_time").toLocalDateTime(),
                        rs.getString("description"),
                        ActivityType.valueOf(rs.getString("activity_type"))),
                id);
    }
}
