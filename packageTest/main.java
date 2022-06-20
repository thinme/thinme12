import packageTest0001.*;

import java.util.Scanner;


public class main {
    public static void main(String[] arg) {
        Scanner input= new Scanner(System.in);
        System.out.println("OS타입을 입력해주세요");
        System.out.println("Mac Os이면 1을 입력해주세요.");
        System.out.println("Windows Os이면 2을 입력해주세요.");

        int osType = input.nextInt();
        osCheck.osCheck(osType);
        
        input.nextLine();
        
        System.out.println("cpu 사양을 적어주세요");
        String inputCPU = input.nextLine();

        System.out.println("램의 사양을 입력해주세요");
        String inputRam = input.nextLine();

        System.out.println("ssd의사양을 입력해주세요");
        String inputSSD = input.nextLine();

        System.out.println("macbook =" + inputCheckType+ "// CPU =" + inputCPU+ "// Ram =" +inputRam+ "// SSD =" + inputSSD+ " ");

        computer macBook=new computer();
        computer macBook1=new computer(inputCheckType, inputCPU, inputRam, inputSSD);

        System.out.println(macBook.company);
        System.out.println("-----------");
        System.out.println(macBook1.checkType);
        System.out.println(macBook1.CPU);
        System.out.println(macBook1.Ram);
        System.out.println(macBook1.SSD);
        System.out.println("------------");
    }
}
