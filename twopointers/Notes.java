// public class notes {

// }

// first is this one we have to substarct witht the traget concept. we have to
// do basic maths before solving. then we need to do code.
// public class TwoPointer {

// public int[] twoSum(int[] nums, int target) {
// HashMap<Integer, Integer> map = new HashMap<>();

// for (int i = 0; i <= nums.length; i++) {

// int needed = target - nums[i];
// if (map.containsKey(needed)) {
// return new int[] { map.get(needed), i };
// }
// map.put(nums[i], i);
// }
// return new int[] {};
// }

// second is this problem where we need to find the second letter. where we need
// to substact with the a to fidn the index of the aplbet array.

// class Solution {
// public boolean checkDistances(String s, int[] distance) {
// for (int i = 0; i < s.length(); i++) {
// int letterIndex = s.charAt(i) - 'a';

// // If the value is >= 0, it means we are seeing this letter for the FIRST
// time
// if (distance[letterIndex] >= 0) {
// // We add the current index to the required distance and store it as a
// negative
// // number
// // This preserves the original requirement while marking it as "seen"
// distance[letterIndex] = -(distance[letterIndex] + i + 1);
// }
// // If the value is negative, it means we are seeing this letter for the
// SECOND
// // time
// else {
// // Reconstruct the expected index: expected_j = original_distance +
// first_index
// // + 1
// // Since we stored it as -(original_distance + first_index + 1), it should
// match
// // -i
// if (distance[letterIndex] != -i) {
// return false;
// }
// }
// }
// return true;
// }
// }

// same example.
// class Solution {
// public boolean checkDistances(String s) {
// // Loop from the first character up to the SECOND TO LAST character
// for (int i = 0; i < s.length() - 1; i++) {

// // Get the integer values of the current and next character
// // Subtracting '0' converts the char (like '3') to its actual integer value
// (3)
// int current = s.charAt(i) - '0';
// int next = s.charAt(i + 1) - '0';

// // If the absolute difference is strictly greater than 2, it fails the
// // condition.
// if (Math.abs(current - next) > 2) {
// return false;
// }
// }

// // If the loop finishes without ever returning false, all pairs are valid!
// return true;
// }
// }

// Java 1. Convert to an array of Strings or Characters:

// public class Main {
// public static void main(String[] args) {
// String s = "123";

// // Option A: Convert to a char array (['1', '2', '3'])
// // This is the most common and efficient way in Java
// char[] charArray = s.toCharArray();

// // Option B: Convert to a String array (["1", "2", "3"])
// String[] stringArray = s.split("");
// }
// }

// 2. Convert to an array of integers (numbers): [1, 2, 3]

// import java.util.Arrays;

// public class Main {
// public static void main(String[] args) {
// String s = "123";

// // Option A: Java 8+ Streams (Clean and modern)
// // .chars() gets an IntStream of character codes, and getNumericValue
// converts
// // them to actual numbers.
// int[] numArray1 = s.chars()
// .map(Character::getNumericValue)
// .toArray();

// // Option B: Traditional For-Loop (Great for performance and older Java
// // versions)
// int[] numArray2 = new int[s.length()];
// for (int i = 0; i < s.length(); i++) {
// // Subtracting '0' (which is 48 in ASCII) converts the character code to its
// // integer value
// numArray2[i] = s.charAt(i) - '0';
// }

// System.out.println(Arrays.toString(numArray1)); // Output: [1, 2, 3]
// }
// }

// full edge cases handled properly prodcution level.

// class Solution {
// public boolean isPalindrome(String s) {
// int left = 0;
// int right = s.length() - 1;

// while (left < right) {
// while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
// left++;
// }
// while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
// right--;
// }
// if (Character.toLowerCase(s.charAt(left)) !=
// Character.toLowerCase(s.charAt(right))) {
// return false;
// }
// left++;
// right--;
// }
// return true;
// }
