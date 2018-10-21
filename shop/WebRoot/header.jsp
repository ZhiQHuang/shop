<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- 登录 注册 购物车... -->
<div class="container-fluid">
	<div class="col-md-4">
		<img src="img/logo2.png" />
	</div>
	<div class="col-md-5">
		<img src="img/header.png" />
	</div>
	<div class="col-md-3" style="padding-top:20px">
		<ol class="list-inline">
			<li><a href="login">登录</a></li>
			<li><a href="register">注册</a></li>
			<li><a href="cart">购物车</a></li>
			<li><a href="order_list">我的订单</a></li>
			<li><a href="my_info">会员中心</a></li>
		</ol>
	</div>
</div>

<!-- 导航条 -->
<div class="container-fluid" id="headContainer">
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index">首页</a>
			</div>

			<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav" id="catList">
					<li :class="{'active':index==0}" v-for="(item,index) in categoryList"
					@click="getCatProduct(item.cid)">
					<a href="#">{{item.cname}}</a></li>	
				</ul>
				<form class="navbar-form navbar-right" role="search">
					<div class="form-group">
						<input type="text" class="form-control" v-model="searchContent" placeholder="请输入搜索内容">
					</div>
					<button type="button" class="btn btn-default"  @click="searchProduct()">提交</button>
				</form>
			</div>
		</div>
	</nav>	
</div>

<script src="js/vue.min.js"></script>
<script src="js/vue-resource.js"></script>
<script type="text/javascript">

    var headvue=new Vue({
        el:'#headContainer',
        data:{
    	categoryList:[],
    	searchContent:""
        },
        methods:{
            getCatProduct:function(cid){
           location.href="product_list?cid="+cid+"&tcid=0";
            },
            searchProduct:function(){
               var content=encodeURI(encodeURI(this.searchContent));
               location.href="serach_list?searchContent="+content;
                }
            
            
          },
            created:function(){
            	//created代表当页面加载完成，立刻执行后面的方法
            	//发生Ajax请求
            	this.$http.get("getcategories").then(
            			function(res){
            				//请求成功
            				this.categoryList=res.data;
            },
            function(res){
            	//请求失败
            	console.log(res);
            });
            }
        
        });

</script>


