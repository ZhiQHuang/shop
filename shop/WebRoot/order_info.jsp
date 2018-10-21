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
	
	<div class="container" id="orderContainer" style="width: 100%; background: url('img/regist_bg.jpg');">
		<div class="row">
			<div style="margin: 0 auto; margin-top: 10px; width: 950px;">
				<h3><strong>订单详情</strong></h3>
				<table class="table table-bordered">
						<thead>
						<tr style="background-color:#EDEDED;">
							<th colspan="5">
								<h4 style="font-weight: bold;">订单编号:{{orderid}}</h4>
							</th>
						</tr>
						<tr style="background-color:#EDEDED;">
							<th width="30%">图片</th>
							<th width="30%">商品</th>
							<th width="20%">价格</th>
							<th width="10%">数量</th>
							<th width="15%">小计</th>
						</tr>
						</thead>
						<tbody>
						<tr class="active" v-for="item in orderitemList">
							<td>
							 <img :src="item.image" width="70"
								height="60"></td>
							<td><a target="_blank">{{item.pname}}</a></td>
							<td>￥{{item.newPrice}}</td>
							<td>{{item.count}}</td>
							<td><span class="subtotal">￥{{item.subtotal}}</span></td>
						</tr>
					</tbody>
				</table>
			</div>

			<div style="text-align: right; margin-right: 220px;font-size:18px; font-weight: bold;">
				<p>商品总金额: 
				￥<span style="color: #ff6600;" id="amount">{{total}}</span>元</p>
			</div>

		</div>

		<div style="margin: 0 auto; margin-top: 10px; width: 950px;">
			<hr />
			


			<div style="margin-top: 5px; margin-left: 50px;font-size:18px; font-weight: bold;">
				<p>选择支付方式：</p>
				<p>
					<br /> <input type="radio" name="pd_FrpId" value="weixin" checked="checked" />微信<br/>
				    <br/><input type="radio" name="pd_FrpId" value="zhifubao"/>支付宝

				</p>
				<hr />
				<p style="text-align: right; margin-right: 100px;">
					<a href="javascript:;">
						<input type="button" width="150" value="确认付款" name="submit" id="login"
								@click="payOrder()"	style="background: url('img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
					</a>
				</p>
				<hr />

			</div>
		</div>

	</div>

	<!-- 引入footer.jsp -->
	<jsp:include page="footer.jsp"></jsp:include>

</body>
<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script type="text/javascript">

    var headvue=new Vue({
        el:'#orderContainer',
        data:{
    	 orderid:"",
         total:0,
         orderitemList:[]
        },
        methods:{
            payOrder:function(){
        	this.$http.post("payOrder",
                	{"oid":this.orderid,"total":this.total},
                	{emulateJSON:true}).then(
        			function(res){

            			location.href="order_list";
        			},
        			function(res){
        				console.log(res);
        			}
        			);
                }
            
            
          },
            created:function(){
            	//created代表当页面加载完成，立刻执行后面的方法
            	//发生Ajax请求
            	this.orderid=getQueryString("oid");
            	this.total=getQueryString("total");
            	
            	this.$http.post("getOrderitemList",
                    	{"oid":this.orderid},
                    	{emulateJSON:true}).then(
            			function(res){

                			this.orderitemList=res.data;
            			},
            			function(res){
            				console.log(res);
            			}
            			);
            }
        
        });

</script>
</html>