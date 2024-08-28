package datastructures;
import java.util.LinkedList;
public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.push(5); // push will add number from 0 index;
        numbers.push(10);
        numbers.push(30);

        for(int i:numbers)
        {
            System.out.println(i);
            
        }
        
    }
}
