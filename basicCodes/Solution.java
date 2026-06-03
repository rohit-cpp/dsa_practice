
// public class Solution {
//     public static int Reverse(int x) {
//         int rev = 0;
//         while (x != 0) {
//             int digit = x % 10;
//             x /= 10;

//             if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
//                 return 0;
//             }
//             if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
//                 return 0;
//             }
//             rev = rev * 10 + digit;
//         }
//         return rev;
//     }

//     public static void main(String[] args) {
//         int x = 21474836;
//         int result = Reverse(x);
//         System.out.println("Reverse of " + x + " is :" + result);
//     }
// }

class Solution {
    public double myPow(double x, int n) {
        long N = n; // handle Integer.MIN_VALUE

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;

        while (N > 0) {
            // If exponent is odd
            if ((N & 1) == 1) {
                result *= x;
            }

            x *= x; // square the base
            N /= 2; // halve the exponent
        }

        return result;
    }
}