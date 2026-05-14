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

import java.util.Collections;
import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {

        Collections.sort(nums);
        int count = 0;
        int left = 0;
        int right = nums.size() - 1;

        while (left < right) {
            int sum = nums.get(left) + nums.get(right);
            if (sum < target) {
                count += (right - left);
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
}