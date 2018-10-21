<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商品列表</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script type="text/javascript" src="js/jqpaginator.min.js" charset="UTF-8"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/util.js"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link rel="stylesheet" href="css/style1.css" type="text/css" />
<link href="css/zpageNav.css" rel="stylesheet">
</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="header.jsp"></jsp:include>

    <div class="container" id="plistContainer" style="width: 100%; background: url('img/regist_bg.jpg');">
	<div class="row plist" >
		<div class="col-md-12" style="text-align: left;">
			<ol class="breadcrumb">
				<li style="font-size: 20px;font-weight: bold;">
				<a href="index" >首页</a>&nbsp;/&nbsp;
				<a href="#" ><span id="catName"></span></a></li>
			</ol>
		</div>
		<div id="plist">
		<div class="col-md-2" v-for="item in productList" @click="showDetail(item.pid)">
			<a href="#"> <img :src="item.image"
				width="200" height="200" style="display: inline-block;">
			</a>
			<p></p>
			<p>
				<a href="#" style='font-weight: bold;'>{{item.pname}}</a>
			</p>
			<p></p>
			<p>
				<font color="#FF0000">商城价：&yen;{{item.newPrice}}</font>
			</p>
		</div>


		</div>
	</div>

	<!--分页 -->
	<div style="width: 380px; margin: 0 auto; margin-top: 50px;">
		  <zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" 
		  v-bind:max-page="maxPage" v-on:pagehandler="pageHandler"><zpagenav>
   
	</div>
	<!-- 分页结束 -->
	</div>
	<!-- 引入footer.jsp -->
	<jsp:include page="footer.jsp"></jsp:include>

</body>

<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script src="js/zpageNav.js"></script>
<script type="text/javascript">
var headvue=new Vue({
	
  el:'#plistContainer',
  data:{
	productList:[],
	page:1,//显示哪一页
	pageSize:10,//该页显示的记录数
	total:100,//记录总数
	maxPage:9//最大的页数
	  },
	methods:{
		  pageHandler: function (page) {//跳转到page页
          this.page = page;//修改显示的页数
           //发送Ajax请求
          var params={"page":page,"row":this.pageSize,"name":getQueryString("searchContent")};
          this.$http.post("getProductsByName",params,{emulateJSON:true}).then(
        		  function(res){
                      this.productList=res.data.list;
                      this.total=res.data.total;
                      this.maxPage=res.data.maxPage;
                      
                      },
                  function(res){
                          console.log(res);
                      }); 
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

</html>