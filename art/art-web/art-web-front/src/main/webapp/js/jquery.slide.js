(function($){ //图片轮播器插件
	$.fn.extend({     
	       player:function(arg){      
			arg = jQuery.extend({//默认参数设置
				wrap  :'#ban_bo',//滑动盒子ID
				prev  :'#prev',//播放上一张ID
				next  :'#next',//播放下一张ID
				button:'#button',//按钮ID
				isbutton:false,//是否生成按钮
				titles  :'#text-title',//标题盒子ID
				istitle :true,//是否显示标题
				tag   :'li',//自定义选择器
				width : 674,//滑动宽度
				timer : 2000,//播放时间间隔
				speed :'slow',//播放速度
				type  :'click',//事件类型
				className:'on',//切换类
				effect:'easeInQuad',//动画效果
				auto:true//是否播放
    	   }, arg);
		 return this.each(function() {
			  $.fn.player.init($(this),arg);
    	 }); 
	   } 
	});
	$.fn.player.init = function(_this,arg){
		//定义局部变量
        var contais = $(arg.wrap).find(arg.tag), 
			len     = contais.length,
			buttons = $(arg.button),lis,
			prev    = $(arg.prev),
			next    = $(arg.next),
			index   = 0 , flag = true,
		    _setStyle = function(w){//设置样式
		        contais.not('.'+arg.className).css('left',w);
		    },
		    _toggleButton = function(ary,i){//切换类
				ary.removeClass(arg.className).eq(i).addClass(arg.className);
			},
			_create  = function(){//生成按钮
				  var htmlText='';
				  for(var j = 1 ; j<=len ; j++ ){
					    htmlText += (function(){
							  return j != 1 ? '<li><a href="javascript:void(null)" target="_self">'+j+'</a></li>'
						             : '<li class="'+arg.className+'"><a href="javascript:void(null)" target="_self">'+j+'</a></li>'
						}());
				  }
				  buttons.html(htmlText);
			},
			_play  = function(i,imgWidth){//播放到某一张
				 if(flag){
					  flag = false;
					  if( arg.istitle ){
						   var titles  = $(arg.titles).find('li');
						   titles.fadeOut(0).eq(i).fadeIn('slow');
					  }
					  _toggleButton(lis,i);
					  contais.eq(i).animate({'left':0},arg.speed,arg.effect,function(){
						 $(this).addClass(arg.className);
					   });
					  contais.filter('.'+arg.className).animate({'left':-imgWidth},arg.speed,arg.effect,function(){
						  $(this).animate({'left':imgWidth},0).removeClass(arg.className);
						  flag = true;
					   });
			       }
		   },
		   _playNext = function(){//播放下一张
		   			if(flag){
						 _setStyle(arg.width);
						 index　<　len　-　1　?　index++　:　index = 0;
						 _play(index,arg.width);
			        }
		   },
		   _playPrev = function(){//播放上一张
					if(flag){
						 _setStyle(-arg.width);
						 index　>　0　?　index--　:　index = len-1;
						 _play(index,-arg.width);
					}
		   },
		   _start = function(){//开始播放
		   			_setStyle(arg.width);
					return setInterval(function(){
							   index < len-1 ? index++ : index = 0;
								_play(index,arg.width);
					},arg.timer);
		   },
		   _stop  = function(){//停止播放
		   			_this.hover(
						function(){
							!!arg.timeout && clearInterval(arg.timeout);
						},function(e){
							arg.timeout = _start();
						}
			        ); 
		   };
         
		+function(){//初始化
			        arg.isbutton && _create();//生成按钮
					lis = buttons.find('li');
					lis[arg.type](function(e){//绑定事件
						_setStyle(arg.width);
						e.stopPropagation();
					    var $this = $(this);
						if( index !== $this.index() ){
							index = $this.index();
					        _play(index,arg.width);
						}
			        });					
					next[arg.type](function(){//绑定上一张
            　　　　　　　　　　　_playNext();
					});
					prev[arg.type](function(){//绑定下一张
            			_playPrev();
					});	
					if( arg.auto ){//是否播放
						arg.timeout = _start();
						_stop();
					}
		}();
	}
})(jQuery); 
//引用as动画算法
jQuery.extend( jQuery.easing,{
	def: 'easeOutQuad',
	swing: function (x, t, b, c, d) {
		return jQuery.easing[jQuery.easing.def](x, t, b, c, d);
	},
	easeInQuad: function (x, t, b, c, d) {
		return c*(t/=d)*t + b;
	},
	easeOutQuad: function (x, t, b, c, d) {
		return -c *(t/=d)*(t-2) + b;
	},
	easeInOutQuad: function (x, t, b, c, d) {
		if ((t/=d/2) < 1) return c/2*t*t + b;
		return -c/2 * ((--t)*(t-2) - 1) + b;
	},
	easeInCubic: function (x, t, b, c, d) {
		return c*(t/=d)*t*t + b;
	},
	easeOutCubic: function (x, t, b, c, d) {
		return c*((t=t/d-1)*t*t + 1) + b;
	},
	easeInOutCubic: function (x, t, b, c, d) {
		if ((t/=d/2) < 1) return c/2*t*t*t + b;
		return c/2*((t-=2)*t*t + 2) + b;
	},
	easeInQuart: function (x, t, b, c, d) {
		return c*(t/=d)*t*t*t + b;
	},
	easeOutQuart: function (x, t, b, c, d) {
		return -c * ((t=t/d-1)*t*t*t - 1) + b;
	},
	easeInOutQuart: function (x, t, b, c, d) {
		if ((t/=d/2) < 1) return c/2*t*t*t*t + b;
		return -c/2 * ((t-=2)*t*t*t - 2) + b;
	},
	easeInQuint: function (x, t, b, c, d) {
		return c*(t/=d)*t*t*t*t + b;
	},
	easeOutQuint: function (x, t, b, c, d) {
		return c*((t=t/d-1)*t*t*t*t + 1) + b;
	},
	easeInOutQuint: function (x, t, b, c, d) {
		if ((t/=d/2) < 1) return c/2*t*t*t*t*t + b;
		return c/2*((t-=2)*t*t*t*t + 2) + b;
	},
	easeInSine: function (x, t, b, c, d) {
		return -c * Math.cos(t/d * (Math.PI/2)) + c + b;
	},
	easeOutSine: function (x, t, b, c, d) {
		return c * Math.sin(t/d * (Math.PI/2)) + b;
	},
	easeInOutSine: function (x, t, b, c, d) {
		return -c/2 * (Math.cos(Math.PI*t/d) - 1) + b;
	},
	easeInExpo: function (x, t, b, c, d) {
		return (t==0) ? b : c * Math.pow(2, 10 * (t/d - 1)) + b;
	},
	easeOutExpo: function (x, t, b, c, d) {
		return (t==d) ? b+c : c * (-Math.pow(2, -10 * t/d) + 1) + b;
	},
	easeInOutExpo: function (x, t, b, c, d) {
		if (t==0) return b;
		if (t==d) return b+c;
		if ((t/=d/2) < 1) return c/2 * Math.pow(2, 10 * (t - 1)) + b;
		return c/2 * (-Math.pow(2, -10 * --t) + 2) + b;
	},
	easeInCirc: function (x, t, b, c, d) {
		return -c * (Math.sqrt(1 - (t/=d)*t) - 1) + b;
	},
	easeOutCirc: function (x, t, b, c, d) {
		return c * Math.sqrt(1 - (t=t/d-1)*t) + b;
	},
	easeInOutCirc: function (x, t, b, c, d) {
		if ((t/=d/2) < 1) return -c/2 * (Math.sqrt(1 - t*t) - 1) + b;
		return c/2 * (Math.sqrt(1 - (t-=2)*t) + 1) + b;
	},
	easeInElastic: function (x, t, b, c, d) {
		var s=1.70158;var p=0;var a=c;
		if (t==0) return b;if ((t/=d)==1) return b+c;if (!p) p=d*.3;
		if (a < Math.abs(c)) {a=c;s=p/4;}
		else s = p/(2*Math.PI) * Math.asin (c/a);
		return -(a*Math.pow(2,10*(t-=1)) * Math.sin( (t*d-s)*(2*Math.PI)/p )) + b;
	},
	easeOutElastic: function (x, t, b, c, d) {
		var s=1.70158;var p=0;var a=c;
		if (t==0) return b;if ((t/=d)==1) return b+c;if (!p) p=d*.3;
		if (a < Math.abs(c)) {a=c;s=p/4;}
		else s = p/(2*Math.PI) * Math.asin (c/a);
		return a*Math.pow(2,-10*t) * Math.sin( (t*d-s)*(2*Math.PI)/p ) + c + b;
	},
	easeInOutElastic: function (x, t, b, c, d) {
		var s=1.70158;var p=0;var a=c;
		if (t==0) return b;if ((t/=d/2)==2) return b+c;if (!p) p=d*(.3*1.5);
		if (a < Math.abs(c)) {a=c;s=p/4;}
		else s = p/(2*Math.PI) * Math.asin (c/a);
		if (t < 1) return -.5*(a*Math.pow(2,10*(t-=1)) * Math.sin( (t*d-s)*(2*Math.PI)/p )) + b;
		return a*Math.pow(2,-10*(t-=1)) * Math.sin( (t*d-s)*(2*Math.PI)/p )*.5 + c + b;
	},
	easeInBack: function (x, t, b, c, d, s) {
		if (s == undefined) s = 1.70158;
		return c*(t/=d)*t*((s+1)*t - s) + b;
	},
	easeOutBack: function (x, t, b, c, d, s) {
		if (s == undefined) s = 1.70158;
		return c*((t=t/d-1)*t*((s+1)*t + s) + 1) + b;
	},
	easeInOutBack: function (x, t, b, c, d, s) {
		if (s == undefined) s = 1.70158;
		if ((t/=d/2) < 1) return c/2*(t*t*(((s*=(1.525))+1)*t - s)) + b;
		return c/2*((t-=2)*t*(((s*=(1.525))+1)*t + s) + 2) + b;
	},
	easeInBounce: function (x, t, b, c, d) {
		return c - jQuery.easing.easeOutBounce (x, d-t, 0, c, d) + b;
	},
	easeOutBounce: function (x, t, b, c, d) {
		if ((t/=d) < (1/2.75)) {
			return c*(7.5625*t*t) + b;
		} else if (t < (2/2.75)) {
			return c*(7.5625*(t-=(1.5/2.75))*t + .75) + b;
		} else if (t < (2.5/2.75)) {
			return c*(7.5625*(t-=(2.25/2.75))*t + .9375) + b;
		} else {
			return c*(7.5625*(t-=(2.625/2.75))*t + .984375) + b;
		}
	},
	easeInOutBounce: function (x, t, b, c, d) {
		if (t < d/2) return jQuery.easing.easeInBounce (x, t*2, 0, c, d) * .5 + b;
		return jQuery.easing.easeOutBounce (x, t*2-d, 0, c, d) * .5 + c*.5 + b;
	}
});