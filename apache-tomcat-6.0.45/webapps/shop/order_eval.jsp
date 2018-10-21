<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@include file="isLogin.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>订单详情</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/util.js" type="text/javascript"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />
<style>
body {
	margin-top: 20px;
	margin: 0 auto;
}

.carousel-inner .item img {
	width: 100%;
	height: 300px;
}
</style>
</head>

<body>
	<!-- 引入header.jsp -->
	<jsp:include page="header.jsp"></jsp:include>
	
	<div class="container" id="pinfoContainer" style="width: 100%; background: url('img/regist_bg.jpg');">
		<div class="row">
			<div style="margin: 0 auto; margin-top: 10px; width: 950px;" >
				<h3><strong>评价订单</strong></h3>
				<table class="table table-bordered" >
						<thead>
						<tr style="background-color:#EDEDED;">
							<th colspan="6">订单编号:<span id="oid">{{orderid}}</span></th>
						</tr>
						<tr style="background-color:#EDEDED;">
							<th width="20%">图片</th>
							<th width="30%">商品</th>
							<th width="20%">价格</th>
							<th width="10%">数量</th>
							<th width="10%">小计</th>
							<th width="15%">评价</th>
						</tr>
						</thead>
						<tbody>
						<tr class="active"   v-for="(item,index) in orderInfo" >
							<td><input type="hidden" name="id"
								value="22"> <img :src="item.image"width="70"
								height="60"></td>
							<td><a target="_blank"> {{item.pname}}</a></td>
							<td>￥ {{item.newPrice}}</td>
							<td>{{item.count}}</td>
							<td><span class="subtotal">￥{{item.subtotal}}</span></td>
							<td colspan="5">
							<textarea id="comment" rows="3" cols="14"></textarea>
						</td>
						</tr>
						
					</tbody>
				</table>
			</div>

		</div>

		<div style="text-align: right;margin-top: 10px; width: 950px;">
			<hr />
			<input type="button" width="100" value="提交评价" name="submit" id="evaluate" @click="commentorders()"
style="background: url('img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">


			
		</div>

	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="footer.jsp"></jsp:include>

</body>
<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script src="js/zpageNav.js"></script>

<script type="text/javascript">
var pinfovue=new Vue({
	el:'#pinfoContainer',
	data:{
	orderid:"",
	orderInfo:[],
	comments:[]
},
methods:{
	commentorders:function(){
     
     
	var params={"pid":1,"context":1};
	alert(params);
	var size=this.orderInfo.length;
	alert(size);
	var pids=getQueryString("pid");
	alert(pids);
	
	    $.post(
	       "commentorders"/*url*/,
	       params,/*向服务器提交的数据（数据名：数据值）*/
	       function(data){//function的参数就是服务器返回的值
	           alert("评论成功！");
	           window.location.reload(true);
	           }//服务器执行完毕，请求成功，执行该函数，该函数的参数代表服务器响应的数据
	       
	    	    );

		
             	   
             } 

             
},
created:function(){
	//created代表当页面加载完成，立刻执行后面的方法
	var params={"oid":getQueryString("oid")};
	this.orderid=getQueryString("oid");
	//获取商品详情
	this.$http.post("getorders",params,{emulateJSON:true}).then(
			function(res){
				this.orderInfo=res.data;
	
			},
			
function(res){
	console.log(res);
}
);

					
}
});


</script>

</html>