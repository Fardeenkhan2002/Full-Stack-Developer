// let raw = "maida";

// function makedough(raw) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (raw != undefined) {
//                 res("Dough is ready");
//             } else {
//                 rej("Dough is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }

// function makebase(dough) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (dough != undefined) {
//                 res("base is ready");
//             } else {
//                 rej("base is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }


// function bakePizza(base) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (base != undefined) {
//                 res("pizza is ready");
//             } else {
//                 rej("pizza is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }

// makedough(raw).then(function (dough) {
//     console.log(dough);

//     return makebase(dough);
// }).then(function (base) {
//     console.log(base);

//     return bakePizza(base)

// }).then(function (pizza) {

//     console.log(pizza);

// }).catch(function (ans) {

//     console.log(ans)

// })

// let raw = "maida";

// function makedough(raw) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (raw != undefined) {
//                 res("Dough is ready");
//             } else {
//                 rej("Dough is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }

// function makebase(dough) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (dough != undefined) {
//                 res("base is ready");
//             } else {
//                 rej("base is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }


// function bakePizza(base) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (base != undefined) {
//                 res("pizza is ready");
//             } else {
//                 rej("pizza is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }

// makedough(raw).then(function (dough) {
//     console.log(dough);

//     return makebase(dough);
// }).then(function (base) {
//     console.log(base);

//     return bakePizza(base)

// }).then(function (pizza) {

//     console.log(pizza);

// }).catch(function (ans) {

//     console.log(ans)
// })



                              //   await   //


// let raw = "maida";

// function makedough(raw) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (raw != undefined) {
//                 res("Dough is ready");
//             } else {
//                 rej("Dough is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }

// function makebase(dough) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (dough != undefined) {
//                 res("base is ready");
//             } else {
//                 rej("base is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }


// function bakePizza(base) {

//     let P = new Promise(function (res, rej) {

//         setTimeout(() => {
//             if (base != undefined) {
//                 res("pizza is ready");
//             } else {
//                 rej("pizza is not ready");
//             }
//         }, 2000);

//     })

//     return P;
// }



// async function makePizza(){
//     let dough = await makedough(raw);
//     console.log(dough);
//     let base  = await makebase(dough);
//     console.log(base);
//     let pizza = await bakePizza(base);
//     console.log(pizza);
// };

// makePizza();


let raw = "maida";

function makedough(raw) {

    let P = new Promise(function (res, rej) {

        setTimeout(() => {
            if (raw != undefined) {
                res("Dough is ready");
            } else {
                rej("Dough is not ready");
            }
        }, 2000);

    })

    return P;
}

function makebase(dough) {

    let P = new Promise(function (res, rej) {

        setTimeout(() => {
            if (dough != undefined) {
                res("base is ready");
            } else {
                rej("base is not ready");
            }
        }, 2000);

    })

    return P;
}


function bakePizza(base) {

    let P = new Promise(function (res, rej) {

        setTimeout(() => {
            if (base != undefined) {
                res("pizza is ready");
            } else {
                rej("pizza is not ready");
            }
        }, 2000);

    })

    return P;
}



async function makePizza(){
    let dough = await makedough(raw);
    console.log(dough);
    let base  = await makebase(dough);
    console.log(base);
    let pizza = await bakePizza(base);
    console.log(pizza);
};

makePizza();
