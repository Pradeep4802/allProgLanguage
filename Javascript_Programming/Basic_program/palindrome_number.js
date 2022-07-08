"use strict";

// const ps = require("prompt-sync");

const prompt = require("prompt-sync")({ sigint: true });

function palindrome(num) {
    let n = num;
    let sum = 0;
    while (n != 0) {
        let rem = n % 10;
        sum=(sum*10)+rem;
        n=parseInt(n/10);
    }
    return sum;
}


let num = prompt("Enter the number: ");
let sn = palindrome(num);
if (sn == num) {
    console.log("It is a palindromic number");
}
else
{
    console.log("It's not a palindromic number");
}