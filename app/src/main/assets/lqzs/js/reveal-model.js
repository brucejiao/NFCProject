// JavaScript Document
$(function(){
	var preventDefault =function(e){
		var e = e || window.event;
		if(e.preventDefault) {
			e.preventDefault();
		} else {
			e.returnValue = false;
		}
	}
	$(".close-reveal-modal").click(function(e){
		preventDefault(e);
		$(".box-content ").fadeOut();
	});
	$.fn.modal = function(){
		this.show = function(a){
			$('.box-content').fadeIn();
		}
		this.close= function(){
			$('.box-content').fadeOut();
		}
		return this;
	}
});