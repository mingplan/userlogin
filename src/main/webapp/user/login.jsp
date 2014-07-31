<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户登录</title>
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/user.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<div class="wrapper">
		<nav>
			<ul>
				<li style="text-align: right;">没有账号？
					<button type="submit" form="userlogin"
						formaction="prepareRegister.do" formmethod="post">注册</button> 一个
				</li>
			</ul>
		</nav>

		<div class="gap_after_header"></div>
		<div class="table_user">

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
								<button class="link_submit" type="submit" formmethod="post"
									formaction="userlogin.do">登录</button>
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