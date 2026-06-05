
// public class Solution {
// public static int Reverse(int x) {
// int rev = 0;
// while (x != 0) {
// int digit = x % 10;
// x /= 10;

// if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit >
// 7)) {
// return 0;
// }
// if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit <
// -8)) {
// return 0;
// }
// rev = rev * 10 + digit;
// }
// return rev;
// }

// public static void main(String[] args) {
// int x = 21474836;
// int result = Reverse(x);
// System.out.println("Reverse of " + x + " is :" + result);
// }
// }

// class Solution {
// public double myPow(double x, int n) {
// long N = n; // handle Integer.MIN_VALUE

// if (N < 0) {
// x = 1 / x;
// N = -N;
// }

// double result = 1;

// while (N > 0) {
// // If exponent is odd
// if ((N & 1) == 1) {
// result *= x;
// }

// x *= x; // square the base
// N /= 2; // halve the exponent
// }

// return result;
// }
// }

// class Solution {
// public String convertToTitle(int columnNumber) {
// StringBuilder result = new StringBuilder();

// while (columnNumber > 0) {
// // Shift down by 1 to make it 0-indexed (0 to 25)
// columnNumber--;

// // Get the current character's offset
// int remainder = columnNumber % 26;

// // Convert offset to the actual character and append
// result.append((char) (remainder + 'A'));

// // Divide by 26 to process the next character
// columnNumber /= 26;
// }

// // Reverse the accumulated characters and return as a String
// return result.reverse().toString();
// }
// }

// class Solution {
// public int reverse(int x) {
// int rev = 0;
// while (x != 0) {
// int lastDigit = x % 10;
// x /= 10;

// // Changed '=' to '==' for comparison
// if ((rev > Integer.MAX_VALUE / 10) || ((rev == Integer.MAX_VALUE / 10) &&
// lastDigit > 7)) {
// return 0;
// }
// // Changed '=' to '==' for comparison
// if ((rev < Integer.MIN_VALUE / 10) || ((rev == Integer.MIN_VALUE / 10) &&
// lastDigit < -8)) {
// return 0;
// }

// rev = rev * 10 + lastDigit;
// }
// return rev;
// }
// }

class Solution {
    public int fib(int n) {
        // Base cases
        if (n <= 1) {
            return n;
        }

        int prev2 = 0; // F(0)
        int prev1 = 1; // F(1)
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2; // F(n) = F(n-1) + F(n-2)
            prev2 = prev1; // Move prev2 forward
            prev1 = current; // Move prev1 forward
        }

        return current;
    }
}