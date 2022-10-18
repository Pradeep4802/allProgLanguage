// Write a simple JavaScript Program to join all elements of the following array into a string.

"use strict";

const prompt = require("prompt-sync")({ sigint: true });

let arrayJoin = (input,ch) => {
    return input.join(ch)
}

let myColor = ["Red","Green","White","Black"];
console.log(arrayJoin(myColor,','));
console.log(arrayJoin(myColor,'+'));
