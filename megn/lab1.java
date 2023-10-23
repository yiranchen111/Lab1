package edu.neu.megn;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lab1 {
    public static void main(String[] args) {
        //part1

        int [] x = {1,2,3,4,5};
        int [] y = {0,6,7,8,9};
        int [] z = new int [5];

        for(int i = 0 ; i < 5 ; i++){
            z[i] = Math.max(x[i] , y[i]);
        }

        System.out.println("Array x =" + Arrays.toString(x));
        System.out.println("Array y =" + Arrays.toString(y));
        System.out.println("Array z =" + Arrays.toString(z));



        //part2

        List<String> names = new ArrayList<>(Arrays.asList("Jack" , "Mike" , "Rose" , "Cindy" , "Jane"));
        List<String> switchedNames = new ArrayList<>();

        for(String n : names){
            char first = n.charAt(0);
            char last = n.charAt(n.length() - 1);
            String switched = Character.toUpperCase(last) + n.substring(1, n.length() - 1) + Character.toLowerCase(first);
            switchedNames.add(switched);
        }

        System.out.println("names =" + names);
        System.out.println("SwitchedNames =" + switchedNames);

    }
}
