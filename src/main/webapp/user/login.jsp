<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/user_login.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
<script>
	function submitForm() {
		$('#userlogin').form('submit');
	}
	function clearForm() {
		$('#userlogin').form('clear');
	}
</script>
</head>
<body>
	<div class="wrapper">
		<nav>
			<ul>
				<li style="text-align: right;"><a>没有账号？注册一个</a></li>
			</ul>
		</nav>

		<div class="gap_after_header"></div>
		<div class="table_login">

			<form id="userlogin" action="/userlogin.do">
				<div>
					<table>
						<tr>
							<td>用户名</td>
							<td colspan="2"><input type="text" name="username" /></td>
						</tr>
						<tr>
							<td>密 码</td>
							<td colspan="2"><input type="password" name="password" /></td>
						</tr>
						<tr class="link_group">
							<td></td>
							<td>
								<button class="link_submit" onclick="submitForm()">登录</button>
							</td>
							<td>
								<button class="link_clear" onclick="clearForm()">重置</button>
							</td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>