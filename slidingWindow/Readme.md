# Sliding Window — Complete LeetCode & GFG Guide

> Master all 6 sub-patterns of Sliding Window from Easy to Hard.
> Problems marked with `[GFG]` are from GeeksForGeeks.

---

## 📌 Patterns Overview

| # | Pattern | Use Case |
|---|---------|----------|
| 1 | Fixed Size Window | Window size k is given |
| 2 | Variable Size Window | Find longest/shortest window meeting condition |
| 3 | Frequency / Count Window | Anagram, permutation, character count |
| 4 | At Most K Distinct | Window with at most K unique elements |
| 5 | Flip / Replacement Window | Replace elements to maximize window |
| 6 | Monotonic Deque Window | Max/min inside window efficiently |

---

## 1. Fixed Size Window

> Window size `k` is fixed. Slide it across and compute something each step.

### 📦 Sub-pattern 1.1 — Sum / Average in Fixed Window

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | LC | Easy |
| — | [Sum of all Subarrays of Size K](https://www.geeksforgeeks.org/problems/sum-of-all-subarrays-of-size-k/1) | GFG | Easy |
| 1343 | [Number of Sub-arrays of Size K and Average ≥ Threshold](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/) | LC | Medium |
| — | [Max Sum Subarray of Size K](https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1) | GFG | Medium |
| 644 | [Maximum Average Subarray II](https://leetcode.com/problems/maximum-average-subarray-ii/) | LC | Hard |

---

### 📦 Sub-pattern 1.2 — Count / Find in Fixed Window

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 1876 | [Substrings of Size Three with Distinct Characters](https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/) | LC | Easy |
| 1456 | [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | LC | Medium |
| 2461 | [Maximum Sum of Distinct Subarrays With Length K](https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/) | LC | Medium |
| 2090 | [K Radius Subarray Averages](https://leetcode.com/problems/k-radius-subarray-averages/) | LC | Medium |
| — | [Count Distinct Elements in Every Window](https://www.geeksforgeeks.org/problems/count-distinct-elements-in-every-window/1) | GFG | Medium |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | LC | Hard |
| — | [Minimum in Every Window of Size K](https://www.geeksforgeeks.org/problems/minimum-in-every-window-of-size-k/1) | GFG | Hard |

---

## 2. Variable Size Window

> Window grows and shrinks based on a condition. Find longest or shortest valid window.

### 📦 Sub-pattern 2.1 — Longest Window

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 674 | [Longest Continuous Increasing Subsequence](https://leetcode.com/problems/longest-continuous-increasing-subsequence/) | LC | Easy |
| — | [Longest Sub-Array with Sum K](https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1) | GFG | Easy |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | LC | Medium |
| 1695 | [Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/) | LC | Medium |
| 1838 | [Frequency of the Most Frequent Element](https://leetcode.com/problems/frequency-of-the-most-frequent-element/) | LC | Medium |
| — | [Longest K Unique Characters Substring](https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1) | GFG | Medium |
| 727 | [Minimum Window Subsequence](https://leetcode.com/problems/minimum-window-subsequence/) | LC | Hard |

---

### 📦 Sub-pattern 2.2 — Shortest / Minimum Window

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Smallest window containing 0, 1 and 2](https://www.geeksforgeeks.org/problems/smallest-window-containing-0-1-and-2/1) | GFG | Easy |
| 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | LC | Medium |
| 1493 | [Longest Subarray of 1s After Deleting One Element](https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/) | LC | Medium |
| — | [Smallest window in a String containing all characters of another String](https://www.geeksforgeeks.org/problems/smallest-window-in-a-string-containing-all-the-characters-of-another-string-1587115621/1) | GFG | Medium |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | LC | Hard |
| 862 | [Shortest Subarray with Sum at Least K](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/) | LC | Hard |

---

## 3. Frequency / Count Window

> Use a hashmap or frequency array to track counts inside window. Used for anagram and permutation problems.

### 📦 Sub-pattern 3.1 — Anagram / Permutation in Window

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Anagram of a Pattern in String](https://www.geeksforgeeks.org/problems/anagram-of-a-pattern-in-a-string/1) | GFG | Easy |
| 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | LC | Medium |
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | LC | Medium |
| — | [Count Occurences of Anagrams](https://www.geeksforgeeks.org/problems/count-occurences-of-anagrams5839/1) | GFG | Medium |
| 30 | [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/) | LC | Hard |

---

### 📦 Sub-pattern 3.2 — At Least K Repeating / Frequency Condition

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Count Substrings with K Distinct Characters](https://www.geeksforgeeks.org/problems/count-substrings-with-k-distinct-characters/1) | GFG | Easy |
| 395 | [Longest Substring with At Least K Repeating Characters](https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/) | LC | Medium |
| 1100 | [Find K-Length Substrings With No Repeated Characters](https://leetcode.com/problems/find-k-length-substrings-with-no-repeated-characters/) | LC | Medium |
| 632 | [Smallest Range Covering Elements from K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/) | LC | Hard |

---

## 4. At Most K Distinct

> Window can have at most K unique elements.

### 📦 Sub-pattern 4.1 — At Most K Distinct Characters

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Longest Substring with at most 2 Distinct Characters](https://www.geeksforgeeks.org/problems/longest-substring-with-at-most-2-distinct-characters/1) | GFG | Easy |
| 159 | [Longest Substring with At Most Two Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-two-distinct-characters/) | LC | Medium |
| 340 | [Longest Substring with At Most K Distinct Characters](https://leetcode.com/problems/longest-substring-with-at-most-k-distinct-characters/) | LC | Medium |
| 904 | [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/) | LC | Medium |
| 992 | [Subarrays with K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers/) | LC | Hard |

---

### 📦 Sub-pattern 4.2 — Exactly K / Count Subarrays

> 💡 Key Trick: **Exactly K = At Most K − At Most K-1**

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Count Subarrays with Given Sum](https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1) | GFG | Easy |
| 1248 | [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/) | LC | Medium |
| — | [Number of Subarrays with Exactly K Distinct](https://www.geeksforgeeks.org/problems/number-of-subarrays-with-exactly-k-distinct-integers/1) | GFG | Medium |
| 1358 | [Number of Substrings Containing All Three Characters](https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/) | LC | Medium |
| 2962 | [Count Subarrays Where Max Element Appears at Least K Times](https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/) | LC | Hard |

---

## 5. Flip / Replacement Window

> You are allowed to flip or replace at most K elements. Maximize the window size.

### 📦 Sub-pattern 5.1 — Flip Zeros / Binary Array

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Maximum Consecutive Ones](https://www.geeksforgeeks.org/problems/maximum-consecutive-ones3751/1) | GFG | Easy |
| 487 | [Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/) | LC | Medium |
| 1004 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) | LC | Medium |
| 2024 | [Maximize the Confusion of an Exam](https://leetcode.com/problems/maximize-the-confusion-of-an-exam/) | LC | Medium |
| — | [Minimum Swaps to Group All 1s Together](https://www.geeksforgeeks.org/problems/minimum-swaps-to-group-all-1s-together/1) | GFG | Medium |
| 1438 | [Longest Continuous Subarray With Absolute Diff ≤ Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | LC | Hard |

---

### 📦 Sub-pattern 5.2 — Replace Characters / Elements

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 1208 | [Get Equal Substrings Within Budget](https://leetcode.com/problems/get-equal-substrings-within-budget/) | LC | Medium |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | LC | Medium |
| — | [Minimum Number of Replacements to make String Balanced](https://www.geeksforgeeks.org/problems/minimum-number-of-deletions-and-insertions/1) | GFG | Medium |
| 2401 | [Longest Nice Subarray](https://leetcode.com/problems/longest-nice-subarray/) | LC | Medium |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | LC | Hard |

---

## 6. Monotonic Deque Window

> Use a deque to track max or min inside window in O(1). Hardest pattern.

### 📦 Sub-pattern 6.1 — Maximum / Minimum in Window

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [First Negative in Every Window of Size K](https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1) | GFG | Easy |
| — | [Minimum in Every Window of Size K](https://www.geeksforgeeks.org/problems/minimum-in-every-window-of-size-k/1) | GFG | Medium |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | LC | Hard |
| 1438 | [Longest Continuous Subarray With Absolute Diff ≤ Limit](https://leetcode.com/problems/longest-continuous-subarray-with-absolute-diff-less-than-or-equal-to-limit/) | LC | Hard |
| — | [Maximum of All Subarrays of Size K](https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1) | GFG | Hard |

---

### 📦 Sub-pattern 6.2 — Deque for Optimization

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 1696 | [Jump Game VI](https://leetcode.com/problems/jump-game-vi/) | LC | Medium |
| 862 | [Shortest Subarray with Sum at Least K](https://leetcode.com/problems/shortest-subarray-with-sum-at-least-k/) | LC | Hard |
| 2398 | [Maximum Number of Robots Within Budget](https://leetcode.com/problems/maximum-number-of-robots-within-budget/) | LC | Hard |
| — | [Sum of Minimum and Maximum Elements of All Subarrays of Size K](https://www.geeksforgeeks.org/problems/sum-of-minimum-and-maximum-elements-of-all-subarrays-of-size-k/1) | GFG | Hard |

---

## ⭐ Must-Do Problems (Most Asked in Interviews)

| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | Fixed Size | Easy |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Variable Size | Medium |
| 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | Variable Size | Medium |
| 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Frequency | Medium |
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Frequency | Medium |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Flip | Medium |
| 1004 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) | Flip | Medium |
| 904 | [Fruit Into Baskets](https://leetcode.com/problems/fruit-into-baskets/) | At Most K | Medium |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Variable Size | Hard |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Deque | Hard |
| 992 | [Subarrays with K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers/) | At Most K | Hard |

---

## 📈 Recommended Order

```
Fixed Size Easy (643 → 1876) → Fixed Size Medium (1456 → 1343)
        ↓
Variable Longest (674 → 3 → 1695) → Variable Shortest (209 → 1493)
        ↓
Frequency Anagram (567 → 438) → Frequency Repeating (395)
        ↓
At Most K (159 → 340 → 904) → Exactly K trick (1248 → 992)
        ↓
Flip Zeros (487 → 1004 → 2024) → Flip Characters (1208 → 424)
        ↓
Deque Easy (GFG First Negative) → Deque Hard (239 → 862 → 1438)
```

---

## 💡 Tips

- **Fixed window** is always the easiest — start here
- **Variable window** is the most common in interviews — master this next
- **Frequency window** = variable window + hashmap — very frequently asked
- **At Most K trick** — "exactly K = at most K minus at most K-1" — remember this always
- **Monotonic Deque** is the hardest — only needed for top companies like Google, Meta
- Sliding window always runs in **O(n)** — if your solution is O(n²) you are using brute force

---

*Total Problems: ~65 | Patterns: 6 | Sub-patterns: 12 | Sources: LeetCode + GFG*
