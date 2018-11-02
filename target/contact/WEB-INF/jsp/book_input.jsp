<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="title"/></title>
</head>
<body>
<a href="cl/zh">中文</a>
<a href="cl/en">English.</a>
<br><br>
</div>

<form:form action="r" method="post" modelAttribute="category">
    <form:errors path="*"/>
    <div>
        ID：<input type="text" name="id" placeholder="id"/>
    </div>
    <div>
        姓名：<input type="text" name="name" placeholder="name" />
    </div>
    ID：<input type="text" name="yu" placeholder="id"/>

    <br>
    <input type="submit"/>
</form:form>

</body>
</html>
