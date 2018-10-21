<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商品详情</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/util.js"></script>
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
    <jsp:include page="daohang.jsp"></jsp:include>

	<div id="pinfoContainer" class="container" style="width: 83%; float:right; background: url('img/regist_bg.jpg');">
		<div class="row">
			<div class="info-header">
				 <ol class="breadcrumb info-header1">
						<li style="font-size: 18px;font-weight: bold;">
						<a href="index" >首页</a>&nbsp;/&nbsp;
						<a href="#" >{{pInfo.cname}}</a>&nbsp;/&nbsp;
						<a href="#" >{{pInfo.pname}}</a></li>
					</ol>
			</div>

			<div class="info-body">
				<div class="col-md-6">
				<div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
					<!-- 轮播图的中的小点 -->
					<ol class="carousel-indicators" >
						<li data-target="#carousel-example-generic" v-for="(item,index) in images" 
						   :class="{'active':index==0}" :data-silde-to="index"></li>
					</ol>
					<!-- 轮播图的轮播图片 -->
					<div class="carousel-inner" role="listbox">
						<div class="item" :class="{'active pro-img-item':index==0}" v-for="(item,index) in images">
							<img :src="item">
						</div>
					</div>

					<!-- 上一张 下一张按钮 -->
					<a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
						<span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a>
					<a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
						<span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
					
				</div>

				<div class="col-md-6 info-right">
					<div class="info-desc">
						<h4>{{pInfo.pname}}</h4>
					</div>
					
					<div class="info-desc">
						现价: <strong style="color: #ef0101;">
						￥：{{pInfo.newPrice}}元</strong>
						&nbsp; &nbsp;
						原价：<del>
						￥{{pInfo.oldPrice}}元</del>
					</div>
					
					<div class="info-desc">
						<div>						
						销量：{{pInfo.volume}}
						</div>
					</div>
					<div class="info-desc">
						<div>						
						库存：{{pInfo.total}}
						</div>
					</div>
					<div class="info-desc">
						商品上市时间:{{pInfo.pdate}}
					</div>
					<div class="info-desc">
						购买数量: <input id="quantity" name="quantity" v-model="quantity" min="1"
						type="number" value="1" maxlength="4" size="10" type="text">
					</div>
					
					<div class="info-desc-1">
						 <img src="img/btn_cart.png" @click="addCart()"/>
						 &nbsp;
					</div>
					
				</div>
			</div>
			<div class="clear"></div>
			<div class="info-body">
				<div class="info-body-desc">
					<h3>商品介绍</h3>
				</div>

				<div id="pro_desc">
					<h3>商品详情</h3>
					{{pInfo.pdesc}}
				</div>

				

				<div class="info-body-desc">
					<h3>商品评论</h3>
					<table class="table">
						<tbody>
							<tr class="active" v-for="item in commentList">
								<td>{{item.username}}</td>
								<td>{{item.created}}</td>
								<td>{{item.content}}</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>


	<!-- 引入footer.jsp -->
	<jsp:include page="footer.jsp"></jsp:include>

</body>
<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script type="text/javascript">
  var pinfovue=new Vue({
     el:'#pinfoContainer',
     data:{
       pInfo:{
         pname:"",
         cname:"",
         newPrice:0,
         oldPrice:0,
         total:0,
         volume:0,
         pdesc:"",
         pdate:"",
         image:""
       },
       images:[],
       quantity:1,
       commentList:[]
       
     },
     methods:{
     addCart:function(){
        if (this.pInfo.total<=0) {
			alert("该商品已经卖光！");
		}else if(this.pInfo.total-this.quantity<0){
		   alert("库存不足，请重新选择购买的数量！");
		}else{
		  var subtotal=this.quantity*(this.pInfo.newPrice);
		  var params={
		     "pid":getQueryString("pid"),
		     "count":this.quantity,
		     "subtotal":subtotal
		  };
		  this.$http.post("addCart",params,{emulateJSON:true}).then(
		      function(res){
		        if(res.data.result=="error"){
		           alert("您未登录，请先登录后再购买！");
		           location.href="login";
		        }else{
		         alert("商品已加入购物车！");
		        }
		      },
		      function(res){
		        console.log(res);
		      }
		  );
		}
      }
     },
     created:function(){
       var params={"pid":getQueryString("pid")};
       this.$http.post("getProductInfo",params,{emulateJSON:true}).then(
          function(res){
          this.pInfo=res.data;
          var strs=new Array();
          strs=this.pInfo.image.split(",");
          for(var i = 0; i < strs.length; i++) {
			strs[i]="/pic/"+strs[i];
		}
          this.images=strs;
          this.pInfo.pdate=new Date(this.pInfo.pdate).format("yyyy年");
          },
          function(res){
          console.log(res);
          }
       );
       this.$http.post("getProductComment",params,{emulateJSON:true}).then(
           function(res){
             this.commentList=res.data;
             res.data.forEach(function(item){
                    item.created=new Date(item.created).format("yyyy年MM月dd日 hhh:mm:ss");
             
             });
           },
         function(res){
         console.log(res);
         }
       );
     }
  });


</script>


</html>