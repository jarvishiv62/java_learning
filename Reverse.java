public class Reverse {
    public static void main(String[] args) {
        int num = 2345976;
        int ans = 0;
        while (num > 0) {          // while loop chal rhi hai tab tak jab num 0 se bada hai
            int rem = num % 10;     // rem nikal rhi hai 
            num /= 10;              // num ko 10 se divide karta hai kyuki hum last digit ko remove karna hai
            ans = ans * 10 + rem;   //ans ko 10 se multiply karta hai aur rem ko add karta hai kyuki hum reverse karna hai
        
        }
System.out.println(ans);
    }
}
