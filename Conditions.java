public class Conditions {
    public static void main(String[] args) {
       
        //if condition

        int num = -10;
        if (num > 0) {
            System.out.println("positive");
        }
        
        //while loop
        int i = 0;
        while (i != 5) {
            System.out.println(i);
            i++;
        }

        //for loop

        for (int j = 0; j != 5; j++) {
            System.out.println(j);
        }


        //if else condition

        int salary = 25000;
        if (salary > 10000) {
            salary = salary + 2000;
        } else {
            salary = salary + 1000;
        }
        System.out.println(salary);

        /*when you do not know that how many times the loop should run use while loop 
        and when you know that how many times the loop should run use for loop.
        */
    }
}
