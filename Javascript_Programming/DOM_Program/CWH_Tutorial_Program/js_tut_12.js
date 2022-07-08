console.log("Welcome to tutorial 12");
// let a = document;
// a = document.all;
// a = document.body;
// a = document.forms[0];
// Array.from(a).forEach(function(element) {
//     console.log(element); 
// });
// a = document.links[0];
// use document.images and document.scripts and print the list of images on an html pages
// a = document.images;       

let a = document.images;
let b = document.scripts;

a = Array.from(a);
b = Array.from(b);

a.forEach(function(element){
    console.log(element);  
});
b.forEach(function(element){
    console.log(element);  
});
console.log(a); 