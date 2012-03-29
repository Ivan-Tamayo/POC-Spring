<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title><spring:message code="title"/></title>
    <link rel="stylesheet" type="text/css" href="/static/css/styles.css"/>
</head>
<body>
    <h1><spring:message code="homepage.title"/></h1>
    <p>
        <spring:message code="welcome.message"/>
    </p>
    <hr/>
    <c:forEach items="${users}" var="user">
    	${user.siret} - ${user.nom} - ${user.prenom}
    	<hr/>
    </c:forEach>
    
    
</body>
</html>