# Two Pointers — Complete LeetCode & GFG Guide

> Master all 6 patterns of Two Pointers with every sub-pattern covered from Easy to Hard.
> Problems marked with `[GFG]` are from GeeksForGeeks.

---

## 📌 Patterns Overview

| # | Pattern | Use Case |
|---|---------|----------|
| 1 | Opposite Ends | Sorted array, pairs/triplets, palindromes, partitioning |
| 2 | Slow & Fast (Same Direction) | In-place modification, rearranging, partitioning |
| 3 | Floyd's Cycle | Linked list cycle, midpoint, intersection |
| 4 | Three Pointers | Dutch flag, three-way sort, partition into 3 parts |
| 5 | Two Pointers on Two Arrays | Merging, intersection, intervals, sequences |

> 📁 Sliding Window is covered separately in `sliding-window.md`

---

## 1. Opposite Ends

> Left pointer starts at beginning, right pointer at end. They move toward each other.

---

### 📦 Sub-pattern 1.1 — Reverse

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 344 | [Reverse String](https://leetcode.com/problems/reverse-string/) | LC | Easy |
| 541 | [Reverse String II](https://leetcode.com/problems/reverse-string-ii/) | LC | Easy |
| 345 | [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | LC | Medium |
| — | [Reverse a String Word by Word](https://www.geeksforgeeks.org/problems/reverse-words-in-a-given-string1330/1) | GFG | Medium |
| 186 | [Reverse Words in a String II](https://leetcode.com/problems/reverse-words-in-a-string-ii/) | LC | Medium |

---

### 📦 Sub-pattern 1.2 — Palindrome

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 125 | [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/) | LC | Easy |
| — | [Check if String is Palindrome](https://www.geeksforgeeks.org/problems/palindrome-string0817/1) | GFG | Easy |
| 680 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | LC | Medium |
| — | [Palindrome by swapping](https://www.geeksforgeeks.org/problems/palindrome-by-swapping-only-once/1) | GFG | Medium |
| 1216 | [Valid Palindrome III](https://leetcode.com/problems/valid-palindrome-iii/) | LC | Hard |

---

### 📦 Sub-pattern 1.3 — Pair / Two Sum in Sorted Array

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 977 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | LC | Easy |
| 167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | LC | Medium |
| — | [Count Pairs with Given Sum](https://www.geeksforgeeks.org/problems/count-pairs-with-given-sum5022/1) | GFG | Medium |
| — | [Pair with given sum in a Sorted Array](https://www.geeksforgeeks.org/problems/pair-with-given-sum-in-a-sorted-array4940/1) | GFG | Medium |
| — | [Pair with given difference](https://www.geeksforgeeks.org/problems/pair-with-given-difference1559/1) | GFG | Medium |

---

### 📦 Sub-pattern 1.4 — Triplets / kSum

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | LC | Medium |
| 16 | [3Sum Closest](https://leetcode.com/problems/3sum-closest/) | LC | Medium |
| 259 | [3Sum Smaller](https://leetcode.com/problems/3sum-smaller/) | LC | Medium |
| 18 | [4Sum](https://leetcode.com/problems/4sum/) | LC | Medium |
| — | [Count Triplets with Sum Smaller Than X](https://www.geeksforgeeks.org/problems/count-triplets-with-sum-smaller-than-x5549/1) | GFG | Medium |
| — | [Triplet Sum in Array](https://www.geeksforgeeks.org/problems/triplet-sum-in-array-1587115621/1) | GFG | Medium |
| 923 | [3Sum With Multiplicity](https://leetcode.com/problems/3sum-with-multiplicity/) | LC | Hard |

---

### 📦 Sub-pattern 1.5 — Container / Water / Area

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Max Water Between Two Buildings](https://www.geeksforgeeks.org/problems/max-water-between-two-buildings/1) | GFG | Easy |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | LC | Medium |
| 42 | [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/) | LC | Hard |
| — | [Trapping Rain Water](https://www.geeksforgeeks.org/problems/trapping-rain-water-1587115621/1) | GFG | Hard |

---

### 📦 Sub-pattern 1.6 — Partition Around a Value

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Segregate Even and Odd](https://www.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4629/1) | GFG | Easy |
| — | [Rearrange Positive and Negative](https://www.geeksforgeeks.org/problems/rearrange-array-alternately-1587115620/1) | GFG | Medium |
| 360 | [Sort Transformed Array](https://leetcode.com/problems/sort-transformed-array/) | LC | Medium |
| — | [Three Way Partitioning](https://www.geeksforgeeks.org/problems/three-way-partitioning/1) | GFG | Medium |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | LC | Hard |

---

## 2. Slow & Fast — Same Direction

> Both pointers move forward but at different speeds or under different conditions.

---

### 📦 Sub-pattern 2.1 — Remove / Delete Elements

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | LC | Easy |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | LC | Easy |
| — | [Remove Duplicates from Unsorted Array](https://www.geeksforgeeks.org/problems/remove-duplicates-from-an-unsorted-linked-list/1) | GFG | Easy |
| 80 | [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/) | LC | Medium |
| 82 | [Remove Duplicates from Sorted List II](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/) | LC | Medium |

---

### 📦 Sub-pattern 2.2 — Move / Rearrange Elements

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | LC | Easy |
| — | [Move All Negative Elements to End](https://www.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1) | GFG | Easy |
| — | [Segregate 0s and 1s](https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5237/1) | GFG | Medium |
| — | [Rearrange Array Elements by Sign](https://www.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1) | GFG | Medium |
| 905 | [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/) | LC | Easy |
| 922 | [Sort Array By Parity II](https://leetcode.com/problems/sort-array-by-parity-ii/) | LC | Easy |

---

### 📦 Sub-pattern 2.3 — Compress / Encode

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 443 | [String Compression](https://leetcode.com/problems/string-compression/) | LC | Medium |
| — | [Run Length Encoding](https://www.geeksforgeeks.org/problems/run-length-encoding/1) | GFG | Medium |
| — | [Consecutive elements](https://www.geeksforgeeks.org/problems/consecutive-elements2306/1) | GFG | Medium |

---

### 📦 Sub-pattern 2.4 — Subsequence Check

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | LC | Easy |
| — | [Check for Subsequence](https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1) | GFG | Easy |
| 524 | [Longest Word in Dictionary through Deleting](https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/) | LC | Medium |
| 481 | [Magical String](https://leetcode.com/problems/magical-string/) | LC | Medium |
| 845 | [Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/) | LC | Medium |

---

## 3. Floyd's Cycle — Linked List

> Slow pointer moves 1 step, fast pointer moves 2 steps.

---

### 📦 Sub-pattern 3.1 — Find Middle

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | LC | Easy |
| — | [Find Middle of Linked List](https://www.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1) | GFG | Easy |
| 234 | [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/) | LC | Easy |
| — | [Nth Node from End](https://www.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1) | GFG | Medium |
| 19 | [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/) | LC | Medium |

---

### 📦 Sub-pattern 3.2 — Cycle Detection

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 141 | [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/) | LC | Easy |
| 202 | [Happy Number](https://leetcode.com/problems/happy-number/) | LC | Easy |
| — | [Detect Loop in Linked List](https://www.geeksforgeeks.org/problems/detect-loop-in-linked-list/1) | GFG | Easy |
| 142 | [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii/) | LC | Medium |
| — | [Find the First Node of Loop](https://www.geeksforgeeks.org/problems/find-the-first-node-of-loop-in-linked-list--170645/1) | GFG | Medium |
| — | [Length of Loop in Linked List](https://www.geeksforgeeks.org/problems/find-length-of-loop/1) | GFG | Medium |
| — | [Remove Loop in Linked List](https://www.geeksforgeeks.org/problems/remove-loop-in-linked-list/1) | GFG | Medium |
| 457 | [Circular Array Loop](https://leetcode.com/problems/circular-array-loop/) | LC | Medium |
| 287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | LC | Medium |

---

### 📦 Sub-pattern 3.3 — Intersection of Two Linked Lists

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Intersection Point in Y Shaped Linked List](https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1) | GFG | Easy |
| 160 | [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists/) | LC | Easy |
| — | [Union and Intersection of Two Linked Lists](https://www.geeksforgeeks.org/problems/union-and-intersection-of-two-linked-lists/1) | GFG | Medium |
| — | [Common Elements in Two Linked Lists](https://www.geeksforgeeks.org/problems/common-elements-in-two-linked-list/1) | GFG | Medium |

---

## 4. Three Pointers

> Extension of two pointers with one extra pointer.

---

### 📦 Sub-pattern 4.1 — Dutch National Flag / Three-way Sort

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Segregate 0s 1s and 2s](https://www.geeksforgeeks.org/problems/segregate-0s-1s-and-2s-by-swapping/1) | GFG | Easy |
| 75 | [Sort Colors (Dutch National Flag)](https://leetcode.com/problems/sort-colors/) | LC | Medium |
| — | [Three Way Partitioning](https://www.geeksforgeeks.org/problems/three-way-partitioning/1) | GFG | Medium |
| 2161 | [Partition Array According to Given Pivot](https://leetcode.com/problems/partition-array-according-to-given-pivot/) | LC | Medium |
| — | [Sort an Array of 0s 1s and 2s](https://www.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1) | GFG | Medium |

---

### 📦 Sub-pattern 4.2 — Merge with Three Pointers

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | LC | Easy |
| — | [Merge Two Sorted Arrays Without Extra Space](https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1) | GFG | Medium |
| — | [Merge 3 Sorted Arrays](https://www.geeksforgeeks.org/problems/merge-3-sorted-arrays/1) | GFG | Medium |
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | LC | Hard |

---

### 📦 Sub-pattern 4.3 — Partition into Parts

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 905 | [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/) | LC | Easy |
| 915 | [Partition Array into Disjoint Intervals](https://leetcode.com/problems/partition-array-into-disjoint-intervals/) | LC | Medium |
| — | [Rearrange Array in Max Min Form](https://www.geeksforgeeks.org/problems/rearrange-array-in-max-min-form-1/1) | GFG | Medium |
| — | [Wave Array](https://www.geeksforgeeks.org/problems/wave-array-1587115621/1) | GFG | Easy |
| — | [Partition Equal Subset](https://www.geeksforgeeks.org/problems/subset-sum-problem2014/1) | GFG | Hard |

---

## 5. Two Pointers on Two Arrays

> One pointer per array. Both move forward independently.

---

### 📦 Sub-pattern 6.1 — Merge Two Arrays / Lists

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | LC | Easy |
| 21 | [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/) | LC | Easy |
| 1768 | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/) | LC | Easy |
| — | [Merge Two Sorted Arrays Without Extra Space](https://www.geeksforgeeks.org/problems/merge-two-sorted-arrays-1587115620/1) | GFG | Medium |
| — | [Merge K Sorted Arrays](https://www.geeksforgeeks.org/problems/merge-k-sorted-arrays/1) | GFG | Hard |

---

### 📦 Sub-pattern 6.2 — Intersection / Common Elements

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 349 | [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | LC | Easy |
| 350 | [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | LC | Easy |
| — | [Common Elements in Two Arrays](https://www.geeksforgeeks.org/problems/common-elements1132/1) | GFG | Easy |
| — | [Union of Two Sorted Arrays](https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1) | GFG | Medium |
| 632 | [Smallest Range Covering Elements from K Lists](https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/) | LC | Hard |

---

### 📦 Sub-pattern 6.3 — Interval Problems

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| — | [Check if Two Intervals Overlap](https://www.geeksforgeeks.org/problems/overlapping-intervals/1) | GFG | Easy |
| 986 | [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/) | LC | Medium |
| 1229 | [Meeting Scheduler](https://leetcode.com/problems/meeting-scheduler/) | LC | Medium |
| — | [Merge Overlapping Intervals](https://www.geeksforgeeks.org/problems/overlapping-intervals/1) | GFG | Medium |
| 57 | [Insert Interval](https://leetcode.com/problems/insert-interval/) | LC | Medium |
| 56 | [Merge Intervals](https://leetcode.com/problems/merge-intervals/) | LC | Medium |

---

### 📦 Sub-pattern 6.4 — Compare Two Sequences / Strings

| # | Problem | Source | Difficulty |
|---|---------|--------|------------|
| 392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | LC | Easy |
| — | [Check for Subsequence](https://www.geeksforgeeks.org/problems/check-for-subsequence4930/1) | GFG | Easy |
| 844 | [Backspace String Compare](https://leetcode.com/problems/backspace-string-compare/) | LC | Easy |
| 925 | [Long Pressed Name](https://leetcode.com/problems/long-pressed-name/) | LC | Easy |
| 1855 | [Maximum Distance Between a Pair of Values](https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/) | LC | Medium |
| — | [Longest Common Subsequence of Two Sorted Arrays](https://www.geeksforgeeks.org/problems/longest-common-subsequence-of-two-sorted-arrays/1) | GFG | Hard |

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
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | Three Pointers | Medium |
| 986 | [Interval List Intersections](https://leetcode.com/problems/interval-list-intersections/) | Two Arrays | Medium |

---

## 📈 Recommended Order

```
1. Opposite Ends Easy (344 → 125 → 977)
        ↓
2. Slow & Fast Easy (283 → 26 → 27 → 392)
        ↓
3. Floyd's Cycle Easy (876 → 141 → 234 → 160)
        ↓
4. Opposite Ends Medium (167 → 15 → 16 → 11)
        ↓
5. Slow & Fast Medium (80 → 443 → 845)
        ↓
6. Floyd's Cycle Medium (142 → 19 → 287)
        ↓
7. Three Pointers (88 → 75 → 2161 → 4)
        ↓
8. Two Arrays (349 → 350 → 21 → 986 → 56 → 57)
        ↓
9. Hard (42 → 923 → 632 → 4)
```

---

## 💡 Tips

- The pattern clicks after **15–20 problems** — it will feel hard before that, that's normal
- Always try to solve yourself first before checking solutions
- Revisit each problem after **3–4 days** without looking at your previous solution
- For every problem ask yourself: **why does two pointers work here?**
- **~80 problems** across all sub-patterns = complete mastery

---

*Total Problems: ~75 | Patterns: 5 | Sub-patterns: 15 | Sources: LeetCode + GFG*
