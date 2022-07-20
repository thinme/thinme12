public class Anonymous {
    Person field =  new Person();
    int fieldInt;

    WayToWork wayToWork_1 = new WayToWork() {
        @Override
        public void run() {
            System.out.println("달립니다");
            car();
        }

        @Override
        public void car() {
            System.out.println("느긋하게 차타고 갑니다");

        }
    };

    void wake() {
        fieldInt=9;
        System.out.println("늦잠 자서 7시에 일어납니다.");
        System.out.println(fieldInt+" 시까지 출근 해야 합니다");
        work();
    };

    private  void work(){
        System.out.println("학생들을 가르치는 교사입니다");
    };

    void method1() {
        WayToWork wayToWork_1 = new WayToWork() {
            @Override
            public void run() {
                System.out.println("달려그아");
            }

            @Override
            public void car() {
                System.out.println("오빠 차 뽑았다");

            }
        };
        Person localVar = new Person(){
            @Override
            void wake(){
                System.out.println("늦잠 자서 10시에 일어납니다!");
                work();
            }

            private  void work(){
                System.out.println("학생들을 가르치는 교사입니다!!");
            }
        };
        localVar.wake();
        wayToWork_1.run();
    }

    void  method2(Person person_1){
        person_1.wake();
    }
}

//void method1(int inputInt){
//           매개변수( 인자값 혹은 전역변수의 라이프 사이클에 따라 살아있다)
// int outputInt
//지역변수(매서드의 라이프 사이클에 따라 활용)
// 익명객체의 라이프 사이클 start
//WayToWork wayToWork_1 = new WayToWork() {
//    @Override
//    public void run() {
//        System.out.println("달려그아");
//    }
//
//    @Override
//    public void car() {
//        System.out.println("오빠 차 뽑았다");
//
//    }
//};
//익명객체의 라이프 사이클 end
//}