<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="en"><!--<![endif]--> 
	<head>
		<jsp:include page="top.jsp"></jsp:include>
		<script src="../js/jquery.min.js" type="text/javascript"></script>
		<script src="../js/bootstrap.min.js" type="text/javascript"></script>
	</head>
	<body>
		<div class="container" id="selectcategoryContainer">
			<jsp:include page="header.jsp"></jsp:include>
			<div class="row">
				<jsp:include page="left.jsp"></jsp:include>
				<div class="span9">
					<h1>
						搜索商品分类列表
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
								
								<tr v-for="(item,index) in selectList" >
								<th>
									{{index+1}}
								</th>
								<th>
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
							
				</div>
			</div>
		</div>
		
	</body>
	
	<script src="../js/vue.min.js"></script>
<script src="../js/vue-resource.js"></script>
<script type="text/javascript">
var pinfovue=new Vue({
	el:'#selectcategoryContainer',
	data:{
　　　　selectList:[],
        cname:""
},
methods:{del:function(cid){
	 this.$http.post("deleteCategories",{"cid":cid},{emulateJSON:true}).then(
   		  function(res){
   			 alert("删除成功！");
	           window.location.reload(true);
                 
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
     this.cname=getQueryString("cname");
	//获取商品详情
	this.$http.post("findCategories",{"cname":this.cname},{emulateJSON:true}).then(
			function(res){
			    
				this.selectList=res.data;
				
	
			},
			
function(res){
	console.log(res);
}
);

					
}
});


</script>




	
</html>

