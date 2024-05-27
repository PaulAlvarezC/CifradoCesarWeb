<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="//use.fontawesome.com/releases/v5.0.7/css/all.css">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap"
	rel="stylesheet">
<link href="./assets/css/styles.css" rel="stylesheet" type="text/css">
<title>Cifrado Cesar</title>
</head>
<body>
	<nav class="navbar navbar-dark bg-primary">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="#">Cifrado Cesar</a>
	  </div>
	</nav>
	<div class="container mt-2">
		<br />
		<div class="row">
			<form action="main" method="post">			
				<div class="col-sm-12">
					<div class="mb-3">
						<label for="textOrigin" class="form-label">Ingrese el texto
							que desea analizar</label>
						<textarea class="form-control" name="textOrigin" id="textOrigin" rows="10" required requir></textarea>
					</div>
				</div>
				<div class="col-sm-4">
					<input type="submit" class="btn btn-outline-primary" value="Analizar" />
				</div>
			</form>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"
		integrity="sha384-q2kxQ16AaE6UbzuKqyBE9/u/KzioAlnx2maXQHiDX9d4/zp8Ok3f+M7DPm+Ib6IU"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.min.js"
		integrity="sha384-pQQkAEnwaBkjpqZ8RU1fF1AKtTcHJwFl3pblpTlHXybJjHpMYo79HY3hIi4NKxyj"
		crossorigin="anonymous"></script>
</body>
</html>