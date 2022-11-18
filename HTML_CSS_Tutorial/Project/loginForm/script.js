let signupBtn = document.getElementById("signupBtn");
let signinBtn = document.getElementById("signinBtn");
let nameField = document.getElementById("nameField");
let title = document.getElementById("title");

<<<<<<< HEAD
signingBtn.onclick = function() {
=======
signinBtn.onclick = function() {
>>>>>>> 2bca116bd5f60181336b42ef6905cdae3406e6e6
    nameField.style.maxHeight = "0";
    title.innerHTML = "Sign In";
    signupBtn.classList.add("disable");
    signinBtn.classList.remove("disable");
}