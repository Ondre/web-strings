<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<fmt:bundle basename="i18n.messages">
    <head>
        <title></title>
    </head>
    <body>
    <div>

        <form action="${pageContext.request.contextPath}/" method="get">
            <input type="submit" value="<fmt:message key="input.return"/>"/> <br/><br/>
        </form>
        <p><fmt:message key="output.text"/>:</p>
        <c:out value="${text}"/>
        <br>

        <p>параграф:</p>
        <c:forEach var="sent" items="${paragraph}" varStatus="loop">
            <br> ${loop.index}. <c:out value="${sent}"/><br>
        </c:forEach>
            <%--        <c:out value="${paragraph}" />--%>
        <br>

        <p>Предложение:</p>
        <c:forEach var="sent" items="${sentence}" varStatus="loop">
            <br>${loop.index}. <c:out value="${sent}"/><br>
        </c:forEach>
            <%--<c:out value="${sentence}" />--%>
        <br>

        <p>Слово:</p>
        <c:forEach var="sent" items="${word}" varStatus="loop">
            <br> ${loop.index}. <c:out value="${sent}"/><br>
        </c:forEach>
            <%--<c:out value="${word}" />--%>

    </div>
    </body>
</fmt:bundle>
</html>
