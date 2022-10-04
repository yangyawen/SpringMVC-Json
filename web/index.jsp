<%--
  Created by IntelliJ IDEA.
  User: yangyawen
  Date: 2022/10/3
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <script src="https://cdn.staticfile.org/jquery/3.6.1/jquery.min.js"></script>
    <script type="text/javascript">
      // 页面加载事件的简写方式
      $(function () {
        $("#btn1").click(function (){
          $.ajax({
            url:"${pageContext.request.contextPath}/json/request01",
            method:"post",
            data:"杨啊啊",
            contentType:"application/json",
            /* contentType若不设置，默认会以form的application/x-www-form-urlencoded方式提交
            * 这种方式的date要以这种形式书写才能传给服务端 "id=1&name=杨啊啊" */
            dataType:"json",
            success:function (user) {
              alert(user.name);
            }
          });
        })

        $("#btn2").click(function (){
          $.ajax({
            url:"${pageContext.request.contextPath}/json/request02",
            method:"post",
            data:'{"id":1,"name":"yangyawen","birthday":"2020-09-01"}',
            contentType:"application/json",
            dataType:"json",
            success:function (user) {
              alert(user.name);
            }
          });
        })
      })
    </script>
  </head>
  <body>
  <input type="button" value="发送单个字符串的json到服务端" id="btn1"/><br/>
  <input type="button" value="发送JavaBean的json到服务端" id="btn2"/>
  </body>
</html>
