package sec03.TEST;

public class MAIN {
    public static void main(String[] arg){
        String[] driver= new String[3];
        driver= new String[]{"박혁진", "자바", "디비"};

        for(int i=0; i<driver.length; i++){
            if(driver[i] == driver[0]){
                System.out.println("0번째 : "+driver[i]);
            }if(driver[i] == driver[1]){
                System.out.println("1번째 : "+driver[i]);
                break;
            }

        }
    }
}
