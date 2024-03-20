// function prime(n){
//     let count=0;
// for (let i = 2; i<n; i++){
//         if(n%i==0){
//             count++;
//         }
        
//     }
//     if(count==0){
//         console.log(true);
//     }
//     else{console.log(false);}
// }
// prime(3);

// function abc(){
//     console.log("Hello i am a function ")
// }

// abc();
// abc();
// abc();
// abc();

// function sum(a,b){
//     return a+b;
// }

// function sub(a,b){
//     return a-b
// }

// function mult(a,b){
//     return a*b
// }

// function div(a,b){
//     return a/b;
// }

// function fact(n){
//     let ans = 1 ;

//     for(let i=1;i<=n;i++){
//         ans = ans*i ;
//     }

//     return ans ;
// }

// let ans= sum(2,3);
// let ans2 = sum(3,7)

// let ans3 = fact(5);

// console.log(fact(5))

// function fib(n){

//     let ft = 0 ;
//     let st = 1 ;

//     for(let i=1;i<=n;i++){
//         console.log(ft);
//         let tt = ft + st ;

//         ft = st ;
//         st = tt ;
//     }
// }

// fib(5)

function primeCheck(n) {

    let count = 0;

    for (let i = 2; i < n; i++) {
        if (n % i == 0) {
            count++;
        }
    }
    if (count == 0) { console.log(true); }
    else { console.log(false); }
}

primeCheck(6);