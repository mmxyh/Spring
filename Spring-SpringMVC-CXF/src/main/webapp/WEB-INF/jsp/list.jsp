<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/6
  Time: 20:10
  note: 使用bootstrap输出后台返回的requestScope对象
--%>
<%--<%@ page isELIgnored="false" %>--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String appPath = request.getContextPath(); %>
<html>
<head>
    <title>图书列表</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- 引入 Bootstrap -->
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>SSM基础框架</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <ul class="nav nav-tabs">
                <li class="active"><a href="<%=appPath%>/book/list">首页</a></li>
                <li><a href="<%=appPath%>/book/add">添加图书信息</a></li>
                <li class="disabled"><a href="#">信息</a></li>
            </ul>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>图书列表
                    <small>显示当前图书库存信息</small>
                </h1>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <table class="table table-hover table-striped">
                <thead>
                <tr>
                    <th>图书编号</th>
                    <th>图书名字</th>
                    <th>图书数量</th>
                    <th>操作</th>
                </tr>
                </thead>
                <tbody>
                <%--<c:forEach var="book" items="${requestScope.result.data}" varStatus="status">--%>
                <c:forEach var="book" items="${result.data}" varStatus="status">
                    <tr>
                        <td>${book.bookId}</td>
                        <td>${book.name}</td>
                        <td>${book.number}</td>
                        <td>
                            <a href="<%=appPath%>/book/detail/${book.bookId}">详情</a> |
                                <%--<a href="<%=appPath%>/book/del/${book.bookId}" id="del">删除</a>--%>
                            <a href="javascript:void(0)" onclick="deleteById(${book.bookId})">删除</a>
                        </td>

                    </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>

<!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
    function list() {
        window.location.href = "<%=appPath%>/book/list";
    }

    function deleteById(bookId) {
        if (confirm("确认删除【" + bookId + "】的信息吗？")) {
            $.ajax({
                type: "GET",
                url: "<%=appPath%>/book/del/" + bookId,
                success: function (result) {
                    // alert(JSON.stringify(result));
                    if (result.code == 200) {
                        list();
                    } else {
                        alert(result.msg);
                    }
                },
                error: function (result) {
                    alert("删除失败! ");
                }
            });
        }
    }

</script>
</body>
</html>
