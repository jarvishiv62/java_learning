import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0); // trim removes basically the extra spaces from the input and charAt(0) returns the first character
        if (ch >= 'a' && ch <= 'z' ){
            System.out.println("lowercase");
        } else {
             System.out.println("uppercase"); // else is optional  
        }
    }
}
