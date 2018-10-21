<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
	<meta
 http-equiv="Content-Type" content="text/html; charset=utf-8"/>
		<jsp:include page="top.jsp"></jsp:include>
			<script src="../js/jquery-1.11.3.min.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="container" id="editcategoryContainer">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="row">
				<!--<jsp:include page="left.jsp"></jsp:include>
				--><div class="span9">
					<h1>
						 修改一级分类
					</h1>
						<fieldset>
							<div class="control-group">
								<label class="control-label" for="input01">一级目录名称</label>
								<div class="controls">
									<input type="text" class="input-xlarge"  name="cname"  v-model="cname"
									  :placeholder="list.cname"
									 />
									
									
								</div>
							</div>
							
													
							<div class="form-actions">
								<button type="submit" class="btn btn-primary" @click="modify();">修改</button> 
								&nbsp;&nbsp;
								<button class="btn" onclick="javascript:history.back();">取消</button>
							</div>
						</fieldset>
					
				</div>
			</div>
		</div>
		
		
	</body>
		<script src="../js/vue.min.js"></script>
<script src="../js/vue-resource.js"></script>


<script type="text/javascript">
var pinfovue=new Vue({
	el:'#editcategoryContainer',
	data:{
	   cname:"",
	   list:[]
	   
	
},
methods:{
	modify:function(){
	 var cid=getQueryString("cid");
	 var params={"cid":cid,"cname":this.cname};
	this.$http.post("modifyCategories",params,{emulateJSON:true}).then(
   		  function(res){
   			 alert("修改成功！");
                
                 location.href="/shop/admin/category_list";
                 },
             function(res){
                     console.log(res);
                 }); 
         

}  
},
created:function(){
		this.beforename
		var cid=getQueryString("cid");
		 this.$http.post("getname",{"cid":cid},{emulateJSON:true}).then(
		   		  function(res){
		   			this.list=res.data;
		   			  
		                 },
		             function(res){
		                     console.log(res);
		                 }); 
		
					
}
});
</script>
</html>

