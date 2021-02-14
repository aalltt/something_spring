<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML>
<html>
<body>
<h2>All Employees</h2>
<br><br>


<security:authorize access="hasRole('hr')">
    FOR HR
    <input type="button" value="salary"
           onclick="window.location.href='hr_info'">
</security:authorize>


<br><br>
<security:authorize access="hasRole('manager')">
    FOR MANAGERS
    <input type="button" value="performance"
           onclick="window.location.href='manager_info'">
</security:authorize>


</body>
</html>
