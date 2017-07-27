package com.me.sis.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.me.sis.dto.StudentDto;
import com.me.sis.service.StudentService;
import com.me.sis.service.StudentServiceImpl;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String LIST_PAGE = "/listStudent.jsp";
	private static final String CREATE_PAGE = "/createStudent.jsp";

	StudentService studentService = new StudentServiceImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String actions = request.getParameter("actions");
		String forward = "";
		if (actions.equalsIgnoreCase("listStudent")) {
			request.setAttribute("studentList", studentService.getAllStudentInfo());
			forward = LIST_PAGE;
		} else if (actions.equalsIgnoreCase("add")) {
			forward = CREATE_PAGE;
		} else if (actions.equalsIgnoreCase("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			request.setAttribute("student", studentService.getStudentInfoById(id));
			forward = CREATE_PAGE;
		} else if (actions.equalsIgnoreCase("delete")) {
			int id = Integer.parseInt(request.getParameter("id"));
			studentService.deleteStudentInfo(id);
			request.setAttribute("studentList", studentService.getAllStudentInfo());
			forward = LIST_PAGE;
		}

		RequestDispatcher rd = request.getRequestDispatcher(forward);
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StudentDto studentDto = new StudentDto();
		studentDto.setStudentName(request.getParameter("sname"));
		studentDto.setCollegeName(request.getParameter("cname"));
		studentDto.setRoll(Integer.parseInt(request.getParameter("roll")));
		studentDto.setEmail(request.getParameter("email"));
		studentDto.setGender(request.getParameter("gender"));
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date dob = null;
		try {
			dob = dateFormat.parse(request.getParameter("dob"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		studentDto.setDob(dob);
		studentDto.setSubject(request.getParameter("subject"));
		String[] departments = request.getParameterValues("sCombo");
		String department = "";
		for (String d : departments) {
			department = department + d + "/";
		}
		studentDto.setDepartments(department);

		String studentId = request.getParameter("id");
		if (studentId == null || studentId.isEmpty()) {
			studentService.saveStudentInfo(studentDto);
		} else {
			studentDto.setId(Integer.parseInt(studentId));
			studentService.updateStudentInfo(studentDto);
		}

		RequestDispatcher rd = request.getRequestDispatcher(LIST_PAGE);
		request.setAttribute("studentList", studentService.getAllStudentInfo());
		rd.forward(request, response);
	}

}
