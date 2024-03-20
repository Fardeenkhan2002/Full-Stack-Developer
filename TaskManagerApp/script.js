let addBtn = document.querySelector(".addbtn");
let taskAdder = document.querySelector(".task-adder");
let taskColors = document.querySelector(".colorPart");
let activeBtn = document.querySelector(".active");
let textArea = document.querySelector(".ta");
let ticketCont = document.querySelector(".ticket-Container");
let delBtn = document.querySelector(".delbtn");
let navColor = document.querySelector(".colorBar");
let showAllBtn = document.querySelector(".showAll");

let taskContainer = []

let colorsArray = ["red", "yellow", "green", "blue"];

let delFlag = false;

addBtn.addEventListener("click", function () {
    taskAdder.classList.toggle("hidden");
})

taskColors.addEventListener("click", function (event) {

    let ele = event.target;
    //   console.log(ele.classList)
    if (ele.classList[0] == "box") {
        activeBtn.classList.remove("active");
        ele.classList.add("active");
        activeBtn = ele;
    }
})

textArea.addEventListener("keydown", function (event) {
    if (event.key == "Enter") {

        let Inputtask = textArea.value;
        let activeColor = activeBtn.classList[1];

        let taskObj = {
            task: Inputtask,
            color: activeColor,
        }

        taskContainer.push(taskObj);

        showTicketUI(taskContainer);

        textArea.value = "";
        taskAdder.classList.toggle("hidden");
    }
})


delBtn.addEventListener("click", function () {
    if (delFlag == false) {
        delBtn.style.color = 'red';
    } else {
        delBtn.style.color = 'black';
    }

    delFlag = !delFlag;
})

showAllBtn.addEventListener("click", function () {
    showTicketUI(taskContainer);
})


navColor.addEventListener("click", function (event) {
    let ele = event.target;

    if (ele.classList[0] == "box") {

        let targetColor = ele.classList[1];
        // console.log(targetColor);

        let filteredArray = [];

        for (let i = 0; i < taskContainer.length; i++) {
            let taskObj = taskContainer[i];

            if (taskObj.color == targetColor) {
                filteredArray.push(taskObj);
            }
        }

        showTicketUI(filteredArray);
    }
})


function showTicketUI(arr) {
    ticketCont.innerHTML = "";
    for (let i = 0; i < arr.length; i++) {
        let taskObj = arr[i];
        let task = taskObj.task;
        let activeColor = taskObj.color;

        // creating new tickets 

        let newTicket = document.createElement("div");
        newTicket.classList.add("ticket");
        newTicket.innerHTML = ` <div class="ticket-color ${activeColor}"></div>
      <div class="ticket-task">${task}    </div> <span class="material-symbols-outlined lockIcon">
      lock
      </span>`

        // lock functionality 

        let lock = newTicket.querySelector(".lockIcon");
        let taskPart = newTicket.querySelector(".ticket-task")
        console.log(taskPart)
        lock.setAttribute("contenteditable", "false");

        lock.addEventListener("click", function () {
            if (lock.innerHTML == "lock_open") {
                lock.innerHTML = "lock";
                taskPart.setAttribute("contenteditable", "false");
                lock.style.color = "blue"
                let updatedTask = taskPart.innerText;

                if (compareString(updatedTask , taskObj.task) == true ) {
                    lock.style.color = "black"
                    console.log("black");
                }

                console.log(compareString(updatedTask , taskObj.task))

                taskObj.task = updatedTask;
                console.log(updatedTask)
            } else {
                lock.innerHTML = "lock_open"
                taskPart.setAttribute("contenteditable", "true");
                lock.style.color = "red"
            }
        })

        //   delete function of ticket 

        newTicket.addEventListener("dblclick", function () {
            if (delFlag == true) {
                ticketCont.removeChild(newTicket);
                taskContainer.splice(i, 1);
            }
        })

        // color swapping function of ticket 

        let ticketColorContainer = newTicket.querySelector(".ticket-color");

        ticketColorContainer.addEventListener("click", function () {
            let intialColor = ticketColorContainer.classList[1];
            let colorIndex = colorsArray.indexOf(intialColor);
            //   console.log(colorIndex);
            let nextColorIndex = (colorIndex + 1) % 4;
            taskObj.color = colorsArray[nextColorIndex];
            ticketColorContainer.classList.remove(intialColor);
            ticketColorContainer.classList.add(colorsArray[nextColorIndex]);

            console.log(taskContainer);
        })

        ticketCont.appendChild(newTicket);
    }

}


function compareString(str1, str2) {

    if (str1.length == str2.length) {

        for (let i = 0; i < str1.length; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;

    } else {
        return false;
    }
}