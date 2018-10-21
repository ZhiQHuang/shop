
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
		<link rel="stylesheet" href="../css/zpageNav.css" />
	</head>
	<body>
		<div class="container" id="stcContainer">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="row">
				<jsp:include page="left.jsp"></jsp:include>
				<div class="span9"  id="tContainer">
					<h1>
						商品二级分类列表
					</h1>
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>
									序号
								</th>
								<th>
									分类名称
								</th>
								<th>
									类型
								</th>
								<th>
									操作
								</th>
							</tr>
						</thead>
						<tbody v-for="(item,index) in twocategoryList">
								<tr>
									<td>
										{{index+1}}
									</td>
									<td>
										{{item.tcname}}
									</td>
									<td>
										{{item.cname}}
									</td>
									<td>
										<a class="link-update" href="javascript:;" @click="modify(item.tcid)">修改</a>
										<a class="link-update" href="javascript:;" @click="del(item.tcid)">删除</a>
									</td>
								</tr>
						</tbody>
					</table>
					
					<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
						<zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-bind:max-page="maxPage"
						v-on:pagehandler="pageHandler">
						</zpagenav>
				</div>
				</div>
			</div>
			
		</div>
		
	</body>
	
	<script src="../js/vue.min.js"></script>
	<script src="../js/vue-resource.js"></script>
	<script src="../js/zpageNav.js"></script>
	<script type="text/javascript">
	var vue1 = new Vue( {
		el : "#stcContainer",
		data : {
			twocategoryList:[],
			page : 1,
			pageSize : 10,
			total : 100,
			maxPage : 9
		},
		methods : {
			pageHandler : function(page) {
				this.page = page;
				var params = {
					"page" : page,
					"row" : this.pageSize,
					"tcname" : getQueryString("searchContent")
				};
				this.$http.post("getTwoCategoryByTcname", params, {
					emulateJSON : true
				}).then(function(res) {
					this.twocategoryList = res.data.list;
					this.total = res.data.total;
					this.maxPage = res.data.pages;
				}, function(res) {
					console.log(res);
				});
			},
			del:function(tcid){
				this.$http.post("deleteTwoCategories",{"tcid":tcid},{emulateJSON:true}).then(
				function(res){
					alert("删除成功！");
					window.location.reload(true);
				},
				function(res){
					console.log(res);
				});
			},
			modify:function(tcid){
				location.href="edit_twocategory?tcid="+tcid;
			}
		},
		created : function() {
			this.pageHandler(1);
		}
	});
</script>
</html>

