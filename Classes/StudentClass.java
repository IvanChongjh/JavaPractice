package Classes;

public class StudentClass {
    String name;
    int age;
    String Course;


    
    StudentClass() // default constructor 
    {
        name = "Not Added";
        age = 0;
        Course = "Not Added";
    }
    StudentClass(String name, int age, String Course)
    {
        this.name = name;
        this.age = age;
        this.Course = Course;
    }
    
    public void detailsOfStudent(){

        System.out.println("My Name is :" + name +"\n My age is : " + age + "My Course is : " + Course );
    }
    public String getStudentName()
    {
        return name;

    }
    public void setStudentName(String name)
    {

        this.name = name;
    }
    public void setStudentAge(int age)
    {
        this.age = age;
    }
    public int getStudentAge()
    {
        return age;
    }
    public String getStudentCourse(){
        return Course;
    }
    public void setStudentCourse(String Course)
    {
        this.Course = Course;
    }
    
}
