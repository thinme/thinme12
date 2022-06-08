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
function solution(string) {
    var answer = '';
    let check=0;
    for(let i=0; i<string.length; i++){
        check=(string[i]==="")?0:check+1;
        answer+=(check%2 ===0)?string[i].toLowerCase():string[i].toUpperCase();
    }
    return answer
}
