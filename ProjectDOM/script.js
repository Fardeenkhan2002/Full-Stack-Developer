let inputBar = document.querySelector(".input1");
let input2 = document.querySelector(".input2");
let input3 = document.querySelector(".input3");
let addBtn = document.querySelector(".add");
let taskcont = document.querySelector(".taskcontainer");

addBtn.addEventListener("click",function(){

    let taskvalue = inputBar.value;
    let taskkvalue = input2.value;
    let taskkkvalue = input3.value;
    
    
    let myele = document.createElement("div");
    myele.style.backgroundcolor="black";


    myele.classList.add("task");

    myele.innerHTML = `
    <p> ${taskvalue} </p>
    <p> ${taskkvalue} </p>
    <p> ${taskkkvalue} </P>`

myele.addEventListener("dblclick",function(){
    myele.remove();
})
   
    taskcont.appendChild(myele);


    
})
