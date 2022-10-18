"use strict";

const prompt = require("prompt-sync")({ sigint: true });
// const prompt = require("prompt-sync");

function sum_of_adj_elem(arr, n) {
  let incl = arr[0];
  let excl = 0;
  let excl_new;

  for (let i = 1; i < n; i++) {
    incl > excl ? (excl_new = incl) : (excl_new = excl);
    incl = excl + arr[i];
    excl = excl_new;
  }
  return incl > excl ? (excl_new = incl) : (excl_new = excl);
}

// let n = prompt("Enter the no of element :");
let arr = [5, 5, 10, 100, 10, 5];
// prompt("Enter the element in the array: ");
// for (let i = 0; i < n; i++) {
//     arr[i] = prompt();
// }

console.log(
  "The highest sum of the sub array are: " + sum_of_adj_elem(arr, arr.length)
);
