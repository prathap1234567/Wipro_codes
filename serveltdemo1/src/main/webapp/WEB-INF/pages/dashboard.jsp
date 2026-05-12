<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Welcome, ${username}
<form action="LogoutServelt" method="get">
	<button type="submit"> Logout </button>
	</form>

</body>
</html>