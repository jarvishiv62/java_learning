import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //take input from the user till user does not press X or x
        int ans = 0;
        while (true) {
            //take input from the user
            System.out.print("Enter the operator : ");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                //take input from the user
                System.out.print("Enter the numbers : ");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();
                if (op == '+') {
                    ans = (num1 + num2);
                }
                if (op == '-') {
                    ans = (num1 - num2);
                }
                if (op == '*') {
                    ans = (num1 * num2);

                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = (num1 / num2);
                    } else {
                        System.out.println("Cannot divide by zero");
                    }
                }

                if (op == '%') {
                    ans = (num1 % num2);
                }

            }
            else if (op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Invalid input");
            }
          System.out.println(ans);
        }
    }
}
