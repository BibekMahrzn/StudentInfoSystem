<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Registration Form</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="resources/css/styles.css">
<link rel="stylesheet" type="text/css" href="resources/css/me.css">
<%@ include file="header.jsp"%>
</head>
<body>
	<br>
	<br>
	<center>
		<h1>Student Registration Form</h1>
		<center>
			<div class="container">
				<div class="row">
					<div
						class="col-xs-12 col-sm-6 col-sm-offset-3 col-md-6 col-md-offset-3 ">
						<div class="panel panel-default">
							<div class="panel-body">
								<form action="StudentController" class="form-horizontal"
									method="post">
									<input type="hidden" name="id" value="${student.id}">
									<div class="form-group">
										<label class="control-label col-sm-3">Student Name</label>

										<div class="col-sm-9">
											<input type="text" name="sname" class="form-control"
												value="${student.studentName}">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3">College Name</label>
										<div class="col-sm-9">
											<input type="text" name="cname" class="form-control"
												value="${student.collegeName}">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3">Email</label>
										<div class="col-sm-9">
											<input type="email" name="email" class="form-control"
												value="${student.email}">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3">Roll</label>
										<div class="col-sm-9">
											<input type="number" name="roll" class="form-control"
												value="${student.roll}">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3">DOB</label>
										<div class="col-sm-9">
											<input type="date" name="dob" value="${student.dob}"
												class="form-control">
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3">Gender</label>
										<div class="col-sm-9">
											<input type="radio" name="gender" value="male"
												${student.gender=='male'?'checked':'' or student.gender == null?'checked':''}>Male
											<input type="radio" name="gender" value="female"
												${student.gender=='female'?'checked':''}>Female
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3">Departments</label>
										<c:set var="depatments"
											value="${fn:split(student.departments, '/')}" />
										<div class="col-sm-9">
											<input type="checkbox" name="C1" value="Computer"
												${depatments[0]=='Computer'?'checked':''}>Computer <input
												type="checkbox" name="C1" value="Electrical"
												${depatments[1]=='Electrical'?'checked':''}>Electrical
											<input type="checkbox" name="C1" value="IT"
												${depatments[2]=='IT'?'checked':''}>IT
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3">Subject</label>
										<div class="col-sm-9">
											<select name="sCombo">
												<option value="Java"
													${student.subject=='Java'?'selected':''}>JAVA</option>
												<option value="php" ${student.subject=='php'?'selected':''}>PHP</option>
												<option value=".Net"
													${student.subject=='.Net'?'selected':''}>.NET</option>
												<option value="android"
													${student.subject=='android'?'selected':''}>ANDROID</option>
												<option value="c++" ${student.subject=='c++'?'selected':''}>C++</option>
												<option value="swift"
													${student.subject=='swift'?'selected':''}>SWIFT</option>
												<option value="javascript"
													${student.subject=='javascript'?'selected':''}>JAVASCRIPT</option>
											</select>
										</div>
									</div>

									<div class="form-group">
										<div class="col-sm-offset-3 col-sm-9">
											<input type="submit" value="Submit"> <input
												type="reset" value="Reset">
										</div>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
</body>
</html>