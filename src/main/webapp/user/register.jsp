<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/user.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<div class="wrapper">
		<nav>
			<ul>
				<li style="text-align: right;">已有账号，立即
					<button type="submit" form="userRegister"
						formaction="prepareLogin.do" formmethod="post">登录</button>
				</li>
			</ul>
		</nav>

		<div class="gap_after_header"></div>
		<div class="table_user">

			<form id="userRegister">
				<div>
					<table>
						<tr>
							<td>用户名</td>
							<td colspan="2"><input type="text" name="username"
								required="required" placeholder="3-20位字母、数字或下划线" /></td>
						</tr>
						<tr>
							<td>密 码</td>
							<td colspan="2"><input type="password" name="password"
								required="required" placeholder="6-20位" /></td>
						</tr>
						<tr>
							<td>昵称</td>
							<td colspan="2"><input type="text" name="nickname"
								required="required" /></td>
						</tr>
						<tr class="link_group">
							<td></td>
							<td>
								<button class="link_submit" type="submit" formmethod="post"
									formaction="userRegister.do">注册</button>
							</td>
							<td>
								<button class="link_clear" type="reset">重置</button>
							</td>
						</tr>
					</table>
				</div>
			</form>
		</div>
		<footer>
			<ul>
				<li style="text-align: center;">Copyright©2014 niuhp</li>
			</ul>
		</footer>
	</div>
</body>
</html>