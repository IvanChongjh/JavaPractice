package Exceptions;

public class ErrorHandling {
    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 }; // declaring array 
            System.out.println(myNumbers[10]); // printing number out of index this will trigger error java.lang.ArrayIndexOutOfBoundsException: 10
        } catch (Exception e) { // this will catch error allowing the program to continue running 
            System.out.println("Something went wrong.");// upon java getting caught this will be printed to console
        }

        System.out.println("Program has continued"); // if the catch was not there program will not be able to print this 
    }
}
