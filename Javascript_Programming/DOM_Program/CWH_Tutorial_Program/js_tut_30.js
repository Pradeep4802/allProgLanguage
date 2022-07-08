console.log("This is tutorial 30");

const proto = {
    slogan: function () {
        return `This company is the best`;
    },
    changeName: function (newName) {
        this.name = newName
    }
}

// This creates harry object
let harry = Object.create(proto);
harry.name = "harry";
harry.role = "Programmer";
// harry.changeName("Harry2")
// console.log(harry)

// This also creates harry object
const harry1 = Object.create(proto, {
    name: { value: "harry", writable: true },
    role: { value: "Programmer" },
});
harry1.changeName("Harry2")
// console.log(harry1)


// Employee constructor
function Employee(name, salary, experience) {
    this.name = name;
    this.salary = salary;
    this.experience = experience;
}

// Slogan
Employee.prototype.slogan = function () {
    return `This company is the best. Regards, ${this.name}`;
}

// Create an object from this constructor now
let harryObj = new Employee("Harry", 345099, 87);
console.log(harryObj.slogan())

// Programmer
function Programmer(name, salary, experience, language) {
    Employee.call(this, name, salary, experience);
    this.language = language;
}

// Inherit the prototype
Programmer.prototype = Object.create(Employee.prototype);

// Manually set the constructor
Programmer.prototype.constructor = Programmer;

let rohan = new Programmer("Rohan", 2, 0, "Javascript");
// console.log(harryObj.experience);
console.log(rohan);


function floor(floorNo, OfficeName, EmployeeName) {
    this.floorNo = floorNo;
    this.OffOfficeName = OfficeName;
    this.EmployeeName = EmployeeName;
}

function cake(floorNo, OfficeName, EmployeeName, languageName) {
    floor.call(this, floorNo, OfficeName, EmployeeName);
    this.languageName = languageName;
}

// cake.prototype = Object.create(floor.prototype);
// cake.prototype.constructor = cake;
let food = new cake(4, "Unique Enterprises", "Suresh", "Python");
console.log(food);

function flour(price, type) {
    this.price = price;
    this.type = type;
}

// let flourObj = new flour(2000, "wheat");
// console.log(flourObj);

function cake(price, type, greeting, flavour,) {
    flour.call(this, price, type);
    this.greeting = greeting;
    this.flavour = flavour;
}

let cakeObj = new cake(2000, "wheat", "Happy Birthday Mummy", "Butterscotch");
console.log(cakeObj);