console.log("This is tutorial 37");

// Pretend that this response is coming from the server
const students = [
    {name: "harry", subject: "Javascript"},
    {name: "Rohan", subject: "Machine Learning"}
]

function enrollStudent(student, callback) {
    setTimeout(function() {
        students.push(student);
        console.log("Student has been enrolled");
        callback();
    }, 1000);
}

function getStudents() {
    setTimeout(function() {
        let str = "";
        students.forEach(function(student) {
            str += `<li> ${student.name} </li>`;
        });
        document.getElementById('students').innerHTML = str;
        console.log("Student have been fetched");
    },5000);
}

let newStudent = {name:"Sunny", subject:"Python"}
enrollStudent(newStudent, getStudents);
getStudents();