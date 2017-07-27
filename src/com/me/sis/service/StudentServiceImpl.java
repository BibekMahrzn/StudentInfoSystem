package com.me.sis.service;

import java.util.List;

import com.me.sis.dao.StudentDao;
import com.me.sis.dao.StudentDaoImpl;
import com.me.sis.dto.StudentDto;

public class StudentServiceImpl implements StudentService {

	StudentDao studentDao = new StudentDaoImpl();

	public void saveStudentInfo(StudentDto studentDto) {

		studentDao.saveStudentInfo(studentDto);
	}

	public void updateStudentInfo(StudentDto studentDto) {
		studentDao.updateStudentInfo(studentDto);

	}

	public void deleteStudentInfo(int id) {
		studentDao.deleteStudentInfo(id);

	}

	public List<StudentDto> getAllStudentInfo() {
		return studentDao.getAllStudentInfo();
	}

	public StudentDto getStudentInfoById(int id) {
		return studentDao.getStudentInfoById(id);
	}

}
