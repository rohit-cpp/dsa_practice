// Question will be of array or linked list.
// If the data is sorted or willing to be sorted
// If it is written merge remove duplicate rearrange
// Detect cycle in linked list
// To find pair or triplets or quad
// Also if we are asked the number to find then when can sort and use two
// pointer.
// and if we are asked to find index and the array is sorted then also we can
// use two pointers.
// If there is given to find pairs without using extra space

// Java Code—Two Pointer(Sorted Array)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[] { left, right };
            } else if (sum < target) {
                left++; // need bigger sum
            } else {
                right--; // need smaller sum
            }
        }
        return new int[] {};
    }
}

// // // Java Code— HashMap (Unsorted Array)

// import java.util.HashMap;

// class Solution {
// public int[] twoSum(int[] nums, int target) {
// HashMap<Integer, Integer> map = new HashMap<>();
// for (int i = 0; i < nums.length; i++) {
// int needed = target - nums[i];
// if (map.containsKey(needed)) {
// return new int[] { map.get(needed), i };
// }
// map.put(nums[i], i);
// }
// return new int[] {};
// }
// }
