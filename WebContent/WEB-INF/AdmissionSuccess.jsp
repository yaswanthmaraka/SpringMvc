<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>${HeaderMessage}</h1>
<h3>Congratulations! The College Has Processed your Application form Successfully</h3>
<h2>Details Submitted By you::</h2>
<table>
<tr>
<td>student Name:</td>
<td>${student1.studentName}</td>
</tr>
<tr>
<td>student Course:</td>
<td>${student1.studentCourse}</td>
</tr>
<tr>
<td>student Mobile:</td>
<td>${student1.studentMobile}</td>
</tr>
<tr>
<td>student DOB:</td>
<td>${student1.studentDOB}</td>
</tr>
<tr>
<td>student Skills:</td>
<td>${student1.studentSkills}</td>
</tr>

</table>
 

</body>
</html>