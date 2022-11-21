<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var = "cpath" value = "${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
		var result=${result};
		checkModal(result);
		
	});
	function checkModal(result){
		if (result==''){
			return;
		}	
		if (parseInt(result)>0){
			$("#myModal").modal("show");
		}
	}

</script>
</head>
<body>
 
<div class="container">
  <h2>Spring MVC</h2>
  <div class="panel panel-default">
    <div class="panel-heading">BOARD</div>
    <div class="panel-body">
    	<table class="table table-bordered table-hover">
    		<tr>
    			<td>번호</td>
    			<td>제목</td>
    			<td>작성자</td>
    			<td>작성일</td>
    			<td>조회수</td>
    		</tr>
    		<c:forEach var = "vo" items="${list}">
	    		<tr>
	    			<td>${vo.idx}</td>
	    			<td><a href="${cpath}/board/get?idx=${vo.idx}">${vo.title}</a></td>
	    			<td>${vo.writer}</td>
	    			<td>${fn:split(vo.indate," ")[0]}</td>
	    			<td>${vo.count}</td>
	    		</tr>
    		</c:forEach>
    	</table>
    	<button class="btn btn-sm btn-default" onclick="location.href='${cpath}/register'">글쓰기</button>
    </div>
    <div class="panel-footer">빅데이터 분석서비스 개발자과정</div>
  </div>
</div>

<div id="myModal" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title">삭제 성공</h4>
      </div>
      <div class="modal-body">
        <p>게시글이 삭제되었습니다.</p>
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div>
    </div>

  </div>
</div>
</body>
</html>