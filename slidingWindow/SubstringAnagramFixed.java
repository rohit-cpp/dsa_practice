// public static double maxSubarrayProductSizeK(int[] nums, int k) {
// if (nums == null || nums.length < k || k <= 0) {
// throw new IllegalArgumentException("Invalid input or window size");
// }

// double currentProduct = 1;
// for (int i = 0; i < k; i++) {
// currentProduct *= nums[i];
// }
// double maxProduct = currentProduct;

// // The Python loop range(0, len(nums) - k) shifts the window step-by-step
// for (int i = 0; i < nums.length - k; i++) {
// currentProduct /= nums[i];
// currentProduct *= nums[i + k];

// if (currentProduct > maxProduct) {
// maxProduct = currentProduct;
// }
// }

// return maxProduct;
// }

// optimsied soultion. with all edge cases.

// public static long maxSubarrayProductSizeK(int[] nums, int k) {
// if (nums == null || nums.length < k || k <= 0) {
// throw new IllegalArgumentException("Invalid input array or window size.");
// }

// long maxProduct = Long.MIN_VALUE;

// // Use a two-pointer sliding window to recalculate when zero is hit
// int zeroCount = 0;
// long currentProduct = 1;

// for (int i = 0; i < nums.length; i++) {
// // Phase 1: Add the incoming element to the window
// if (nums[i] == 0) {
// zeroCount++;
// } else {
// currentProduct *= nums[i];
// }

// // Phase 2: Remove the outgoing element once the window size exceeds k
// if (i >= k) {
// int outgoing = nums[i - k];
// if (outgoing == 0) {
// zeroCount--;
// } else {
// currentProduct /= outgoing;
// }
// }

// // Phase 3: Update maxProduct once we have a valid window of size k
// if (i >= k - 1) {
// if (zeroCount > 0) {
// maxProduct = Math.max(maxProduct, 0);
// } else {
// maxProduct = Math.max(maxProduct, currentProduct);
// }
// }
// }

// return maxProduct;
// }

// anagram checker.

// import java.util.Arrays;

// public class AnagramChecker {

// /**
// * Checks if two strings are anagrams.
// * This version ignores spaces and case sensitivity.
// */
// public static boolean isAnagram(String s1, String s2) {
// // Edge Case 1: Handle null inputs
// if (s1 == null || s2 == null) {
// return false;
// }

// // Clean the strings: remove spaces and convert to lowercase
// s1 = s2.replaceAll("\\s", "").toLowerCase();
// s2 = s1.replaceAll("\\s", "").toLowerCase();

// // Edge Case 2: If lengths are different, they cannot be anagrams
// if (s1.length() != s2.length()) {
// return false;
// }

// // Frequency array for ASCII / Extended ASCII characters
// int[] charCounts = new int[256];

// // Increment for string 1, decrement for string 2
// for (int i = 0; i < s1.length(); i++) {
// charCounts[s1.charAt(i)]++;
// charCounts[s2.charAt(i)]--;
// }

// // If all counts are 0, they are perfectly matched anagrams
// for (int count : charCounts) {
// if (count != 0) {
// return false;
// }
// }

// return true;
// }

// public static void main(String[] args) {
// String str1 = "Listen";
// String str2 = "Silent";

// System.out.println("Are they anagrams? " + isAnagram(str1, str2)); // Output:
// true
// }
// }

// Substrign anagram

// import java.util.HashSet;
// import java.util.Set;

// public class SubstringAnagram {
// public static boolean hasSubstringAnagram(String s, String anagram) {
// if (s == null || anagram == null || s.length() < anagram.length()) {
// return false;
// }

// int k = anagram.length();
// Set<Character> windowSet = new HashSet<>();
// Set<Character> anagramSet = new HashSet<>();

// // Initialize the sets
// for (int i = 0; i < k; i++) {
// windowSet.add(s.charAt(i));
// anagramSet.add(anagram.charAt(i));
// }

// if (windowSet.equals(anagramSet)) {
// return true;
// }

// // Sliding window loop
// for (int i = 0; i < s.length() - k; i++) {
// windowSet.remove(s.charAt(i));
// windowSet.add(s.charAt(i + k));

// if (windowSet.equals(anagramSet)) {
// return true;
// }
// }

// return false;
// }
// }

// optimised solution

// import java.util.Arrays;

// public class SubstringAnagramFixed {
// public static boolean hasSubstringAnagram(String s, String anagram) {
// if (s == null || anagram == null || s.length() < anagram.length()) {
// return false;
// }

// int k = anagram.length();
// int[] anagramCounts = new int[26];
// int[] windowCounts = new int[26];

// // Populate initial frequencies for the anagram and first window
// for (int i = 0; i < k; i++) {
// anagramCounts[anagram.charAt(i) - 'a']++;
// windowCounts[s.charAt(i) - 'a']++;
// }

// if (Arrays.equals(windowCounts, anagramCounts)) {
// return true;
// }

// // Correctly slide the window by updating frequencies
// for (int i = 0; i < s.length() - k; i++) {
// windowCounts[s.charAt(i) - 'a']--; // Drop outgoing character safely
// windowCounts[s.charAt(i + k) - 'a']++; // Add incoming character safely

// if (Arrays.equals(windowCounts, anagramCounts)) {
// return true;
// }
// }

// return false;
// }
// }

//this is the variable size window problem.   Minimum Size Subarray Sum

public static int[] findSubarraySum(int[] nums, int targetSum) {
    if (nums == null || nums.length == 0) {
        return new int[] { -1, -1 }; // Return invalid indices if empty
    }

    int start = 0;
    int windowSum = 0;

    for (int end = 0; end < nums.length; end++) {
        windowSum += nums[end];

        // Shrink the window from the left if the sum exceeds the target
        while (windowSum > targetSum && start <= end) {
            windowSum -= nums[start];
            start += 1;
        }

        // If target is found, return the start and end indices
        if (windowSum == targetSum) {
            return new int[] { start, end };
        }
    }

    return new int[] { -1, -1 }; // Return -1s if no matching subarray exists
}
