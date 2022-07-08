// Examine The Document Object

// console.dir(document);
// console.log(document.domain);
// console.log(document.URL);
// console.log(document.title);
// document.title = 123;
// console.log(document.doctype);
// console.log(document.head);
// console.log(document.body);
// console.log(document.all);
// console.log(document.all[10]);
// console.log(document.all[10]);
// document.all[10].textContent = 'Hello';
// console.log(document.children);
// console.log(document.forms[0]);
// console.log(document.links);

// console.log(document.images);

// getElementById //
// console.log(document.getElementById('header-title'));
// let headerTitle = document.getElementById('header-title');
// let header = document.getElementById('main-header');
// console.log(headerTitle);
// headerTitle.textContent = 'Hello';
// headerTitle.innerText = 'GoodBye';
// console.log(headerTitle.innerText);
// headerTitle.innerHTML = '<h3>Hello</h3>';
// header.style.borderBottom = 'solid 3px #000';

// getElementByClassName //
// let item = document.getElementsByClassName('list-group-item');
// console.log(item);
// console.log(item[1]);
// item[1].textContent = 'Hello 2';
// item[1].style.fontWeight = 'bold';
// item[1].style.backgroundColor = 'yellow';

// // gives error
// // item.style.backgroundColor = '#f4f4f4';

// for (let i = 0; i < item.length; i++) {
//     item[i].style.background = '#f4f4f4';
// }

// getElementByTagName //
// let li = document.getElementsByTagName('li');
// console.log(li);
// console.log(li[1]);
// li[1].textContent = 'Hello 2';
// li[1].style.fontWeight = 'bold';
// li[1].style.backgroundColor = 'yellow';

// // gives error
// // item.style.backgroundColor = '#f4f4f4';

// for (let i = 0; i < li.length; i++) {
//     li[i].style.background = '#f4f4f4';
// }

// QuerySelector //

// let header = document.querySelector('#main-header');
// header.style.borderBottom = 'solid 4px #ccc';

// let input = document.querySelector('input');
// input.value = 'Hello World';

// let submit = document.querySelector('input[type="submit"]');
// submit.value = "SEND";

// let item = document.querySelector('.list-group-item');
// item.style.color = 'red';

// let lastItem = document.querySelector('.list-group-item:last-child');
// lastItem.style.color = 'blue';

// let secondItem = document.querySelector('.list-group-item:nth-child(2)');
// secondItem.style.color = 'coral';

// QuerySelectorAll //

// let titles = document.querySelectorAll('.title');

// console.log(titles);
// titles[0].textContent = 'Hello';

// let odd = document.querySelectorAll('li:nth-child(odd)');
// let even = document.querySelectorAll('li:nth-child(even)');

// for (let i = 0; i < odd.length; i++) {
//     odd[i].style.backgroundColor = '#f4f4f4';
//     even[i].style.backgroundColor = '#ccc';
// }

// Traversing The DOM //
let itemList = document.querySelector("#items");

// ParentNode
// console.log(itemList.parentNode);
// itemList.parentNode.style.backgroundColor = '#f4f4f4';
// console.log(itemList.parentNode.parentNode.parentNode);

// parentElement
// console.log(itemList.parentElement);
// itemList.parentElement.style.backgroundColor = '#f4f4f4';
// console.log(itemList.parentElement.parentElement.parentElement);

//childNodes
// console.log(itemList.childNodes);
// console.log(itemList.children);
// console.log(itemList.children[1]);
// itemList.children[1].style.backgroundColor = 'yellow';

// firstChild
// console.log(itemList.firstChild);
// firstElementChild
// console.log(itemList.firstElementChild);
// itemList.firstElementChild.textContent = 'Hello 1';

// lastChild
// console.log(itemList.lastChild);
// lastElementChild
// console.log(itemList.lastElementChild);
// itemList.lastElementChild.textContent = 'Hello 4';

// nextSibling
// console.log(itemList.nextSibling);
// nextElementSibling
// console.log(itemList.nextElementSibling);

// previousSibling
// console.log(itemList.previousSibling);
// previousElementSibling
// console.log(itemList.previousElementSibling);
// itemList.previousElementSibling.style.color = 'green';

// createElement

// create a div
// let newDiv = document.createElement('div');

// Add class
// newDiv.className = 'Hello';

// Add id
// newDiv.id = 'hello1';

// Add attr
// newDiv.setAttribute('title', 'Hello Div');

// Create text node
// let newDivText = document.createTextNode('Hello World');

// Add text to div
// newDiv.appendChild(newDivText);

// let container = document.querySelector('header .container');
// let h1 = document.querySelector('header h1');

// console.log(newDiv);

// newDiv.style.fontSize = '30px';
// container.insertBefore(newDiv, h1);

// EVENTS //

// let button = document
//   .getElementById("button")
//   .addEventListener("click", buttonClick);
// //     console.log(123);
// //   });

// function buttonClick(e) {
//   //   console.log("Button clicked");
//   // document.getElementById('header-title').textContent = 'Changed';
//   // document.querySelector('#main').style.backgroundColor = '#f4f4f4';
//   // e.bubbles = false
//   // console.log(e);

// //   console.log(e.target);
// //   console.log(e.target.id);
// //   console.log(e.target.className);
// //   console.log(e.target.classList);

// //   let output = document.getElementById('output');
// //   output.innerHTML = '<h3>'+e.target.id+'</h3>';

//     // console.log(e.type);

//     // console.log(e.clientX);
//     // console.log(e.clientY);

//     // console.log(e.offsetX);
//     // console.log(e.offsetY);

//     // console.log(e.altKey);
//     // console.log(e.altKey);
//     // console.log(e.shiftKey);
// }

let button = document.getElementById("button");
let box = document.getElementById('box');

// button.addEventListener("click", runEvent);
// button.addEventListener("dblclick", runEvent);
// button.addEventListener("mousedown", runEvent);
// button.addEventListener("mouseup", runEvent);

box.addEventListener('mouseenter', runEvent);
// box.addEventListener('mouseleave', runEvent);

box.addEventListener('mouseover', runEvent);
// box.addEventListener('mouseout', runEvent);

function runEvent(e) {
  console.log("EVENT TYPE: " + e.type);
}
