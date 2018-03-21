<%@page language="java" contentType="text/html" %>


<html>
<head>
    <title>HOME PAGE</title>
</head>

<body>
<h1>Welcome in My First JSP Page</h1>

<p>
    <% out.print(request.getAttribute("test1")); %>
</p>
</body>

</html>