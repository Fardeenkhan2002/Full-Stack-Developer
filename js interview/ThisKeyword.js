let obj = {
    name : "fardeen",
    city : "mumbai",
    printName : ()=>{
        console.log(this.name , this.city);
    }
}

// obj.printName();
console.log(this)