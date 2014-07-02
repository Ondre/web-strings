<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
            ${text}

    </div>
    </body>
</fmt:bundle>
</html>
