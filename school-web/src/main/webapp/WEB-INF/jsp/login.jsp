<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/login.css">
<body>
	<div id="body_container">
		<form method="post" class="form-group" id="formMit" action="${APP_PATH }/doLogin" method="post">
			<div class="form-group form-inline container">
				<label for="username" class="ml-2 text-justifyt col-lg-3 text-success">用户名</label>
				<input type="text" class="form-control col-lg-8 text-center m-auto" id="username" name="username" placeholder="请输入用户名">
			</div>
			<div class="form-group form-inline container">
				<label for="password" class="ml-2 text-justifyt col-lg-3 text-success">密&nbsp;&nbsp;&nbsp;码</label>
				<input type="password" class="form-control col-lg-8 text-center m-auto" id="password" name="password" placeholder="请输入密码">
			</div>
			<div class="form form-inline">
				<a id="loginMit" style="color:white;" class="btn btn-primary m-auto" onclick="doLogin()">登录</a><a class="btn m-auto btn-primary" href="${APP_PATH }/register" style="color:white;">注册</a>
			</div>
			<span class="text-warning text-center" style="display:block">${message }</span>
		</form>
	</div>
	<%-- <script type="text/javascript" src="${APP_PATH }/js/login.js"></script> --%>
	
	<script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
	<script src="${APP_PATH }/layer/layer.js"></script>
	<script>
	function doLogin(){
		//判断用户名是否为空
		var username = $("#username").val();
		if(username == ""){
			//alert("用户名不能为空，请输入");
       		layer.msg("用户名不能为空，请输入",{time:1000,icon:5,shift:6},function(){
       			
       		});
			return;
		}
		
		var password = $("#password").val();
		if(password == ""){
			layer.msg("密码不能为空，请输入",{time:1000,icon:5,shift:6},function(){
       			
       		});
			return;
		}
	
		var loadingIndex = null;
		$.ajax({
			type:"post",
			url:"doResultLogin",
			data:{
				"username":username,
				"password":password
			},
			//延迟加载。
    		beforesend :function() {
    			loadingIndex = layer.msg('处理中', {icon: 16});
    		},
			success:function(result){
				layer.close(loadingIndex);
				if(result.success){
					window.location.href="index";
				}else{
					layer.msg("用户登录账号或密码不正确，请重新输入", {time:2000, icon:5, shift:6}, function(){
                    	
                    });
				}
			}
		});
	}
	</script>
	
</body>
</html>