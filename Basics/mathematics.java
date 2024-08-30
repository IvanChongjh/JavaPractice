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
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers");
        Scanner elements = new Scanner(System.in);
        int numberOne = elements.nextInt();
        int numberTwo = elements.nextInt();

        System.out.println(sumUp(numberOne,numberTwo));
        System.out.println(average(numberOne,numberTwo));
    }
}
