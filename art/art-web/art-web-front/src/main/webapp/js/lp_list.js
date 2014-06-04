// JavaScript Document
 jQuery(function(){
	 //搜索列表页城市菜单
    $(".slide").click(function(){
		//$(".slide-hd").toggle();
		//$(this).toggleClass("slie-b");
		});
 });
jQuery(function(){
	//搜索列表页城市下拉菜单
	$(".choose-city").hover(function(){			
		$(".n_city").toggle();
		$(" .n_city ul li").click(function(){
			$(".n_city").hide();
		});
	});
   
 });
		 
jQuery(function(){
	//收起菜单
	$(".shut-menu").click(function(){
		$(".menu-list-in").slideToggle();
	});
 });

jQuery(function(){
	favoritesInit();
});

function favoritesInit(){
	//加入购物车隐藏
	$(".shopping-trolley").hide();
	$(".table-item-detail tr:even").css("background","#f7f7f7");
	$(".table-item-detail tr").css("cursor","pointer");
	$(".table-item-detail tr").hover(function(){
		$(this).find(".shopping-trolley").show();
		$(this).find(".operation-lt").css("position","absolute");
		$(this).find(".operation-lt").css("left","0");
		$(this).find(".operation-lt").css("top","29px");
    },function(){
        $(this).find(".shopping-trolley").hide();  
		$(this).find(".operation-lt").css("position","");
		$(this).find(".operation-lt").css("left","");
		$(this).find(".operation-lt").css("top","");
    });
}
			 
jQuery(function(){
	showStar();
 });

function showStar(){
	//星星移上提示效果 
	$(".redstar-prompt").hide();
	$(".star-box2").mouseover(function(){
		$(this).find(".redstar-prompt").show();
	});
	$(".star-box2").mouseout(function(){
		$(this).find(".redstar-prompt").hide();
	});
}
 
jQuery(function(){
	listInit();
});

function listInit(){
	//加入收藏效果 
	$(".operation-b1").hide();
	$(".operation-a1").hover(function(){
		$(this).addClass("operation-b1-b");
		$(this).next(".operation-b1").show();
	 },function(){
		 $(this).next(".operation-b1").hide();
		 $(this).toggleClass("operation-b1-b");
	});
	//联系卖家效果 
	$(".operation-b2").hide();
	$(".operation-a2").hover(function(){
		$(this).addClass("operation-b2-b");
		$(this).next(".operation-b2").show();
	 },function(){
		 $(this).next(".operation-b2").hide();
		 $(this).toggleClass("operation-b2-b");
	});
	//查看座位 
	$(".operation-b3").hide();
	$(".operation-a3").hover(function(){
		$(this).addClass("operation-b3-b");
		$(this).next(".operation-b3").show();
	 },function(){
		 $(this).next(".operation-b3").hide();
		 $(this).toggleClass("operation-b3-b");
	});
}
			 
jQuery(function(){
	openDivInit();
});

function openDivInit(){
	//加入购物车弹出框 
	$(".t-jion").hide();
	$(".shopping-trolley").click(function(){
		//$(".t-jion").show();
		if ($.browser.version == 6) {
			var sTop = $(document).scrollTop();
			$(".t-jion").css('top', sTop + 155).show();
		} else {
			$(".t-jion").show();
		}
	});
	$(".collect-h a").click(function(){
		$(".t-jion").hide();
	});

	//联系卖家 
	$(".t-collect-saler").hide();
	$(".operation-a2").click(function(){
		var sell_user_id = $(this).attr("dataId");
		jQuery("#messageContent").val("");
		jQuery("#jsUserId").val(sell_user_id);
		
		var sell_user_name = $(this).attr("dataName");
		if(sell_user_name == null){
			sell_user_name = "";
		}
		$("#showSellUserName").html("向" + sell_user_name + "发送站内信");
		
		if ($.browser.version == 6) {
			var sTop = $(document).scrollTop();
			
			$(".t-collect-saler").css('top', sTop + 155).show();
		}
		else {
			$(".t-collect-saler").show();
		}
		
		//$(".t-collect-saler").show();
	});
	$(".collect-h a").click(function(){
		$(".t-collect-saler").hide();
	});
	//加入收藏 
	$(".t-coollecting").hide();
	$(".operation-a1").click(function(){
		var ticketId = $(this).attr("dataId");
		addFavoriteTicket(ticketId);
	});
	$(".collect-h a").click(function(){
		$(".t-coollecting").hide();
	});
	//卖家资料 
	//$(".t-seller-Information").hide();
	
	$(".collect-h a").click(function(){
		$(".t-seller-Information").hide();
	});

	// 查看座位弹出框
	$(".t-view-seat").hide();
	$(".operation-a3").click(function() {
		if ($.browser.version == 6) {
			var sTop = $(document).scrollTop();
			$(".t-view-seat").css('top', sTop + 155).show();
		} else {
			$(".t-view-seat").show();
		}
		var dataStandId = $(this).attr("dataStandId");
	    var dataSyncSeatId = $(this).attr("dataSyncSeatId");
	    var dataTransactionMode = $(this).attr("dataTransactionMode");
	    
		refreshCurrentFalsh(dataStandId,dataSyncSeatId,dataTransactionMode);
	});
	$(".shut-btnse").click(function() {
		$(".t-view-seat").hide();
	});

}

jQuery(function(){
//帮助中心-常见问题左栏导航 
	$(".self-con3 li").next(".self-second").hide();
	$(".self-con3 li").click(function(){
		$(this).toggleClass("back-Reduction");
		$(this).find(".self-second").toggle();
	});
});
			 
		