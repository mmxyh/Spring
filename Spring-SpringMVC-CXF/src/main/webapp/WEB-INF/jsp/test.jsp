<%--
  Created by IntelliJ IDEA.
  User: HMM
  Date: 2019/9/12
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>json测试</title>
</head>
<body>
<input type="button" value="请求json响应json" onclick="requestJson()"><br/> <br/>

<input type="button" value="请求key/value响应json" onclick="responseJson()"><br/>

<script src="https://code.jquery.com/jquery.js"></script>
<script type="text/javascript">
    function requestJson(){
        //使用ajax请求
        $.ajax({

            type:'post',
            url:'${pageContext.request.contextPath }/requestJson',
            contentType:'application/json;charset=utf-8',
            //请求的json，设置
            data:'{"name":"安然","age":55}',
            success:function(data){
                alert(data.name);
            }

        });

    }

    //请求key/value响应json
    function responseJson(){
        //使用ajax请求
        $.ajax({

            type:'post',
            url:'${pageContext.request.contextPath }/responseJson',
            //请求的json，设置
            //contentType:'application/json;charset=utf-8',
            //不用指定contentType因为默认提交是key/value
            data:'name=安仁&age=15',
            success:function(data){
                alert(data);
            }

        });

    }

</script>
</body>
</html>
