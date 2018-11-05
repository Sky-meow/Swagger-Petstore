<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <script src="https://cdn.jsdelivr.net/npm/jquery@1.12.4/dist/jquery.min.js"></script>
    <title>Title</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>编号</th>
        <th>姓名</th>
    </tr>
    </thead>
    <tbody id="tbody1">
    <tr>
        <td><input type='text' name='id1'/></td>
        <td><input type='text' name='name1'/></td>
        <td><input type='button' class='add' value='  +  '/></td>
        <td><input type='button' class='del' value='  -  '/></td>
    </tr>
    </tbody>
</table>
<p></p>
<input type="button" id="btn_add" value="批量添加">
<table>
    <tr>
        <th>编号</th>
        <th>类型</th>
    </tr>
    <c:forEach var="e" items="${petList}">
        <tr>
            <form action="/b/upda" method="post">
                <td> <input type="text" name="id" value="${e.id}" readonly="readonly"/> </td>
                <td> <input type="text" name="name" value="${e.name}"/> </td>
                <td> <input type="submit" value="修改"/></td>
                <td><a href="/a/del/${e.id}">删除</a></td>
            </form>
        </tr>
    </c:forEach>
</table>

<script src="../js/jquery.js"></script>
<script>
    $(function () {
        var tbody = $("#tbody1");

        trNode = tbody.clone();

        tbody.on("click", " .add", function () {
            $("#tbody1").append(trNode.clone());
        });

        tbody.on("click", ".del", function () {
            var del = $("tr", tbody).length;
            console.log(del);
            if (del === 1) {
                alert("不允许再次进行删除操作");
                return false;
            }
            $(this).parent().parent().remove();
        })
    });

    $("#btn_add").click(function () {
        var data = [];
        $("#tbody1 tr").each(function (index, obj) {
            data.push(
                {
                    id: $("input[name='id1']", obj).val(),
                    name: $("input[name='name1']", obj).val(),
                }
            )
        });
        $.post({
            url: "/b",
            contentType: "application/json;charset=utf-8",
            data: JSON.stringify(data)
        }).done(function () {
            if (data.msg === "perfect") {
                alert("添加成功!");
            }
            else {
                alert(data.msg);
            }
        }).fail(function (xhr, code, ex) {
            console.error(ex);
        });
    })
</script>
</body>
</html>

