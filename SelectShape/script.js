let inpurBar = document.querySelector("input");
let selectTg = document.querySelector("select");
let cont = document.querySelector(".container");
let btn = document.querySelector("button");
let colorInput = document.querySelector(".color");



btn.addEventListener("click", function(){
    let inputvalue = inpurBar.value;
    inpurBar.value ="";
    let selectvalue = selectTg.value;
    let color = colorInput.value;


    cont.innerHTML="";

 for (let i= 1; i<=inputvalue; i++){

    let ele = document.createElement("div");
    

    ele.classList.add(selectvalue);
    ele.style.backgroundColor=color;
    ele .setAttribute("contenteditable", "true");

    ele.addEventListener("dblclick", function(){
        cont.removeChild(ele);

    })

    cont.appendChild(ele);

 }

})