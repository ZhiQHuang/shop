<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>商品列表</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
<script src="js/bootstrap.min.js" type="text/javascript"></script>
<script src="js/util.js"></script>
<!-- 引入自定义css文件 style.css -->
<link rel="stylesheet" href="css/style.css" type="text/css" />
<link rel="stylesheet" href="css/style1.css" type="text/css" />
<link href="css/zpageNav.css" rel="stylesheet"/>


</head>

<body>


	<!-- 引入header.jsp -->
	<jsp:include page="header.jsp"></jsp:include>
      <jsp:include page="daohang.jsp"></jsp:include>

    <div class="container" id="plistContainer" style="width: 100%; background: url('img/regist_bg.jpg');">
    
	<div class="row plist" style="width: 83%; float:right;background: url('img/regist_bg.jpg');">
		<div class="col-md-12" style="text-align: left;">
			<ol class="breadcrumb">
				<li style="font-size: 20px;font-weight: bold;">
					<a href="index" >首页</a>/
					<a href="#" ><span >{{cname}}</span></a>/
					<a href="#" ><span >{{scname}}</span></a>
				</li>
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
		<zpagenav v-bind:page="page" v-bind:page-size="pageSize" v-bind:total="total" v-bind:max-page="maxPage" v-on:pagehandler="pageHandler"><zpagenav>
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
         page:1,
         pageSize:10,
         total:100,
         maxPage:9,
         cname:"",
         scname:""
      },
      methods:{
         pageHandler:function(page){
           this.page=page;
           var params={"page":page,"row":this.pageSize,"cid":getQueryString("cid"),"tcid":getQueryString("tcid")};
           this.$http.post("getCatProducts",params,{emulateJSON:true}).then(
              function(res){
                this.productList=res.data.list;
                this.total=res.data.total;
                this.maxPage=res.data.pages;
              },
              function(res){
              
               console.log(res);
               
              } );
         },
         showDetail:function(pid){
            location.href="product_info?pid="+pid;
         }
      },
      created:function(){
         this.pageHandler(1);
         var tcid=parseInt(getQueryString("tcid"));
          var params={"cid":getQueryString("cid"),"tcid":tcid};
         this.$http.post("getCnameAndScname",params,{emulateJSON:true}).then(
			function(res) {
				this.cname = res.data.cname;
				if(tcid!=0){
					this.scname = res.data.scname;
				}
			}, function(res) {
				console.log(res);
			});
      }
    });
</script>

</html>