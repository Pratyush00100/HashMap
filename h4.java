package HashMap;
import java.util.HashMap;
import java.util.Scanner;
public class h4 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array of nums:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array::");

        for(int i =0 ; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }

        HashMap <Integer ,Integer> hash = new HashMap<>(n);

        for(int i = 0 ; i<n ; i++)
        {
            hash.put(i, arr[i]);
        }

        int maxkey = Integer.MIN_VALUE;
        int maxvalue = Integer.MAX_VALUE;
        for (Integer key : hash.keySet()){

            int value = hash.get(key);
            if(value>maxvalue){
                maxvalue = value;
                maxkey = key;
                
            }
        }

        System.out.println("The majority element in this array is:" + " " + maxvalue+" " + "and it is present at the key:" + " " + maxkey);
        
        sc.close();
        
        
    }
}
