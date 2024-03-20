let apikey = "cdde088899194620b0f92348242401";
let cityEle = document.querySelector(".city");
let citytem = document.querySelector(".temp");
let cityhumid = document.querySelector(".humid");
let cityicon = document.querySelector(".icon");
let cityfeel = document.querySelector(".feel");
let citywind = document.querySelector(".wind");

let input = document.querySelector(".Inputcity");
let Btn = document.querySelector("#search-addon");


Btn.addEventListener("click",function(){
    let city = input.value;
    input.value = "";

     // getData(city);
})

async function getData(city="manali"){

    let data = await fetch(`http://api.weatherapi.com/v1/current.json?key=${apikey}&q=${city}&aqi=no`);

    data =  await data.json();

    console.log(data);

    screenUPdate(data);





}

// getData();

function screenUPdate(obj){

    let cityname = obj.location.name;
    let temp = obj.current.temp_c;
    let humidity = obj.current.humidity;
    let icon = obj.current.condition.icon;
    let feel = obj.current.feelslike_c;
    let wind = obj.current.wind_kph;

    // console.table([cityname,temp,humidity,icon]);

    cityEle.innerHTML = cityname;
    citytem.innerHTML = temp;
    cityhumid.innerHTML = humidity;
    cityfeel.innerHTML = feel;
    citywind.innerHTML = wind;
    cityicon.src=  icon;





}