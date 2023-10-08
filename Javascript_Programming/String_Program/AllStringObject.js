// console.log("Hello World");

let str = "The quick brown fox jumps over the lazy dogs.";

// String.charAt()
const index = 4;

let sentence = "";
for (let i = 0; i < str.length; i++) {
  sentence += str.charAt(i);
}
console.log(sentence);
console.log(`Char At :  ${index} is ${str.charAt(6)}`);
console.log(`Code Point At :  ${index} is ${str.codePointAt(6)}`);
console.log(`From Code Point : ${String.fromCodePoint(65, 66, 67, 68)}`);

let str1 = "Hello ";
let str2 = "Pradeepkumar";
console.log(
  "COncatentaion is : " +
    str1.concat(
      str2,
      " How Are You!!",
      " You are so good to see you",
      " Machine level code"
    )
);

let fox =
  "The quick brown fox jumps over the lazy dog. If the dog barked, was it really lazy?";
const search = "dog";
let index1 = fox.indexOf(search);
console.log("Index of : " + fox.lastIndexOf(search));

let rep = "Hello ";
console.log(`The Repeated are : ${rep.repeat(4)}`);

let string = new String("Pradeep", "Pal");
console.log(string[0]);

let array = new Array("Dham", "Ram", "Kaam", 1, true, 78.988, 97371237123721);
console.log(typeof array);

let object = new Object("ObjctDham", "KaamObject", "NewObject", "ActualObject");
console.log(object[6]);

let Person = {
  name: "Suraj Yadav",
  age: 21,
  email: "sj@gmail.com",
  contact: 9371392133,
};

let Public = function (Name, Age) {
  this.Name = Name;
  this.Age = Age;
};

// let monitor = new Person({name: "Pradeep",age: 21,email: "pradeep@gmail.com",contact: 7045757937});
// let monitor = new Person();

const monitor = new Public("Abhinay", 25);
console.log(monitor.Name);

let newarr = [
  {
    id: 101,
    car: "BMW",
  },
  {
    id: 102,
    car: "Mercedez",
  },
  {
    id: 103,
    user: [
      {
        Name: "Pradeep",
        Car: "Jaguar",
        Age: 21,
      },
    ]
  },
];

console.log(newarr[0].id);
console.log(newarr[1].car);
console.log(newarr[2].user[0].Car);

