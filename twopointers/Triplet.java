// question in array find triplets where sum=0;and it shdould be unique others numbers should not repeat.

// by looking into question and our flowcahrt. 
//we can see that we need to find more then one. and it is array.  

// Brute force
// So we will run three nested loops to find the sum that is equal to zero.//
// so the time complexity becomes o(n)3. 

// Optimised solution for this. 
// we have to find sum of three numbers whose sum is 0;
//means x+y+z=0; means a[i]+a[i]+a[i] = 0; so keep two a[i] as x and y. so now the equation becomes a[i] + x + y = 0; or x+y = -a[i]
// ok now for the unique elements in the array.(Two sum)
// take two pointers left and right. left[i] right[n-1]
// if sum of these both left[i] and right[n-1] = target
// then left[i]++ and right[i]++
//while(a[left]==a[left-1])
//left++
//while(a[right]==a[right+1])
//right--
//else if (sum<target)
//left++
//else if (sum>target)
//right--
import java.util.*;

class Triplet {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Step 1: Sort the array
        Arrays.sort(nums);

        int n = nums.length;

        // Step 2: Traverse the array
        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // declare two pointers
            int left = i + 1;
            int right = n - 1;

            // Step 3: Two Pointer Approach
            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                // Found triplet
                if (sum == 0) {

                    result.add(Arrays.asList(
                            nums[i],
                            nums[left],
                            nums[right]));

                    // Skip duplicates for left pointer
                    while (left < right &&
                            nums[left] == nums[left + 1]) {
                        left++;
                    }

                    // Skip duplicates for right pointer
                    while (left < right &&
                            nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right--;
                }

                // Need smaller sum
                else if (sum > 0) {
                    right--;
                }

                // Need bigger sum
                else {
                    left++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Triplet solution = new Triplet();

        // Test case 1
        int[] nums1 = { -1, 0, 1, 2, -1, -4 };
        System.out.println("Test case 1: " + Arrays.toString(nums1));
        System.out.println("Result: " + solution.threeSum(nums1));

        // Test case 2
        int[] nums2 = { 0, 0, 0 };
        System.out.println("\nTest case 2: " + Arrays.toString(nums2));
        System.out.println("Result: " + solution.threeSum(nums2));

        // Test case 3
        int[] nums3 = { -2, 0, 1, 1, 2 };
        System.out.println("\nTest case 3: " + Arrays.toString(nums3));
        System.out.println("Result: " + solution.threeSum(nums3));
    }
}
