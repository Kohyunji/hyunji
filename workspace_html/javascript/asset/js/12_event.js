console.log("hello js")
const c = document.querySelector('#console')
console.log(c)

window.addEventListener('load', init);
// window.onload = init;

function init() {
    const c = document.querySelector('#console');
    console.log(c);

    bind();
}
function bind() {
    const msg = document.querySelector('#console');


    const btn1 = document.querySelector('#btn1');
    btn1.onclick = function () {
        msg.innerHTML += '<br>버튼1 클릭'
    }
    //onclick은 변수라서 마지막 값만 저장된다
    // 덮어쓰는거 가능
    btn1.onclick = function () {
        msg.innerHTML += '<br>버튼1 클릭!'
    }
    const btn2 = document.querySelector('#btn2')
    btn2.addEventListener('click', function () {
        msg.innerHTML += '<br>버튼2 클릭'
        //addEventListener는 계속 동일 이벤트를 추가할 수 있다
    })
    btn2.addEventListener('click', function () {
        msg.innerHTML += '<br>버튼2 클릭!'
    })
}

function btnClick() {
    const msg = document.querySelector('#console');
    msg.innerHTML += '<br>btnClick 실행'

    //     로그인 버튼을 눌렀을 때
    //     아이디와 비밀번호가 비어있지 않다면
    //     아이디, 비밀번호 출력
    //     하나라도 안썼다면
    //     아이디는 필수입니다 또는 비밀번호는 필수입니다 출력
    const login = document.querySelector('#login')
    login.addEventListener('click', function () {
        const id = document.querySelector('#id').value;
        const pw = document.querySelector('#pw').value;
        console.log('id :', id, id == "")
        if (id == "") {
            msg.innerHTML += '<br>아이디는 필수입니다'
        } else if (pw == "") {
            msg.innerHTML += '<br>비밀번호는 필수입니다'
        } else {
            msg.innerHTML += `<br>${id}, ${pw}`;
        }

    })

    window.addEventListener('scroll', function () {
        console.log('scroll')
        console.log('crollTop', document.documentElement.scrollTop )
        //document.documentElement.scrollTop =140
    })

    document.querySelector('#top').querySelector

    window.addEventListener9('scroll')

    document.documentElement.scrollTop -=10;
    //스크롤탑이 180 위치에 있어요
    //0까지 -10씩 바꿀거에요
    //어떻게?
    //180일때 100
    //170일때 200
    //160일때 300
    // 18 : 1
    // 17 : 2
    // 16 : 3

    for(let i=document.documentElement.scrollTop; i >=0; i -= 10){
        let time = (200 - i) * 10;
        setTimeout(function(){
            console.log('i: ', i , ' time : ', time)
            document.documentElement.scrollTop = i;
        }, time)

});
// document.querySelector('#id').addEventListener('keydown', function(){}
document,querySelector('#id').addEventListener('keyup', function(event){
    console.log(event);
    console.log(event.keyCode);
    if(event.keyCode ==13){
        console.log('엔터 빵!!')
        document,querySelector('#pw').focus()
    }

});
document.querySelector('#pw').addEventListener('keyup', function(event){
    if(event.event.keyCod == 13){
        document.querySelector('#pw').focus()

});
