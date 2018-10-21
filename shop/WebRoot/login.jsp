<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>会员登录</title>
<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
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

.container .row div {
	/* position:relative;
				 float:left; */
	
}

font {
	color: #666;
	font-size: 22px;
	font-weight: normal;
	padding-right: 17px;
}
</style>
</head>
<body>
	<!-- 引入header.jsp -->
	<jsp:include page="header.jsp"></jsp:include>

	<div class="container" id="loginContainer"
		style="width: 100%; height: 460px; background: #FF2C4C url('img/loginbg.jpg') no-repeat;">
		<div class="row">
			<div class="col-md-7">
				<!--<img src="./image/login.jpg" width="500" height="330" alt="会员登录" title="会员登录">-->
			</div>

			<div class="col-md-5">
				<div style="width: 440px; border: 1px solid #E7E7E7; padding: 20px 0 20px 30px; border-radius: 5px; margin-top: 60px; background: #fff;">
					<font>会员登录</font>USER LOGIN
					<div>&nbsp;</div>
					<form class="form-horizontal">
						<div class="form-group">
							<label for="username" class="col-sm-2 control-label">用户ID</label>
							<div class="col-sm-6">
								<input type="text" class="form-control" id="uid" name="uid"
									v-model="user.uid" placeholder="请输入用户ID">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">密码</label>
							<div class="col-sm-6">
								<input type="password" class="form-control" id="password" name="password"
									v-model="user.password" placeholder="请输入密码">
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label">验证码</label>
							<div class="col-sm-3">
								<input type="text" class="form-control" id="checkcode" name="checkcode"
									placeholder="验证码" v-model="checkcode">
							</div>
							<div class="col-sm-3">
								<img :src="imagSrc" @click="changeCheckcode()" />
							</div>
						</div>
						<div class="form-group">
							<label for="inputPassword3" class="col-sm-2 control-label"></label>
							<div class="col-sm-6" id="checkResult"></div>
						</div>
						
						<div class="form-group">
							<div class="col-sm-offset-2 col-sm-10">
								<input type="button" width="100" value="登录" name="submit"@click="userLogin()"
									style="background: url('img/login.gif') no-repeat scroll 0 0 rgba(0, 0, 0, 0); height: 35px; width: 100px; color: white;">
							</div>
						</div>
					</form>
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

var loginvue=new Vue({
	el:'#loginContainer',
	data:{
	user:{
	uid:"",
	password:""
	
},
	checkcode:"",
	imagSrc:"VerifyCode"
},
methods:{

userLogin:function(){
	//created代表当页面加载完成，立刻执行后面的方法
	var params={"uid":this.user.uid,"password":this.user.password,
			"checkcode":this.checkcode};
	
	this.$http.post("checkUserLogin",params,{emulateJSON:true}).then(
			function(res){
				if(res.data.result=="ok"){
					alert("登录成功");
					history.back();//返回上一页面
				}else{
					alert("您输入的信息有误，请重新输入");
				}
			},
				
function(res){
	console.log(res);
}
			);
},
changeCheckcode:function(){
	//更换验证码
	var str=this.imagSrc;
	this.imagSrc=str+"?"+new Date();
}
}
});


</script>
</html>