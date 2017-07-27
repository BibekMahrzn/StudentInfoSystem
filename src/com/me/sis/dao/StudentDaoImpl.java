package com.me.sis.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.me.sis.dto.StudentDto;
import com.me.sis.util.DbUtil;
import com.me.sis.util.QueryUtil;

public class StudentDaoImpl implements StudentDao {

	PreparedStatement ps = null;

	public void saveStudentInfo(StudentDto studentDto) {
		try {
			ps = DbUtil.getConnection().prepareStatement(QueryUtil.SAVE_STUDENT);
			ps.setString(1, studentDto.getStudentName());
			ps.setString(2, studentDto.getCollegeName());
			ps.setString(3, studentDto.getGender());
			ps.setString(4, studentDto.getDepartments());
			ps.setString(5, studentDto.getSubject());
			ps.setInt(6, studentDto.getRoll());
			ps.setDate(7, new java.sql.Date(studentDto.getDob().getTime()));
			ps.setString(8, studentDto.getEmail());
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void updateStudentInfo(StudentDto studentDto) {
		try {
			ps = DbUtil.getConnection().prepareStatement(QueryUtil.UPDATE_STUDENT);
			ps.setString(1, studentDto.getStudentName());
			ps.setString(2, studentDto.getCollegeName());
			ps.setInt(3, studentDto.getRoll());
			ps.setDate(4, new java.sql.Date(studentDto.getDob().getTime()));
			ps.setString(5, studentDto.getGender());
			ps.setString(6, studentDto.getSubject());
			ps.setString(7, studentDto.getDepartments());
			ps.setString(8, studentDto.getEmail());
			ps.setInt(9, studentDto.getId());
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteStudentInfo(int id) {
		try {
			ps = DbUtil.getConnection().prepareStatement(QueryUtil.DELETE_STUDENT);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<StudentDto> getAllStudentInfo() {
		List<StudentDto> studentList = new ArrayList<>();

		try {
			ps = DbUtil.getConnection().prepareStatement(QueryUtil.LIST_STUDENT);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				StudentDto studentDto = new StudentDto();
				studentDto.setId(rs.getInt("id"));
				studentDto.setStudentName(rs.getString("student_name"));
				studentDto.setCollegeName(rs.getString("college_name"));
				studentDto.setRoll(rs.getInt("roll"));
				studentDto.setGender(rs.getString("gender"));
				studentDto.setSubject(rs.getString("subject"));
				studentDto.setDepartments(rs.getString("departments"));
				studentDto.setEmail(rs.getString("email"));
				studentDto.setDob(rs.getDate("dob"));
				studentList.add(studentDto);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return studentList;
	}

	public StudentDto getStudentInfoById(int id) {
		StudentDto studentDto = new StudentDto();
		try {
			ps = DbUtil.getConnection().prepareStatement(QueryUtil.GET_STUDENT_BY_ID);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {

				studentDto.setId(rs.getInt("id"));
				studentDto.setStudentName(rs.getString("student_name"));
				studentDto.setCollegeName(rs.getString("college_name"));
				studentDto.setRoll(rs.getInt("roll"));
				studentDto.setGender(rs.getString("gender"));
				studentDto.setSubject(rs.getString("subject"));
				studentDto.setDepartments(rs.getString("departments"));
				studentDto.setEmail(rs.getString("email"));
				studentDto.setDob(rs.getDate("dob"));
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return studentDto;
	}

}
