console.log("Hello Techie How are You!");
let logo1 = document.getElementById('Microsoft');
let company = document.getElementById('company');

logo1.onclick = function () {
    company.style.backgroundImage = "url(Images/bill_gates.jpg)";
}