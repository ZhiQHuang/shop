<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
		<jsp:include page="top.jsp"></jsp:include>
	</head>
	<body>
		<div class="container" id="etContainer">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="row">
				<!--<jsp:include page="left.jsp"></jsp:include>
				--><div class="span9">
					<h1>
						 修改二级商品分类
					</h1>
					<form id="form" class="form-horizontal">
						<fieldset>
							<legend>修改二级商品分类</legend>
							<div class="control-group">
								<label class="control-label" for="input01">商品二级分类名称</label>
								<div class="controls">
									<input type="text" class="input-large" v-model="tcname" />
								</div>
								
							</div>
								<div class="control-group">
								<label class="control-label" for="input01">分类类型</label>
								<div class="controls">
									<select v-model="selected">
										<option v-for="item in categoryList" :value="item.cid" >{{item.cname}}</option>
									</select>
								</div>
							</div>
							
							<div class="form-actions">
								<a class="btn btn-primary" href="javascript:;" @click="modify()">修改</a>
								<button class="btn">取消</button>
							</div>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</body>
	
	<script src="../js/vue.min.js"></script>
	<script src="../js/vue-resource.js"></script>
	<script type="text/javascript">
		var tvue = new Vue({
		el:"#etContainer",
		data:{
			tcname:"",
			categoryList:[],
			selected:"",
			tcp:[]
		},
		methods:{
			modify:function(tcid){
				var params = {"tcid":getQueryString("tcid"),"tcname":this.tcname,"cid":this.selected};
				this.$http.post("modifyTwoCategories",params,{emulateJSON:true}).then(
				function(res){
					alert("修改成功！");
					location.href="twocategory_list";
				},
				function(res){
					console.log(res);
				});
			}
		},
		created:function(){
			var params={"tcid":getQueryString("tcid")};
			this.$http.get("getCategories").then(
			function(res){
				this.categoryList=res.data;
			},
			function(res){
				console.log(res);
			});
			
			this.$http.post("getTwoCategoryByTcid",params,{emulateJSON:true}).then(
	        function(res){
	        	this.tcp=res.data;
	        	this.tcname=this.tcp.tcname;
	        	this.selected=this.tcp.cid;
	          },
	          function(res){
	          	console.log(res);
	          }
	       );
		}
	});
</script>	
</html>

