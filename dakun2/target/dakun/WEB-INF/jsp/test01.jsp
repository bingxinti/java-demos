<%--
  Created by IntelliJ IDEA.
  User: Demon
  Date: 16/12/19
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title></title>
</head>
<body>

    test:<hr />
    ${str1}<hr />

    <c:if test="${!empty testList}" >
        <c:forEach var="testInfo" items="${testList}">
            id ：${testInfo.id}
            title ： ${testInfo.title}
            sort ： ${testInfo.sort}
            <br />
        </c:forEach>
    </c:if>


</body>
</html>
