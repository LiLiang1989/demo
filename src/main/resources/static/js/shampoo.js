/**
 * 
 */
$(function(){
	$('.stop-btn').click(function(){
		layer.confirm('您是否要停止本次实验？', {
			  btn: ['是','否'] //按钮
			}, function(){
			  layer.msg('正在结束本次实验', {icon: 1});
			  setTimeout(function(){
				  window.location.href='/user/home';
			  },2000)
			}, function(){
			  layer.msg('您选择了继续实验', {
			    time: 20000
			  });
			});
	})
})