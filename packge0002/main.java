
import java.util.Scanner;

import package0003.StudentGrade;


public class main {

    public static void main(String[] arg) {


        Scanner input= new Scanner(System.in);
        System.out.println("student Name!!");
        String inputStudentName = input.nextLine();

        System.out.println("subject Name");
        String inputSubjectName = input.nextLine();

        System.out.println("Grade Name");
        int intputGradeName = input.nextInt();

        System.out.println("student =" +inputStudentName+"// subject = "+inputSubjectName+"// grade =" +intputGradeName);
        
        StudentGrade student= new StudentGrade(); 
        StudentGrade student2=new StudentGrade(inputStudentName, inputSubjectName, intputGradeName);

        System.out.println(student.ClassName);
        System.out.println("----------");
        System.out.println(student2.ClassName);
        System.out.println(student2.name);
        System.out.println(student2.subject);
        System.out.println(student2.grade);
        System.out.println("------------");
        /*Overloading car1 = new Overloading();
        System.out.println("car1.company :" + car1.company);
        System.out.println();

        Overloading car2= new Overloading("model_name" );
        System.out.println("car2.company :" + car2.company);
        System.out.println("car2.model :" + car2.model);

        Overloading car3= new Overloading("model_color", "black");
        System.out.println("car3.company :" + car3.company);
        System.out.println("car3.model :"+ car3.model);
        System.out.println("car3.color :" + car3.color);

        Overloading car4= new Overloading("corando", "white", 200);
        System.out.println("car4.company :" + car4.company);
        System.out.println("car4.model :"+ car4.model);
        System.out.println("car4.color :" + car4.color);
        System.out.println("car4.maxSpeed :" + car4.maxSpeed);*/
    }
    
}
