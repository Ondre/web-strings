<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<fmt:bundle basename="i18n.messages">
    <head>
        <title></title>
    </head>
    <body>
    <div>
        <form action="${pageContext.request.contextPath}/" method="post">

            <textarea name="text" rows="20" cols="50"></textarea><br/>
            <input type="submit" value="<fmt:message key="input.submit"/>"/>
        </form>
    </div>
    </body>
</fmt:bundle>
</html>
