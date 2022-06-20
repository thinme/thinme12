package packageTest0001;

public class checkYn {

    public static boolean checkYn(String check, String type) {

        if(type=="inputCheck"){
            if(check =="yes"){
                System.out.println("데이터에 저장합니다.");
                return true;
            }else if(check =="no"){
                System.out.println("입력값을 삭제합니다.");
                return false;
            }else{
                System.out.println("입력을 올바르게 해 주세요.");
                return false;
            }
        }else if(type == "brakeCheck"){
            if(check== "yes"){
                System.out.println("데이터 입력을 계속합니다.");
                return true;
            }else{
                System.out.println("데이터 입력을 종료합니다.");
                return false;
            }
        }else{
            return false;
        }
    } 
    
}
