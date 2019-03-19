$(function() {
	init();
})
function init() {
	var nav_li = $("nav").children("ul").children("li")
	NavArrayUtils.li = nav_li;
	nav_li[1].style.background = "blue"
	NavArrayUtils.liClick();
	searchEvents();
}
NavArrayUtils = {
	clearLi : function() {
		NavArrayUtils.li.css("background", "none")
	},
	li : [],
	liClick : function() {
		NavArrayUtils.li.each(function(index) {
			$(this).click(function() {
				NavArrayUtils.clearLi();
				$(this).css("background", "blue");
			})
		})
	}
}
function searchEvents(){
	$("#processSearch").click(function(){
		var search = $("#search")
		if(search.val().length > 0){
			var fs = window.frames['container'].src=search.attr("data-src") + "/news/link/" + search.val();
		}else{
			alert("输入内容为空")
		}
		
	})
}