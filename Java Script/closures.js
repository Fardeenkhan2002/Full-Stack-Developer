// function counter() {
//     let count = 0;
//     return {
//         inc: function () {
//             count = count + 1;
//             console.log(count);
//         }
//         , dec: function () {
//             count = count - 1;
//             console.log(count);
//         }
//     };
// }

// let obj = counter();

// obj.inc();
// obj.inc();
// obj.inc();
// obj.inc();
// obj.inc();
// obj.inc();
// obj.inc();
// obj.inc();
// obj.dec()
// obj.dec()
// obj.dec()
// obj.dec()

// let obj= counter (function counter() {
//     let count = 0;
//     return {
//         inc: function () {
//             count = count + 1;
//             console.log(count);
//         }
//         , dec: function () {
//             count = count - 1;
//             console.log(count);
//         }
//     };
// })

// obj.inc();





//  let {inc , dec } = (function counter() {
//     let count = 0;
//     return {
//         inc: function () {
//             count = count + 1;
//             console.log(count);
//         }
//         , dec: function () {
//             count = count - 1;
//             console.log(count);
//         }
//     };
// })()

// inc()
// inc()
// inc()


// let obj = {
//     name : "fardeen",
//     age : "21",
//     phone : "9074467323"
// }
// let {name , age}=obj;

// console.log(name , age)


//  Destructuring the array   //

let arr = ["frist", "second"," third"];
let [a,b]=arr ;
console.log(a,b);
