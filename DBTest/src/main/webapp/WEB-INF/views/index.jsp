<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Index</title>
</head>
<body>
<% String context = request.getContextPath(); %>
	<form action="<%= context %>/list" method="post">
		<input type="text" name="memberId">
		<input type="submit" value="idcheck">
	</form>
</body>
</html>