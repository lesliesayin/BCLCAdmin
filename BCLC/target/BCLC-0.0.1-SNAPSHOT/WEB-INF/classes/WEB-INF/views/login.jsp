<!DOCTYPE html>
<html>
	<head>
		<title>BCLC | Login</title>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
		<link rel="stylesheet" href="resources/AdminLTE/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="resources/AdminLTE/dist/css/AdminLTE.min.css">
		<link rel="stylesheet" href="resources/AdminLTE/plugins/iCheck/square/blue.css">
		<link rel="stylesheet" href="resources/styles/common.css">
		<link rel="stylesheet" href="resources/styles/login.css">
		
		<!--[if lt IE 9]>
			<script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
			<script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	</head>
	<body class="hold-transition login-page">
		<div class="login-box">
			<div class="login-box-body">
				<div class="login-logo">
					<b>BCLC</b>Login
				</div>
				<form action="authenticateUser" method="post">
					<div class="form-group has-feedback">
						<input type="text" class="form-control" name="username" placeholder="Username" autofocus>
						<span class="glyphicon glyphicon-user form-control-feedback"></span>
					</div>
					<div class="form-group has-feedback">
						<input type="password" class="form-control" name="password" placeholder="Password">
						<span class="glyphicon glyphicon-lock form-control-feedback"></span>
					</div>
					<div class="row">
						<div class="col-xs-12">
							<div class="alert alert-danger" role="alert" id="alert-box">
								<p id="alert-box-text">${errorMessage}</p>
							</div>
							<button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
						</div>
					</div>
				</form>
			</div>
		</div>
		
		<script src="resources/AdminLTE/plugins/jQuery/jQuery-2.1.4.min.js"></script>
		<script src="resources/AdminLTE/bootstrap/js/bootstrap.min.js"></script>
		<script src="resources/AdminLTE/plugins/iCheck/icheck.min.js"></script>
		<script src="resources/scripts/login.js"></script>
	</body>
</html>
