package activitytracker;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class TrackPointRepository {
    private JdbcTemplate jdbcTemplate;

    public TrackPointRepository(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }

    public void saveTrackPoints(List<TrackPoint> trackPoints, long activityId) {
        if (!trackPoints.stream().allMatch(TrackPoint::isValid)) {
            throw new IllegalStateException("There are some invalid track points!");
        }
        for (TrackPoint actual: trackPoints) {//language=sql
            jdbcTemplate.update("INSERT INTO track_point VALUES (?, ?, ?, ?);",
                    activityId, actual.getTime(), actual.getLat(), actual.getLon());
        }
    }
}
