<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    HOT DOG
</h2>

<%--<form action="/showDetails" method="get">--%>
<%--    <br>--%>
<%--    <input type="text" name="employeeName"--%>
<%--           placeholder="Write something mf">--%>
<%--    <input type="submit">--%>
<%--</form>--%>

<form:form action="showDetails" modelAttribute="employee">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br><br>
    Surname <form:input path="surName"/>
    <form:errors path="surName"/>
    <br><br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br><br>
    Department <form:select path="department">
    <%--    <form:option value="IT" label="IT"/>--%>
    <%--    <form:option value="HR" label="HR"/>--%>
    <%--    <form:option value="SALES" label="sale"/>--%>
    <form:options items="${employee.departments}"/>
</form:select>
    <br><br>
    Car?
    <br><br>
    <%--    BMW <form:radiobutton path="car" value="BMW"/>--%>
    <%--    <br>--%>
    <%--    AUDI <form:radiobutton path="car" value="Audi"/>--%>
    <%--    <br>--%>
    <form:radiobuttons path="car" items="${employee.cars}"/>
    <br>
    <br>
    Languages MF ?
    <br>
    <%--    EN <form:checkbox path="langs" value="English"/>--%>
    <%--    <br>--%>
    <%--    Spanish <form:checkbox path="langs" value="Spanish"/>--%>
    <form:checkboxes path="lang" items="${employee.langs}"/>
    <br><br>

    Phone <form:input path="phone"/>
    <form:errors path="phone"/>
    <br><br>

    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>

    <input type="submit" value="Ok">

</form:form>


</body>
</html>