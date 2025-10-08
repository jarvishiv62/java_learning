package control_flow;

import java.util.Scanner;

/**
 * This program demonstrates the use of nested switch-case statements in Java.
 */
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // input the employee ID
        int empID = in.nextInt();
        // input the department of the employee
        String department = in.next();

        // switch based on the employee ID
        switch (empID) {
            case 1:
                // print the name of the employee with ID 1
                System.out.println("utkarsh Maurya");
                break;
            case 2:
                // print the name of the employee with ID 2
                System.out.println("kunal kushwaha");
                break;
            case 3:
                // for employee with ID 3, switch based on the department
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        // print the department of the employee with ID 3 and department 'IT'
                        System.out.println("IT department");
                        break;
                    case "Management":
                        // print the department of the employee with ID 3 and department 'Management'
                        System.out.println("Management department");
                        break;
                    default:
                        // print an error message if the department is invalid
                        System.out.println("Invalid department");
                }
                break;

        }
    }
}

    /*
     * The flow of the code is as follows:
     * 1. The main method is called and it creates a new Scanner object to read user input.
     * 2. The method prompts the user for the employee ID and reads it using the Scanner object.
     * 3. The method prompts the user for the department of the employee and reads it using the Scanner object.
     * 4. The method switches based on the employee ID.
     * 5. If the employee ID is 1, the method prints the name of the employee with ID 1.
     * 6. If the employee ID is 2, the method prints the name of the employee with ID 2.
     * 7. If the employee ID is 3, the method switches based on the department.
     * 8. If the department is 'IT', the method prints the department of the employee with ID 3 and department 'IT'.
     * 9. If the department is 'Management', the method prints the department of the employee with ID 3 and department 'Management'.
     * 10. If the department is invalid, the method prints an error message.
     */



