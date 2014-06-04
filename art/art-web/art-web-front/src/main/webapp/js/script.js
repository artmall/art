// JavaScript Document

function setTab(name,cursel,n){
	for(i=1;i<=n;i++){
	var menu=document.getElementById(name+i);
	var con=document.getElementById("con_"+name+"_"+i);
	menu.className=i==cursel?"hover":"";
	con.style.display=i==cursel?"block":"none";
	}
}

/*jQuery(function($){
	//查看&收起座位详情
	(function($){
		$(".choose-seat a").click(function(){
			$(this).next(".venue").slideToggle();
			if ($(this).html() == "查看座位详情") {
					$(this).html("收起座位详情");
			} else {
					$(this).html("查看座位详情");
			}
		})
	})(jQuery);
})*/

jQuery(function($){
	//我的消息
	reads = $('.see-hd'),popBox = $('.my-information-hd');
	reads.each(function(index){
		var $this = $(this);
		$this.click(function(){
			var trhis = $this.closest('tr').next();
			trhis.slideDown('slow',function(){
				trhis.find('.slide-up').click(function(){
					trhis.slideUp();
				});
			});
			
		});
	});
});

function sellerDetail(){
	//卖家详情-弹出层
	
  $(function(){
	  $(".t-seller").click(function(){
		  
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-seller-detail").css('top',sTop+255).show();	
			 }else{
			$("#t-seller-detail").show();	 
				 }
		  });
	  
	  $("#t-sure").click(function(){
		
		$("#t-seller-detail").hide();
		
       });

	  });
};

function orderDetail(){
	//订单详情
	$(".t-order").click(function(){
		 if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-order-detail").css('top',sTop+255).show();	
			 }else{
			$("#t-order-detail").show();	 
				 }
		
		});
		$("#t-order-sure").click(function(){			
			$("#t-order-detail").hide();
			});
	};
	
function correlationDetail(){
	//相关消息
	$(".t-correlation").click(function(){
		
		  
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-correlation-detail").css('top',sTop+245).show();	
			 }else{
			$("#t-correlation-detail").show();	 
				 }
				 $("#t-correlation-detail").css("border","1px solid #eee");
		});
		$("#t-correlation-shut").click(function(){
			
			$("#t-correlation-detail").hide();
			});
	};
	
	
function businessCancel(){
	// 终止交易取消
	$(".t-business").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-business-end").css('top',sTop+255).show();	
			 }else{
			$("#t-business-end").show();	 
				 }

		});
		$("#t-business-cancel").click(function(){
			
			$("#t-business-end").hide();
			});
	};
	//终止交易确认关闭
	    function businessSure(){
			$('#t-business-end').hide();
			
			};
	
	
function sellerContact(fun){
	//联系卖家
	$(".t-seller-txt").click(function(){
		fun(this);
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-seller-contact").css('top',sTop+255).show();	
			 }else{
			$("#t-seller-contact").show();	 
				 }
		});
		$("#t-seller-contact-shut").click(function(){
			
			$("#t-seller-contact").hide();
			});
	};
	
function deleteCancel(){
	//订单删除取消
	$(".t-order-delete-t").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-order-delete").css('top',sTop+255).show();	
			 }else{
			$("#t-order-delete").show();	 
				 }
		});
		$("#t-delete-cancel").click(function(){
			
			$("#t-order-delete").hide();
			});	
	};
/*订单删除确认关闭*/
	function orderDelete(){
		$('#t-order-delete').hide();
		}
	
//公用的弹出框		
function commonPopBox(fun,f1,f2,f3){
	//收藏取消
	$("."+f1+"").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#"+f2+"").css('top',sTop+205).show();	
			 }else{
			$("#"+f2+"").show();	 
				 }
		});
		$("#"+f3+"").click(function(){
			fun();
			$("#"+f2+"").hide();
			});
	};
	//收藏确认关闭
	function packawaySure(fun,f1){
		$("#"+f1+"").click(fun);
		};
	
	
function shopVehicle(){
	//加入购物车
	$(".t-jion-shop-txt").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-jion-shop-vehicle").css('top',sTop+205).show();	
			 }else{
			$("#t-jion-shop-vehicle").show();	 
				 }

		});
		$("#t-jion-shop-vehicle-shut").click(function(){
			
			$("#t-jion-shop-vehicle").hide();
			});

	};
	
	
function complaintDetail(){
	//投诉详情
	$(".t-Complaint").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-Complaint-detail").css('top',sTop+255).show();	
			 }else{
			$("#t-Complaint-detail").show();	 
				 }
		});
		$("#t-Complaint-sure").click(function(){
			
			$("#t-Complaint-detail").hide();
			});

	};
	
	
function RefundDetail(){
	//退款详情
	$(".t-Refund").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-Refund-detail").css('top',sTop+255).show();	
			 }else{
			$("#t-Refund-detail").show();	 
				 }
		});
		$("#t-Refund-sure").click(function(){
			
			$("#t-Refund-detail").hide();
			});

	};
	
	
function starSure(){
	//完善票品星级确定关闭
	$(".t-ticket-star-txt").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-ticket-star").css('top',sTop+255).show();	
			 }else{
			$("#t-ticket-star").show();	 
				 }
		
		});
		$("#t-ticket-star-sure").click(function(){
			
			$("#t-ticket-star").hide();
			});
	};
	
function changemodeCancel(){
	//修改交易模式取消
	$(".t-change-mode-txt").click(function(){
		if($.browser.version==6){
			 var sTop=$(document).scrollTop();
			 $("#t-change-mode").css('top',sTop+255).show();	
			 }else{
			$("#t-change-mode").show();	 
				 }
		});
		$("#t-mode-cancel").click(function(){
			
			$("#t-change-mode").hide();
			});
	};
	
	//修改交易模式确认关闭
	function changemodeSure(){
		 $("#t-change-mode").hide();
		};
	

		function getNowFormatDate() {
			 var date = new Date();
			    var seperator1 = "-";
			    var seperator2 = ":";
			    var month = date.getMonth() + 1;
			    var strDate = date.getDate();
			    if (month >= 1 && month <= 9) {
			        month = "0" + month;
			    }
			    if (strDate >= 0 && strDate <= 9) {
			        strDate = "0" + strDate;
			    }
			    var hour = date.getHours();    
			    if (hour < 10) {        
			    	hour = "0" + hour.toString();    
			    	}    
			    var minute = date.getMinutes();    
			    if (minute < 10) {       
			    	minute = "0" + minute.toString();    
			    	}    
			    var second = date.getSeconds();    
			    if (second < 10) {       
			    	second = "0" + second.toString();   
			    	}
			    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
			            + " " + hour + seperator2 + minute
			            + seperator2 + second;

		    return currentdate;
		}	
  
 //IE6弹出层SELEC修复
 