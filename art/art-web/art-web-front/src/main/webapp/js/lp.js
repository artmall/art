// JavaScript Document
	 jQuery(function(){
		 //搜索列表页城市菜单
		    $(".slide").click(function(){
				
				$(".slide-hd").toggle();
				$(this).toggleClass("slie-b");
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
			 
/*	jQuery(function(){
		//加入购物车隐藏
		 $(".shopping-trolley").hide();
		 $(".table-item-detail tr:even").css("background","#f7f7f7")
		 $(".table-item-detail tr").css("cursor","pointer")
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
    })
});*/
/*			 
 jQuery(function(){
		 //星星移上提示效果 
		  $(".redstar-prompt").hide();
		 $(".star-box2").mouseover(function(){
			 $(this).find(".redstar-prompt").show();
		
			 })
			 $(".star-box2").mouseout(function(){
				   $(this).find(".redstar-prompt").hide();
				 
				 });
		 });
	*/
			 
 jQuery(function(){
 //加入收藏效果 
  $(".operation-b1").hide();
 $(".operation-a1").hover(function(){
	 $(this).addClass("operation-b1-b")
	 $(this).next(".operation-b1").show();

	 },function(){
		   $(this).next(".operation-b1").hide();
			$(this).toggleClass("operation-b1-b")
		 });
 //联系卖家效果 
  $(".operation-b2").hide();
 $(".operation-a2").hover(function(){
	 $(this).addClass("operation-b2-b")
	 $(this).next(".operation-b2").show();

	 },function(){
			$(this).next(".operation-b2").hide();
			 $(this).toggleClass("operation-b2-b")
		 
		 });
		 //查看座位 
  $(".operation-b3").hide();
 $(".operation-a3").hover(function(){
	 $(this).addClass("operation-b3-b")
	 $(this).next(".operation-b3").show();

	 },function(){
		  $(this).next(".operation-b3").hide();
		   $(this).toggleClass("operation-b3-b")
		 
		 });
 }); 
			 
 jQuery(function(){
			 //切换到在线选座 
			 $(".change-other").click(function(){
				 $(".line-chooseseat").toggle();
				 $(".table-item-detail").toggle();
				 })
				
			 });
			 
 jQuery(function(){
			 //加入购物车弹出框 
			  $(".t-jion").hide();
			 $(".shopping-trolley").click(function(){
				 $(".t-jion").show();
				 });
		   $(".collect-h a").click(function(){
				 $(".t-jion").hide();
				 })
				
		    //联系卖家 
			  $(".t-collect-saler").hide();
			 $(".operation-a2").click(function(){
				 $(".t-collect-saler").show();
				 });
		   $(".collect-h a").click(function(){
				 $(".t-collect-saler").hide();
				 })
		   //加入收藏 
		   
			  $(".t-coollecting").hide();
			 $(".operation-a1").click(function(){
				 $(".t-coollecting").show();
				 });
		   $(".collect-h a").click(function(){
				 $(".t-coollecting").hide();
				 })
			  //卖家资料 
		   
			  $(".t-seller-Information").hide();
			 $(".ni-said").click(function(){
			 $(".t-seller-Information").show(); 
				
				 });
		   $(".collect-h a").click(function(){
				 $(".t-seller-Information").hide();
				 })  
			 });
			 
			 
			 
				 
 jQuery(function(){
			 //帮助中心-常见问题左栏导航
			  var oA=$('.self-second li').children('a')
				  $(".self-con3 li").next(".self-second").hide();
				  $(".self-con3 li").click(function(){
					  $(this).toggleClass("back-Reduction");
					   $(this).find(".self-second").toggle();
					  });
				   oA.click(function(event){
					   event.stopPropagation();
					   
					   })
							
						 });
			 
jQuery(function(){
			 //手机及邮箱注册效果 
	  $(".reg dl").hover(function(){
		  $(this).toggleClass("dlhover");
		  });
				
			 });
			 
			 
			 			 
jQuery(function(){
			 //项目终极页排序切换--星级推荐 
	  $(".taxis-up").click(function(){
		  $(this).toggleClass("taxis-down");
		  });
		   //项目终极页排序切换--剩余时间
     $(".taxis-uprup53").click(function(){
		  $(this).toggleClass("taxis-updown53");
		  });
		  	   //项目终极页排序切换--售价/折扣
     $(".taxis-uprup29").click(function(){
		  $(this).toggleClass("taxis-updown29");
		  });
				
 });

jQuery(function(){
	//充值-选择充值方式
	$('.platform-list-box').hide();
	$('.online-bank').click(function(){
		$('.payment-list-box').show();
		  $('.platform-list-box').hide();
		
    });
	
	$('.platform').click(function(){
		$('.platform-list-box').show();
		 $('.payment-list-box').hide();
	});
});
	
jQuery(function(){
		  	   //竞拍列表页-开始时间，时间状态
     $(".taxis-uprup41").click(function(){
		  $(this).toggleClass("taxis-updown41");
		  });
		      //竞拍列表页--星级推荐
	  $(".taxis-uprup95").click(function(){
	  $(this).toggleClass("taxis-updown95");
	  });
				
 });  
 
jQuery(function(){
	 var timer=null;
	$('.current-city').mouseover
		(
		 function(){
			 clearInterval(timer)
			 $('.city-item-slet').show()}
		);
	
     $('.current-city').mouseout(function()
	      {
		 
			   timer=setInterval(
				function()
					 {
						 $('.city-item-slet').hide();
					 }
			 ,300)
		  }
	  );
 
	 $('.city-item-slet').mouseover(function()
		 {
			clearInterval(timer)
			$(this).show();
		 }
	  );
		 
	$('.city-item-slet').mouseout(function()
		{
		  timer=setInterval(
				function()
					 {
						 $('.city-item-slet').hide();
					 }
			 ,300)
				 
		 }
	 )

});
jQuery(function(){ 
   //确认演出项目选择城市
	$('.ct-ol:gt(0)').hide();
	var hdli=$('.city-txt-Letter li')
	hdli.hover(function()
	 {
		$(this).addClass('active')
		       $(this).siblings().removeClass('active');
	 });
	 
	 var hdli_index=hdli.index(this)
	 hdli.hover(function(){
		 $('.ct-ol').eq(hdli.index(this)).show().siblings().hide();
		 
		 
	});


 
 });	 	 
			 
			 
			 
			 