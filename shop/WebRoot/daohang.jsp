<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>侧栏弹出导航</title>
	<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style: none;
}

body {
	background: #fff;
	font: normal 16px/ 22px 宋体;
}

img {
	border: 0;
}

a {
	text-decoration: none;
	color: #333;
}

a:hover {
	color: #1974A1;
	text-decoration: underline;
}

.banner {
	padding-left: 15px;
	width: 250px;
	display: inline;
	float: left;
	
}

#nav {
	position: relative;
	z-index: 1;
	width: auto;
	background: #F1F1F1;
	height:auto;
}

#nav .mainCate {
	position: relative;
	padding: 10px 20px;
	zoom: 1;
	height:80px;
	font-size: 20px;
    
}

#nav .evenLeval {
	background: #fff;
}

#nav h3 {
	height: 28px;
	line-height: 28px;
	font-size: 16px;
	overflow: hidden;
}

#nav h3 span {
	width: 18px;
	height: 15px;
	line-height: 32px;
	font-weight: 200;
	font-size: 12px;
	float: right;
}

#nav p {
	height: 20px;
	line-height: 20px;
}

#nav p a {
	margin-right: 10px;
	color: #666;
}

#nav .subCate {
	display: none;
	background: url(images/nav_div_bg.jpg) 0 0 repeat-y #fff;
	position: absolute;
	left: 250px;
	top: 0;
	width: 750px;
	padding: 0 0 20px 20px;
	color: #333;
}

#nav .subCate h4 {
	height: 26px;
	line-height: 26px;
	margin: 0 0 10px 0;
	border-bottom: 1px solid #ccc;
	font-size: 16px;
	color: #333;
}

#nav .subCate ul {
	width: 230px;
	float: left;
	overflow: hidden;
	padding-top: 20px;
}

#nav .subCate li {
	width: 230px;
	float: left;
	display: inline;
}

#nav .subCate li a {
	display: block;
	float: left;
	padding: 0 5px;
	line-height: 25px;
	color: #666;
	word-break: keep-all;
	white-space: nowrap;
}

#nav .subCate #sub-ul-1 {
	width: 100%;
}

#nav .on {
	background: #88766E;
	color: #fff;
}

#nav .on h3 a,#nav .on p a {
	color: #fff;
}

#nav .on .subCate {
	display: block !important;
}

#mainCate-1 {
	font-size:13px
}

#mainCate-4 .subCate {
	top: -100px
}

#mainCate-5 .subCate {
	top: -164px;
}

#mainCate-6 .subCate {
	top: auto;
	bottom: 0;
}
</style>
</head>
<body>



	<div class="banner" id="leftContainer">
		<ul id="nav">
			<li class="mainCate" :class="{'active':index==0}"
				v-for="(item,index) in categoryList" @click="show(item)">
				<a href="#" @click="getCatProduct(item.cid)">{{item.cname}}</a>
				<p v-show="!item.sub"  id="mainCate-1">
					<li2 v-for="(t,index) in twocategoryList">
					<a href="#" @click="getTwoCatProduct(item.cid,t.tcid)" v-if="t.cid==item.cid">{{t.tcname}}</a>
					</li2>
				</p>
			</li>

		</ul>
	</div>


</body>
<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script type="text/javascript">
	var leftvue = new Vue( {
		el : '#leftContainer',
		data : {
			categoryList : [],
			twocategoryList : []

		},
		methods : {
			getCatProduct : function(cid) {
				location.href = "product_list?cid=" + cid+"&tcid=0";
			},
			getTwoCatProduct : function(cid,tcid) {
				location.href = "product_list?tcid="+tcid+"&cid="+cid;
			},
			show:function(item){
				item.sub=!item.sub;
			}

		},
		created : function() {
			//created代表当页面加载完成，立刻执行后面的方法
		//发生Ajax请求
		this.$http.get("getcategories").then(function(res) {
			//请求成功
				this.categoryList = res.data;
			}, function(res) {
				//请求失败
				console.log(res);
			});

		this.$http.get("getTwocategories").then(

		function(res) {
				this.twocategoryList = res.data;

			},

			function(res) {
				//请求失败
				console.log(res);
			});
	}

	});
</script>




