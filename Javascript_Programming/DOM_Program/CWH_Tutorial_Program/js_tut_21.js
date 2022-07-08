console.log("Tutorial 21 exercise 2 javascript");
/*

    You have to create a div and inject it into the page contains a heading.
    Whenever someone clicks on the div, it should be converted into an editable item. Whenever user clicks away (blur). save the note into the local storage. 

*/

// function change() {
//     let el = document.getElementById('red');
//     el.addEventListener('click', function (e) {
//         document.write("Hi, I am Pradeepkumar");
//     });
// }

// let div = document.createElement('DIV');
// div.innerText = 'Hello, This is Headlines'
// div.setAttribute("id", "editDiv");
// div.setAttribute("contenteditable", "true");
// document.body.insertBefore(div, DomManipulate);

// document.getElementById('editDiv').addEventListener("input", function () {
//     localStorage.setItem("Content", div.innerText);
// });

// let mainBody = document.querySelector('body');
// let divTag = document.createElement('div');
// divTag.innerText = 'Hello, this is div tag';
// mainBody.appendChild(divTag);
// divTag.addEventListener('click', (e) => {
//     let text = prompt("Enter the text into which you want to convert the div string into");
//     divTag.innerText = text;
//     localStorage.setItem('text', text);
// });


// let make1 = document.querySelector('body');
// let make2 = document.createElement('div');
// make2.innerText = "Hello, Hi Kaiso Ho aap log";
// make1.appendChild(make2);

// make2.addEventListener('click', (e) => {
//     let note = prompt("Enter the text that you want to enter: ");
//     make2.innerText = note;
//     localStorage.setItem('myText',note);
// });


let tes = document.querySelector('body');
let text = document.createElement('div');
text.innerText = "Hi, How are you."
tes.appendChild(text);

tes.addEventListener('click', function(e) {
    let note = prompt("Enter the test that you want to enter: ");
    tes.innerText = note;
    localStorage.setItem('myText' , 'note');
});