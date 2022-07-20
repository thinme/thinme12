package sec03.equals_quest;

public class SchoolExample {

    public static void main(String[] arg){

        School obj1 = new School("박혁진", 1);
        School obj2 = new School("박혁진", 2);
        School obj3 = new School("박혁진", 3);

        if(obj1.equals(obj2)){
            System.out.println("obj1 와 obj2이 동일합니다");
        }else{
            System.out.println("obj1 와 obj2이 동일하지않습니다");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1 와 obj3이 동일합니다");
        }else{
            System.out.println("obj1 와 obj3이 동일하지않습니다");
        }

//        obj2=obj3;
//        if(obj2.equals(obj3)){
//            System.out.println("obj2 와 obj3이 동일합니다");
//        }else{
//            System.out.println("obj2 와 obj3이 동일하지않습니다");
//        }

    }
}
