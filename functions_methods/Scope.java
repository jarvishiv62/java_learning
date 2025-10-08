package functions_methods;

public class Scope {
    public static void main(String[] args) {
        int a = 20;
        int b = 43;
        System.out.println(a + b);

        {
            //  int a = 78;  we cannot initialise as we have already initialised a outside the block in the same method.

            a = 43; // reassign the origin ref variable to some other variable

            int c = 32;
            //  value initialised in this block will remain in the block
        }
        // System.out.println(c);  this will throw an error as c is not initialised outside the block
    }

    static void random(int marks) {
        int num = 56;
        System.out.println(num);
        System.out.println(marks);
         
    }
}
