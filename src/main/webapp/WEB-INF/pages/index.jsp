<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Popper JS -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 class="center">STUDENT REGISTRATION</h1>
	<form action="save" method="Post">
		<div class="container">
			<div class="row">
				<div class="col-md-">
					<div class="form-control">Name</div>
					<div>
						<input type="text" name="stdName">
					</div>

				</div>
			</div>
		</div>
		<table>
			<tr>
				<td>NAME :</td>
				<td></td>
			</tr>
			<tr>
				<td>COURSE :</td>
				<td><input type="text" name="stdCourse"></td>
			</tr>
			<tr>
				<td>FEE :</td>
				<td><input type="text" name="stdFee"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit"></td>
			</tr>

			<tr>
				<td>${msg}</td>
				<td></td>
			</tr>
		</table>


	</form>


</body>
</html>