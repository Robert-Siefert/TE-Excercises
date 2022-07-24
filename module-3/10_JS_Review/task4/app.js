document.addEventListener('DOMContentLoaded', () => {




    const colorButton = document.getElementById('btn1');
    
    colorButton.addEventListener('click', showColor('color_2'));
    
    colorButton.addEventListener('dblclick', showColor('color_3'));
    
    
    
    
    });
    
    
    function showColor(color){
        let background = document.querySelector('body');
        background.className = color;
    
    }
    