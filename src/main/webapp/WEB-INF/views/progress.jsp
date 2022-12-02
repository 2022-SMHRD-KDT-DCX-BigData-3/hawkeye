<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="cpath" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>사진을 검색하는 중입니다.</title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap');
#section{
	background-image: url("image/back.png");	
}
</style>
<link rel="stylesheet" href="css/progress.css">
<link rel="stylesheet" href="css/HeadandFoot.css">
</head>
<body>

	<div class="container">

		<!-- header -->
		<header>
			<a href="${cpath}/main"><img src="image/logo.png"></a>
			<nav>
				<ul>
					<li><a href="${cpath}/main"><i>Main</i></a></li>
					<li><a href="${cpath}/info"><i>About</i></a></li>
					<li><a href="${cpath}/uplode"><i>Search</i></a></li>
					<c:if test="${empty vo}">
					<li><a href="${cpath}/login"><i>Login</i></a></li>
					<li><a href="${cpath}/join"><i>Sign up</i></a></li>
					</c:if>
					<c:if test ="${!empty vo}">
					<li><a href="${cpath}/logout"><i>Logout</i></a></li>
					<li><a href=""><i>${vo.memid}</i></a></li>
					</c:if>
				</ul>
			</nav>
		</header>

		<!-- center -->
		<section id="section">
			<aside></aside>
			<article>
				<div class="joinbox">
					<div class="joinbox1">
						<img src="image/progress.png">
						<h2>사진을 검출중입니다...</h2>
						<progress id="progress" value="60" min="0" max="100"></progress>
					</div>
				
				</div>
			</article>
			<aside></aside>
		</section>

		<!-- footer -->
		<footer>
			<div class="info">
				<h4>
					서비스 이용약관 | 제휴 문의 | 고객센터</a>
				</h4>
				<h5>Copyright © Hawkeye. All rights reserved.</h5>
			</div>

		</footer>
	</div>
</body>
</html>