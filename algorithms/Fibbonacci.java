package algorithms;
import java.util.Scanner;

public class Fibbonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates a Scanner to read user input from the console.
        System.out.print("Enter the position in Fibonacci sequence:"); // Prompts the user for input.
        int n = input.nextInt(); // Reads an integer from the user, representing the position in the Fibonacci sequence.
        int a = 0; // First Fibonacci number.
        int b = 1; // Second Fibonacci number.
        int count = 2; // Counter to track the position in the sequence.

        while (count <= n) { // Loop until reaching the nth position.
            int temp = b; // Store current value of b.
            b = b + a; // Calculate next Fibonacci number.
            a = temp; // Update a to previous b.
            count++; // Move to the next position.
        }
        System.out.println(b); // Output the nth Fibonacci number.
    }
    
}


/*
THEORY: FIBONACCI SEQUENCE

1. Definition:
   - The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones.
   - It starts from 0 and 1, and the sequence continues as: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
   - Mathematically, it's defined by the recurrence relation:
     F₀ = 0, F₁ = 1
     Fₙ = Fₙ₋₁ + Fₙ₋₂ for n > 1

2. Properties:
   - The ratio between consecutive Fibonacci numbers approaches the Golden Ratio (φ ≈ 1.618) as n increases.
   - Every third Fibonacci number is even.
   - The sum of any ten consecutive Fibonacci numbers is divisible by 11.
   - The Fibonacci sequence grows exponentially, with Fₙ ≈ φⁿ/√5.

3. Time Complexity:
   - Iterative approach (as implemented): O(n) time and O(1) space.
   - Recursive approach: O(2ⁿ) time (inefficient for large n).
   - Dynamic Programming: O(n) time with O(n) space.
   - Matrix Exponentiation: O(log n) time (most efficient for very large n).
   - Binet's Formula: O(1) time (but limited by floating-point precision).

4. Applications:
   - Algorithm analysis (e.g., analysis of the Euclidean algorithm)
   - Financial markets analysis (Fibonacci retracements)
   - Computer algorithms (Fibonacci heap, Fibonacci search)
   - Nature (phyllotaxis, branching in trees, arrangement of leaves)
   - Art and architecture (golden ratio applications)

5. Common Variations:
   - Starting with different numbers (Lucas numbers: 2, 1, 3, 4, 7, ...)
   - Negative indices (F₋ₙ = (-1)ⁿ⁺¹Fₙ)
   - Tribonacci numbers (each term is the sum of three preceding ones)

6. Edge Cases to Consider:
   - Negative input (not defined in standard Fibonacci)
   - Large n (may cause integer overflow)
   - n = 0 or n = 1 (base cases)

7. Optimizations:
   - Memoization for recursive solutions
   - Using iteration instead of recursion
   - Matrix exponentiation for O(log n) time complexity
   - Using the closed-form expression (Binet's formula) for quick approximation

8. Interesting Facts:
   - The Fibonacci sequence appears in nature's patterns (e.g., flower petals, pinecones).
   - The Fibonacci sequence is closely related to the Golden Ratio.
   - November 23 is celebrated as Fibonacci Day (11/23 in mm/dd format).
   - The Fibonacci sequence appears in Pascal's Triangle.
*/
