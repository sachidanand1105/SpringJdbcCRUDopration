package in.sp.mains;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import in.sp.bean.Student;
import in.sp.configuration.SpringConfig;
import in.sp.rowMapper.StudentRowMapper;

public class App {
	public static void main(String[] args) {

		int std_rollno = 13;
		String std_name = "Deepanshu Chaudhary";
		float std_marks = 90.0f;

		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);

		/*
		 * String insertQuery="INSERT INTO student values(?,?,?)"; int
		 * count=jdbcTemplate.update(insertQuery,std_rollno,std_name,std_marks);
		 * 
		 * if(count>0) {
		 * 
		 * System.out.println("Insertion Successfull"); } else {
		 * 
		 * System.out.println("Insertion Unsuccessfull"); }
		 */

		/*
		 * String
		 * updateQuery="UPDATE student set std_marks=?,std_name=? where std_roll=?"; int
		 * count=jdbcTemplate.update(updateQuery,std_marks, std_name,std_rollno);
		 * 
		 * if(count>0) {
		 * 
		 * System.out.println("Updated Sucessfully"); } else {
		 * 
		 * System.out.println("Unsucessfull"); }
		 */

		/*
		 * String deleteQuery="DELETE from student where std_roll=?";
		 * 
		 * int count=jdbcTemplate.update(deleteQuery,std_rollno);
		 * 
		 * if(count>0) { System.out.println("Deleted Sucessfully"); }
		 * 
		 * else {
		 * 
		 * System.out.println("Unsucessfull"); }
		 */

		String selectQuery = "select * from student";
		List<Student> std_list = jdbcTemplate.query(selectQuery, new StudentRowMapper());

		for (Student std : std_list) {

			System.out.println("RollNo: " + std.getStd_roll());
			System.out.println("Name: " + std.getStd_name());
			System.out.println("Marks: " + std.getStd_marks());
			System.out.println("======================================");

		}

//		String selectQuery = "select * from student where std_roll=?";
//		Student std = jdbcTemplate.queryForObject(selectQuery, new StudentRowMapper(), 18);
//
//		System.out.println("RollNo: " + std.getStd_roll());
//		System.out.println("Name: " + std.getStd_name());
//		System.out.println("Marks: " + std.getStd_marks());
//		System.out.println("======================================");

	}
}
