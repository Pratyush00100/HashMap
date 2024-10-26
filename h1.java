package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class h1 {
    public static void main(String[] args) {
        HashMap<Integer , String> h1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the key and value as said:");
        int j = 0;
        String s = new String();
        while( j < 5)
        {
            System.out.println("Enter the key :");
            int key = sc.nextInt();
            System.out.println("ENter the value:");
            s = sc.next();
            h1.put(key, s);
            j++;

        }

        
        System.out.println("The hashmap created by you is :"+ h1);
        sc.close();

      /* /  for(int i= 0 ; i <5 ; i++)
        {
            h1.get(i);
        }*/




    }
}
