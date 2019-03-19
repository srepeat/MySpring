$(function(){
	initHref();
})
function initHref(){
	$(".img_flag").each(function(){
		$(this).click(function(){
			var basePath = $("#container_js").attr("data-src")
			console.log(basePath)
			window.location.href = basePath + "checkDetails/" + $(this)[0].dataset.id
		})
	})
}