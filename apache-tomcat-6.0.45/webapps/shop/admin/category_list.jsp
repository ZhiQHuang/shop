<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Stict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-
strict.dtd">
<html lang = "zh-CN">

	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<jsp:include page="top.jsp"></jsp:include>
		<script src="../js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="../js/bootstrap.min.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="container" id="categoryContainer">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="row">
				<jsp:include page="left.jsp"></jsp:include>
				<div class="span9">
					<h1>
						商品分类列表
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
									操作
								</th>
							</tr >
								
								<tr v-for="(item,index) in categoryList" >
								<th>
									{{index+1}}
								</th>
								<th >
									{{item.cname}}
								</th>
								
								<th>
								  	<a class="link-update" @click="javascript:modify(item.cid)">修改</a>
							     <a class="link-del"  @click="javascript:del(item.cid)"> 删除</a>
								</th>
							</tr >
						</thead>
						<tbody>
							
						</tbody>
					</table>
					
							<td colspan="3">
							
							<input type="text" name="keyname" v-model="name">

							<button type="button" class="btn btn-primary" @click="javascript:find();">一级分类查找</button>
							
							
							
							</td>
		

									
					<div class="pagination">
						<ul id="pagination1"></ul>
					</div>
					<a class="toggle-link" href="#form">
						<i class="icon-plus"></i> 新增商品分类</a>
					<form id="form" class="form-horizontal hidden">
						<fieldset>
							<legend>新增商品分类</legend>
							<div class="control-group">
								<label class="control-label" for="input01">商品分类名称</label>
								<div class="controls">
									<input type="text" class="input-xlarge" id="cname" v-model="cname"/>
								</div>
							</div>
							
							<div class="form-actions">
								<button type="button" class="btn btn-primary" @click="javascript:insert();">创建</button> 
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
var pinfovue=new Vue({
	el:'#categoryContainer',
	data:{
	categoryList:[],
	cname:"",
	name:"",
	selectList:[],
	beforecname:""
},
methods:{
	del:function(cid){
	 this.$http.post("deleteCategories",{"cid":cid},{emulateJSON:true}).then(
   		  function(res){
   			 alert("删除成功！");
	           window.location.reload(true);
                 
                 },
             function(res){
                     console.log(res);
                 }); 

},
insert:function(){
	 this.$http.post("insertCategories",{"cname":this.cname},{emulateJSON:true}).then(
	   		  function(res){
	   			 alert("添加成功！");
		           window.location.reload(true);
	                 
	                 },
	             function(res){
	                     console.log(res);
	                 }); 

	},
	find:function(){
		 this.$http.post("findCategories",{"cname":this.name},{emulateJSON:true}).then(
		   		  function(res){
		   			this.selectList=res.data;
		   			if(this.selectList.length>0){
		   				window.location.reload(true);
		   				alert("查找成功！");
		                var truename=encodeURI(encodeURI(this.name));
		   			 location.href="search_category?cname="+truename;
			   			}else{
			   				alert("没有匹配的目录！");
				   			}
		          
		                 
		                 },
		             function(res){
		                     console.log(res);
		                 }); 

		},
modify:function(cid){

			  location.href="edit_category?cid="+cid;
			
	 

}     
},
created:function(){

	//created代表当页面加载完成，立刻执行后面的方法
	//发生Ajax请求
	this.$http.get("getCategories").then(
			function(res){
				//请求成功
				this.categoryList=res.data;
},
function(res){
	//请求失败
	console.log(res);
});
					
}
});


</script>


	
</html>

