<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/css/styles.css">
<link rel="stylesheet" type="text/css" href="resources/css/me.css">
<%@ include file="header.jsp"%>
</head>
<body>
	<br>
	<br>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-md-6 col-md-offset-3">
				<h1>Student List</h1>
				<a href="StudentController?actions=add">
					<button class="btn btn-info navbar-btn" style="margin-left: 90%;">Add
						Student</button>
				</a>
			</div>
		</div>
	</div>
	<c:if test="${!empty studentList}">
		<div class="container">
			<div class="panel panel-default">
				<div class="panel-body">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>ID</th>
								<th>Student Name</th>
								<th>College Name</th>
								<th>Subject</th>
								<th>Email</th>
								<th>Departments</th>
								<th>DOB</th>
								<th>Roll</th>
								<th>Gender</th>
								<th>Actions</th>
							</tr>
						</thead>
						<tbody>

							<c:forEach items="${studentList}" var="student">
								<tr>
									<td><c:out value="${student.id}" /></td>
									<td><c:out value="${student.studentName}" /></td>
									<td><c:out value="${student.collegeName}" /></td>
									<td><c:out value="${student.subject}" /></td>
									<td><c:out value="${student.email}" /></td>
									<td><c:out value="${student.departments}" /></td>
									<td><c:out value="${student.dob}" /></td>
									<td><c:out value="${student.roll}" /></td>
									<td><c:out value="${student.gender}" /></td>
									<td style="width: 175px;"><a
										class="btn btn-warning navbar-btn"
										href="StudentController?actions=edit&id=<c:out value="${student.id}" />">Edit</a>
										<a class="btn btn-danger navbar-btn"
										href="StudentController?actions=delete&id=<c:out value="${student.id}"/>">Delete</a>
									</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>
				</div>
			</div>
		</div>
	</c:if>
</body>
</html>