"use strict";

const prompt = require("prompt-sync")({ sigint: true });

function even_odd(arr,n) {
    console.log("Even number are: ");
    for (let i = 0; i < n; i++) {
        if (arr[i] % 2 == 0) {
            console.log(arr[i]);
        }
    }
    console.log("Odd Number are: ");
    for (let i = 0; i < n; i++) {
        if (arr[i] % 2 != 0) {
            console.log(arr[i]);
        }
    }
}

let arr = [10];
let n = prompt("Enter the no of the element: ");
console.log("Enter the element in the array: ");
for (let i = 0; i < n; i++) {
    arr[i] = prompt();
}
even_odd(arr, n);
