// 1. Write a function that takes two numbers as arguments and returns therir sum.

// function sum(a,b) {
//     return a+b;
// }

// let a=5,b=10;
// console.log(sum(a,b))

// 2. Write a function that takes a string as an argument and returns its length.

// function strArg(str) {
//     return str.length;
// }

// console.log(strArg("Hi My name is pradeepkumar pal"));

// 3. Write a program tht takes two numbers and displays their sum, difference, product, and, quotient.

// function operator() {
//   let x = parseInt(prompt("Enter the first number: "));
//   let y = parseInt(prompt("Enter the second number: "));

//   let oper = prompt("Enter operator mode: ");

//   if (oper == "+") {
//     return x + y;
//   }
//   if (oper == "-") {
//     return x - y;
//   }
//   if (oper == "*") {
//     return x * y;
//   }
//   if (oper == "%") {
//     return x % y;
//   }
// }

// console.log(operator());

// 4. Write a function that takes two numbers as arguments and returns the larger number.

// function larger(num1,num2) {
//     return num1 > num2 ? num1 : num2;
// }

// console.log(larger(10,20));

// 5. Write a program that displays a string in reverse order.

// let str = "Hi My name is pradeep";
// let split = str.split("").reverse().join("");
// console.log(split);

// 6. Write a program that takes a number and checks whether it is positive,negative, or zero.

// function check(num) {
//   if (num > 0) {
//     return "positive";
//   } else if (num < 0) {
//     return "negative";
//   } else {
//     return "zero";
//   }
// }

// console.log(check(-1));
// console.log(check(0));
// console.log(check(1));

// 7. Write a program that takes a number and prints the multiplication table for that number.

// let num = 2;

// for (let i = 1; i <= 10; i++) {
//     console.log(`${num} x ${i} = ${num*i}`);
// }

// 8. Write a program that takes a number and calculates the sum of all numbers from 1 to that number.

// let num = 10;

// let sum = 0;
// for (let i = 1; i <= num; i++) {
//     sum = sum + i;
// }
// console.log(`Sum of the number: ${sum}`);

// 9. write a program that takes a string and prints out the number of vowels in the string.

// function checkvowel(str) {
//   let count = 0;
//   for (let i = 0; i < str.length; i++) {
//     if (str.charAt(i) == "a" || str.charAt(i) == "e" || str.charAt(i) == "i" || str.charAt(i) == "o" || str.charAt(i) == "u") {
//       count += 1;
//     }
//   }
//   return count;
// }

// console.log(checkvowel("Pradeepkumar Pal"));
// console.log(checkvowel("Love Babbar"));

// 10. Write a function that takes two arrays of integers as arguments and returns an array of the common elements in both arrays, without any duplicates.The returned array should be sorted in ascending order. For example, given the arrays [1,2,3,4,5] and [3,4,5,6,7], the function should return [3,4,5].

// function findCommonElements(arr1, arr2) 
// {
//     let commonElements = [];
//     for (let i = 0; i < arr1.length; i++) {
//         if(arr2.includes(arr1[i])) {
//             if(!commonElements.includes(arr1[i])) {
//                 commonElements.push(arr1[i]);
//             }
//         } 
//     }
//     // commonElements.sort((a,b) => a-b);
//     return commonElements;
// }

// const arr1 = [1,2,3,4,5];
// const arr2 = [3,4,5,6,7];

// const commonElements = findCommonElements(arr1,arr2);
// console.log(commonElements);


let lastName = '  Babbar      ';

let firstName = new String('Love'); 

let message = 'This is my first Meassage';

let words = message.split(' ');

console.log(words);