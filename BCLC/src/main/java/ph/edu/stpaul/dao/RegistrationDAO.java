package ph.edu.stpaul.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ph.edu.stpaul.domain.Registration;

public class RegistrationDAO {
	private JdbcTemplate jdbcTemplate;

	public RegistrationDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public List<Registration> getRegistrations(final String schoolYear, final String filter, final int start, final int length) {
		RowMapper<Registration> mapper = new RowMapper<Registration>() {
			@Override
			public Registration mapRow(ResultSet rs, int rowNum) throws SQLException {
				Registration registration = new Registration(rs.getString("student_id"));
				registration.setId(rs.getString("id"));
				registration.setSchoolYear(rs.getString("school_year"));
				registration.setFirstName(rs.getString("first_name"));
				registration.setMiddleName(rs.getString("middle_name"));
				registration.setLastName(rs.getString("last_name"));
				registration.setAddress(rs.getString("address"));
				return registration;
			}
		};
		
		try {
			final String likeSchoolYear = "%" + schoolYear + "%";
			final String likeFilter = "%" + filter + "%";
			final String SQL = "select id, school_year, student_id, first_name, middle_name, last_name, address from registrations where school_year like ? and (student_id like ? or first_name like ? or middle_name like ? or last_name like ? or address like ?) limit ?, ?";
			return jdbcTemplate.query(SQL, new Object[] { likeSchoolYear, likeFilter, likeFilter, likeFilter, likeFilter, likeFilter, start, length }, mapper);
		} catch (EmptyResultDataAccessException emptyException) {
			return null;
		}
	}

	public void addRegistration(Registration registration) {
		String SQL = "insert into registrations (student_type, school_year, student_id, first_name, middle_name, last_name, birth_date, gender, religion, birth_place, address, father_first_name, father_middle_name, father_last_name, father_occupation, father_landline_number, father_mobile_number, mother_first_name, mother_middle_name, mother_last_name, mother_occupation, mother_landline_number, mother_mobile_number, level, cluster, adviser, schedule, start_time, end_time) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(SQL, registration.getStudentType(), registration.getSchoolYear(), registration.getStudentId(), registration.getFirstName(), registration.getMiddleName(), registration.getLastName(), registration.getBirthDate(), registration.getGender(), registration.getReligion(), registration.getBirthPlace(), registration.getAddress(), registration.getFatherFirstName(), registration.getFatherMiddleName(), registration.getFatherLastName(), registration.getFatherOccupation(), registration.getFatherLandlineNumber(), registration.getFatherMobileNumber(), registration.getMotherFirstName(), registration.getMotherMiddleName(), registration.getMotherLastName(), registration.getMotherOccupation(), registration.getMotherLandlineNumber(), registration.getMotherMobileNumber(), registration.getLevel(), registration.getCluster(), registration.getAdviser(), registration.getSchedule(), registration.getStartTime(), registration.getEndTime());
	}

	public void updateRegistration(Registration registration) {
		String SQL = "update registrations set value student_type = ?, school_year = ? where id = ?";
		jdbcTemplate.update(SQL, registration.getStudentType(), registration.getSchoolYear(), registration.getId());
	}

	public void deleteRegistration(Registration registration) {
		String SQL = "delete registrations where id = ?";
		jdbcTemplate.update(SQL, registration.getId());
	}
}