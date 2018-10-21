<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]-->
<!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]-->
<!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]-->
<!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!-->
<html lang="en">
	<!--<![endif]-->
	<head>
		<jsp:include page="top.jsp"></jsp:include>


	</head>

	<body>
		<div class="container">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="row">
				<jsp:include page="left.jsp"></jsp:include>
				<div class="span9">
					<h1>
						管理员用户列表
					</h1>
					<form class="navbar-search pull-left" action="" method="post">
								<input type="text" class="search-query span2" placeholder="Search" />
					</form>
					<br/><br/><br/>
					
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									选择
								</th>
								<th>
									序号
								</th>
								<th>
									用户名
								</th>
								<th>
									类型
								</th>
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${adminlist }" var="admin" varStatus="status">
								<tr>
									<td>
										<input type="checkbox" name="delId" value="${admin.uid }" />
									</td>
									<td>
										${status.index+1 }
									</td>
									<td>
										${admin.username }
									</td>
									<td>
										${admin.type }
									</td>
									<td>
										<a class="link-update" href="adminEdit/${admin.uid}.htm">修改</a>
										<a class="link-del" href="javascript:del(${admin.uid })">删除</a>
									</td>
								</tr>
							</c:forEach>

							<tr>
								<td colspan="2">
									<button type="button" class="btn btn-primary" 
									onclick="javascript: batchDel()">
										批量删除
									</button>
								</td>
							</tr>
						</tbody>
					</table>
					<div class="pagination">
						<ul id="pagination1"></ul>
					</div>
					<a class="toggle-link" href="#new-project"> <i
						class="icon-plus"></i> 新增管理员</a>
					<form id="new-project" class="form-horizontal hidden">
						<fieldset>
							<legend>
								新增管理员
							</legend>
							<div class="control-group">
								<label class="control-label" for="input01">
									管理员姓名
								</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="username"
										name="username" />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="select01">
									管理员类型
								</label>
								<div class="controls">
									<select id="type" name="type">
										<option>
											-- 选择管理员类型 --
										</option>
										<option value="1">
											超级管理员
										</option>
										<option value="2">
											普通管理员
										</option>
									</select>
								</div>
							</div>

							<div class="form-actions">
								<button type="button" class="btn btn-primary" onclick="javascript:addAdmin()" >
									创建
								</button>
								<button class="btn">
									取消
								</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>

	</body>

	<script type="text/javascript" src="../js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript">
	function del(uid) {
		$.post("adminDel", {
			uid : uid
		}, function data() {
			alert("操作成功！");
			window.location.reload(true);
		});

	}

	function batchDel() {
		var delIds = new Array();
		$("input:checked").each(function() {
			delIds.push($(this).val());
		});
		$.post("batchDelAdmin", {
			uids : delIds
		}, function(data) {
			alert("操作成功");
			window.location.reload(true);
		});
		}
	
	function addAdmin(){
		var params=$("form").serializeArray();
		$.post(
			"addAdmin",
			params,
			function(data){
				alert("操作成功！");
				window.location.reload(true);
			}
		);
	}
</script>

</html>

