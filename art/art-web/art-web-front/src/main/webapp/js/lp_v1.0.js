// JavaScript Document
jQuery(function(){
	/*收货地址与发货地址切换*/
	$('.harvest').click(function(){
	$('.con_show_1').show();	
	$('.con_show_2').hide();
     });
	
	$('.send-out').click(function(){
	$('.con_show_2').show();	
	$('.con_show_1').hide();
	
	});
});


jQuery(function(){
	/*买家消息《收件箱》下拉*/
	$('.lp-v101uc-show-box2').hide();
	$('.lp-v101uc-my-infor-table2 tr:gt(1)').hide();
	var slides= $('.lp-v101uc-show-record-btn')
	var slideup=$('.lp-v101uc-show-record-btnup')
	var tables= $('.lp-v101uc-my-infor-table2 tr:gt(1)')
	var box1= $('.lp-v101uc-show-box')
	var box2= $('.lp-v101uc-show-box2')
	     
		 slides.click(function(){
			tables.show(); 
			box1.hide()
		    box2.show();
         });
		   slideup.click(function(){
			tables.hide(); 
			box1.show();
		    box2.hide();
				
         });

});

jQuery(function(){
	/*买家消息《发件箱》下拉*/
	$('.lp-v101uc-show-box4').hide();
	$('.lp-v101uc-my-infor-table4 tr:gt(1)').hide();
	var slides2= $('.lp-v101uc-show-record-btn2')
	var slideup2=$('.lp-v101uc-show-record-btnup2')
	var tables2= $('.lp-v101uc-my-infor-table4 tr:gt(1)')
	var box3= $('.lp-v101uc-show-box3')
	var box4= $('.lp-v101uc-show-box4')
	     
		 slides2.click(function(){
			tables2.show(); 
			box3.hide()
		    box4.show();
         });
		   slideup2.click(function(){
			tables2.hide(); 
			box3.show();
		    box4.hide();
				
         });

});



jQuery(function(){
	/* 点击评论弹出框*/
	 var  evaluationText=$('.lp-v101uc-evaluation-box')
	 var  evaluationLayoutbg=$('.bg-layers-cover')
	 var  evaluationBtn=$('.lp-v101uc-raceipt-seccess-shut')
	 
	 $('.evaluationing').click(function(){
		     evaluationText.show();
			 evaluationLayoutbg.show();
	 });
	 
	  evaluationBtn.click(function(){
		     evaluationText.hide();
			 evaluationLayoutbg.hide();
	 });
	
});

jQuery(function(){
	/* 申请退款弹出框*/
	 var  applyText=$('.lp-v101uc-apply-box')
	 var  applyLayoutbg=$('.bg-layers-apply-cover')
	 var  applyBtn=$('.lp-v101uc-apply-shut')
	 
	 $('.applying').click(function(){
		     applyText.show();
			 applyLayoutbg.show();
	 });
	 
	  applyBtn.click(function(){
		     applyText.hide();
			 applyLayoutbg.hide();
	 });
	
});











