<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/user_login.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<div class="wrapper">
		<nav>
			<ul>
				<li style="text-align: right;"><a onclick="window.location.href='user/login.jsp'">已有账号，立即登录</a></li>
			</ul>
		</nav>

		<div class="gap_after_header"></div>
		<div class="table_login">

			<form id="userlogin">
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
								<button class="link_submit" type="submit"
									formaction="/userlogin.do">登录</button>
							</td>
							<td>
								<button class="link_clear" type="reset">重置</button>
							</td>
						</tr>
					</table>
				</div>
			</form>
		</div>
	</div>
</body>
</html>