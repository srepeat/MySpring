$(function() {
	init();
})
function init() {
	click();
	
}
function click() {
	let username = document.querySelector("#username")
	let password = document.querySelector("#password")
	let nickName = document.querySelector("#nickName")
	$("#register").click(function() {
		if (nickName.value.trim().length < 1) {
			alert("昵称不能为空")
			nickName.focus();
		} else {
			if (validUser(username)) {
				if (validUser(password)) {
					var basePath = $("#register_script").attr("data-base")
					$.ajax({
						url:basePath + "/user/register",
						type:"post",
						data:{
							username:username.value,
							password:password.value,
							nickName:nickName.value
						},
						dataType:"json",
						success:function(result){
							if(result.state){
								window.location.href="./"
							}else{
								alert(result.message)
							}
						},
						error:function(err){
							console.log(err)
						}
					})
				}
			}
		}
	})
	$("#reset").click(function(){
		clear(nickName)
		clear(username)
		clear(password)
	})
}
function clear(dom) {
	dom.value = ""
}
function validUser(dom) {
	if (/^\w{5,12}$/.test(dom.value)) {
		return true;
	} else {
		dom.focus();
		alert("用户名密码必须为5-12位的数字和字母")
		return false;
	}
}