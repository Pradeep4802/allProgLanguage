const items = [1, 2, 3, 4, 5];
// const items = [
//     { name: 'Bike' ,        price: 100 },
//     { name: 'TV' ,          price: 200 },
//     { name: 'Album' ,       price: 10 },
//     { name: 'Book' ,        price: 5 },
//     { name: 'Phone' ,       price: 500 },
//     { name: 'Computer' ,    price: 1000 },
//     { name: 'keyBoard' ,    price: 30 },
// ]

// filter() method
// const filteredItems = items.filter((item) => {
//     return item.price <= 100;
// });

// console.log(filteredItems);
// console.log(items);

// map() method
// const itemNames = items.map((item) => {
//     return item.price;
// });

// console.log(itemNames);

//find() method
// const foundItem  = items.find((item) => {
//     return item.name.toLowerCase() === 'album';
// });

// console.log(foundItem);

// forEach() method
// items.forEach((item) => {
//     console.log(item.price);
// });

// some() method
// const hasInexpensiveItems = items.some((item) => {
//     return item.price <= 0;
// });
// console.log(hasInexpensiveItems);

// every() method
// const hasInexpensiveItems = items.every((item) => {
//     return item.price <= 10;
// });

// console.log(hasInexpensiveItems);

// reduce() method
// const total = items.reduce((currentTotal, item) => {
//     return item.price + currentTotal;
// }, 0);

// console.log(total);

// includes() method
const includesTwo = items.includes(6);
console.log(includesTwo);