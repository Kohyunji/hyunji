let view
let isDown =false;
let mouseX = 0;
let mouesY = 0;

window.onload = function(){
    view = document.querySelector("#view");

    const cursor = document.querySelector("#cursor");
    cursor.style.top = '-1000px';
    cursor.style.left = '-1000px';

    const drag = document.querySelector("#drag");
    drag.style.top = '0px';
    drag.style.left = '0px';

    bind()

}
function bind(){
    
}