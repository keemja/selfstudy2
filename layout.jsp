<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	#wrap {
		width: 1000px;
		height: 900px;
		margin: auto;
	}
	
	#header {
		width: 100%;
		height: 150px;
		background-color: yellow;
	}
	#content {
		width: 100%;
		height: 600px;
		background-color: orange;
	}
	#footer {
		width: 100%;
		height: 150px;
		background-color: pink;
	}
</style>
</head>
<body>
<%
	String showPage = request.getParameter("page");
	
	// 맨 처음 실행시 넘어오는 값이 없기 때문에 분기문 처리
	if(showPage == null) {
		showPage="main.jsp";
	}
%>
<div id="wrap">
	
	<div id="header">
		<jsp:include page="header.jsp"/>
	</div>
	
	<div id="content">
		<jsp:include page="<%=showPage %>"/>
	</div>
	
	<div id="footer">
		<jsp:include page="footer.jsp"/>
	</div>
	
</div>
</body>
</html>