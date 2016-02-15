package ph.edu.stpaul.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import ph.edu.stpaul.domain.User;

public class UserDAO {
	private JdbcTemplate jdbcTemplate;

	public UserDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public User getUserByUsername(final String username) {
		RowMapper<User> mapper = new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) {
				try {
					User user = new User();
					user.setId(rs.getString("id"));
					user.setUsername(rs.getString("username"));
					user.setPassword(rs.getString("password"));
					user.setType(rs.getString("type"));
					return user;
				} catch (SQLException e) {
					// using created custom exception DataAccessException to avoid throwing SQLexception on method signature for maintainability
					throw new DataAccessException("Having Trouble getting user by username", e);
				}
			}
		};

		String SQL = "select id, username, password, type from users where username = ?";
		try {
			return jdbcTemplate.queryForObject(SQL, new Object[] { username }, mapper);
		} catch (EmptyResultDataAccessException emptyException) {
			return null;
		}
	}
}