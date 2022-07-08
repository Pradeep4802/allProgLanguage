console.log("Welcome To tutorial 17 on events");

document.getElementById('heading').addEventListener('click', function (e) {
    let variable;
    console.log('You have clicked the heading');
    variable = e.target;
    variable = e.target.className;
    // variable = e.target.classList;
    // variable = e.target.id;
    variable = Array.from(e.target.classList);

    variable = e.target.id;
    variable = e.offsetX;
    variable = e.offsetY;
    variable = e.clientX;
    variable = e.clientY;
    console.log(variable);
    // console.log(e);
    // location.href = '//codewithharry.com'
});