let signupBtn = document.getElementById("signupBtn");
let signingBtn = document.getElementById("signingBtn");
let nameField = document.getElementById("nameField");
let title = document.getElementById("title");

signingBtn.onclick = function() {
    nameField.style.maxHeight = "0";
    title.innerHTML = "Sign In";
    signupBtn.classList.add("disable");
    signingBtn.classList.remove("disable");
}