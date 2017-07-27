package com.me.sis.service;

import java.util.List;

import com.me.sis.dto.StudentDto;

public interface StudentService {
	public void saveStudentInfo(StudentDto studentDto);

	public void updateStudentInfo(StudentDto studentDto);

	public void deleteStudentInfo(int id);

	public List<StudentDto> getAllStudentInfo();

	public StudentDto getStudentInfoById(int id);
}
