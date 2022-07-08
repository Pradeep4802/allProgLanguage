console.log("Welcome to tutorial 18 on events");
// let btn = document.getElementById('btn');
// btn.addEventListener('click', func1);
// // btn.addEventListener('mousedown', func3);
// btn.addEventListener('dblclick', func2);

// function func1(e) {
//     console.log("Thanks", e);
//     e.preventDefault();
// }

// function func2(e) {
//     console.log("Thanks its a double click", e);
//     e.preventDefault();
// }

// function func3(e) {
//     console.log("Thanks its a mouse down", e);
//     e.preventDefault();
// }

// document.querySelector('.no').addEventListener('mouseenter', function() {
//     console.log('You entered no');
// });

document.querySelector('.container').addEventListener('mousemove', function(e) {
    console.log(e.offsetX, e.offsetY);
    document.body.style.backgroundColor = `rgb(${e.offsetX}, ${e.offsetX},54)`; 
    console.log('You triggered mouse move event');
});