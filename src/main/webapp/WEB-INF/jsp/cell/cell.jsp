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
				<button class="btn btn-info" onclick="turnToAddCell()">新增小区住房</button>
			</div>
			
			<div class="dropdown col-xs-1">
			    <button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown">小区选择
			        <span class="caret"></span>
			    </button>
			    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
			    	<c:forEach items="${allSubdistList }" var="sub">
				        <li role="presentation">
				            <a id="${sub.subdistrictid }" role="menuitem" tabindex="-1" href="#"><c:out value="${sub.subdistrictname }"></c:out></a>
				        </li>
			    	</c:forEach>
			    </ul>
			</div>
			<button class="btn btn-success" onclick="searchCell()">查询</button>
			
			<div class="col-xs-2">
					<input type="text" id="name" name="name" class="form-control" placeholder="名称"/>
			</div>
			<button class="btn btn-success" onclick="exportCell()">导出小区信息</button>
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
		
		<div class="modal fade" id="AddCell" tabindex="-1" role="dialog" 
			   aria-labelledby="myModalLabel" aria-hidden="true">
			   <div class="modal-dialog" style="width:600px;margin-top:200px;">
			      <div class="modal-content">
			         <div class="modal-header">
			            <button type="button" class="close" 
			               data-dismiss="modal" aria-hidden="true">
			                  &times;
			            </button>
			            <h4 class="modal-title" id="myModalLabel">
			             		添加小区房屋信息
			            </h4>
			         </div>
			         	<form action="<%=path%>/cell/addCell" method="post" id="AddCellForm">
				         	<div class="modal-body">
				         		<input type="hidden" name="token" value="${token}" />
								小区名称：
								<select name="subname" id="subname" class="form-control">
									 <option value="" disabled selected>请选择小区</option>  
									<c:forEach items="${allSubdistList }" var="subdist">
										<option value="${subdist.subdistrictid }">${subdist.subdistrictname }</option>
									</c:forEach>
								</select>
								楼层：<input type="text" class="form-control"  name="cellfloor" placeholder="楼层(输入数字)" value=""/>
								单元号：<input type="text" class="form-control"  name="cellname" placeholder="单元号(3-101)" value=""/>
								房屋面积：<input type="text" class="form-control"  name="cellname" placeholder="面积/m2" value=""/>
								价格/m2：<input type="text" class="form-control"  name="cellmoney" placeholder="单位价格" value=""/>
								折扣点：<input type="text" class="form-control"  name="cellmoney" placeholder="折扣点(几个点)" value=""/>
					         </div>
				         <div class="modal-footer">
				            <button type="button" class="btn btn-default" 
				               data-dismiss="modal">关闭
				            </button>
				            <button type="button" class="btn btn-primary" onclick="submitAddCell()">
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
			         	<form action="<%=path%>/sub/updateCell" method="post" id="updateCell">
				         	<div class="modal-body">
				         		<input type="hidden" id="Cellrictid" name="Cellrictid" value="" />
								名称：<input type="text" class="form-control" id="Cellrictname" name="Cellrictname" value=""/>
								描述：<input type="text" class="form-control" id="Cellrictdiscribe" name="Cellrictdiscribe" value=""/>
								地址：<input type="text" class="form-control" id="Cellrictaddr" name="Cellrictaddr" value=""/>
								所属范围：<input type="text" class="form-control" id="Cellrictbelong" name="Cellrictbelong" value=""/>
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
			var requestUrl = "<%=path%>/cell/cellpage";
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
	            pageSize: 20,            //每页的记录行数（*）
	            pageList: [5, 10, 15],    //可供选择的每页的行数（*）
	    	    minimumCountColumns: 2,    //最少允许的列数
	    	    clickToSelect: true,    //是否启用点击选中行
	    	    uniqueId: "cellid",      //每一行的唯一标识，一般为主键列
	    	    showToggle:false,     //是否显示详细视图和列表视图的切换按钮
	    	    columns: [
	    	              {title: 'cellid',field: 'cellid',align: 'center',valign: 'middle',visible:false}, 
		                  {title: '单元楼层',field: 'cellname',align: 'center',valign: 'middle',width:'100px'}, 
		                  {title: '单元面积',field: 'cellarea',align: 'center',valign: 'middle',width:'100px'},
		                  {title: '价格/m2',field: 'cellmoney',align: 'center',valign: 'middle',width:'100px'},
		                  {title: '折扣',field: 'cellpoint',align: 'center',valign: 'middle',width:'100px'},
		                  {title: '总价',field: 'celltotal',align: 'center',valign: 'middle',width:'100px'},
		                  {field:'operate', title:'查看详情',align:'center',valign: 'middle',width:'80px',
			               	   formatter:function(value, row, index){
				               		var a = '<font size=6><i style="cursor:hand;" class="glyphicon glyphicon-search" onclick="searchMore(\''+row.Cellrictid+'\')"></i></font>';
				               		var c = '<span>  </span>';
				               		var b = '<font size=6><i style="cursor:hand;" class="glyphicon glyphicon-cog" onclick="modifyMore(\''+row.Cellrictid+'\')"></i></font>';
				               	    return a+c+b;
			               	   }
			              }
		                  
		          ]
	          });
		}
	    
	    function turnToAddCell(){
	    	$('#AddCell').modal({
			      keyboard: true
		   });
	    }
	    
	    /**跳转到个人详情页面 **/
	    function searchMore(id){
	    	window.location.href='<%=path%>/sub/subInfoById/'+id;
	    	
	    }
	    
	    /** 保存修改 **/
	    function confirmModify(){
	    	
	    	$("#updateCell").submit();
	    }
	    
	    /**保存**/
	    function submitAddCell(){
	    	//做验证
	    	$("#AddCellForm").submit();
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
	    			$("#Cellrictid").val(subId);
	    			$("#Cellrictname").val(data.Cellrictname);
	    			$("#Cellrictdiscribe").val(data.Cellrictdiscribe);
	    			$("#Cellrictaddr").val(data.Cellrictaddr);
	    			$("#Cellrictbelong").val(data.Cellrictbelong);
			    	$('#recyleModal').modal({
					      keyboard: true
				   });
	    		}
	    	});
	    }
	    /**查询 **/
	    function searchCell(){
	    	var na = $("#name").val();
	    	if(na == null || na ==""){
	    		var  url = '<%=path%>/sub/subpage';
	    	}else{
	    		var name =encodeURI(encodeURI(na));
		    	url = '<%=path%>/sub/CellRefush/'+name;
	    	}
	    	$('#dataTables-example').bootstrapTable('refresh',{url:url});
	    }
	    /** 导出小区信息 **/
	    function exportCell(){
	    	window.location.href='<%=path%>/sub/exprtCell';
	    }
    </script>

</body>

</html>
