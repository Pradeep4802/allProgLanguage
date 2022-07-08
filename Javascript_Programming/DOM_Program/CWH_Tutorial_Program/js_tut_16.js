console.log("Welcome to tutorial 16");
let element = document.createElement('li');
let text = document.createTextNode('I am a text node');
element.appendChild(text);
// console.log(element);

// Add a class name to the li element
element.className = 'childul';
element.id = 'createdLi';
element.setAttribute('title', 'mytitle');
element.setAttribute('value', 'mainres');
// element.innerText = '<b>Hello this is created by harry</b>'; // wrong
// element.innerHTML = '<b>Hello this is created by harry</b>';
// console.log(element);

let ul = document.querySelector('ul.this');
ul.appendChild(element);
// console.log(ul);
// console.log(element);
// console.log(ul);

let elem2 = document.createElement('h3');
elem2.id = 'elem';
elem2.className = 'elem2';
let tnode = document.createTextNode('This is a created node for elem2');
elem2.appendChild(tnode);

// element.replaceWith(elem2);
let pr1 = elem2.getAttribute('id');
// console.log(pr1);
// console.log(element);
// console.log(elem2);
let myul = document.getElementById("myul");
myul.replaceChild(element, document.getElementById('fui'));
console.log(element);
console.log(myul);
myul.removeChild(document.getElementById('lui'));
console.log(myul);
let pr = elem2.hasAttribute('href');
// elem2.removeAttribute('id');
elem2.setAttribute('title', 'myelem2title');
// console.log(elem2, pr);

// quick quiz
// create a heading element with text as "Go to codeWitharry" and create an a tag outside it with href = "https://www.codeWithHarry.com"

let set = document.querySelector('a');
set.setAttribute('href', "//codewithharry.com");
let gh = set.hasAttribute('href');
console.log(set, gh);