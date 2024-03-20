let obj ={
    name : "fardeen",
    age : "21" ,
    phone : "9074467323",
}
localStorage.setItem("obj",JSON.stringify(obj))


console.log(localStorage.getItem("obj"))