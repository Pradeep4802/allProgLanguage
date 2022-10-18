// write a JavaScript function to check Whether an "input" is an array or not.

"use strict";

const prompt = require("prompt-sync")({ sigint: true });

let is_Array = function(inputs) {
    return Array.isArray(inputs);
}


// let num = [1, 2, 3, 4, 5, 6];
// let num = 1;
// let n = num.length;
// let bool = is_Array(num,n);
console.log(is_Array([1,2,3,4]));
console.log(is_Array("weresorce"));



// all following calls return true
// Array.isArray([]);
// Array.isArray([1]);
// Array.isArray(new Array());
// Array.isArray(new Array("a", "b", "c", "d"));
// Array.isArray(new Array(3));
// Little known fact: Array.prototype itself is an array:
// Array.isArray(Array.prototype);

// all following calls return false
// Array.isArray();
// Array.isArray({});
// Array.isArray(null);
// Array.isArray(undefined);
// Array.isArray(17);
// Array.isArray("Array");
// Array.isArray(true);
// Array.isArray(false);
// Array.isArray(new Uint8Array(32));
// This is not an array, because it was not created using the
// array literal syntax or the Array constructor
// Array.isArray({ __proto__: Array.prototype });
