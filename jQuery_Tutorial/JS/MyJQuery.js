$(document).ready(function () {
    // $(document).ready instead we can write      $
    // Your jQuery code here
    console.log("WE are using jQuery");
    // jQuery Syntax looks like this
    // $('selector').action()  //click on p

    // clicks on all the p elements . This is an example of element selector.
    $("p").click(function () {
      console.log("You clicked on p", this);
      // $(this).hide();
    }); // do this when we click on p
    
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
    $('*').click() // clicks on all the elements
    // $("p.odd").click(); // clicks on all the elements
    // $("p:first").click(); // clicks on all the elements
});
    
