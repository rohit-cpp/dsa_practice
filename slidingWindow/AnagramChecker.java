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
//     if (nums == null || nums.length < k || k <= 0) {
//         throw new IllegalArgumentException("Invalid input array or window size.");
//     }

//     long maxProduct = Long.MIN_VALUE;

//     // Use a two-pointer sliding window to recalculate when zero is hit
//     int zeroCount = 0;
//     long currentProduct = 1;

//     for (int i = 0; i < nums.length; i++) {
//         // Phase 1: Add the incoming element to the window
//         if (nums[i] == 0) {
//             zeroCount++;
//         } else {
//             currentProduct *= nums[i];
//         }

//         // Phase 2: Remove the outgoing element once the window size exceeds k
//         if (i >= k) {
//             int outgoing = nums[i - k];
//             if (outgoing == 0) {
//                 zeroCount--;
//             } else {
//                 currentProduct /= outgoing;
//             }
//         }

//         // Phase 3: Update maxProduct once we have a valid window of size k
//         if (i >= k - 1) {
//             if (zeroCount > 0) {
//                 maxProduct = Math.max(maxProduct, 0);
//             } else {
//                 maxProduct = Math.max(maxProduct, currentProduct);
//             }
//         }
//     }

//     return maxProduct;
// }

// anagram checker. 

import java.util.Arrays;

public class AnagramChecker {

    /**
     * Checks if two strings are anagrams.
     * This version ignores spaces and case sensitivity.
     */
    public static boolean isAnagram(String s1, String s2) {
        // Edge Case 1: Handle null inputs
        if (s1 == null || s2 == null) {
            return false;
        }

        // Clean the strings: remove spaces and convert to lowercase
        s1 = s2.replaceAll("\\s", "").toLowerCase();
        s2 = s1.replaceAll("\\s", "").toLowerCase();

        // Edge Case 2: If lengths are different, they cannot be anagrams
        if (s1.length() != s2.length()) {
            return false;
        }

        // Frequency array for ASCII / Extended ASCII characters
        int[] charCounts = new int[256];

        // Increment for string 1, decrement for string 2
        for (int i = 0; i < s1.length(); i++) {
            charCounts[s1.charAt(i)]++;
            charCounts[s2.charAt(i)]--;
        }

        // If all counts are 0, they are perfectly matched anagrams
        for (int count : charCounts) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        System.out.println("Are they anagrams? " + isAnagram(str1, str2)); // Output: true
    }
}
