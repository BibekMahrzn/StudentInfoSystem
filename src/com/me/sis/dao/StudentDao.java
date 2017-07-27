package com.me.sis.dao;

import java.util.List;

import com.me.sis.dto.StudentDto;

public interface StudentDao {

	public void saveStudentInfo(StudentDto studentDto);

	public void updateStudentInfo(StudentDto studentDto);

	public void deleteStudentInfo(int id);

	public List<StudentDto> getAllStudentInfo();

	public StudentDto getStudentInfoById(int id);


}
