//pacage 작성

//파일명과 클래스명 동일
import java.util.ArrayList; //내장메소드를 쓰기위해 불러옴

class Main{
    public static void main(String[] args) {         //static-딱하나만 만들겠다 void-리턴값을 안하겠다 string-통로역할
        System.out.println("programmers start"); //print-줄바꿈을 하지않음,println-줄바꿈 해준다

        //String[] inputText={"Jane", "Kim"};
        ArrayList<String> inputArray= new ArrayList<String>(); //실제구현->new 타입명은ArrayList<String>()
        inputArray.add("Jane"); 
        inputArray.add("Kim");
        System.out.println(solution(inputArray));
    }



    public static String solution(ArrayList<String> seoul){  //String-리턴하는 타입을 말해준다. <>안에는 반환값을 써줘야한다
        System.out.println(seoul.size());
        String answer = "";
        for(int i=0; i<seoul.size(); i++ ){
            
            if(seoul.get(i) == "Kim"){
            //if(seoul[i].equals("seoul")){
                System.out.println("ok");
            }
        }
        
        StringBuffer text_test=new StringBuffer("hellow");
        text_test.append("abc");
        text_test.append("fff");
        System.out.println(text_test);
           

     
        return answer;
    }
       
}
    



