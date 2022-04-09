package covid;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

public class CitizenService {//language=sql

    private final String ADD_CITIZEN_SQL_QUERY = "INSERT INTO citizens (" +
            "`citizen_name`, `zip_code`, `age`, `e-mail`, `social_security_number`)" +
            "VALUES (?, ?, ?, ?, ?);";

    private JdbcTemplate jdbcTemplate;

    public CitizenService(DataSource ds) {
        jdbcTemplate = new JdbcTemplate(ds);
    }

    public long registerCitizen(Citizen citizen) {
        KeyHolder kh = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(ADD_CITIZEN_SQL_QUERY, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, citizen.getCitizenName());
            ps.setString(2, citizen.getZipCode());
            ps.setInt(3, citizen.getAge());
            ps.setString(4, citizen.getEmail());
            ps.setString(5, citizen.getSocialSecurityNumber());
            return ps;
        }, kh);
        return kh.getKey().longValue();
    }

    public long registerCitizen(String citizenName, String zipCode, int age, String email, String ssn) {
        return registerCitizen(new Citizen(citizenName, zipCode, age, email, ssn));
    }

    public void registerCitizens(List<Citizen> citizens) {
        citizens.forEach(c -> this.registerCitizen(c));
    }
}
