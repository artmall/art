// JavaScript Document

jQuery.fn.CSselectBox = jQuery.fn.sBox = function(options){
	options = $.extend({
		animated : false
	},options);
	var _self = this;
	/*构建结构*/
	var _parent = _self.parent();
	var wrapHtml = '<div class="CSselectBox"></div>';
	var $wrapHtml = $(wrapHtml).appendTo(_parent);
	var selectedOptionValue = _self.find("option:selected").attr("value");
	var selectedOptionTxt = _self.find("option:selected").text();
	var name = _self.attr("name");
	var id = _self.attr("id");
	var inputHtml = '<input type="hidden" value="'+selectedOptionValue+'" name="'+name+'" id="'+id+'"/>';
	$(inputHtml).appendTo($wrapHtml);
	var inputTxtHtml = '<input type="hidden" value="'+selectedOptionTxt+'" name="'+name+'_CRtext" id="'+id+'_CRtext"/>';
	$(inputTxtHtml).appendTo($wrapHtml);
	var aHtml = '<a  href="#"><span class="CSselectValue">'+selectedOptionTxt+'</span></a>';
	$(aHtml).appendTo($wrapHtml);
	var ulHtml = '<ol class="CSselectBoxOptions"></ol>';
	var $ulHtml = $(ulHtml).appendTo($wrapHtml);
	var liHtml = "";
	_self.find("option").each(function(){
		if($(this).attr("selected")){
			liHtml += '<li class="CSselectBoxItem"><a href="#" class="selected"><span rel="'+$(this).attr("value")+'">'+$(this).text()+'</span></a></li>';
		}else{
			liHtml += '<li class="CSselectBoxItem"><a href="#"><span rel="'+$(this).attr("value")+'">'+$(this).text()+'</span></a></li>';
		}
	});
	$(liHtml).appendTo($ulHtml);
	/*添加效果*/
	$( $wrapHtml, _parent).hover(function(){
		$(this).addClass("CSselectBoxHover");
	},function(){
		$(this).removeClass("CSselectBoxHover");
	});
	$(".CSselectValue",$wrapHtml).click(function(){
		$(this).blur();	
		if( $(".CSselectBoxOptions",$wrapHtml).is(":hidden") ){
			if(options.animated){
				$(".CSselectBoxOptions").slideUp("fast");
				$(".CSselectBoxOptions",$wrapHtml).slideDown("fast");
			}else{
				$(".CSselectBoxOptions").hide();
				$(".CSselectBoxOptions",$wrapHtml).show();
			}
		}
		return false;
	});
	$(".CSselectBoxItem a",$wrapHtml).click(function(){
		$(this).blur();
		var value = $(this).attr("rel");
		var txt = $(this).text();
		$("#"+id).val(value);
		$("#"+id+"_CRtext").val(txt);
		$(".CSselectValue",$wrapHtml).text(txt);
		$(".CSselectBoxItem a",$wrapHtml).removeClass("selected");
		$(this).addClass("selected");
		if(options.animated){
			$(".CSselectBoxOptions",$wrapHtml).slideUp("fast");
		}else{
			$(".CSselectBoxOptions",$wrapHtml).hide();
		}
		return false;
	});
	$(document).click(function(event){
		if( $(event.target).attr("class") != "CSselectBox" ){
			if(options.animated){
			$(".CSselectBoxOptions",$wrapHtml).slideUp("fast");
			}else{
				$(".CSselectBoxOptions",$wrapHtml).hide();
			}
		}
	});
	_self.remove();
	return _self;
}