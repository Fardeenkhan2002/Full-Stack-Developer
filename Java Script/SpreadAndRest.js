// let arr1 =[1,2,3];
// let arr2 = [4,5,6];
// let arr3 = [7,8,9];

// let ans=[...arr1 ,...arr2, 25, 50, 75 , 100 , ...arr3]

// console.log(ans)


function sum (...arr){
    return arr.reduce(function(pre , curr){
        return pre + curr ;

    })
}
console.log(sum(1,2,3,4,5,6,7,8,9))