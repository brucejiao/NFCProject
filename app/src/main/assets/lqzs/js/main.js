$(function(){
  initializePage();
  mui('.mui-scroll-wrapper').scroll({
    deceleration: 0.0005
  });

  $('.drop').each(function(index, el) {
    var $obj=$(this);
    var ind=0;
    $obj.click(function(event) {
      ind++;
      if(ind>2){
        ind=0;
      }
      $obj.removeClass('t0 t1 t2');
      $obj.addClass('t'+ind);
    });
  });
  $('.drop').click(function(event) {
    var ind=0;
  });

});

/*---------------method---------------*/
//