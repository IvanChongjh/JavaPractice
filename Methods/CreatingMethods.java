package Methods;

public class CreatingMethods {
    

    static void printNameAndHobby() // Declaration of methods before main
    {
        String myName = "Ivan Chong";
        String myHobby = "Soccer";
        System.out.println("My name is " + myName + ", My favourite hobbie is :"+ myHobby);

    }

    static double sumUp( double numberOne , double numberTwo)
    {
        double sum = numberOne + numberTwo;

        return sum;
    }
    public static void main(String[] args)
    {
        printNameAndHobby();

        double numberOne = 50;
        double numberTwo = 100.50;
        double sumOfTwoNumbers = sumUp(numberOne,numberTwo);

        System.out.print("The total sum of numberOne and numberTwo is "+ sumOfTwoNumbers);
    }
}
