// type conversion and coercion
console.log('WELCOME TO TUT5');
let myVar;
myVar = String(34);

// console.log(myVar, (typeof myVar));

let booleanVar = String(true);
// console.log(booleanVar, (typeof booleanVar));

let date = String(new Date());
// console.log(date, (typeof date));

let arr = String([1, 2, 3, 4, 5, 6]);
// console.log(arr.length, (typeof arr));

let i = new Date();
// console.log(i.toString());

let stri = Number("3434");
stri = Number("34d34");
stri = Number(false);
stri = Number([1,2,3,4,5,6,7,8,9]);
// console.log(stri, (typeof stri));

let number = parseFloat('34.83838');
console.log(number.toFixed(3), (typeof number));


// Type Coercion

let mystr = Number("698");
let mynum = 34;

console.log(mystr + mynum);