package Basics;
import java.util.Scanner;
public class changedatatypes {
    public static void main(String[] args)
    {

         Scanner input = new Scanner(System.in);
         System.out.println("Enter your height: ");
         double age = input.nextDouble();
         System.out.println("Your height is : " + age);
         
         // casting double to int 
         int ageint = ((int)age); // changes the variage to int to store value in this case only keeping int values;
         System.out.println("Your input value has been cast to INT for variable, The Value is : " +ageint);
         
         float height = ((float)ageint); // casting from int to float 
         System.out.println("int value has been casted to float, The Value is : " + height);



    }
}   
