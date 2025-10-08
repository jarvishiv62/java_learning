package functions_methods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(1, 2, 3, 4, 5, 54, 654, 54);
        multiple(23, 32, "utkarsh", "maurya", "dsfb");

    }

    static void multiple(int a, int b, String... v) {
        System.out.println(a + " " + b + " " + Arrays.toString(v));

    }
    static void fun(int ...v)
    {
        System.out.println(Arrays.toString(v));
    }
    
}

