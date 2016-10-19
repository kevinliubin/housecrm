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
				<h1 class="page-header" align="center">小区信息列表</h1>
			</div>
			<!-- /.col-lg-12 -->
		</div>
		<!-- /.row -->
		<div class="row">
			<div class="col-xs-1" align="left">
				<button class="btn btn-info" onclick="turnToAddSubdist()">新增小区</button>
			</div>
			<div class="col-xs-2">
					<input type="text" id="name" name="name" class="form-control" placeholder="名称"/>
			</div>
			<button class="btn btn-success" onclick="searchSubdist()">查询</button>
			<button class="btn btn-success" onclick="exportSubdist()">导出小区信息</button>
			<br>
			<div class="col-lg-12">
				<div class="panel panel-default">
					<!-- /.panel-heading -->
					<div class="panel-body">
						<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
							<!-- 在这个TABLE填充数据 -->
						</table>
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
		
		<div class="modal fade" id="AddSubdist" tabindex="-1" role="dialog" 
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div class="modal-dialog" style="width:300px;margin-top:200px;">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			             		添加小区信息
			            </h4>
			         </div>
			         	<form action="<%=path%>/sub/addSubdist" method="post" id="AddSubdistForm" enctype="multipart/form-data">
				         	<div class="modal-body">
				         		<input type="hidden" name="token" value="${token}" />
								小区名称：<input type="text" class="form-control"  name="subdistrictname" placeholder="名称" value=""/>
								小区描述：<input type="text" class="form-control"  name="subdistrictdiscribe" placeholder="描述" value=""/>
								小区地址：<input type="text" class="form-control"  name="subdistrictaddr" placeholder="地址" value=""/>
								图片1：<input type="file" class="form-control"  name="myfiles" />
								图片2：<input type="file" class="form-control"  name="myfiles" />
								图片3：<input type="file" class="form-control"  name="myfiles" />
					         </div>
				         <div class="modal-footer">
				            <button type="button" class="btn btn-default" 
				               data-dismiss="modal">关闭
				            </button>
				            <button type="button" class="btn btn-primary" onclick="submitAddSubdist()">
				             		添加
				            </button>
			         	</div>
			         	</form>
			      </div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
		
		<div class="modal fade" id="recyleModal" tabindex="-1" role="dialog" 
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div class="modal-dialog" style="width:300px;margin-top:200px;">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			             		修改小区信息
			            </h4>
			         </div>
			         	<form action="<%=path%>/sub/updateSubdist" method="post" id="updateSubdist">
				         	<div class="modal-body">
				         		<input type="hidden" id="subdistrictid" name="subdistrictid" value="" />
								名称：<input type="text" class="form-control" id="subdistrictname" name="subdistrictname" value=""/>
								描述：<input type="text" class="form-control" id="subdistrictdiscribe" name="subdistrictdiscribe" value=""/>
								地址：<input type="text" class="form-control" id="subdistrictaddr" name="subdistrictaddr" value=""/>
								所属范围：<input type="text" class="form-control" id="subdistrictbelong" name="subdistrictbelong" value=""/>
					         </div>
				         <div class="modal-footer">
				            <button type="button" class="btn btn-default" 
				               data-dismiss="modal">关闭
				            </button>
				            <button type="button" class="btn btn-primary" onclick="confirmModify()">
				             		提交修改
				            </button>
			         	</div>
			         	</form>
			      </div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
		
		
	</div>
	<!-- /#page-wrapper -->

	<!-- /#wrapper -->

	<!-- jQuery -->
	<script src="<%=path%>/vendor/jquery/jquery.min.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="<%=path%>/vendor/bootstrap/js/bootstrap.min.js"></script>

	<!-- Metis Menu Plugin JavaScript -->
	<script src="<%=path%>/vendor/metisMenu/metisMenu.min.js"></script>

	<!-- DataTables JavaScript -->
	<script src="<%=path%>/vendor/datatables/js/jquery.dataTables.min.js"></script>
	<script src="<%=path%>/vendor/datatables-plugins/dataTables.bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/bootstrap-table.js"></script>
	<script type="text/javascript" src="<%=path%>/js/bootstrap-table-zh-CN.js"></script>
	<script src="<%=path%>/vendor/datatables-responsive/dataTables.responsive.js"></script>

	<!-- Custom Theme JavaScript -->
	<script src="<%=path%>/dist/js/sb-admin-2.js"></script>

	<!-- Page-Level Demo Scripts - Tables - Use for reference -->
	<script>
	
	
		<!--页面加载时候  加载这个方法-->
	    $(document).ready(function() {
	    	iniTable();
	    });
	    
	    function iniTable(){
			var requestUrl = "<%=path%>/sub/subpage";
			$('#dataTables-example').bootstrapTable({
	    	    url: requestUrl, 
	    	    method: 'post',      //请求方式（*）
	    	    striped: true,      //是否显示行间隔色
	    	    cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
	    	    sortable: true,      //是否启用排序
	    	    sortOrder: "desc",          //排序方式 
	    	    pagination: true,          //是否显示分页（*）
	    	    sidePagination: "server",      //分页方式：client客户端分页，server服务端分页（*）
	            pageNumber:1,            //初始化加载第一页，默认第一页
	            pageSize: 6,            //每页的记录行数（*）
	            pageList: [5, 10, 15],    //可供选择的每页的行数（*）
	    	    minimumCountColumns: 2,    //最少允许的列数
	    	    clickToSelect: true,    //是否启用点击选中行
	    	    uniqueId: "subdistrictid",      //每一行的唯一标识，一般为主键列
	    	    showToggle:false,     //是否显示详细视图和列表视图的切换按钮
	    	    columns: [
	    	              {title: 'subdistrictId',field: 'subdistrictid',align: 'center',valign: 'middle',visible:false}, 
		                  {field:'operate', title:'小区展示',align:'center',width:'80px',
			               	   formatter:function(value, row, index){
				               		var b = '<img src=\''+row.subdistrictpic+'\' width=100px;/>';
				               	    return b;
			               	   }
			              },
		                  {title: '小区名称',field: 'subdistrictname',align: 'center',valign: 'middle',width:'100px'}, 
		                  {title: '小区地址',field: 'subdistrictaddr',align: 'center',valign: 'middle',width:'100px'},
		                  {field:'operate', title:'查看详情',align:'center',valign: 'middle',width:'80px',
			               	   formatter:function(value, row, index){
				               		var a = '<font size=6><i style="cursor:hand;" class="glyphicon glyphicon-search" onclick="searchMore(\''+row.subdistrictid+'\')"></i></font>';
				               		var c = '<span>  </span>'
				               		var b = '<font size=6><i style="cursor:hand;" class="glyphicon glyphicon-cog" onclick="modifyMore(\''+row.subdistrictid+'\')"></i></font>';
				               	    return a+c+b;
			               	   }
			              }
		                  
		          ]
	          });
		}
	    
	    function turnToAddSubdist(){
	    	$('#AddSubdist').modal({
			      keyboard: true
		   });
	    }
	    
	    /**跳转到个人详情页面 **/
	    function searchMore(id){
	    	window.location.href='<%=path%>/sub/subInfoById/'+id;
	    	
	    }
	    
	    /** 保存修改 **/
	    function confirmModify(){
	    	
	    	$("#updateSubdist").submit();
	    }
	    
	    /**保存**/
	    function submitAddSubdist(){
	    	$("#AddSubdistForm").submit();
	    }
	    
	    
	    /**设置**/
	    function modifyMore(subId){
	    	var url = '<%=path%>/sub/modifySubInfo/'+subId ;
	    	$.ajax({
	    		type:"POST",
	    		url:url,
	    		async:false,
	    		success:function(msg){
	    			var data = jQuery.parseJSON(msg);
	    			$("#subdistrictid").val(subId);
	    			$("#subdistrictname").val(data.subdistrictname);
	    			$("#subdistrictdiscribe").val(data.subdistrictdiscribe);
	    			$("#subdistrictaddr").val(data.subdistrictaddr);
	    			$("#subdistrictbelong").val(data.subdistrictbelong);
			    	$('#recyleModal').modal({
					      keyboard: true
				   });
	    		}
	    	});
	    }
	    /**查询 **/
	    function searchSubdist(){
	    	var na = $("#name").val();
	    	if(na == null || na ==""){
	    		var  url = '<%=path%>/sub/subpage';
	    	}else{
	    		var name =encodeURI(encodeURI(na));
		    	url = '<%=path%>/sub/subdistRefush/'+name;
	    	}
	    	$('#dataTables-example').bootstrapTable('refresh',{url:url});
	    }
	    /** 导出小区信息 **/
	    function exportSubdist(){
	    	window.location.href='<%=path%>/sub/exprtSubdist';
	    }
    </script>

</body>

</html>
