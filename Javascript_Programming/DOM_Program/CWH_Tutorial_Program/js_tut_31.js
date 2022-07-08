console.log('this  is Tutorial31.js');

class Employee {
    constructor(giveName, givenExperience, givenDivision) {
        this.name = giveName;
        this.experience = givenExperience;
        this.division = givenDivision;

    }

    slogan() {
        return `I am ${this.name} and this company is the best`;
    }

    joiningYear() {
        return 2020 - this.experience;
    }

    static add(a, b) {
        return a + b;
    }
}

class Programmer extends Employee {
    constructor(giveName, givenExperience, givenDivision, givenLanguage, github) {
        super(giveName, givenExperience, givenDivision);
        this.language = givenLanguage;
        this.github = github;
    }

    favoriteLanguage() {
        if (this.language == 'python') {
            return 'Python';
        }
        else {
            return 'Javascript';
        }
    }

    static multiply(a, b) {
        return a*b;
    }
}

// harry = new Employee("Harry", 56, "Division");
// console.log(harry);

// console.log(Employee.add(10, 20));
rohan = new Programmer("Rohan", 3, "Lays", "Go", "Rohan2019")
console.log(rohan.favoriteLanguage());
console.log(Programmer.multiply(4,9));