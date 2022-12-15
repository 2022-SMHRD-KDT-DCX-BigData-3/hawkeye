<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<meta charset="UTF-8">
<title>요청 폼</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
$("input[type=button]").click(function() {
 console.log()
 var form = $("#fileUploadForm")[0];
 var data = new FormData(form);
 $("input[type=button]").prop("disabled", true);
 $.ajax({
 url : "http://127.0.0.1:5000/test_img",
 async : true,
 type : "POST",
 data : data,
 processData : false,
 contentType : false,
 cache : false,
 timeout : 600000,
 success : function(data) {
 console.log(data)
 var html="<table border='1'>";
 html+="<tr>";
 html+="<td>No</td>";
 html+="<td>사진파일</td>";
 html+="<td>출처</td>";
 html+="<td>신고하기</td>";
 html+="</tr>";
 $.each(data, function(index, obj){	 
	 html+="<tr>";
	 html+="<td>"+index+"</td>";
	 html+="<td><img width='60' height='60'  src='data:image/png;base64," + obj.file + "'></td>";
	 html+="<td>출처</td>";
	 html+="<td>신고하기</td>";
	 html+="</tr>";	 
	// $("#result").append("<img src='data:image/png;base64," + obj.file + "'>");
 });
 $("#result").html(html);
 
 $("input[type=button]").prop("disabled", true);
 },
 error : function(e) {
 console.log("ERROR : ", e);
 alert("fail");
 }
 });
})
});
</script> 
<form method="post" enctype="multipart/form-data" id="fileUploadForm">
 데이터 : <input type="text" name="data" value="test hello"><p>
 파일 : <input type="file" name="file"></p><p>
 <input type="button" value=" 비동기 요청 ">
 </p>
</form>
<div id="result">여기에 요청 결과가 출력되어야 합니다.</div>