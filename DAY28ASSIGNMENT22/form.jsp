<%@ page language="java" %>
<html>
<head>
<title>Student Form</title>
</head>

<body>

<h2>Student Details Form</h2>

<form action="result.jsp" method="post">

Name:
<input type="text" name="name" required><br><br>

Email:
<input type="email" name="email" required><br><br>

Course:
<input type="text" name="course" required><br><br>

Marks:
<input type="number" name="marks" required><br><br>

<input type="submit" value="Submit">

</form>

</body>
</html>