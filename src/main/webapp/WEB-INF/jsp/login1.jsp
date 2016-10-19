<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<title>用户登录</title>
	<meta name="viewport"
		content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
	<meta name="apple-mobile-web-app-capable" content="yes" />
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<link rel="shortcut icon" href="<%=path%>/favicon.ico" type="image/x-icon" />
    <!-- Bootstrap Core CSS -->
    <link href="<%=path%>/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- MetisMenu CSS -->
    <link href="<%=path%>/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%=path%>/dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%=path%>/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title" align="center" style="font-size: 20px;border: 10;">隆基泰和房屋管理系统</h3>
                    </div>
                    <div class="panel-body">
                        <form role="form" id="userForm" action="<%=path%>/user/logincheck.do" method="post">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="姓名拼音" name="username" id="userName" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="密码" id="userPassword" name="userpassword" type="password" value="">
                                </div>
                                <c:if test="${errorUserMess ne null }">
                                	<div class="form-group">
                                		<span>${errorUserMess}</span>
                                	</div>
                                </c:if>
                                <div class="checkbox">
                                    <label>
                                        <input name="remember" type="checkbox" value="Remember Me">记住我
                                    </label>
                                </div>
                                <!-- Change this to a button or input when using this as a form -->
                                <a href="javascript:void(0)" onclick="checkNameAndPass()" class="btn btn-lg btn-success btn-block">登陆</a>
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <!-- jQuery -->
    <script src="<%=path%>/vendor/jquery/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%=path%>/vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="<%=path%>/vendor/metisMenu/metisMenu.min.js"></script>
    <!-- 页面弹出层 -->
    <script src="<%=path%>/vendor/layer/layer.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="<%=path%>/dist/js/sb-admin-2.js"></script>
    
    <script type="text/javascript">
	    function checkNameAndPass(){
	    	var name = $("#userName").val();
	    	var password = $("#userPassword").val();
	    	if(name == null || name == ''){
	    		layer.msg("用户名不能为空");
	    		return;
	    	}
	    	if(password == null || password == ''){
	    		layer.msg("密码不能为空");
	    		return;
	    	}
	    	$("#userForm").submit();
	    }
    </script>

</body>

</html>
