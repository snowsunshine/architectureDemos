<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
         language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
<h2>Hello World!</h2>
<div>
    <form id="loginForm" class="formList clearfix"
          action='<c:url value="/login.html"/>' method="post">
        <div >
            <input type="text"  id="input_test"
                   name="username" value="请输入用户名" data-options="required:true"
                   autocomplete="off" />
        </div>
        <div >
            <input type="text"  id="input_test1"
                   value="请输入密码" data-options="required:true"
                   onkeydown="LoginSubmit()" />
        </div>
        <div class="dl">
            <a href="javascript:;" onclick="sub()"></a>
        </div>
    </form>
</div>
<script>
    function sub(){
        $('#loginForm').submit();
    }
</script>
</body>
</html>
