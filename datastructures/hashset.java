package datastructures;

import java.util.HashSet;
public class hashset {

    public static void main(String[] args)
    {
        HashSet<Integer> elements = new HashSet<Integer>();
        elements.add(1);
        elements.add(2);
        elements.add(3);
        elements.add(4);

        System.out.println(elements);

        System.out.println(elements.contains(1)); // quick search into hash set to find if number 1 exist in the elements if found return true;
        

    }   
}
