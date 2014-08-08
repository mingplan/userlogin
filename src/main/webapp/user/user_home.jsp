<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${session.user.nickname}的主页</title>
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/user.css" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.easyui.min.js"></script>
</head>
<body>
	<div class="wrapper">
		<nav>
			<ul class="level1">
				<li><a href="#">${session.user.nickname}</a>
					<ul class="level2">
						<li><a href="http://icondock.com">个人资料</a></li>
						<li><a href="http://bestwebgallery.com">修改密码</a></li>
						<li><a href="http://bestwebgallery.com">退出系统</a></li>
					</ul></li>
			</ul>
		</nav>

		<div class="gap_after_header"></div>
		<h1 align="center">
			this is home page of <font color="blue">${session.user.nickname} !</font>
		</h1>
	</div>
</body>
</html>