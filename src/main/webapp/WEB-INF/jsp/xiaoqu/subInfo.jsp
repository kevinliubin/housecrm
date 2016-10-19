<%@ page language="java" import="java.util.*"
	contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>隆基泰和小区总览</title>
<link rel="shortcut icon" href="<%=path%>/favicon.ico"
	type="image/x-icon" />
<!-- Bootstrap Core CSS -->
<link href="<%=path%>/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">
<!-- 导入bootstrap TABLE 的css-->
<link rel="stylesheet" href="<%=path%>/dist/css/bootstrap-table.css">

<!-- MetisMenu CSS -->
<link href="<%=path%>/vendor/metisMenu/metisMenu.min.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="<%=path%>/dist/css/sb-admin-2.css" rel="stylesheet">

<!-- Morris Charts CSS -->
<link href="<%=path%>/vendor/morrisjs/morris.css" rel="stylesheet">

<!-- Custom Fonts -->
<link href="<%=path%>/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">

<!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
<style type="text/css">
</style>
</head>
<body>
	<!-- 导入导航 -->
 	<%@ include file="../home.jsp" %>
 	<div id="page-wrapper">
 		
 		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header" align="center"><c:out value="${subdistrict.subdistrictname }"></c:out>小区信息展示</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div>
 			<button class="btn btn-default" onclick="showSubList()">返回列表页面</button>
 		</div>
		<div class="row">
			<div class="page-header">
		    <h1>小区描述
		        <small></small>
		    </h1>
			</div>
			<p><c:out value="${subdistrict.subdistrictdiscribe }"></c:out></p>
		</div>
		<div class="container">
			<p>小区内饰</p>                  
			<img src="<c:out value="${subdistrict.subdistrictpic }"></c:out>" class="img-responsive" alt="Cinque Terre"> 
			<img src="<c:out value="${subdistrict.subdistrictpic2 }"></c:out>" class="img-responsive" alt="Cinque Terre"> 
			<img src="<c:out value="${subdistrict.subdistrictpic3 }"></c:out>" class="img-responsive" alt="Cinque Terre"> 
		</div>
 	</div>

</body>
<script type="text/javascript">
	//跳转到列表页面
	function showSubList(){
		window.location.href='<%=path%>/sub/subList';
	}
</script>
</html>