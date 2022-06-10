id=prompt('아이디 입력');
    if(id=='admin'){
        password=prompt('비밀번호 입력');
        if(password==='123456'){
            location.href="20_login.html"
        }
        else{
            location.href="20_error.html"
        }
}
else{
    location.href="20_error.html"
}
function solution(array) {
    let swap;
    for(let i=0; i<array.length; i++){
        for(let j=0; j<=array.length-i; j++){
            if(array[j]>array[j+1]){
                swap=array[j];
                array[j]=array[j+1];
                array[j+1]=swap;                  //버블정렬
            }
        }

    }
    }
    console.log(solution(3,2,1,4,5))
 
