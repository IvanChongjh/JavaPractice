package Basics;
import java.util.Scanner; // declaration of scanner

public class userinput {
    public static void main(String[] args)
    {
        Scanner myObjj =  new Scanner(System.in); // create a scanner that reads from keyboard.
        System.out.println("Enter Username : "); // prompts user for username
        String userName  = myObjj.nextLine();  // using declared scanner to read in using nextline() function
        System.out.println(userName); 
    }
}
