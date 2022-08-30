$(document).ready(function () {
  // $(document).ready instead we can write      $
  // Your jQuery code here
  console.log("WE are using jQuery");
  // jQuery Syntax looks like this
  // $('selector').action()  //click on p

  // clicks on all the p elements . This is an example of element selector.
  // $("p").click(function () {
  //   console.log("You clicked on p", this);
  //   $(this).hide();
  // }); // do this when we click on p

  // $("p").dblclick(function () {
  //   console.log("You double clicked on p", this);
  //   // $(this).hide();
  // }); // do this when we click on p

  // $("p").hover(function () {
  //   console.log("You hovered on", this);
  //   // $(this).hide();
  // },
  // function () {
  //   console.log("Thanks for coming")
  // }
  // ); // do this when we click on p

  // $("p").mouseenter(function () {
  //   console.log("You double clicked on p", this);
  //   // $(this).hide();
  // }); // do this when we click on p

  // there are three main types of selectors in jQuery
  // 1. element selector
  // 2. id selector
  // 3. class selector

  // 1. Element selector - This is an example of element selector which clicks on all p
  // $('p').click();

  // 2. ID selector - this is an example of id selector
  // $('#second').click();

  // 3. class selector - this is an example of class selector
  // $('#odd').click();

  // Other selectors
  // $('*').click() // clicks on all the elements
  // $("p.odd").click(); // clicks on all the elements
  // $("p:first").click(); // clicks on all the elements

  // Events in jQuery
  // Mouse events = clients,dblclick,mousenter.mouseleave
  // keyboardEvent = keypress, keydown, MediaKeyStatusMap

  // demoing the on method
  // $("p").on({
  //   click: function () {
  //     console.log("Thanks for clicking", this);
  //   },
  //   mouseleave: function () {
  //     console.log("mouseleave");
  //   },
  // });

  // $('#wiki').hide(1000, function() {
  //   console.log('hidden');
  // });
  // $('#wiki').show(1000, function() {
  //   console.log('Shown');
  // });
  $("#btn").click(function () {
    // $("#wiki").toggle(1000);
    // $("#wiki").fadeOut(5000);
    // $("#wiki").fadeIn(5000);
    // $("#wiki").fadeToggle(5000);
    // $("#wiki").fadeTo(5000, 0.4);
  });

  // Slide methods -- speed and callbacks method is optional
  // $('#wiki').slideUp(1000, function() {
  //   console.log('Done');
  // });
  // $('#wiki').slideDown(1000);
  // $('#wiki').slideToggle(1000);

  // Animate function in jQuery
  $("#wiki").animate(
    {
      opacity: 0.3,
      height: "150px",
      width: "350px",
    },
    "slow"
  );
  // $("#wiki").animate({ opacity: 0.3 }, 4000);
  // $("#wiki").animate({ opacity: 0.9 }, 1000);
  // $("#wiki").animate({ height: "350px" }, 12000);

  // $("#ta").html("setting it to harry");
  // $("#ta").val("setting it to harry");
  // $("#inp").html("setting it to harry");
  // $("#inp").val("setting it to harry");
  // $("#inp").empty();
  // $("#wiki").empty();
  // $('#wiki').text('you are good')
  // $('#wiki').remove()
  // $("#wiki").addClass('myclass2');
  // $("#wiki").removeClass('myclass2');

  // $("#wiki").css('background-color','red');
  // $('#wiki').css('background-color');

  // AJAX Using jQuery
  // $.get('https://code.jquery.com/jquery-3.3.1.js', function (data, status) { alert(data); })

  // $.get('https://code.jquery.com/jquery-3.3.1.js', function (data, status) { alert(status); })

  // $.post('https://code.jquery.com/jquery-3.3.1.js',
  //     { name: 'harry', channel: 'code with harry' },
  //     function (data, status) { alert(status) });
});
console.log("I am in a new file now");
