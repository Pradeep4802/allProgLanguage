// Write a Javascript function to get the last element of an array.Passing a parameter 'n' will return the last element 'n' elements of the array

"use strict";

const prompt = require("prompt-sync")({ sigint: true });

let last = (input,n) => {
    if (input == null)
        return void 0;
    if (n == null)
        return input[input.length - 1];
    if (n < 0) {
        return input;
    }
    return input.slice(Math.max(input.length-n,0));
}



console.log(last([7,9,0,-2]));
console.log(last([7,9,0,-2],3));
console.log(last([7,9,0,-2],6));