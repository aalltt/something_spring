<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    HELLO MF
</h2>

<%--YOUR F NAME : ${param.employeeName}--%>

YOUR F NAME: ${employee.name}

<br><br>
YOUR F SURNAME: ${employee.surName}
<br><br>
YOUR F SALARY: ${employee.salary}
<br><br>
YOUR F DEPARTMENT: ${employee.department}
<br><br>
YOUR F CAR: ${employee.car}
<br><br>
YOUR F LANGUAGE:
<br>
<ul>
    <c:forEach var="langu" items="${employee.lang}">
    <li>
            ${langu}
        </c:forEach>
    </li>
</ul>

YOUR F PHONE: ${employee.phone}
<br><br>
YOUR F EMAIL: ${employee.email}
<br>


</body>
</html>