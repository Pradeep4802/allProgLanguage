 // Exercise
// You have to create a variable which is a string conatining the text which is a valid link you are interested in.

// You have to fetch all the links from a given page which contains this text

// codewithharry.com
// javascript

let a = document.links;

Array.from(a).forEach(function(element){
     if(element.href.includes("javascript"))
    {
           console.log(element.href);
    }
}
);