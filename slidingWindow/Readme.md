# Sliding Window — Complete LeetCode Guide

> Master all sliding window patterns from Easy to Hard.

---

## 📌 Patterns Overview

| # | Pattern | Use Case |
|---|---------|----------|
| 1 | Fixed Size Window | Window size is given in problem |
| 2 | Variable Size Window | Find longest/shortest window meeting condition |
| 3 | Frequency / Count Window | Anagram, permutation, character count |
| 4 | At Most K Distinct | Window with at most K unique elements |
| 5 | Flip / Replacement Window | Replace elements to maximize window |
| 6 | Monotonic Deque Window | Max/min in window efficiently |

---

## 1. Fixed Size Window

> Window size `k` is given. Slide it across and compute something each step.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | Easy |
| 1343 | [Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/) | Medium |
| 1456 | [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | Medium |
| 2461 | [Maximum Sum of Distinct Subarrays With Length K](https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/) | Medium |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 1876 | [Substrings of Size Three with Distinct Characters](https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/) | Easy |
| 2090 | [K Radius Subarray Averages](https://leetcode.com/problems/k-radius-subarray-averages/) | Medium |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard |

---

## 2. Variable Size Window

> Window grows and shrinks based on a condition. Find longest or shortest valid window.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Medium |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium |
| 1493 | [Longest Subarray of 1s After Deleting One Element](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/) | Medium |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 674 | [Longest Continuous Increasing Subsequence](https://leetcode.com/problems/longest-continuous-increasing-subsequence/) | Easy |
| 1695 | [Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/) | Medium |
| 1838 | [Frequency of the Most Frequent Element](https://leetcode.com/problems/frequency-of-the-most-frequent-element/) | Medium |
| 727 | [Minimum Window Subsequence](https://leetcode.com/problems/minimum-window-subsequence/) | Hard |

---

## 3. Frequency / Count Window

> Use a hashmap or frequency array to track character/element counts inside window. Used for anagram and permutation problems.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Medium |
| 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Medium |
| 395 | [Longest Substring with At Least K Repeating Characters](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/) | Medium |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 1100 | [Find K-Length Substrings With No Repeated Characters](https://leetcode.com/problems/find-k-length-substrings-with-no-repeated-characters/) | Medium |
| 30 | [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | Hard |
| 632 | [Smallest Range Covering Elements from K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/) | Hard |

---

## 4. At Most K Distinct

> Window can have at most K unique elements. Classic pattern using hashmap to track distinct count.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 340 | [Longest Substring with At Most K Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/) | Medium |
| 904 | [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/) | Medium |
| 992 | [Subarrays with K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers/) | Hard |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 159 | [Longest Substring with At Most Two Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/) | Medium |
| 1248 | [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/) | Medium |

> 💡 Trick: "exactly K" problems = "at most K" minus "at most K-1"

---

## 5. Flip / Replacement Window

> You are allowed to flip or replace at most K elements. Maximize the window size.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 1004 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) | Medium |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium |
| 1208 | [Get Equal Substrings Within Budget](https://leetcode.com/problems/get-equal-substrings-within-budget/) | Medium |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 487 | [Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/) | Medium |
| 2024 | [Maximize the Confusion of an Exam](https://leetcode.com/problems/maximize-the-confusion-of-an-exam/) | Medium |
| 1438 | [Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | Hard |

---

## 6. Monotonic Deque Window

> Use a deque to track max or min inside the window in O(1). Hardest pattern.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard |
| 1438 | [Longest Continuous Subarray With Absolute Diff Less Than or Equal to Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | Hard |
| 862 | [Shortest Subarray with Sum at Least K](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/) | Hard |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 1696 | [Jump Game VI](https://leetcode.com/problems/jump-game-vi/) | Medium |
| 2398 | [Maximum Number of Robots Within Budget](https://leetcode.com/problems/maximum-number-of-robots-within-budget/) | Hard |

---

## ⭐ Must-Do Problems (Most Asked in Interviews)

| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Variable | Medium |
| 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Variable | Medium |
| 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Frequency | Medium |
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Frequency | Medium |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Flip | Medium |
| 1004 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) | Flip | Medium |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Variable | Hard |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Deque | Hard |
| 992 | [Subarrays with K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers/) | At Most K | Hard |

---

## 📈 Recommended Order

```
Fixed Size (643 → 1456) → Variable Size (209 → 3)
        ↓
Frequency (438 → 567) → Flip (1004 → 424)
        ↓
At Most K (340 → 904 → 992)
        ↓
Hard Variable (76) → Monotonic Deque (239 → 862)
```

---

## 💡 Tips

- **Fixed window** is always the easiest — start here
- **Variable window** is the most common in interviews — master this first
- **Frequency window** = variable window + hashmap — very frequently asked
- **At Most K trick** is important — "exactly K = at most K minus at most K-1"
- **Monotonic Deque** is the hardest — only needed for top companies
- Sliding window always runs in **O(n)** — if your solution is O(n²), you're using brute force

---

*Total Problems: ~40 | Patterns: 6 | Difficulty: Easy → Hard*
