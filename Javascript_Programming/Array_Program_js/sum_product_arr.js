// Write a JavaScript Program to compute the sum and product of an array of integers.
"use strict";

const prompt = require("prompt-sync")({ sigint: true });

function sum_prod(arr,n) {
    let sum = 0;
    let product = 1;
    for (let i = 0; i < n; i++) {
        sum = sum + Number.parseInt(arr[i]);
        product = product * Number.parseInt(arr[i]);
    }
    console.log("Sum of array of integer: " + sum);
    console.log("Product of array of integer: " + product);
}


const arr = new Array(10);

console.log("Enter the Number of element that user want to enter: ");
let n = prompt();
console.log("Enter the element in the array: ");












for (let index = 0; index < n; index++) {
    let element = prompt();
    arr[index] = element;
}

sum_prod(arr,n);