function initializePage(){
  bindOnResize();
  bindToggleOn();
  
}

/*---------------method---------------*/
//
function bindOnResize(){
  var resize=function(){
    var height=$(window).height();
    $('.full-height').height(height);
    var width=$(window).width();
    $('html').css('font-size', width/375*16+'px');
  }
  resize();
  $(window).resize(function(event) {
    resize();
  });
}
function bindToggleOn(){
  $('toggle-on').click(function(event) {
    $(this).toggleClass('on');
  });
}

$(function(){
  /*初始化*/
  var counter = 0; /*计数器*/
  var pageStart = 0; /*offset*/
  var pageSize = 20; /*size*/
   
  /*首次加载*/
  //getData(pageStart, pageSize);
   
  /*监听加载更多*/
  $(document).on('click', '.js-load-more', function(){
    counter ++;
    pageStart = counter * pageSize;
     
    //getData(pageStart, pageSize);
  });
});