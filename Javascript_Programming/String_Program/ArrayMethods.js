let arr = ["Pradeep", 8393884, true, null, 45.5665, 82.12, "Pal", undefined];
console.log(arr);
arr.push("Suraj");
console.log(arr);

// Remove last from array and return that element and its also change the length of teh array
arr.pop();
console.log(arr.pop());
console.log(arr);
console.log(arr.push("India"));
console.log(arr);
arr.push("RONALDO");
console.log(arr);

// shift : remove first element from the array and returns its
arr.shift();
console.log(arr);

// unshift : Adds one or more elements to the beginning of an array and returns the new length.
console.log(arr.unshift("VIRAT"));
console.log(arr);
arr.unshift("SIXER", 34.4334, false);
console.log(arr);
Array.prototype.unshift.call(arr, 23322322344433, "MAHI");
console.log(arr);

// concat() : Combines two or more arrays and returns a new array without modifying the original arrays.
let teacher = ["Mahesh", "Jotika", "Gagan", "Kiran"];
let student = ["Pradeep", "Suraj", "Abhinay"];
console.log(teacher.concat(student));

let newarray = teacher.concat(student);
console.log(newarray);

// join() : Joins all elements of an array into a single string, optionally separated by a specified delimiter.
console.log(typeof teacher.join());
console.log(teacher.join("$"));

let myarr = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9],
];
console.log(myarr[2][0]);

let twoD = [[[1, 2, 3]], [[4, 5, 6]]];
console.log(twoD[0][0][1]);

// slice() : Changes the contents of an array by removing, replacing, or adding elements in place.
const animals = ["ant", "bison", "camel", "duck", "elephant"];
console.log(animals.slice(1));

const myHonda = {
  color: "red",
  wheels: 4,
  engine: { cylinders: 4, size: 2.2 },
};
const myCar = [myHonda, 2, "cherry condition", "purchased 1997"];
const newCar = myCar.slice(0, 2);
console.log(newCar);
console.log(myCar[2].color);
console.log(newCar[0].engine);

let funcarr = [];
funcarr.push("Pradeep");
funcarr.push("Suraj");
funcarr.push("Abhinay");
funcarr.push("Kabeer");

let password = "";

for (let i = 0; i < funcarr.length; i++) {
  password += funcarr[i];
}
console.log(password);
console.log(Array.from(password));

// splice() : changes the  contents of the array by removing, adding and or replacing elements in place
const months = ["Jan", "March", "April", "June"];
console.log(months);
console.log(months.splice(1, 0, "Feb"));
console.log(months);
months.splice(4, 1, "May");
console.log(months);
months.splice(2, 1, 3.142234324323, "December", "November");
console.log(months);

// map() : create an new array by applying a given function to aeacjh elemenst of the origunal Array.
const array1 = [1, 2, 3, 4, 5];
let sum = [];
let add = array1.map((e) => e * 2);
for (let i = 0; i < array1.length; i++) {
  if (add[i] > 4) {
    sum.push(add[i]);
  }
}
console.log(sum);

add.forEach((elem) => {
  console.log(elem * 3);
});

console.log("---------------------");

for (const key in add) {
  // if (Object.hasOwnProperty.call(add, key)) {
  //     const element = add[key];
  //     console.log(element);
  // }
  console.log(add[key]);
}

console.log("---------------------");

for (const iterator of add) {
  console.log(iterator);
}

let mapped = array1.filter((e1) => e1 > 2);
console.log(mapped);

let reducearr = [15, 16, 17, 18, 19].reduce(
  (accum, curren) => accum + curren,
  10
);
console.log(reducearr);

const array = [15, 16, 17, 18, 19];

function reducer(accumulator, currentValue, index) {
  const returns = accumulator + currentValue;
  console.log(
    `accumulator: ${accumulator}, currentValue: ${currentValue}, index: ${index}, returns: ${returns}`
  );
  return returns;
}

console.log(array.reduce(reducer));

// forEach() method :  Array instances executes a provided function once for each array element.
["mango", "banana", "grapes", "watermelon"].forEach(function (e) {
  console.log(e);
});
console.log("-----------------------------------");
["mango", "banana", "grapes", "watermelon"].forEach((e) => console.log(e));
console.log("-----------------------------------");
const carArr = ["BMW", "Mercedes", "Volvo", "Jaguar", "Tata"];
carArr.forEach((car) => console.log(car));

const logArrayElements = (elem, ind /*, array */) => {
  console.log(`a[${ind}] = ${elem}`);
};

// Notice that index 2 is skipped, since there is no item at
// that position in the array.
[2, 5, , 9].forEach(logArrayElements);
// Logs:
// a[0] = 2
// a[1] = 5
// a[3] = 9

// Flatten an array
const flatten = (arr) => {
  const result = [];
  arr.forEach((item) => {
    if (Array.isArray(item)) {
      // console.log(Array.isArray(item));
      result.push(...flatten(item));
    } else {
      // console.log("yes");
      result.push(item);
    }
  });
  return result;
};

// Usage
const nested = [1, 2, 3, [4, 5, [6, 7], 8, 9]];
console.log(flatten(nested)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

// find() :  Array instances returns the first element in the provided array that satisfies the provided testing function. If no values satisfy the testing function, undefined is returned.
const finArray = [5, 12, 8, 130, 44];
const findObject = [
  {
    Name: "Pradeep",
    Age: 21
  },
  {
    Name: "Suraj",
    Age: 22
  },
  {
    Name: "Abhinay",
    Age: 23
  }
]
console.log(finArray.find(e => e > 100));
console.log(findObject.find((element)=>{
  if(element.Name == "Suraj") return element;
}));

function findNumber(elem,ind) {
  console.log(ind);
  if(elem > 0) return elem;
}

console.log([0,-8,-3,9].find(findNumber));