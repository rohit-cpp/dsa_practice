
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

// class Solution {
// public int fib(int n) {
// // Base cases
// if (n <= 1) {
// return n;
// }

// int prev2 = 0; // F(0)
// int prev1 = 1; // F(1)
// int current = 0;

// for (int i = 2; i <= n; i++) {
// current = prev1 + prev2; // F(n) = F(n-1) + F(n-2)
// prev2 = prev1; // Move prev2 forward
// prev1 = current; // Move prev1 forward
// }

// return current;
// }
// }

// import java.util.*;

// class Solution {

// public List<String> restoreIpAddresses(String s) {
// List<String> result = new ArrayList<>();

// if (s.length() < 4 || s.length() > 12) {
// return result;
// }

// backtrack(s, 0, new ArrayList<>(), result);
// return result;
// }

// private void backtrack(String s, int index,
// List<String> parts,
// List<String> result) {

// // If 4 parts are formed
// if (parts.size() == 4) {
// if (index == s.length()) {
// result.add(String.join(".", parts));
// }
// return;
// }

// // Try segments of length 1, 2, and 3
// for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

// String segment = s.substring(index, index + len);

// // Leading zero check
// if (segment.length() > 1 && segment.charAt(0) == '0') {
// break;
// }

// int value = Integer.parseInt(segment);

// if (value <= 255) {
// parts.add(segment);
// backtrack(s, index + len, parts, result);
// parts.remove(parts.size() - 1); // backtrack
// }
// }
// }
// }

// using Array integer.

// class Solution {
// public boolean isAnagram(String s, String t) {
// if (s.length() != t.length()) {
// return false;
// }
// int[] letterCounts = new int[26];

// for (int i = 0; i < s.length(); i++) {
// letterCounts[s.charAt(i) - 'a']++;
// letterCounts[t.charAt(i) - 'a']--;
// }

// for (int count : letterCounts) {
// if (count != 0) {
// return false;
// }
// }
// return true;
// }
// }

// if(s.length() != t.length()){
// return false;
// }
// HashMap<Character, Integer> maps = new HashMap<>();
// HashMap<Character, Integer> mapt = new HashMap<>();

// for(int i = 0; i< s.length(); i++){
// char c = s.charAt(i);
// maps.put(c,maps.getOrDefault(c,0)+1);
// }

// for(int i = 0; i< t.length(); i++){
// char c = t.charAt(i);
// mapt.put(c,mapt.getOrDefault(c,0)+1);
// }

// return maps.equals(mapt);
// }
// }

// class Solution {
// public int lengthOfLastWord(String s) {

// int lastChar = s.length() - 1;
// int count = 0;

// for (int i = lastChar; i >= 0; i--) {
// if (s.charAt(i) != ' ') {
// count++;
// } else if (count > 0) {
// break;
// }
// }
// return count;
// }

// }

// class Solution {

// static void checkString(String s) {
// int vowels = 0;

// for (int i = 0; i < s.length(); i++) {
// char c = s.charAt(i);

// if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
// vowels++;
// }
// }

// int consonents = s.length() - vowels;

// // FIX: Added "ln" to the end of print statements
// if (vowels > consonents) {
// System.out.println("Yes");
// } else if (vowels < consonents) {
// System.out.println("No");
// } else {
// System.out.println("Same");
// }
// }
// }

// public String removeVowels(String s) {
//     // 1. Create a StringBuilder to hold our final answer
//     StringBuilder result = new StringBuilder();
//     
//     // 2. A reference string of all possible vowels
//     String vowels = "aeiouAEIOU";

//     for (int i = 0; i < s.length(); i++) {
//         char c = s.charAt(i);
//         
//         // 3. .indexOf(c) returns -1 if the letter is NOT in the vowel
// string.
//         // If it's -1, it's a consonant, so we append it to our result!
//         if (vowels.indexOf(c) == -1) {
//             result.append(c);
//         }
//     }

//     // 4. Convert the builder back into a standard String
//     return result.toString();
// }

// class Solution {
// public String toggleCase(String s) {
// // code here
// StringBuilder result = new StringBuilder(s.length());

// for (int i = 0; i < s.length(); i++) {
// char c = s.charAt(i);

// if (Character.isUpperCase(c)) {
// result.append(Character.toLowerCase(c));
// } else if (Character.isLowerCase(c)) {
// result.append(Character.toUpperCase(c));
// } else {
// result.append(c);
// }
// }
// return result.toString();
// }
// }

// class Solution {
// public String modifyString(String s) {
// // Convert string to a char array for mutability
// char[] chars = s.toCharArray();
// int n = chars.length;

// for (int i = 0; i < n; i++) {
// if (chars[i] == '?') {
// // We only need to check 'a', 'b', and 'c'
// for (char candidate = 'a'; candidate <= 'c'; candidate++) {
// // Check left neighbor (if it exists)
// if (i > 0 && chars[i - 1] == candidate) {
// continue;
// }
// // Check right neighbor (if it exists)
// if (i < n - 1 && chars[i + 1] == candidate) {
// continue;
// }

// // If the candidate passed both checks, assign it and stop checking
// chars[i] = candidate;
// break;
// }
// }
// }

// // Convert the modified char array back to a String
// return new String(chars);
// }
// }