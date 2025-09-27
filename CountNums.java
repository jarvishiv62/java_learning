public class CountNums {
    public static void main(String[] args) {
        int n = 243454433; // here we are giving input number from which to count
        int count = 0; // here we are initializing count to 0
        while (n>0) // here we are running a while loop until n becomes 0
        {
            int rem = n % 10; // here we are getting the remainder of n
            if (rem==4) // here we are checking if the remainder is 4
            {
                count++;
            }
            n = n / 10; // here we are removing the last digit from n
        }
        System.out.println(count); // here we are printing the count
    }
}
