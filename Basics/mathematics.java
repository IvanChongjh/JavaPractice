package Basics;
import java.util.Scanner;

public class mathematics {
    

    private static double sumUp(int numberOne, int numberTwo)
    {
        return numberOne+numberTwo;
    }

    private static double average(int numberOne,int numberTwo)
    {
        double avg = (((double)numberOne)+((double)numberTwo))/2;
        return avg;
    }
    public static double subtraction(double numberOne, double numberTwo)
    {
        return numberOne - numberTwo;
    }
    
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers");
        Scanner elements = new Scanner(System.in);
        int numberOne = elements.nextInt();
        int numberTwo = elements.nextInt();

        System.out.println(sumUp(numberOne,numberTwo));
        System.out.println("The average of two numbers is : " + average(numberOne,numberTwo));
        System.out.println("The Subtraction between number one and number two is : " + subtraction(numberOne, numberTwo));

    }
}
