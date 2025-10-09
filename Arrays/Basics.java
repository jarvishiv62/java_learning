package Arrays;
import java.util.Arrays;
import java.util.Scanner;
 public class Basics {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int[] arr = new int[5];
         arr[0] = 23;
         arr[1] = 43;
         arr[2] = 254;
         arr[3] = 6;
         arr[4] = 274;

        //  System.out.println(arr[2]);

        //  for (int i = 0; i < arr.length; i++) {
        //      arr[i] = in.nextInt();
        //  }

         String[] str = new String[3];
     for (int i = 0; i<str.length; i++){
        str[i] = in.next();
     }
        System.out.println(Arrays.toString(str));
    }
 }

 /*
 * array objects are in heap 
 * heap objects are not continuous
 * hence, in java array may not be continuous ---> It depends on JVM
 * DMA (dynamic memory allocation)
 * primitives are stored in stack memory only 
 * objects are stored in heap memory only
 * 
 * 
 * 
 */ 