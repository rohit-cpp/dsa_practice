
// It will be in Array and Strings only it will not be in the linkd list.
// if in question has subarray or substring then it will be sliding window.

// subarray means continuos
// subsequence means non-continus

// question want us to find -
// maximum,minimum,longest,shortest,sum/count/average,at most k/at least k/
// exactly k.

// this to be looked only when the upper one is compatible. SO if all those
// conditions are satisfied then onyl we will do sliding window.

// ONE MORE THING.
// sliding window has two types.
// fixed and dynamic

// sometimes the size or lenght is given of subarray or substring.
// Then we need to take fixed window

// and if the size or length is not given then we need to take dynamic.

// Step 1. Find out the pattern Sliding window by chcek above requiremnts.
// Step 2. Find out the window is fixed or dynamic.
// Step 3. Find out the information to what to find out in the window.
// Step 4. Fidn out the information for next sliding window also.

// ok so for brute for of this sliding window problems.
// first we take subarrays then we fidn sum fo all the elements in the subarray
// one by one and
// then comapre with the max sum.
// so here time complexity will be number of subarray will be n-k; and we need
// to do soem opeariton liek sum. then we will itrate for all the elemtns inside
// the subarray. so work per subarray is k times. so time compelxty is
// 0(n-k * k) and obsuvly subraay will not be bigger than n right. so 0(nk -
// kk). so drop kk. and TIME COMPELXTIY WILL BE 0(NK);

// optimal solution
// now for the subarray instad of itrating we cna just substract the left-1. and
// add right +1 to the sum. SO the time compexity will be number of subarray
// will be n-k; and work per subarry reduced to only 2 times one is remvoe form
// left. and then addign in the right . SO the TIME COMPEXITY WILL BE 0(N-K * 2)
// WHICH IS 0(N-K) that is 0(N) beacuse n will always grater than k.

// class Solution {

// public int maxSubarraySum(int[] arr, int k) {

// int currentSum = 0;

// for (int i = 0; i < k; i++) {
// currentSum += arr[i];
// }

// int maxSum = currentSum;

// for (int i = 0; i < arr.length - k; i++) {

// currentSum -= arr[i];
// currentSum += arr[i + k];

// if (currentSum > maxSum) {
// maxSum = currentSum;
// }

// }
// return maxSum;
// }
// }

//
// for the varaible size window. First if the condition then accrodign to that
// conditon we move the start and end arr[i]. if the condition staitsfty that is
// if we got sum less than target. then move end++. and if target is big then we
// need to shrink window that is move start++.
// Minimum Size Subarray Sum

// public static int[] findSubarraySum(int[] nums, int targetSum) {
// if (nums == null || nums.length == 0) {
// return new int[] { -1, -1 }; // Return invalid indices if empty
// }

// int start = 0;
// int windowSum = 0;

// for (int end = 0; end < nums.length; end++) {
// windowSum += nums[end];

// // Shrink the window from the left if the sum exceeds the target
// while (windowSum > targetSum && start <= end) {
// windowSum -= nums[start];
// start += 1;
// }

// // If target is found, return the start and end indices
// if (windowSum == targetSum) {
// return new int[] { start, end };
// }
// }

// return new int[] { -1, -1 }; // Return -1s if no matching subarray exists
// }
