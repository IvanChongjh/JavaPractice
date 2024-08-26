
package Classes;

public class CreatingClasses {
    
    String name = "Default";
    int age = 0;


    public static void main(String[] args)
    {   

        CreatingClasses test = new CreatingClasses();
        System.out.println(test.name);
        System.out.println(test.age);

        test.age = 50;

        System.out.println(test.age);
        StudentClass testOne = new StudentClass();


        
        testOne.detailsOfStudent();
        testOne.setStudentAge(20);
        testOne.setStudentName("Sarah");
        testOne.setStudentCourse("Nurse");
        testOne.detailsOfStudent();

    }
}
