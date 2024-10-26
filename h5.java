package HashMap;
//import java.util.Stack;
import java.util.*;

public class h5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements in the array:");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = sc.nextInt();
        }
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for(int i = 0 ; i <n ; i++){
            map.put(arr[i], 1);
        }

        int result = map.lastEntry().getKey();
        System.out.println("The largest element of the map is:" + result);
        sc.close();
   }
}
