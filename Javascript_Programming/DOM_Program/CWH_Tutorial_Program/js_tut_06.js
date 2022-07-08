// console.log('We are at tut 6');
// const name = 'Harry';
// const greeting = 'Good Morning';
// console.log(greeting +" " +  name);

// let html;
// html = "<h1> this is heading </h1>" +
//     "<p> This is my para </p>";

// html = html.concat('this', 'str2');
// console.log(html);
// console.log(html.length);
// console.log(html.toLowerCase());
// console.log(html.toUpperCase());
// console.log(html);

// console.log(html[1]);
// console.log(html.indexOf('<'));
// console.log(html.lastIndexOf('<'));
// console.log(html.charAt(5));
// console.log(html.endsWith('ssssqqwqdq'));
// console.log(html.includes('fg'));
// console.log(html.substring(1,6));
// console.log(html.slice(0,4));
// console.log(html.split('>'));
// console.log(html.replace('this', 'it'));

// let fruits1 = 'Orange';
// let fruits2 = 'Apple';
// let myHtml = `Hello ${name}
//             <h1> This is' "my" heading </h1>
//             <p> You like ${fruits1} and ${fruits2}

// `;
// document.body.innerHTML = myHtml;

var str = "Hello World!";
var res = str.slice(3);
console.log(res);


var str1 = "How are you doing today?";
var es = str1.split("o");
console.log(es);

let str2 = "Visit W3School";
console.log(str2.search("W3School"));

const mygreet = function(name) {
    let msg = `Happy birthday $(name)`;
    return msg;
}

let name = 'nikhil';
let val = mygreet(name);
console.log(val);