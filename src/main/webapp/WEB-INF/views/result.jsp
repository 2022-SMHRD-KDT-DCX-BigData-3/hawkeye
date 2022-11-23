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
<title>호크아이 검색 결과 페이지 입니다</title>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap');
#section{
	background-image: url("image/back.png");	
}
</style>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
<link rel="stylesheet" href="css/result.css">
</head>
<body>
    <div class="container-fluid">

      <!-- header -->
      <header>
        <a href="${cpath}/main"><img src="image/logo.png"></a>
          <nav>
              <ul>
                  <li><a href="${cpath}/main" class="text-decoration-none"><i>Main</i></a></li>
                  <li><a href="${cpath}/info" class="text-decoration-none"><i>About</i></a></li>
                  <li><a href="${cpath}/uplode" class="text-decoration-none"><i>Search</i></a></li>
                  <li><a href="${cpath}/login" class="text-decoration-none"><i>Login</i></a></li>
                  <li><a href="${cpath}/join" class="text-decoration-none"><i>Sign up</i></a></li>
              </ul>
          </nav>
      </header>

      <!-- center -->
      <section id="section">
          <article>
            <h2><i>검색 결과</i></h2>
            <div class="box_top">
                <table class="table table-striped table-hover">
                    <thead>
                      <tr>
                        <th scope="col">No.</th>
                        <th scope="col">사진</th>
                        <th scope="col">유출 사이트</th>
                        <th scope="col">신고하기</th>
                      </tr>
                    </thead>
                    <tbody class="table-group-divider">
                      <tr>
                        <th scope="row">1</th>
                        <td>Mark</td>
                        <td>Otto</td>
                        <td><button type="button" class="btn btn-primary">신고하기</button></td>
                      </tr>
                      <tr>
                        <th scope="row">2</th>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td><button type="button" class="btn btn-primary">신고하기</button></td>
                      </tr>
                      <tr>
                        <th scope="row">3</th>
                        <td>Jacob</td>
                        <td>Thornton</td>
                        <td><button type="button" class="btn btn-primary">신고하기</button></td>
                      </tr>
                    </tbody>
                  </table>
                </div>
          </article>
      </section>

      <!-- footer -->
      <footer>
          <div class="info">
              <h4>서비스 이용약관 | 제휴 문의 | 고객센터</a></h4>
              <h5>Copyright © Hawkeye. All rights reserved.</h5>
          </div>

      </footer>
  </div>
</body>
</html>