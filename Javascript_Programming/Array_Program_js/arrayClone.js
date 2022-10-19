// Write a JavaScript function to clone an array.

"use strict";

const prompt = require("prompt-sync")({ sigint: true });

let array_Clone = function (array) {
  return array.slice(0);
};

console.log(array_Clone([1, 2, 4, 0]));
console.log(array_Clone([1, 2, [4, 0]]));

// Definition of slice method
// The slice() method returns a shallow copy of a portion of an array into a new array object selected from start to end (end not included) where start and end represent the index of items in that array. The original array will not be modified.

// console.log([1, 2, , 4, 5].slice(1, 4)); // [2, empty, 4]

const animals = ['ant', 'bison', 'camel', 'duck', 'elephant'];

// console.log(animals.slice(2));
// expected output: Array ["camel", "duck", "elephant"]

// console.log(animals.slice(2, 4));
// expected output: Array ["camel", "duck"]

// console.log(animals.slice(1, 5));
// expected output: Array ["bison", "camel", "duck", "elephant"]

// console.log(animals.slice(-2));
// expected output: Array ["duck", "elephant"]

// console.log(animals.slice(2, -1));
// expected output: Array ["camel", "duck"]

// console.log(animals.slice());
// expected output: Array ["ant", "bison", "camel", "duck", "elephant"]

// Using slice, create newCar from myCar.
const myHonda = { color: 'red', wheels: 4, engine: { cylinders: 4, size: 2.2 } };
const myCar = [myHonda, 2, 'cherry condition', 'purchased 1997'];
const newCar = myCar.slice(0, 2);

// Display the values of myCar, newCar, and the color of myHonda
//  referenced from both arrays.
console.log('myCar = ', myCar);
console.log('newCar = ', newCar);
console.log('myCar[0].color = ', myCar[0].color);
console.log('newCar[0].color = ', newCar[0].color);

// Change the color of myHonda.
myHonda.color = 'purple';
console.log('The new color of my Honda is ', myHonda.color);

// Display the color of myHonda referenced from both arrays.
console.log('myCar[0].color = ', myCar[0].color);
console.log('newCar[0].color = ', newCar[0].color);

