// var name = window.prompt("What is your name?");
// var age = window.prompt("How Old Are You?");

// document.write("Hey " + name + ", How are you today. Do you like being " + age +  " year old?");

function armstrong(num) {
    let sum = 0;
    let n = num;
    while (n != 0) {
        let rem = n % 10;
        sum = sum + rem * rem * rem;
        n = parseInt(n / 10);
        // console.log(n);
    }
    // console.log(sum);
    console.log(num);
    if (sum == num) {
        console.log("It is a armstrong number.");
    }
    else {
        console.log("It's not a armstrong number.");
    }
    return sum;
}

let num = prompt("Enter the number: ");
let ans = armstrong(num);
console.log(ans);
