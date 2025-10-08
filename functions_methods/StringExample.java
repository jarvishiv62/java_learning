package functions_methods;

/**
 * This class demonstrates the use of a static method to greet a user.
 */
public class StringExample {
    
    public static void main(String[] args) {
        // calls the static method meGreet with the argument "utkarsh"
        // and stores the returned value in the variable personal
        String personal = meGreet("utkarsh");

        //--------------input from user--------------------------
        // import java.util.Scanner;
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter your name");
        // String name = in.nextLine();
        // String personal = meGreet(name);
        //-------------------------------------------------------

        // prints the value of the variable personal
        System.out.println(personal);
    }
    
    /**
     * This static method takes a String argument and generates a greeting message.
     * 
     * @param name The String argument to be greeted.
     * @return A greeting message in the form of a String.
     */

    static String meGreet(String name) {
        // creates a new String object with the value "hi!! " concatenated with the value of the argument name and the string " good afternoon"
        String message = "hi!! " + name + " good afternoon";
        
        // returns the message String object
        return message;
    }
}

    /*
     * The flow of the code is as follows:
     * 1. The main method is called and it calls the static method meGreet() with the argument "utkarsh".
     * 2. The meGreet() method is called and it creates a new String object with the value "hi!! " concatenated with the value of the argument name and the string " good afternoon".
     * 3. The meGreet() method returns the message String object.
     * 4. The main method stores the returned value in the variable personal.
     * 5. The main method prints the value of the variable personal.
     */
