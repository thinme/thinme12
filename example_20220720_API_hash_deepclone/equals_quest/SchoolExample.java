package sec03.equals_quest;

public class SchoolExample {

    public static void main(String[] arg){

        School obj1 = new School("������", 1);
        School obj2 = new School("������", 2);
        School obj3 = new School("������", 3);

        if(obj1.equals(obj2)){
            System.out.println("obj1 �� obj2�� �����մϴ�");
        }else{
            System.out.println("obj1 �� obj2�� ���������ʽ��ϴ�");
        }

        if(obj1.equals(obj3)){
            System.out.println("obj1 �� obj3�� �����մϴ�");
        }else{
            System.out.println("obj1 �� obj3�� ���������ʽ��ϴ�");
        }

//        obj2=obj3;
//        if(obj2.equals(obj3)){
//            System.out.println("obj2 �� obj3�� �����մϴ�");
//        }else{
//            System.out.println("obj2 �� obj3�� ���������ʽ��ϴ�");
//        }

    }
}
