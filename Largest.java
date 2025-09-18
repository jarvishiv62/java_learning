import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();

        // find the largest number
        // int max = n1 ;
        // if(n2>max)
        // {
        //     max = n2;
        // }
        // if(n3>max){
        //     max = n3;
        // }
          
            int max= Math.max(n3, Math.max(n1,n2));
    System.out.println(max);

    }
}
