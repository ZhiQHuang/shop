<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
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
						商品列表
					</h1>
					<h4>请输入查询条件：</h4>
					<form class="form-horizontal">
						<div class="control-group">
						<fieldset>
						<label class="control-label" for="input01">商品名称：</label>
						<div class="controls">
							<input type="text" name="pname" id="pname"/>
						</div>
						&nbsp;&nbsp;
						<label class="control-label" for="input01">商品分类：</label>
						<div class="controls">
							<select name="cid">
										
							</select>
						</div>
						&nbsp;&nbsp;
						<div class="controls">
						<button type="button" id="search" class="btn btn-primary">查询</button> 
						</div>
						</fieldset>
						</div>
					</form>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									商品编号
								</th>
								<th>
									商品名称
								</th>
								<th>
									商品原价
								</th>
								<th>
									商品新价
								</th>
								<th>
									商品库存
								</th>
								<th>
									商品销量
								</th>								
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody>
							
						</tbody>
					</table>				
					<div class="pagination">
    					<ul id="pagination1"></ul>
					</div>
				</div>
			</div>
		</div>
	</body>

	
	<script type="text/javascript">
		function load(url, params){
			$.ajax({
				url : url,
				type : "post",
				data : params,
				dataType : "json",
				success : function(data){
					$('#pagination1').jqPaginator('option',{
						totalPages : data.pages,
						currentPage : data.pageNumber
					});
					$("tbody").empty();
					$.each(data.list, function(i, n){
						var tr = $("<tr></tr>");
						tr.html("<td>"+(i+1)+"</td>"+
							"<td>"+n.pname+"</td>"+
							"<td>"+n.oldPrice+"</td>"+
							"<td>"+n.newPrice+"</td>"+
							"<td>"+n.total+"</td>"+
							"<td>"+n.volume+"</td>"+
							"<td><a class='link-update' href='javascript:modify("+n.pid+")'>修改</a>&nbsp;"+
								"<a class='link-del' href='javascript:del("+n.pid+")'>删除</a></td>"
						);
						$("tbody").append(tr);
					});
				}
			});
		}
		
		$(function(){
			$.jqPaginator('#pagination1', {
				totalPages : 100,
				visiblePages : 10,
				currentPage : 1,
				pageSize : 10,
				prev : '<li class="prev"><a href="javascript:;">上一页</a></li>',
				next : '<li class="next"><a href="javascript:;">下一页</a></li>',
				page : '<li class="prev"><a href="javascript:;">{{page}}</a></li>',
				onPageChange : function (page, type) {
					var params = {page : page, row : 10};
					var url = "/shop/admin/listProduct";
					load(url, params);
				}
			});
		});
	</script>
	
</html>












