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

public static long maxSubarrayProductSizeK(int[] nums, int k) {
    if (nums == null || nums.length < k || k <= 0) {
        throw new IllegalArgumentException("Invalid input array or window size.");
    }

    long maxProduct = Long.MIN_VALUE;

    // Use a two-pointer sliding window to recalculate when zero is hit
    int zeroCount = 0;
    long currentProduct = 1;

    for (int i = 0; i < nums.length; i++) {
        // Phase 1: Add the incoming element to the window
        if (nums[i] == 0) {
            zeroCount++;
        } else {
            currentProduct *= nums[i];
        }

        // Phase 2: Remove the outgoing element once the window size exceeds k
        if (i >= k) {
            int outgoing = nums[i - k];
            if (outgoing == 0) {
                zeroCount--;
            } else {
                currentProduct /= outgoing;
            }
        }

        // Phase 3: Update maxProduct once we have a valid window of size k
        if (i >= k - 1) {
            if (zeroCount > 0) {
                maxProduct = Math.max(maxProduct, 0);
            } else {
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }
    }

    return maxProduct;
}
