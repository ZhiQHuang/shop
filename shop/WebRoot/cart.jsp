<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="isLogin.jsp" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>商城购物车</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
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
			
			font {
				color: #3164af;
				font-size: 18px;
				font-weight: normal;
				padding: 0 10px;
			}
		</style>
	</head>

	<body>
		<!-- 引入header.jsp -->
		<jsp:include page="header.jsp"></jsp:include>

		<div class="container" id="cartContainer" style="width: 100%; background: url('img/regist_bg.jpg');">
			<div class="row">

				<div style="margin:0 auto; margin-top:10px;width:950px;">
					<div style="width:100%;font-size:20px;margin:10px 0px;height:50px;background-color: #d3d3d3;">
					<div style="line-height:50px;margin:10px;"><strong>购物车</strong></div>
					</div>
					<table class="table table-bordered">
						<thead>
							<tr class="warning">
								<th width="7%">选择</th>
								<th width="20%">图片</th>
								<th width="20%">商品</th>
								<th width="20%">价格</th>
								<th width="10%">数量</th>
								<th width="15%">小计</th>
								<th width="7%">操作</th>
							</tr>
						</thead>
						<tbody>
							<tr class="active" v-for="(item,index) in cartList ">
								<td>
								<input type="checkbox" name="selectList" :value="index"
								    :id="item.sid"  v-model="selectList"/>
								</td>
								<td>
									<img :src="item.image" width="70" height="60">
								</td>
								<td>
									<a href="#" target="_blank">{{item.pname}}</a>
								</td>
								<td>
									￥{{item.newPrice}}
								</td>
								<td>
									<input type="number" name="quantity" :value="item.count" 
									 min="1" maxlength="4" size="10" @change="changeNumber(item,$event)">
								</td>
								<td>
									<span class="subtotal">￥{{item.newPrice*item.count}}</span>
								</td>
								<td>
									<a href="javascript:;" class="delete" @click="deleteItem(item,index)">删除</a>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>

			<div style="margin-right:130px;">
				<div style="text-align:right;">
					&nbsp; 
			总金额: <strong style="color:#ff6600;">￥{{total}}元</strong>
				</div>
				<div style="text-align:right;margin-top:10px;margin-bottom:10px;">
					<a href="javascript:;">
						<input type="button" width="100" value="提交订单" name="submit" 
						 @click="submitOrder()"  border="0" style="background: url('img/register.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0);
						height:35px;width:100px;color:white;">
					</a>
				</div>
			</div>

		</div>

		<!-- 引入footer.jsp -->
		<jsp:include page="footer.jsp"></jsp:include>

	</body>
<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script type="text/javascript">

    var cartvue=new Vue({
        el:'#cartContainer',
        data:{
    	cartList:[],
    	selectList:[]

        },
       computed:{
          total:function(){
             //总金额计算得到
              //selectList表示用户选择的购物项，与复选框绑定
              //将用户选择的所有项的金额加起来，成为总金额
              var sum=0;
              var len=this.selectList.length;
              for ( var i= 0;i< len;i++) {
            	  var index=this.selectList[i];
                  var item=this.cartList[index];

                  if (item) {
                      sum+=item.newPrice*item.count;
				} else {
                             continue;
				 }
		  	}
  			return sum;
            }
            },
       

        
        methods:{
          changeNumber:function(item,event){
             var obj=$(event.target);
             item.count=obj.val();
             //金额的变化存入到数据库中
             item.subtotal=item.newPrice*item.count;
         	this.$http.post("changeShopCart",item,{emulateJSON:true}).then(
        			function(res){
        				//请求成功
        				
        },
           function(res){
        	//请求失败
        	console.log(res);
              });  
            },
            deleteItem(item,index){
                if (confirm("您确认要删除此商品的么？")){
              	  this.cartList.splice(index,1);
              	 	this.$http.post("deleteShopCart",{"sid":item.sid},{emulateJSON:true}).then(
                  			function(res){
                  				//请求成功
                  				alert("删除成功");
                  				
                  },
                     function(res){
                  	//请求失败
                  	console.log(res);
                        });
                    
  				
  			}     
                  },
                  submitOrder:function(){
                	  if (confirm("您确认要提交订单的么？")){
                    var cartIds=new Array();
                    var len=this.selectList.length;
                    for ( var i= 0;i< len;i++) {
                  	  var index=this.selectList[i];
                        var item=this.cartList[index];

                        if (item) {
                        	cartIds.push(item.sid)
      				} else {
                                   continue;
      				 }
      		  	} 

          		  	var params={"total":this.total,"cartIds":cartIds};
          			this.$http.post("submitOrder",params,{emulateJSON:true}).then(
                  			function(res){
                  				//请求成功
                  				//接受服务器传递过来的订单编号，转到order_info页面，显示订单详情，让用户付款
                  				location.href="order_info?oid="+res.data.result+"&total="+this.total;
                  				
                  },
                     function(res){
                  	//请求失败
                  	console.log(res);
                        });
                    	  }

                      }
      
            
  
          },
            created:function(){
            	//created代表当页面加载完成，立刻执行后面的方法
            	//发生Ajax请求
            	this.$http.get("getShopCart").then(
            			function(res){
            				//请求成功
            				this.cartList=res.data;
            },
            function(res){
            	//请求失败
            	console.log(res);
            });
            }
        
        });

</script>
</html>