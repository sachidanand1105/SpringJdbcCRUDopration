package in.sp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig {

	@Bean
	public DriverManagerDataSource myDataSource() {
		
		DriverManagerDataSource datasource= new DriverManagerDataSource();
		
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3307/spring_db");
		datasource.setUsername("root");
		datasource.setPassword("root1");
		
		return datasource;
	}
	
	@Bean
	public JdbcTemplate myJdbcTemplate() {
		
		JdbcTemplate jdbcTemplate= new JdbcTemplate();
		jdbcTemplate.setDataSource(myDataSource());
		
		return jdbcTemplate;
		
	}
	
	
}
