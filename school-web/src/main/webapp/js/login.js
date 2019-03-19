;(function(){
	let username = document.querySelector("#username")
	let password = document.querySelector("#password")
	document.querySelector("#loginMit").onclick = function(){
		if(validUser(username)){
			if(validUser(password)){
				document.querySelector("#formMit").submit();
			}		
		}
	}
	document.querySelector("#password").onkeydown=function(event){
		if(event.keyCode == 13){
			if(validUser(username)){
				if(validUser(password)){
					document.querySelector("#formMit").submit();
				}		
			}
		}
	}
})()
function validUser(dom){
	if(/^\w{5,12}$/.test(dom.value)){
		return true;
	}else{
		dom.focus();
		alert("用户名密码必须为5-12位的数字和字母")
		return false;
	}
}