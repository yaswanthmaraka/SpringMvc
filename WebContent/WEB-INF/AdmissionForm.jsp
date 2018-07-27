<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
<h1>${HeaderMessage}</h1>
    <H1>Student Submit Form For Technology Courses</H1>
    <form:errors path="student1.*"/>;
    <form action="/HelloSpringMvc/SubmitAdmissionForm.html" method="Post">
    <table>
    <tr>
    <td>Student Name: </td><td><input type="text" name="studentName"/></td>
    </tr>
    <tr>
    <td>Student Course:</td><td><input type="text" name="studentCourse"/></td>
    </tr>
    <tr>
    <td>StudentMobile:</td><td><input type="text" name="studentMobile"/></td>
    </tr>
    <tr>
    <td>StudentDate:</td><td><input type="text" name="studentDOB"/></td>
    </tr>
    <tr>
    <td>StudentSkill:</td><td><Select name="studentSkills" muiltiple>
                              <option value="javacore">java core</option>
                              <option value="spring Mvc">springMvc</option>
                              <option value="oracleDB">oracleDb</option>
                              
    </tr>
    
    
    
     
     
     
     
     </td>
     
     
     </tr>
    </table>
    <input type="submit" value="submit this form by clicking here"/>
    </form>

</body>
</html>