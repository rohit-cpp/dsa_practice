// import java.util.HashMap;

// done by myslef.
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

// }
// question []count pairs whose sum is less than target.
// take two pointer i and j. where i =nums[0] and j=nums[1];
// calculte the sum of both os the numbers and chcek if the sum is smaller than
// the target. if the sum is smaller add that pair in the count. So we can
// count. then increase j++; then i++;
// brute force with logs as well

// public class TwoPointer {
// public static int pair(int nums[], int target) {
// int count = 0;
// for (int i = 0; i <= nums.length - 2; i++) {
// for (int j = i + 1; j <= nums.length - 1; j++) {
// int sum = nums[i] + nums[j];
// if (sum < target) {
// count++;
// // System.out.println(nums[i] + nums[j]);
// // System.out.println("sum is " + sum);
// // System.out.println(count);
// }
// }

// }
// return count;

// }

// public static void main(String[] args) {
// int[] nums = { -6, 2, 5, -2, -7, -1, 3 };
// int target = -2;
// int result = pair(nums, target);
// System.out.println(result);
// }
// }

// optimised approach.

// import java.util.Collections;
// import java.util.List;

// class Solution {
// public int countPairs(List<Integer> nums, int target) {

// Collections.sort(nums);
// int count = 0;
// int left = 0;
// int right = nums.size() - 1;

// while (left < right) {
// int sum = nums.get(left) + nums.get(right);
// if (sum < target) {
// count += (right - left);
// left++;
// } else {
// right--;
// }
// }
// return count;
// }
// }

// number of distinct averges.
// hasmap is for key value pairs. and hashset is for onyl one value.
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

// class TwoPointer {
// public static int distinctAverages(int[] nums) {
// Arrays.sort(nums);

// int min = 0;
// int max = nums.length - 1;

// Set<Double> averages = new HashSet<>();
// while (min < max) {

// double average_numbers = (nums[min] + nums[max]) / 2.0;

// averages.add(average_numbers);

// min++;
// max--;
// }
// return averages.size();
// }

// public static void main(String args[]) {
// int[] nums = { 4, 1, 4, 0, 3, 5 };
// int result = distinctAverages(nums);
// System.out.println(
// "result is :" + result);
// }
// }

// // new question find largest positive integer that exist with negative
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;

// import java.util.Arrays;

// class TwoPointer {
// public static int largestpositiveinteger(int[] nums) {
// // 1. Sort the array so negatives are on the left and positives on the right
// Arrays.sort(nums);

// int min = 0;
// int max = nums.length - 1;

// // 2. Use a single while loop
// while (min < max) {
// int sum = nums[min] + nums[max];

// if (sum == 0) {
// // If sum is 0, we found our pair!
// // Since 'max' starts from the end, this is guaranteed to be the largest
// // possible positive integer.
// return nums[max];
// } else if (sum < 0) {
// // If sum is negative, the negative number is too large in magnitude.
// // Move the left pointer to the right to get a smaller negative number.
// min++;
// } else {
// // If sum is positive, the positive number is too large.
// // Move the right pointer to the left to get a smaller positive number.
// max--;
// }
// }

// // 3. Return -1 if no such pair exists
// return -1;
// }

// public static void main(String args[]) {
// int[] nums = { -1, 10, 6, 7, -7, 1 };
// int result = largestpositiveinteger(nums);
// System.out.println("result is :" + result);
// }
// }

// OPTIMIZED SOULTION.

// import java.util.HashSet;

// class TwoPointer {
// public static int largestPostive(int nums[]) {

// HashSet<Integer> double_num = new HashSet<>();
// int maxValue = -1;

// for (int num : nums) {
// if (double_num.contains(-num)) {
// maxValue = Math.max(maxValue, Math.abs(num));
// }
// double_num.add(num);
// }

// return maxValue;
// }

// public static void main(String args[]) {
// int nums[] = { -1, 10, 6, 7, -7, 1 };
// int result = largestPostive(nums);
// System.out.println("largest postive number is :" + result);
// }
// }
import java.util.HashSet;

class TwoPointer {
    public static boolean findSubarrays(int nums[]) {

        HashSet<Integer> box = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];

            if (box.contains(sum)) {
                return true;
            } else {
                box.add(sum);
            }

        }
        return false;
    }

    public static void main(String args[]) {
        int nums[] = { 4, 2, 4 };
        boolean result = findSubarrays(nums);
        System.out.println("largest postive number is :" + result);
    }
}