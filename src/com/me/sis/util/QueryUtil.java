package com.me.sis.util;

public class QueryUtil {
	////////////// Student Section////////////////////
	public static final String SAVE_STUDENT = "insert into student_details(student_name, college_name, gender, departments, subject, roll, dob, email)values(?,?,?,?,?,?,?,?)";
	public static final String UPDATE_STUDENT = "update student_details set student_name=?, college_name=?, roll=?, dob=?, gender=?, subject=?, departments=?, email=? where id=?";
	public static final String LIST_STUDENT = "select * from student_details";
	public static final String GET_STUDENT_BY_ID = "select * from student_details where id=?";
	public static final String DELETE_STUDENT = "delete from student_details where id=?";
	//////////////// User Section////////////////
	public static final String CREATE_USER = "INSERT INTO users (first_name,last_name, email, dob, username, password) VALUES (?,?,?,?,?,?)";
	public static final String GET_ALL_USER = "SELECT * from users";
	public static final String DELETE_USER = "DELETE from users where user_id=?";
	public static final String UPDATE_USER = "UPDATE users SET first_name=?,last_name=?,email=?, dob=?, password=? where user_id=?";
	public static final String GET_USER_BY_ID = "select * from users where user_id=?";
	public static final String GET_USER_BY_USERNAME_AND_PASSWORD = "select user_id,username, password from users where username=? and password=?";
	public static final String GET_BY_EMAIL = "select * from users where email=?";
	public static final String GET_PASSWORD_BY_PASSWORD = "select * from users where password=?";
}
