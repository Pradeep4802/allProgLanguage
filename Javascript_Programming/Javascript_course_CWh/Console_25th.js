console.time("p1");
// let time1 = performance.now();
let obj1 = {
    Name : "pradeep",
    Age : 21,
    College : "MCC"
}


console.table(obj1);

console.warn("Warn : Hey please dont drink soda");
console.error("Error : I am terrorist");
console.assert("Assert : I am assert" != false);
console.info("Info : I am info");

console.table(console);
// let time2 = performance.now();
// console.log("Total Time is : "+(time2-time1));
console.timeEnd("p1");

console.time("forloop");
for (let i = 0; i < 5; i++) {
    console.log(255);
    
}
console.timeEnd("forloop");
console.time("whileloop");
let i = 0;
while(i < 5) {
    console.log(i++);
}
console.timeEnd("whileloop");








let num = [45,87,90,847,-23,-2342,98383,983,6473733,34443,3223,45345];
let f = Infinity;

for(let i = 0; i < num.length ; i++) {
    f = Math.min(f,num[i]);
}

// console.log(f);

let evaluate = new Function();
let obj = new Object();
obj.loc = "Dighe";
obj.city = "Navi Mumbai";
evaluate.Name = "Suraj";
evaluate.Age = 23;

// console.log(evaluate);
// console.log(obj);

function myFunc(Name,Age = 43) {
    return [Name,Age];
}

let calc = myFunc("Pradeep",23,"Pal");
// console.log(calc);

function car(mycar,brr){
    mycar.model = "B34";
    brr[3] = "Brahma";
}

const mycar = {
    model : "A21",
    Color : "Blue",
    Origin : "Australia"
}

const brr = ["Bholenath","Krishna","Vishnu","Arjuna","Karna"];

// console.log(mycar.model);  // mycar model
// console.log(brr[3]);
car(mycar,brr);

// console.log(mycar.model);
// console.log(brr[3]);







// var student = stud();
// console.log(stud.name);

// var obj1 = {
//   Id: 102,
//   Name: "Abhinay",
//   Age: 21,
//   func : function() {
//     console.log("Name : "+this.Name);
//     return 34;
//   }
// };
// let val = "func";
// console.log(obj1.func());



// How to create Object
// key.name = "Pradeep";
// key.age = 21;
// console.log(key.name);
// key = {
//     Bank : "SBI",
//     Location : "Airoli",
//     Pincode : 400708
// }
// console.log(key.name);
// console.log(key);

function stud(name, age) {
    this.name = name;
    this.age = age;
  
  }

// function object
let foo = new stud("Virat",35);
let foo2 = new stud("Ronaldo",38);
// console.log(foo.name);
// console.log(foo2.name);