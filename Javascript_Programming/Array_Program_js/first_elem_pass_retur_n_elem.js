// Write a Javascript function to get the first element of an array. Passing a parameter 'n' will return the first 'n' elements of the array.

"use strict";

const prompt = require("prompt-sync")({ sigint: true });

let first = (input,n) => {
    if (input == null) 
        return void 0;
    if (n == null)
        return input[0];
    if (n < 0) 
        return 0;
    return input.slice(0,n)
}

console.log(first([7, 9, 0, -2]));
console.log(first([],3));
console.log(first([7, 9, 0, -2],3));
console.log(first([7, 9, 0, -2],6));
console.log(first([7, 9, 0, -2],-3));
