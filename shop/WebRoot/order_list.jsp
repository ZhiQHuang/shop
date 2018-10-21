<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@include file="isLogin.jsp" %>
<!DOCTYPE html>
<html>

<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>订单列表</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/util.js"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link href="css/zpageNav.css" rel="stylesheet">

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

	<div class="container" id="olistContainer" style="width: 100%; background: url('img/regist_bg.jpg');">
		<div class="row">
			<div style="margin: 0 auto; margin-top: 10px; width: 950px;">
				<h3><strong>我的订单</strong></h3>
				<table class="table table-bordered">
					<tbody v-for="(item,index) in orderList">
						<tr class="success">
							<th colspan="5">订单编号:{{item[0].oid}}
							&nbsp;订单时间：{{item[0].ordertime}}
							&nbsp;订单状态：{{item[0].status}}
							&nbsp;物流编号：{{item[0].number}}
							
							</th>
						</tr>
						<tr class="warning">
							<th width="30%">图片</th>
							<th width="30%">商品</th>
							<th width="20%">价格</th>
							<th width="10%">数量</th>
							<th width="15%">小计</th>
							
						</tr>
					
						<tr class="active" v-for="o in item " >
							<td><img :src="o.image" width="70"
								height="60"></td>
							<td><a target="_blank"> {{o.pname}}</a></td>
							<td> {{o.newPrice}}</td>
							<td>{{o.count}}</td>
							<td><span class="subtotal">￥{{o.subtotal}}</span>
							<button v-if="item[0].status=='已收货'" @click="javascript:commentorders(o.pid)">评价</button>  </td>
							
							</tr>
						<tr class="success">
							<th colspan="5">
							<button v-if="item[0].status=='交易成功'" @click="javascript:del(item[0].oid)">删除订单</button>
							&nbsp;<button v-if="item[0].status=='已发货'" @click="javascript:sure(item[0].oid)">确认收货</button>
							&nbsp;<button v-if="item[0].status=='已收货'" @click="commentorders(item[0].oid)">评价订单</button>
							
							</th>
						</tr>
					</tbody>
					
				
				</table>
			</div>
		</div>
		<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
		 <zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" 
		  v-bind:max-page="maxPage" v-on:pagehandler="pageHandler"><zpagenav>
		</ul>
	</div>
</div>
	<!-- 引入footer.jsp -->
	<jsp:include page="footer.jsp"></jsp:include>
	
</body>
<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script src="js/zpageNav.js"></script>
<script type="text/javascript">
var headvue=new Vue({
	
  el:'#olistContainer',
  data:{
	orderList:[],
	page:1,//显示哪一页
	pageSize:5,//该页显示的记录数
	total:100,//记录总数
	maxPage:9//最大的页数
	  },
	methods:{
		  pageHandler: function (page) {//跳转到page页
          this.page = page;//修改显示的页数
           //发送Ajax请求
          var params={"page":page,"row":this.pageSize,"cid":getQueryString("cid")};
          this.$http.post("getOrderListByUid",params,{emulateJSON:true}).then(
        		  function(res){
                      this.orderList=res.data.list;
                      for ( var i = 0; i< this.orderList.length;i++) {
                      for ( var j = 0; j < this.orderList[i].length; j++) {
                      this.orderList[i][j].ordertime=
                      new Date(this.orderList[i][j].ordertime)
                      .format("yyyy年MM月dd日hh：mm：ss");
                      
						
					}
						
					}
                      this.total=res.data.total;
                      this.maxPage=res.data.maxPage;
                      
                      },
                  function(res){
                          console.log(res);
                      }); 
                  },
                  commentorders: function (oid) {
                      
                      //跳转到page页
                	  location.href="order_eval?oid="+oid;
                             },
                  showDetail:function(pid){
                      location.href="product_info?pid="+pid;
                         }
			} ,

	  created:function(){

    this.pageHandler(1);
    }	
       });


</script>

<script type="text/javascript">
function del(oid){
    $.post(
       "deleteOrder"/*url*/,
       {"oid":oid},/*向服务器提交的数据（数据名：数据值）*/
       function(data){//function的参数就是服务器返回的值
           alert("操作成功！");
           window.location.reload(true);
           }//服务器执行完毕，请求成功，执行该函数，该函数的参数代表服务器响应的数据
       
    	    );

		 }
function sure(oid){
    $.post(
       "sureOrder"/*url*/,
       {"oid":oid},/*向服务器提交的数据（数据名：数据值）*/
       function(data){//function的参数就是服务器返回的值
           alert("操作成功！");
           window.location.reload(true);
           }//服务器执行完毕，请求成功，执行该函数，该函数的参数代表服务器响应的数据
       
    	    );

		 }

/*function commentorders(){
	location.href="order_eval?oid="+res.data.result+"&pid="+this.pid;
	
}*/
</script>

</html>