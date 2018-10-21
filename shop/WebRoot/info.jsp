<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="isLogin.jsp" %>
<!DOCTYPE html>
<html>

	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>商城信息展示</title>
		<link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
		<script src="js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">

			<!-- 引入header.jsp -->
			<jsp:include page="header.jsp"></jsp:include>

			<div class="container-fluid" style="width: 100%; background: url('img/regist_bg.jpg');">
				<div class="main_con">
					<h2>公司简介</h2>
					<hr/>
					<div>
						<p>
							<h2>湖北理工学院计算机学院</h2>
							湖北理工学院计算机学院创建于1995年，现有教师64人，具有硕士及以上学历学位的教师占教师总人数的80%；拥有教授7人，副教授17人；博士13人，形成了一支学术造诣较高、科研能力较强、年龄与知识结构合理的师资队伍。现开设有计算机科学与技术、网络工程、软件工程、物联网工程4个本科专业和计算机应用技术、计算机网络技术2个专科专业，本、专科在校学生1184人。 

学院建设有信息技术及应用省级重点实验教学示范中心和湖北省服务外包人才培养（训）基地。办学条件优良，拥有网络工程实验室、软件综合实验室、硬件综合实验室、多媒体实验室、物联网实验室、计算机基础实验室6类共20个实验室，其中计算机基础实验室为省级合格实验室；拥有各类计算机800多台套，各类网络设备100台余套，ARM、EDA、DSP、接口及组成原理等各类硬件开发设备120多台套，实验设备总资产达800余万元，能充分满足师生各类教学实验及科研的需要。

						</p>
					</div>
				</div>
			</div>
		</div>
		
		<!-- 引入footer.jsp -->
		<jsp:include page="footer.jsp"></jsp:include>

	</body>

</html>