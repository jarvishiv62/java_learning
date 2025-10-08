package functions_methods;

import java.util.Arrays;

/**
 * This class demonstrates how to change the value of an array element inside a static method.
 */
public class ChangeValue {
    public static void main(String[] args) {
        // create an array of integers
        int[] arr = { 0, 1, 2, 3, 4, 5 };
        // call the static method change() to change the value of the array element
        change(arr);
        // print the array to see the changed value
        System.out.println(Arrays.toString(arr));
    }

    /**
     * This static method takes an array of integers as an argument and changes the value of the third element.
     * @param nums the array of integers
     */
    static void change(int[] nums) {
        // change the value of the third element to 65
        nums[2] = 65;
    }
}

    // flow of the code:
    // main() method is called
    // main() creates an array of integers and calls the static method change()
    // change() method is called with the array as an argument
    // change() method changes the value of the third element of the array
    // main() prints the array to see the changed value
