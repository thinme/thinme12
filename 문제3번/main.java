import TV.SmartTelevision;

import java.util.Scanner;
public class main {

    public  static  void main(String[] arg){

        Scanner in =new Scanner(System.in);

        SmartTelevision ex = new SmartTelevision();
        ex.turnOn();

        String ID;
        String PW;
        while(true){
            System.out.println("로그인을진행합니다.");
            System.out.println(" ID :");
            ID=in.nextLine();
            System.out.println("PW :");
            PW=in.nextLine();
            ex.DoLogIn();
            break;
        }
        ex.getPrefer();

        int channelNum = 0;
        while(true) {
            System.out.println("채널을 입력하세요 [종료 : -1]");
            channelNum = in.nextInt();
            if(channelNum == -1) {
                ex.turnOff();
                break;
            }
            ex.addChannel(channelNum);
        }

    }
}
