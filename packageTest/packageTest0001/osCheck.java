package packageTest0001;

public class osCheck {
    public static void osCheck(int checkType){
        if(checkType == 1){
            System.out.println("Computer Type은 Mac os 입니다.");
        }else if(checkType ==2){
            System.out.println("Computer Type은 windows os 입니다.");
        }else{
            System.out.println("정상적인 입력이 아닙니다.");
        }
    }
    
}
