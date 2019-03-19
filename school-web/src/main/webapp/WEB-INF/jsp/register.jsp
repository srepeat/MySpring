<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>用户注册</title>
<%
	String basePath = request.getContextPath();
%>
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css"
	href="<%=basePath%>/css/register.css">
<script type="text/javascript"
	src="<%=basePath%>/js/jquery-3.3.1.min.js"></script>
</head>
<body>
	<form id="userFrom">
		<div class="form-group" id="register_body">
			<div class="form-group register_body_one form-inline col-lg-12">
				<label for="nickName" class="col-lg-3 text-center text-warning">昵&nbsp;&nbsp;&nbsp;称</label>
				<input type="text" class="col-lg-9 form-control" id="nickName"
					placeholder="请输入你要注册的昵称" />
			</div>
			<div class="form-group form-inline col-lg-12">
				<label for="username" class="col-lg-3 text-center text-warning">用户名</label>
				<input type="text" id="username" class="col-lg-9 form-control"
					placeholder="请输入你要注册的用户名" />
			</div>
			<div class="form-group form-inline col-lg-12">
				<label for="password" class="col-lg-3 text-center text-warning">密&nbsp;&nbsp;&nbsp;码</label>
				<input type="password" id="password" class="col-lg-9 form-control "
					placeholder="请输入你要注册的密码" />
			</div>
			<div class="form-group form-inline col-lg-12">
				<button id="register" class="btn btn-primary m-auto mr-4">注册</button>
				<button class="btn btn-primary m-auto" id="reset">重置</button>
			</div>
		</div>
	</form>
</body>
<%-- <script type="text/javascript" id="register_script" data-base="<%=basePath %>" src="<%=basePath%>/js/register.js" ></script> --%>
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script src="${APP_PATH }/layer/layer.js"></script>
	<script>
	
		$('#reset').click=function(){
			$('#userFrom')[0].reset();
		}
	
		$('#register').click=function(){
			//验证是否输入为空
			var nickName = $("#nickName").val();
			if(nickName != null){
				layer.msg("昵称不能为空，请输入",{time:1000,icon:5,shift:6},function(){
	       			
	       		});
				return;
			}
			
			var username = $("#username").val();
			if(username != null){
				layer.msg("用户名不能为空，请输入",{time:1000,icon:5,shift:6},function(){
	       			
	       		});
				return;
			}
			
			var password = $("#password").val();
			if(password != null){
				layer.msg("密码不能为空，请输入",{time:1000,icon:5,shift:6},function(){
	       			
	       		});
				return;
			}
			
			$.ajax({
				type:"post",
				url:"",
				data:{
					
				},
				
				
				
			});
		}
	</script>


</html>