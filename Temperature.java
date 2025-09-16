import java.util.Scanner;
public class Temperature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Fahrenheit = ");
        float fahrenheit = in.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Celsius = " + celsius);
    }
}
