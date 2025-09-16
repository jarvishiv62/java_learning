import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int num1 = input.nextInt();
        // int num2 = input.nextInt();
        // int sum = num1 + num2;
        // System.out.println("Sum = " + sum);

        //type casting 

        // int num = (int) (632.543f);
        // System.out.println(num);

        //automatic type promotion in expressions

        // int a = 257;
        // byte b = (byte) (a);
        // System.out.println(b);
        
        /*byte overflow see here we are going over the 256 when multiplied 
        but it is automatically converting it to int to store the value*/
        
        byte a = 46;
        byte b = 60;
        byte c = 40;
        int d = (byte)(a * b / c);
        System.out.println(d);
    }
}