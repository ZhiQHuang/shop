<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>商城首页</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<link rel="stylesheet" href="css/style.css" type="text/css" />
		<script src="js/jquery.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>

	</head>


	<body>
		<div class="container-fluid"
			style="width: 100%; background: url('img/regist_bg.jpg');">

			<!-- 引入header.jsp -->
			<jsp:include page="header.jsp"></jsp:include>
		
			
		     <jsp:include page="daohang.jsp"></jsp:include>
			<div id="indexContainer" style="width: 83%;float:right;display:inline;">
				<!-- 轮播图 -->
				<div class="container-fluid">
					<div id="carousel-example-generic" class="carousel slide"
						data-ride="carousel">
						<!-- 轮播图的中的小点 -->
						<ol class="carousel-indicators">
							<li data-target="#carousel-example-generic" data-slide-to="0"
								class="active"></li>
							<li data-target="#carousel-example-generic" data-slide-to="1"></li>
							<li data-target="#carousel-example-generic" data-slide-to="2"></li>
						</ol>

						<!-- 轮播图的轮播图片 -->
						<div class="carousel-inner" role="listbox" id="pics"
							style="text-align: center;">
							<div class="item" :class="{'active':index==0}"
								v-for="(item,index) in picProducts" align="center"
								@click="showDetail(item.pid)">
								<img :src="item.image" style="width: auto">
								<div class="carousel-caption">
									{{item.pname}}
								</div>
							</div>
						</div>

						<!-- 上一张 下一张按钮 -->
						<a class="left carousel-control" href="#carousel-example-generic"
							role="button" data-slide="prev"> <span
							class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
							<span class="sr-only">Previous</span> </a>
						<a class="right carousel-control" href="#carousel-example-generic"
							role="button" data-slide="next"> <span
							class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
							<span class="sr-only">Next</span> </a>
					</div>
				</div>

				<!-- 热门商品 -->
				<div class="container-fluid">
					<div class="col-md-12">
						<h2>
							热门商品&nbsp;&nbsp;
							<img src="img/title2.jpg" />
						</h2>
					</div>
					<div class="col-md-2"
						style="border: 1px solid #E7E7E7; border-right: 0; padding: 0;">
						<img v-if="hotProducts.length>0" :src="hotProducts[0].image"
							@click="showDetail(hotProducts[0].pid)" width="205" height="404"
							style="display: inline-block;" />
					</div>
					<div class="col-md-10" id="hotProducts">
						<div class="col-md-6 image-item1">
							<a href="#">
							<img v-if="hotProducts.length>0" :src="hotProducts[1].image"
									@click="showDetail(hotProducts[1].pid)" width="516px"
									height="200px" style="display: inline-block;"> </a>
						</div>

						<div v-for="(item,index) in hotProducts" v-if="index>1"
							class="col-md-2 image-item2"
							:class="{'yes-right-border':index==4||index==10}"
							@click="showDetail(item.pid)">
							<a href="#"> <img :src="item.image" width="130" height="130"
									style="display: inline-block;"> </a>
							<p class="image-item2-title">
								<a href="#">{{item.pname}}</a>
							</p>
							<p class="image-item2-price">
								&yen;{{item.newPrice}}
							</p>
						</div>
					</div>
				</div>
				<!-- 广告条 -->
				<div class="container-fluid">
					<img src="img/products/hao/ad.jpg" width="100%" />
				</div>

				<!-- 最新商品 -->
				<div class="container-fluid">
					<div class="col-md-12">
						<h2>
							最新商品&nbsp;&nbsp;
							<img src="img/title2.jpg" />
						</h2>
					</div>
					<div class="col-md-2"
						style="border: 1px solid #E7E7E7; border-right: 0; padding: 0;">
						<img v-if="newProducts.length>0"
							@click="showDetail(newProducts[0].pid)"
							:src="newProducts[0].image" width="205" height="404"
							style="display: inline-block;" />
					</div>
					<div class="col-md-10" id="newProducts">
						<div class="col-md-6"
							style="text-align: center; height: 200px; padding: 0px;">
							<a href="#"> <img v-if="newProducts.length>0"
									@click="showDetail(newProducts[1].pid)"
									:src="newProducts[1].image" width="516px" height="200px"
									style="display: inline-block;"> </a>
						</div>

						<div v-for="(item,index) in newProducts" v-if="index>1"
							class="col-md-2 image-item2"
							:class="{'yes-right-border':index==4||index==10}"
							@click="showDetail(item.pid)">
							<a href="#"> <img :src="item.image" width="130" height="130"
									style="display: inline-block;"> </a>
							<p class="image-item2-title">
								<a href="#">{{item.pname}}</a>
							</p>
							<p class="image-item2-price">
								&yen;{{item.newPrice}}
							</p>
						</div>
					</div>
					
				</div>
			</div>

				<!-- 引入footer.jsp -->
				<jsp:include page="footer.jsp"></jsp:include>
			
			</div>
	</body>

	<script src="js/vue.min.js"></script>
	<script src="js/vue-resource.js"></script>
	<script type="text/javascript">
	var headvue = new Vue( {
		el : '#indexContainer',
		data : {
			picProducts : [],
			hotProducts : [],
			newProducts : []
		},
		methods : {
			showDetail : function(pid) {
				location.href = "product_info?pid=" + pid;
			}
		},

		created : function() {
			this.$http.get("getPicProducts").then(
			function(res) {
				this.picProducts = res.data.list;
			}, function(res) {
				console.log(res);
			});

			this.$http.get("getHotProducts").then(
			function(res) {
				this.hotProducts = res.data.list;
			}, function(res) {
				console.log(res);
			});

			this.$http.get("getNewProducts").then(function(res) {
				this.newProducts = res.data.list;
			}, function(res) {
				console.log(res);
			});
		}
	});
</script>

</html>