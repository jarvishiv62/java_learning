package functions_methods;

public class Overloading {
    public static void main(String[] args) {
        fun(67);
        fun("utkarsh");

        int ans = sum(2, 3);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }
    
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
}
