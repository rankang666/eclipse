<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<div>
<a href="addProduct">添加商品</a>
<table border="1" >
<table>
        <tr>
            <td>商品编号</td>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>出版社</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item.pid }</td>
                <td>${item.pname }</td>
                <td>${item.price }</td>
                <td><a href="DeleteProduct?pid=${item.pid }">删除</a>|<a href="update?pid=${item.pid}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</table>
</div>

</body>
</html>