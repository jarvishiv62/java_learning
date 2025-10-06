import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner in = new Scanner(System.in);
        // Prompt the user for input
        System.out.print("Fahrenheit = ");
        // Read the input from the user
        float fahrenheit = in.nextFloat();
        // Convert the input from Fahrenheit to Celsius
        float celsius = (fahrenheit - 32) * 5 / 9;
        // Print the result
        System.out.println("Celsius = " + celsius);
        
        // Usage: java Temperature <fahrenheit>
        // Example: java Temperature 98.6
    }
}


/*
THEORY: TEMPERATURE CONVERSION

1. Temperature Scales:
   - Celsius (°C): Water freezes at 0°C and boils at 100°C at sea level.
   - Fahrenheit (°F): Water freezes at 32°F and boils at 212°F at sea level.
   - Kelvin (K): Absolute zero is 0K (-273.15°C), water freezes at 273.15K.

2. Conversion Formulas:
   - Fahrenheit to Celsius: C = (F - 32) × 5/9
   - Celsius to Fahrenheit: F = (C × 9/5) + 32
   - Celsius to Kelvin: K = C + 273.15
   - Kelvin to Celsius: C = K - 273.15

3. Key Temperature Points:
   - Absolute zero: -273.15°C, -459.67°F, 0K
   - Water freezes: 0°C, 32°F, 273.15K
   - Human body temperature: ~37°C, ~98.6°F, ~310.15K
   - Water boils: 100°C, 212°F, 373.15K (at 1 atm pressure)

4. Common Temperature Ranges:
   - Arctic winter: -40°C to -30°C
   - Freezing: 0°C
   - Room temperature: 20-25°C (68-77°F)
   - Body temperature: ~37°C (98.6°F)
   - Hot summer day: 30-40°C (86-104°F)
   - Fever: >38°C (100.4°F)

5. Implementation Notes:
   - Use floating-point arithmetic for precise calculations
   - Be aware of integer division issues (e.g., 5/9 in integer math is 0)
   - Consider using BigDecimal for financial or scientific precision
   - Always include proper input validation

6. Common Mistakes:
   - Using integer division instead of floating-point division
   - Not handling negative temperatures correctly
   - Forgetting to validate user input
   - Rounding errors in floating-point arithmetic

7. Real-world Applications:
   - Weather forecasting
   - Cooking and food safety
   - Medical applications
   - Scientific research
   - Industrial processes
   - Climate control systems

8. Advanced Topics:
   - Temperature scales conversion for scientific calculations
   - Handling of significant figures in measurements
   - Temperature compensation in sensors
   - Thermal imaging and infrared thermography
   - Heat index and wind chill calculations
*/


