"use strict";

// const ps = require("prompt-sync");

const prompt = require("prompt-sync")({sigint: true});

let name = prompt("Enter your name: ");
// console.log('Hello ' + name);
console.log(`Hello ${name}`);