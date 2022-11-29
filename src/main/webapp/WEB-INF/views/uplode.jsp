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
<title>호크아이 업로드 페이지 입니다</title>
<style>
@import
   url('https://fonts.googleapis.com/css2?family=Roboto:wght@500&display=swap');
#section{
   background-image: url("image/back.png");   
}   
</style>
<script src="https://use.fontawesome.com/3a2eaf6206.js"></script>
<link rel="stylesheet" href="css/uplode.css">
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
               <li><a href="${cpath}/login"><i>Login</i></a></li>
               <li><a href="${cpath}/join"><i>Sign up</i></a></li>
            </ul>
         </nav>
      </header>

      <!-- center -->
      <section id="section">
         <aside></aside>
         <article>
            <div class="upbox">
            <div class="inbox">
               <h1>본인의 사진을 올려주세요</h1>
                  <label for="up">
                  <form action = "${cpath}/crawling" method="post" enctype="multipart/form-data">
                     <input type="file" onchange="photo_uplode(this);" id="up" name="file"> 
                     <div class="image_box">
                         <img id="preview" />
                     </div>
                    </label>
                    
                   
                   <input type="submit" value="검색하기" class="final_button">
                   </form>
            </div>
            </div>
         </article>
         <aside></aside>
      </section>

		<!-- center -->
		<section id="section">
			<aside></aside>
			<article>
				<div class="upbox">
				<div class="inbox">
					<h1>본인의 사진을 올려주세요</h1>
						<label for="up">
						   <input type="file" onchange="photo_uplode(this);" id="up"> 
						   <div class="image_box">
						       <img id="preview" />
						   </div>
					  	</label>
					    
					    <a href="${cpath}/crawling"><input type="submit" value="검색하기" class="final_button"></a>
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

   <!-- js -->
   <script>
       function photo_uplode(input) {
           if (input.files && input.files[0]) {
             var reader = new FileReader();
             reader.onload = function(e) {
               document.getElementById('preview').src = e.target.result;
             };
             reader.readAsDataURL(input.files[0]);
           } else {
             document.getElementById('preview').src = "";
           }
         }
    </script>
</body>

</html>