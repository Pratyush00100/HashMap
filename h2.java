package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class h2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = new String();
        System.out.println("enter the compleate number");
        s = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (h1.containsKey(s.charAt(i))) {
                char c = s.charAt(i);
                h1.put(c, h1.getOrDefault(c, 0) + 1);

            }

            else {
                h1.put(s.charAt(i), 1);

            }

        }

        boolean found = false;
        for (int i = 0; i < s.length(); i++) {
            if (h1.get(s.charAt(i)) > 1) {
                System.out.println("First repeating character: " + s.charAt(i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("There is no repeating character :)");
        }

        sc.close();

    }
}
