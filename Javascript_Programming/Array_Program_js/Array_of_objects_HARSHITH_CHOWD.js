const myTodos = ['Buy Bread', 'Go to gym', 'Record youtube videos'];

// console.log(myTodos.indexOf('Buy Bread'));

const newTodos = [{
    title: 'Buy Bread',
    isDone: false,
}, {
    title: 'Go to Gym',
    isDone: false,
}, {
    title: 'Record youtube videos',
    isDone: true,
}];

// const index = newTodos.findIndex(function(todo, index){
//     console.log(todo);
//     return todo.title === 'Go to Gym';
// });

// console.log(index);

// Method 1
// const findTodo = function(anyTodos, title) {
//     const index1 = anyTodos.findIndex(function(todo, index){
//         return todo.title.toLowerCase() === title.toLowerCase();
//     });
//     return anyTodos[index1];
// };

// let printMe = findTodo(newTodos, 'Go to Gym');
// console.log(printMe);

const findTodo = function (myTodos, title) {
    const titleReturned = myTodos.find(function (todo, index) {
        return todo.title.toLowerCase() === title.toLowerCase();
    });
    return titleReturned;
};
let printMe = findTodo(newTodos, 'Go to Gym');
console.log(printMe);