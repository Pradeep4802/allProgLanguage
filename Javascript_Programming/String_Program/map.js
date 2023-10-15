const numbers = [1, 2, 3, 4, 5, 6];
const evenNumbers = numbers.filter((num) => num * 2);
console.log(evenNumbers);

const squareNumbers = numbers.map((num) => num * 2);
console.log(squareNumbers);

console.log(5 ** 2);
console.log(52);

// For filter method demo

const filterNum = filterOut(numbers);

function filterOut(even) {
  let newArr = [];
  for (const key of even) {
    if (key % 2 == 0) {
      newArr.push(key);
    }
  }

  return newArr;
}

console.log("Filter Array are : " + filterNum);

// For map method demo

const mapNum = mapOut(numbers);

function mapOut(even) {
  let mapArr = [];
  for (const key of even) {
    if (key % 2 == 0) {
      mapArr.push(true);
    } else {
      mapArr.push(false);
    }

    // add,sub,mul,div
    mapArr.push(key + 2); // for addition
    mapArr.push(key - 2); // for Substraction
    mapArr.push(key * 2); // for Multiplication
    mapArr.push(key / 2); // for Division
  }

  return mapArr;
}

console.log("Mapped array are : " + mapNum);

// function Object

function Obj() {
  this.m1 = function M1() {
    return "From M1";
  };
  this.m2 = function M2() {
    return "From M2";
  };
  this.m4 = function M3() {
    return "From M2";
  };
}

function getAllMethods(obj) {
    let my = console.log(typeof obj);
    console.log(myindex.html);
  return Object.keys(obj)
    .filter((key) => typeof obj[key] === "function")
    .map((key) => obj[key]);
}

function gfg_Run() {
  console.log(getAllMethods(new Obj()));
}
gfg_Run();
