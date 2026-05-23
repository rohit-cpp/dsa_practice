public static double maxSubarrayProductSizeK(int[] nums, int k) {
    if (nums == null || nums.length < k || k <= 0) {
        throw new IllegalArgumentException("Invalid input or window size");
    }

    double currentProduct = 1;
    for (int i = 0; i < k; i++) {
        currentProduct *= nums[i];
    }
    double maxProduct = currentProduct;

    // The Python loop range(0, len(nums) - k) shifts the window step-by-step
    for (int i = 0; i < nums.length - k; i++) {
        currentProduct /= nums[i];
        currentProduct *= nums[i + k];

        if (currentProduct > maxProduct) {
            maxProduct = currentProduct;
        }
    }

    return maxProduct;
}
