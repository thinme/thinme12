package exam05_instanceof.check;

import exam05_instanceof.driver.Beginner;
import exam05_instanceof.driver.Expert;
import exam05_instanceof.driver.Driver;

public interface CheckPrint {

    final Beginner beginner = new Beginner();
    final Expert expert = new Expert();

    static  enum city{천안, 서울};
    static  enum highway{고속도로};

    static  int getLimitSpeed(Driver input_Driver) {
        if(input_Driver instanceof  Expert){
            return  input_Driver.getSpeed();
        }else if(input_Driver instanceof  Beginner){
            return input_Driver.getSpeed();
        }
        return 0;
    }

    static Driver viewLocation(String location) {
        for (city c : city.values()) {
            if (c.name().equals(location)) {
                System.out.println("드라이버" + beginner.getClass().getName() + " 모드로 변경합니다");
                return beginner;
            }
        }
        for (highway h : highway.values()) {
            if (h.name().equals(location)) {
                System.out.println("드라이버 " + expert.getClass().getName() + " 모드로 변경합니다");
                return expert;
            }
        }
        System.out.println("남산으로"+beginner.getClass().getName()+" 모드로 변경합니다");
        return beginner;
    }
}
