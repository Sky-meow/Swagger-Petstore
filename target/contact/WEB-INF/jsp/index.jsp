<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><spring:message code="title"/></title>
</head>
<body>

<div style="color: red">
    ${err}
</div> 

<form action="tijiao" method="post" enctype="multipart/form-data">
    <input type="file" name="file1"/>
    <input type="text" name="file2"/>
    <input type="submit"/>
</form>
   

</body>
</html>
