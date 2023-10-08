console.log(Array);

let num = [45,87,90,847,-23,-2342,98383,983,6473733,34443,3223,45345];
let f = Infinity;

for(let i = 0; i < num.length ; i++) {
    f = Math.min(f,num[i]);
}

console.log(f);

let evaluate = new Function();
let obj = new Object();
obj.loc = "Dighe";
obj.city = "Navi Mumbai";
evaluate.Name = "Suraj";
evaluate.Age = 23;

console.log(evaluate);
console.log(obj);

function myFunc(Name,Age = 43) {
    return [Name,Age];
}

let calc = myFunc("Pradeep",23,"Pal");
console.log(calc);

function car(mycar){
    mycar.model = "B34";
}

let mycar = {
    model : "A21",
    Color : "Blue",
    Origin : "Australia"
}

console.log(mycar.model);  // mycar model








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