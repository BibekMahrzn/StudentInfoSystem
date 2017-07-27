<nav class="navbar navbar-inverse navbar-fixed-top" id="my-navbar">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#navbar-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span> <span class="icon-bar"></span>
			</button>
			<a href="" class="navbar-brand"> <img
				src="resources/image/logo.png" height="30" width="150">
			</a>
		</div>
		<div class="collapse navbar-collapse" id="navbar-collapse">
			<a href="LogoutController"
				class="btn btn-warning navbar-btn navbar-right">Logout</a>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="home.jsp">Home</a></li>
				<li><a href="StudentController?actions=listStudent">Student</a></li>
				<li><a href="UserController?action=listUser">User</a></li>
				<li>${sessionScope.username}</li>
			</ul>
		</div>
	</div>
</nav>