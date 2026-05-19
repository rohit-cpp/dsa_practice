
# Two Pointers — Complete LeetCode Guide

> Master all 6 patterns of Two Pointers with curated problems from Easy to Hard.

---

## 📌 Patterns Overview

| # | Pattern | Use Case |
|---|---------|----------|
| 1 | Opposite Ends | Sorted array, pairs/triplets, palindromes |
| 2 | Slow & Fast (Same Direction) | In-place array modification |
| 3 | Floyd's Cycle | Linked list cycle, midpoint |
| 4 | Three Pointers | Partitioning, merging |
| 5 | Sliding Window | Subarray/substring problems |
| 6 | Two Pointers on Two Arrays | Merging, intersection, intervals |

---

## 1. Opposite Ends

> Left pointer starts at beginning, right pointer at end. They move toward each other.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | Easy |
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | Easy |
| 167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | Medium |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Medium |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Medium |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Hard |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 977 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | Easy |
| 680 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | Medium |
| 16 | [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | Medium |
| 18 | [4Sum](https://leetcode.com/problems/4sum/) | Medium |
| 259 | [3Sum Smaller](https://leetcode.com/problems/3sum-smaller/) | Medium |

---

## 2. Slow & Fast — Same Direction

> Both pointers move forward but at different speeds or under different conditions.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | Easy |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | Easy |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | Easy |
| 80 | [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | Medium |
| 443 | [String Compression](https://leetcode.com/problems/string-compression/) | Medium |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | Easy |
| 845 | [Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/) | Medium |
| 481 | [Magical String](https://leetcode.com/problems/magical-string/) | Medium |

---

## 3. Floyd's Cycle — Linked List

> Slow pointer moves 1 step, fast pointer moves 2 steps. Used to detect cycles and find midpoints.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | Easy |
| 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Easy |
| 234 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | Easy |
| 202 | [Happy Number](https://leetcode.com/problems/happy-number/) | Easy |
| 142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | Medium |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | Medium |
| 287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | Medium |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 457 | [Circular Array Loop](https://leetcode.com/problems/circular-array-loop/) | Medium |

> ⚠️ Hard problems for this pattern are rare — the pattern gets combined with other techniques at that level.

---

## 4. Three Pointers

> Extension of two pointers with one extra pointer. Used for partitioning and multi-condition problems.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | Easy |
| 905 | [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/) | Easy |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Medium |
| 915 | [Partition Array into Disjoint Intervals](https://leetcode.com/problems/partition-array-into-disjoint-intervals/) | Medium |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 2161 | [Partition Array According to Given Pivot](https://leetcode.com/problems/partition-array-according-to-given-pivot/) | Medium |
| 360 | [Sort Transformed Array](https://leetcode.com/problems/sort-transformed-array/) | Medium |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | Hard |

---

## 5. Sliding Window

> Two pointers define a window (left & right). Window expands and shrinks based on a condition.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | Easy |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Medium |
| 567 | [Permutation in String](https://leetcode.com/problems/permutation-in-string/) | Medium |
| 424 | [Longest Repeating Character Replacement](https://leetcode.com/problems/longest-repeating-character-replacement/) | Medium |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Hard |
| 239 | [Sliding Window Maximum](https://leetcode.com/problems/sliding-window-maximum/) | Hard |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 1456 | [Maximum Number of Vowels in a Substring of Given Length](https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/) | Easy |
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | Medium |
| 1004 | [Max Consecutive Ones III](https://leetcode.com/problems/max-consecutive-ones-iii/) | Medium |
| 992 | [Subarrays with K Different Integers](https://leetcode.com/problems/subarrays-with-k-different-integers/) | Hard |

---

## 6. Two Pointers on Two Arrays

> One pointer per array, both move forward independently. Used for merging, intersection, and interval problems.

### 🟢 Learn

| # | Problem | Difficulty |
|---|---------|------------|
| 349 | [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | Easy |
| 350 | [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | Easy |
| 1768 | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/) | Easy |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | Easy |
| 986 | [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/) | Medium |
| 1229 | [Meeting Scheduler](https://leetcode.com/problems/meeting-scheduler/) | Medium |

### 🔵 Practice

| # | Problem | Difficulty |
|---|---------|------------|
| 923 | [3Sum With Multiplicity](https://leetcode.com/problems/3sum-with-multiplicity/) | Medium |
| 632 | [Smallest Range Covering Elements from K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/) | Hard |

---

## ⭐ Must-Do Problems (Most Asked in Interviews)

| # | Problem | Pattern | Difficulty |
|---|---------|---------|------------|
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | Opposite Ends | Medium |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | Opposite Ends | Medium |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | Opposite Ends | Hard |
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | Sliding Window | Medium |
| 76 | [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/) | Sliding Window | Hard |
| 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | Floyd's Cycle | Easy |
| 142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | Floyd's Cycle | Medium |
| 287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | Floyd's Cycle | Medium |

---

## 📈 Recommended Order

```
Easy Opposite Ends → Easy Slow & Fast → Easy Floyd's Cycle
        ↓
Medium Opposite Ends (167 → 15 → 11) → Medium Sliding Window (3 → 567 → 424)
        ↓
Medium Floyd's Cycle (142 → 19 → 287) → Medium Two Arrays
        ↓
Hard (42 → 76 → 239 → 992 → 4 → 632)
```

---

## 💡 Tips

- The pattern clicks after **15–20 problems** — it will feel hard before that, that's normal
- Always try to solve yourself first before checking solutions
- Revisit each problem after **3–4 days** without looking at your previous solution
- For every problem, ask yourself: **why does two pointers work here?**
- **~60 problems** is more than enough to master this pattern completely

---

*Total Problems: ~55 | Patterns: 6 | Difficulty: Easy → Hard*
