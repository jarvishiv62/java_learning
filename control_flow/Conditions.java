package control_flow;

import java.util.Scanner;

/**
 * A comprehensive demonstration of different control flow statements in Java.
 * This program showcases if-else conditions, while loops, do-while loops, and for loops.
 */
public class Conditions {
    public static void main(String[] args) {
        // ========== IF STATEMENT ==========
        System.out.println("\n=== IF STATEMENT ===");
        int num = 10;
        if (num > 0) {
            System.out.println("The number is positive");
        }
        
        //while loop

        int i = 0;
        while (i <= 3) {
            System.out.println("While loop iteration: " + i);
            i++;
        }

        // do while loop
        
        /*it will run atleast one loop even if the condition is false */

        int number = 1;
        do{
            System.out.println(number);
            number+=1;    
        }
        while(number<=3);

        //for loop

        /* for loop syntax:

           for (initialisation; condition; increement/decreement ){
           // body
           }
         
         */

        // for (int j = 0; j != 5; j++) {
        //     System.out.println(j);
        // }

        // Print numbers 1 to n.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int j = 0; j <= n; j++) {
            System.out.println(j + " ");
        System.out.print("hello utkarsh");    
        }


        //if else condition

        int salary = 25000;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        // Close the scanner to prevent resource leaks
        input.close();
    }
}

/*
THEORY: CONTROL FLOW IN JAVA

1. IF STATEMENT:
   - Executes a block of code if a specified condition is true
   - Syntax:
     if (condition) {
         // code to execute if condition is true
     }

2. IF-ELSE STATEMENT:
   - Executes one block if condition is true, another if false
   - Syntax:
     if (condition) {
         // code if true
     } else {
         // code if false
     }

3. WHILE LOOP:
   - Repeats a block of code while a condition is true
   - Best when number of iterations is not known in advance
   - Syntax:
     while (condition) {
         // code to execute
     }

4. DO-WHILE LOOP:
   - Similar to while, but executes at least once
   - Syntax:
     do {
         // code to execute
     } while (condition);

5. FOR LOOP:
   - Used when number of iterations is known
   - Syntax:
     for (initialization; condition; update) {
         // code to execute
     }

BEST PRACTICES:
- Always use curly braces {} for better readability
- Keep loop conditions simple and clear
- Avoid infinite loops by ensuring loop conditions will eventually be false
- Use meaningful variable names in loop counters
- Be careful with floating-point numbers in loop conditions

COMMON PITFALLS:
- Off-by-one errors
- Infinite loops
- Unreachable code
- Dangling else problem
- Missing break in switch statements

ADVANCED TOPICS:
- Nested loops
- Break and continue statements
- Labeled breaks
- Enhanced for-each loop (for arrays and collections)
- Switch expressions (Java 14+)

WHEN TO USE WHICH LOOP:
- Use 'for' when you know the number of iterations
- Use 'while' when the number of iterations is not known
- Use 'do-while' when the loop must execute at least once
*/


