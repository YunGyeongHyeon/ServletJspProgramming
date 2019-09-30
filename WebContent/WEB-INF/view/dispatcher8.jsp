<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import = "com.mycompany.dto.Counter" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>dispatcher8.jsp</h4>
		
		<%-- How1  --%>
		<%Counter applicationCounter = (Counter)application.getAttribute("applicationcounter"); %>
		applicationCounter :  <%=applicationCounter.getValue() %>		<br/>
		
		<%Counter sessionCounter = (Counter)session.getAttribute("sessioncounter"); %>
		sessionCounter :	 <%=sessionCounter.getValue() %>  		<br/>
	
		<%Counter requestCounter = (Counter)request.getAttribute("requestcounter"); %>
		requestCounter :    <%=requestCounter.getValue() %>	  		<br/> <br/>
		
		<%--How2(Expression Language) = EL --%><br/>
		applicationCounter :  ${applicationCounter.value }<br/>
		sessionCounter :  ${sessionCounter.value } <br/>
		requestCounter : ${requestCounter.value }  <br/>
	</body>
</html>