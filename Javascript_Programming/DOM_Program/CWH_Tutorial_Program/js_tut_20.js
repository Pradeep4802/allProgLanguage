console.log("This is tut 20");
let impArray = ['adrak','pyaz','bhindi'];


//Add a key-value pair inside local storage
localStorage.setItem('Name', 'Harry');
localStorage.setItem('Name2', 'Rohan');
localStorage.setItem('Sabji', JSON.stringify(impArray));
// localStorage.setItem('Sabji', impArray);

// clears ths entire kocal storage
// localStorage.clear();

// clear a particular key-value pair
// localStorage.removeItem('Name2');

// Retrieve an item from the local storage
let name = localStorage.getItem('Name');
name = JSON.parse(localStorage.getItem('Sabji'));
console.log(name);

// sessionStorage.setItem('sessionName', 'sHarry');
// sessionStorage.setItem('sessionName2', 'sRohan');
// sessionStorage.setItem('sessionSabji', JSON.stringify(impArray));