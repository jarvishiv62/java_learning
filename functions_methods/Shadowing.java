package functions_methods;

public class Shadowing {
    static int x = 90;  // this will be shadowed at line 9

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x; // the class varible at line 4 is shadowed by this 
        x = 40;
        System.out.println(x); // 40
        fun();
    }
    
    static void fun() {
        System.out.println(x); // 90
    }
}

/* 
The flow of the code is as follows:

1. The main method is called and it prints the value of the class variable x which is 90.
2. The main method then declares a local variable x which shadows the class variable x.
3. The main method assigns the value 40 to the local variable x.
4. The main method then calls the fun method.
5. The fun method prints the value of the class variable x which is 90.

The usage of variable shadowing is to avoid naming conflicts between variables with the same name. 
It is also used to make the code more readable by avoiding the use of fully qualified names.

The need for variable shadowing is to avoid naming conflicts between variables with the same name. 
It is also needed to make the code more readable by avoiding the use of fully qualified names.
*/