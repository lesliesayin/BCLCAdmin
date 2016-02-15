<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<title>BCLC</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/datatables/dataTables.bootstrap.css">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/styles/common.css">
		
		<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	</head>
	<body>
		<nav class="navbar navbar-default navbar-fixed-top em-navbar">
			<div class="container">
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#em-main-menu" aria-expanded="false" aria-controls="navbar">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>
				</div>
				<div id="em-main-menu" class="navbar-collapse collapse">
					<ul class="nav navbar-nav navbar-right em-navbar-nav">
						<li class="active"><a href="${pageContext.request.contextPath}/registration">REGISTRATION</a></li>
						<li><a href="${pageContext.request.contextPath}/payments">PAYMENTS</a></li>
						<li><a href="${pageContext.request.contextPath}/logout">LOGOUT</a></li>
					</ul>
				</div>
			</div>
		</nav>
		
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<form class="form-inline">
						<div class="form-group">
							<label class="school-year-type">School Year</label>
							<select id="school-year-type" class="form-control school-year-type">
								<option value="all" selected="selected">All</option>
								<option value="2016-2016">2015-2016</option>
								<option value="2016-2017">2016-2017</option>
								<option value="2017-2018">2017-2018</option>
								<option value="2018-2019">2018-2019</option>
								<option value="2019-2020">2019-2020</option>
								<option value="2020-2021">2020-2021</option>
								<option value="2021-2022">2021-2022</option>
								<option value="2022-2023">2022-2023</option>
								<option value="2023-2024">2023-2024</option>
								<option value="2024-2025">2024-2025</option>
								<option value="2025-2026">2025-2026</option>
								<option value="2026-2027">2026-2027</option>
								<option value="2027-2028">2027-2028</option>
								<option value="2028-2029">2028-2029</option>
								<option value="2029-2030">2029-2030</option>
							</select>
							<input type="text" class="form-control searchFilter" id="searchFilter" name="searchFilter" placeholder="Search">
						</div>
					</form>	
				</div>
			</div>
			<div class="row bc-table-div" id="bc-registration-table-div">
				<div class="col-xs-12">
					<table id="bc-registration-table" class="bc-table">
						<thead>
							<tr>
								<th>ID</th>
								<th>Name</th>
								<th>Address</th>
								<th>Latitude</th>
								<th>Longitude</th>
								<th class="actions">Actions</th>
							</tr>
						</thead>
					</table>
				</div>
			</div>
		</div>
		
		<script src="${pageContext.request.contextPath}/resources/jQuery/jquery-2.1.4.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/bootstrap/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/datatables/jquery.dataTables.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/datatables/dataTables.bootstrap.min.js"></script>
	</body>
</html>
