import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
       
        //if condition

        int num = 10;
        if (num > 0) {
            System.out.println("positive");
        }
        
        //while loop

        int i = 0;
        while(i<=6)
        {
            System.out.println(i);
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

        /*when you do not know that how many times the loop should run use "while" loop 
        and when you know that how many times the loop should run use "for" loop.
        */
    }
}

