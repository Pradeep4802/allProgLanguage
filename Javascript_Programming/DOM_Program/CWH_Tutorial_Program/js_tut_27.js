console.log("Welcome 27 is on OOPS Programming");

// Object Literal for creating objects
let car = {
    name: 'Maruti 800',
    topSpeed: 89,
    run: function () {
        console.log("Car is running");
    }
}

// We have already seen constructors like these;
// new Date();

// Creating a constructor for cars
function GeneralCar(givenName, givenSpeed) {
    this.name = givenName;
    this.topSpeed = givenSpeed;
    this.run = function () {
        console.log(`${this.name} is running`);
    }
    this.analyze = function () {
        console.log(`This car is slower ${200 - this.topSpeed} km/hr than mercedes`);
    }
}
car1 = new GeneralCar('Nissan', 100);
car2 = new GeneralCar('Maruti Alto', 80);
car3 = new GeneralCar('Mercedes', 200);
// console.log(car1,car2,car3);
// console.log(car1.topSpeed);
console.log(car1.analyze());