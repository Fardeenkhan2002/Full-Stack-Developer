// let arr = [ 1,2,33,5,45];

// let ans = arrr.map((e)=>{
// return e*2;

// })
// console.log(ans);

let arr = [ 1,2,33,5,45];
let num = [1,2,3,4,5,6,7,8,9]
Array.prototype.sum = function(){
    let arr = this;
    let sum = 0;
    for(let i=0; i<arr.length; i++){
        sum = sum +arr[i];
    }
    return sum ;
}
console.log(num.sum())