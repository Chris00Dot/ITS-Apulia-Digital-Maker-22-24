<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Pagina isFirst </title>
</head>
<body>

<%

HttpSession Session = request.getSession();
Boolean isFirst = (Boolean) session.getAttribute("isFirst");
if(isFirst == null || isFirst)
{
	out.print("<h1> Benvenuto! </h1>");
	session.setAttribute("isFirst", false);
}
else
{
	out.println("<h1> Bentornato! </h1>");
}

%>

</body>
</html>