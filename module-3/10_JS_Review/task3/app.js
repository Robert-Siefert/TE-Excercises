document.addEventListener('DOMContentLoaded', () => {




const timeButton = document.getElementById('timeButton');

timeButton.addEventListener('click', showTime);






});


function showTime(){
    let time = document.getElementById('time');

    time.innerText = Date();

}
