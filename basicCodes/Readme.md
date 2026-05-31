# ☕ Java Coding Interview Questions & Solutions

A comprehensive collection of common Java coding interview questions categorized by topic, with clean solutions and links to practice on LeetCode and GeeksforGeeks.

---
First Step. this are the basic problems. But when you start to do DSA. then Keep this thigns in mind.
1. Do no directy jump on any questions on the leedcode. First understnad the concept or pattern of that questions or watch a tutorial of it then 
chek its code. then try to solve that problem on your own. without looking in the solution.
2. As you solve any question by the above method then try to solve other question on your own of same pattern and of same sub pattern. 
3. Do not watch videos first, of any random questions. First pattern then solution.
4. Try to exaplin out loud that question after solving it.  it you cant explain then you are not able to solve it.
5. Also you will be fully able to understand the problem only if you had dry run it. (best approach). first get the dry run of the sultion form the gemini or anyhitng.  

## 📋 Table of Contents

- [Category 1: Basic Number-Based Questions](#category-1-basic-number-based-questions)
- [Category 2: String Manipulation Questions](#category-2-string-manipulation-questions)
- [Category 3: Array-Based Questions](#category-3-array-based-questions)
- [Category 4: Intermediate & Logical Questions](#category-4-intermediate--logical-questions)
- [Category 5: Advanced & Pattern Questions](#category-5-advanced--pattern-questions)
- [How to Use This Repository](#-how-to-use-this-repository)
- [Study Strategy](#-study-strategy)
- [Contributing](#-contributing)

---
Here is the **combined list of unique questions** from both lists (duplicates removed), organized by topic.

# Numbers & Mathematics

1. Reverse a Number
2. Fibonacci Series
3. GCD (HCF) of Two Numbers
4. LCM of Two Numbers
5. Perfect Number
6. Leap Year
7. Prime Number
8. Armstrong Number
9. Palindrome Number
10. Factorial of a Number
11. Strong Number
12. Count Digits in a Number
13. Sum of Digits
14. Power of a Number (without `pow()`)
15. Prime Factors
16. Binary to Decimal Conversion
17. Decimal to Binary Conversion
18. Octal to Decimal Conversion
19. Hexadecimal to Decimal Conversion
20. Area of a Circle
21. Handshakes Problem
22. Quadrant Selection
23. Square Root Using Binary Search

---

# Strings

24. Reverse a String
25. Palindrome String
26. Anagram Check
27. Length of String Without Built-in Functions
28. Count Vowels and Consonants
29. Remove Vowels
30. Toggle Case
31. ASCII Value of a Character
32. Replace Substring
33. Wildcard Character Matching (`*`, `?`)
34. First Non-Repeating Character
35. Count Occurrences of a Character
36. Remove All Spaces from String
37. Longest Common Prefix
38. String Compression (`aaabbc → a3b2c1`)
39. Check if String Contains Only Digits
40. Reverse Words in a Sentence
41. Count Words in a String
42. Balanced Parentheses
43. Longest Palindromic Substring
44. Replace Spaces with `%20`

---

# Arrays

45. Largest Element in Array
46. Smallest Element in Array
47. Second Largest Element
48. Second Smallest Element
49. Reverse an Array
50. Sort an Array (Bubble Sort)
51. Selection Sort
52. Insertion Sort
53. Merge Sort
54. Sum of Array Elements
55. Frequency of Elements
56. Distinct Elements in Array
57. Move All Zeros to End
58. Find Duplicates in Array
59. Rotate Array by K Positions
60. Kadane’s Algorithm (Maximum Subarray Sum)
61. Two Sum Problem
62. Merge Two Sorted Arrays
63. Find Missing Number (1 to N)
64. Find Pair with Given Sum
65. Check if Array is Sorted
66. Remove Duplicates from Sorted Array
67. Leaders in an Array
68. Equilibrium Index
69. Symmetric Pairs
70. Find Kth Largest/Smallest Element

---

# Searching

71. Linear Search
72. Binary Search
73. Search Element in Rotated Sorted Array
74. First and Last Occurrence of an Element

---

# Special Array / Matrix Problems

75. Sort 0s, 1s and 2s (Dutch National Flag)
76. Count Comparisons in Bubble Sort
77. Matrix Addition
78. Matrix Subtraction
79. Matrix Multiplication
80. Transpose of a Matrix
81. Spiral Traversal of Matrix
82. Median of Sorted Matrix

---

# Linked List

83. Reverse a Linked List
84. Find Middle of Linked List
85. Detect Loop in Linked List
86. Delete Nth Node from End
87. Merge Two Sorted Linked Lists

---

# Stack & Queue

88. Implement Stack Using Array
89. Implement Queue Using Array
90. Implement Stack Using Queues
91. Next Greater Element Using Stack
92. Valid Parentheses Using Stack

---

# Patterns

93. Pyramid Pattern
94. Diamond Pattern
95. Pascal’s Triangle

---

## Recommended Learning Order

If your goal is **TCS, Infosys, Wipro, Cognizant, Capgemini, Accenture, HCL, Tech Mahindra, and product-company interviews**, solve them in this order:

1. Numbers & Mathematics (1–23)
2. Strings (24–44)
3. Arrays (45–70)
4. Searching & Sorting (71–76)
5. Matrix Problems (77–82)
6. Linked List (83–87)
7. Stack & Queue (88–92)
8. Patterns (93–95)

These **95 questions** form a very strong beginner-to-intermediate DSA preparation list and cover most frequently asked coding questions in service-based company assessments and many interview rounds.



## Category 1: Basic Number-Based Questions

### 1. Reverse a Number

Write a program to take an integer and reverse its digits (e.g., 123 → 321).

**Practice Link:** [LeetCode 7: Reverse Integer](https://leetcode.com/problems/reverse-integer/)

```java
public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;           // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            num = num / 10;                 // remove last digit
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 12345;
        int result = reverseNumber(num);
        System.out.println("Original Number: " + num);
        System.out.println("Reversed Number: " + result);
    }
}
```

---

### 2. Fibonacci Series

Find the Fibonacci series up to the nth term.

**Practice Link:** [LeetCode 509: Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)

```java
import java.util.Scanner;

public class FibonacciSeries {
    public static void fibonacci(int n) {
        int first = 0;
        int second = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        fibonacci(n);
    }
}
```

---

### 3. Greatest Common Divisor (GCD)

Calculate the HCF/GCD of two numbers.

**Practice Link:** [GFG: Program to Find GCD](https://www.geeksforgeeks.org/c-program-find-gcd-hcf-two-numbers/)

```java
import java.util.Scanner;

public class GCD {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bigger number");
        int num1 = sc.nextInt();
        System.out.println("Enter the smaller number");
        int num2 = sc.nextInt();
        System.out.println("Both numbers are: " + num1 + " " + num2);
        int result = gcd(num1, num2);
        System.out.println("Result = " + result);
    }
}
```

---

### 4. Perfect Number

Check if a number is equal to the sum of its proper divisors.

**Practice Link:** [LeetCode 507: Perfect Number](https://leetcode.com/problems/perfect-number/)

```java
public class Perfect {
    public static boolean isPerfect(int num) {
        if (num <= 0) return false;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    public static void main(String[] args) {
        int num = 6;
        if (isPerfect(num)) {
            System.out.println(num + " is a perfect number");
        } else {
            System.out.println(num + " is not a perfect number");
        }
    }
}
```

---

### 5. Leap Year

Determine whether a given year is a leap year.

**Practice Link:** [GFG: Check Leap Year](https://www.geeksforgeeks.org/program-to-check-leap-year/)

```java
import java.util.Scanner;

public class LeapYear {
    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        if (sc.hasNextInt()) {
            int year = sc.nextInt();
            if (checkLeapYear(year)) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
        sc.close();
    }
}
```

---

### 6. Prime Number

Check if a number is prime or find primes in a range.

**Practice Link:** [LeetCode 204: Count Primes](https://leetcode.com/problems/count-primes/)

```java
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till which you want to check the prime:");
        int limit = sc.nextInt();
        for (int i = 2; i <= limit; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
```

---

### 7. Armstrong Number

Check if a number is equal to the sum of its own digits raised to the power of the number of digits.

**Practice Link:** [GFG: Armstrong Numbers](https://www.geeksforgeeks.org/program-for-armstrong-numbers/)

```java
public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num = num / 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;
        if (isArmstrong(num)) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
```

---

### 8. Palindrome Number

Check if a number reads the same forwards and backwards.

**Practice Link:** [LeetCode 9: Palindrome Number](https://leetcode.com/problems/palindrome-number/)

```java
public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int original = num;
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse == original;
    }

    public static void main(String[] args) {
        int num = 121;
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
}
```

---

### 9. Factorial of a Number

Calculate the product of all positive integers up to n.

**Practice Link:** [GFG: Factorial of a Number](https://www.geeksforgeeks.org/program-for-factorial-of-a-number/)

```java
public class Fact {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 50;
        System.out.println("Factorial of " + num + " is " + factorial(num));
    }
}
```

---

### 10. Strong Number

Check if the sum of factorials of digits is equal to the number itself.

**Practice Link:** [GFG: Strong Numbers](https://www.geeksforgeeks.org/strong-number/)

```java
public class Strong {
    public static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static boolean strong(int num) {
        int original = num;
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        int num = 145;
        if (strong(num)) {
            System.out.println("The number is Strong");
        } else {
            System.out.println("The number is Not Strong");
        }
    }
}
```

---

## Category 2: String Manipulation Questions

### 11. Anagram Check

Determine if two strings contain the same characters in the same frequency.

**Practice Link:** [LeetCode 242: Valid Anagram](https://leetcode.com/problems/valid-anagram/)

```java
public class Anagram {
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if (isAnagram(str1, str2)) {
            System.out.println("They are anagram");
        } else {
            System.out.println("They are not anagram");
        }
    }
}
```

---

### 12. Palindrome String

Check if a string is a palindrome.

**Practice Link:** [LeetCode 125: Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

```java
public class PalindromeString {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        if (isPalindrome(str)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
```

---

### 13. Replace Substring

Find and replace a specific substring within a larger string.

**Practice Link:** [GFG: Replace a substring of a string](https://www.geeksforgeeks.org/replace-a-character-in-a-string/)

```java
public class ReplaceSubstring {
    public static String replaceWord(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        String text = "I love Java programming";
        String result = replaceWord(text, "Java", "Python");
        System.out.println("Original String: " + text);
        System.out.println("Updated String:  " + result);
    }
}
```

---

### 14. Vowel and Consonant Count

Count the number of vowels and consonants in a string.

**Practice Link:** [GFG: Count Vowels and Consonants](https://www.geeksforgeeks.org/program-count-vowels-consonants-string/)

```java
import java.util.Scanner;

public class VowelConsonant {
    public static void countLetters(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        countLetters(input);
        sc.close();
    }
}
```

---

### 15. Remove Vowels

Create a new string with all vowels removed.

**Practice Link:** [GFG: Remove Vowels from String](https://www.geeksforgeeks.org/remove-vowels-from-a-string/)

```java
import java.util.Scanner;

public class RemoveVowels {
    public static String getOnlyConsonants(String input) {
        input = input.toLowerCase();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String cleanedText = getOnlyConsonants(input);
        System.out.println("Result: " + cleanedText);
        sc.close();
    }
}
```

---

### 16. String Reversal

Reverse a string without using built-in library functions.

**Practice Link:** [LeetCode 344: Reverse String](https://leetcode.com/problems/reverse-string/)

```java
import java.util.Scanner;

public class Reversal {
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to reverse: ");
        String input = sc.nextLine();
        String result = reverseString(input);
        System.out.println("Reversed: " + result);
        sc.close();
    }
}
```

---

### 17. ASCII Value

Find the ASCII value of a specific character.

**Practice Link:** [GFG: Print ASCII Value in Java](https://www.geeksforgeeks.org/program-print-ascii-value-character/)

```java
import java.util.Scanner;

public class AsciiFinder {
    public static int getAsciiValue(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = sc.next().charAt(0);
        int result = getAsciiValue(inputChar);
        System.out.println("The ASCII value of '" + inputChar + "' is: " + result);
        sc.close();
    }
}
```

---

### 18. Toggle Case

Convert uppercase characters to lowercase and vice versa.

**Practice Link:** [GFG: Toggle Case of a String](https://www.geeksforgeeks.org/toggle-case-string/)

```java
import java.util.Scanner;

public class ToggleCase {
    public static String toggle(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                result += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        String flipped = toggle(input);
        System.out.println("Toggled: " + flipped);
        sc.close();
    }
}
```

---

### 19. Length of String

Calculate string length without using `.length()`.

**Practice Link:** [GFG: Find length of string without built-in function](https://www.geeksforgeeks.org/find-length-of-string-without-using-strlen/)

```java
import java.util.Scanner;

public class StringLength {
    public static int findLength(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();
        int len = findLength(input);
        System.out.println("The length is: " + len);
        sc.close();
    }
}
```

---

## Category 3: Array-Based Questions

### 20. Largest / Smallest Element

Find the maximum or minimum value in an array.

**Practice Link:** [GFG: Program to find largest element in an array](https://www.geeksforgeeks.org/c-program-find-largest-element-array/)

```java
import java.util.Scanner;

public class MaxMin {
    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        System.out.println("Largest:  " + max);
        System.out.println("Smallest: " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int size = sc.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        findMaxMin(numbers);
        sc.close();
    }
}
```

---

### 21. Second Smallest / Largest

Find the second-place values in an array.

**Practice Link:** [GFG: Find Second Largest Element](https://www.geeksforgeeks.org/find-second-largest-element-array/)

```java
import java.util.Scanner;

public class SecondBestBoth {
    public static void findSeconds(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array is too small.");
            return;
        }
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            // Second Largest Logic
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
            // Second Smallest Logic
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Second Largest:  " + secondLargest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        findSeconds(nums);
        sc.close();
    }
}
```

---

### 22. Reverse an Array

Reverse the order of elements in an array.

**Practice Link:** [GFG: Reverse an Array](https://www.geeksforgeeks.org/write-a-program-to-reverse-an-array-or-string/)

```java
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        reverse(nums);
        System.out.print("Reversed Array: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
```

---

### 23. Sum of Elements

Calculate the total sum of all elements in an array.

**Practice Link:** [GFG: Program to Find Sum of Elements](https://www.geeksforgeeks.org/program-find-sum-elements-given-array/)

```java
import java.util.Scanner;

public class ArraySum {
    public static int calculateSum(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int sum = calculateSum(nums);
        System.out.println("The total sum is: " + sum);
        sc.close();
    }
}
```

---

### 24. Frequency of Elements

Count how many times each element appears.

**Practice Link:** [LeetCode 1636: Sort Array by Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)

**For Sorted Array:**

```java
public class FrequencySorted {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 4};
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                System.out.println(arr[i - 1] + " -> " + count);
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1] + " -> " + count);
    }
}
```

**For Unsorted Array:**

```java
import java.util.HashMap;

public class FrequencyHashMap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 4, 2};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}
```

---

### 25. Symmetric Pairs

Find pairs (a, b) and (c, d) such that a = d and b = c.

**Practice Link:** [GFG: Find all symmetric pairs in an array](https://www.geeksforgeeks.org/given-a-sequence-of-pairs-find-all-symmetric-pairs-in-it/)

```java
import java.util.HashMap;

public class SymmetricPairs {
    public static void findSymmetricPairs(int[][] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println("Symmetric Pairs found:");
        for (int[] pair : arr) {
            int first = pair[0];
            int second = pair[1];
            Integer val = map.get(second);
            if (val != null && val == first) {
                System.out.println("(" + second + ", " + first + ") and (" + first + ", " + second + ")");
            } else {
                map.put(first, second);
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
            {11, 20}, {30, 40}, {5, 10}, {40, 30}, {10, 5}
        };
        findSymmetricPairs(arr);
    }
}
```

---

### 26. Distinct Elements

Count or print all unique elements in an array.

**Practice Link:** [GFG: Count Distinct Elements](https://www.geeksforgeeks.org/count-distinct-elements-in-an-array/)

```java
import java.util.HashSet;

public class DistinctElements {
    public static void printDistinct(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        System.out.println("Distinct elements:");
        for (int num : arr) {
            if (set.add(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 40};
        printDistinct(arr);
    }
}
```

---

### 27. Array Rotation

Rotate an array to the left or right by k positions.

**Practice Link:** [LeetCode 189: Rotate Array](https://leetcode.com/problems/rotate-array/)

```java
import java.util.Arrays;

public class ArrayRotation {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, 0, n - 1); // 1. Reverse the whole array
        reverse(nums, 0, k - 1); // 2. Reverse the first k elements
        reverse(nums, k, n - 1); // 3. Reverse the rest
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);
        System.out.println(Arrays.toString(arr)); // Output: [4, 5, 1, 2, 3]
    }
}
```

---

### 28. Equilibrium Index

Find an index where the sum of elements to the left equals the sum to the right.

**Practice Link:** [LeetCode 724: Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)

```java
public class EquilibriumIndex {
    public static int findEquilibrium(int[] arr) {
        int totalSum = 0;
        int leftSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            if (leftSum == totalSum) {
                return i;
            }
            leftSum += arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println("Equilibrium Index is: " + findEquilibrium(arr));
    }
}
```

---

## Category 4: Intermediate & Logical Questions

### 29. Binary to Decimal Conversion

Convert a binary string to its integer equivalent.

**Practice Link:** [GFG: Binary to Decimal Conversion](https://www.geeksforgeeks.org/program-binary-decimal-conversion/)

```java
import java.util.Scanner;

public class BinaryToDecimal {
    public static int getDecimal(String binary) {
        int decimal = 0;
        int n = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += Math.pow(2, n);
            }
            n++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = sc.nextLine();
        int result = getDecimal(binaryString);
        System.out.println("Decimal equivalent: " + result);
        sc.close();
    }
}
```

---

### 30. Decimal to Binary Conversion

Convert an integer to its binary representation.

**Practice Link:** [GFG: Decimal to Binary Conversion](https://www.geeksforgeeks.org/program-decimal-binary-conversion/)

```java
import java.util.Scanner;

public class DecimalToBinary {
    public static String getBinary(int decimal) {
        if (decimal == 0) return "0";
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }
        return binary.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal integer: ");
        if (input.hasNextInt()) {
            int decimalNumber = input.nextInt();
            String binaryResult = getBinary(decimalNumber);
            System.out.println("Binary representation: " + binaryResult);
        } else {
            System.out.println("Please enter a valid integer.");
        }
        input.close();
    }
}
```

---

### 31. Octal to Decimal

Convert octal numbers to decimal.

**Practice Link:** [GFG: Octal to Decimal Conversion](https://www.geeksforgeeks.org/program-octal-decimal-conversion/)

```java
import java.util.Scanner;

public class OctalToDecimal {
    public static int getDecimalFromOctal(String octal) {
        int decimal = 0;
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(octal.charAt(i));
            int power = length - 1 - i;
            decimal += digit * Math.pow(8, power);
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an octal number: ");
        String octalInput = scanner.nextLine();
        int result = getDecimalFromOctal(octalInput);
        System.out.println("Decimal equivalent: " + result);
        scanner.close();
    }
}
```

---

### 32. Area of a Circle

Calculate area given the radius.

**Practice Link:** [GFG: Program to Find Area of Circle](https://www.geeksforgeeks.org/java-program-to-compute-the-area-of-a-circle/)

```java
import java.util.Scanner;

public class CircleArea {
    public static double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            double area = calculateArea(radius);
            System.out.printf("The area of the circle is: %.2f%n", area);
        } else {
            System.out.println("Invalid input! Please enter a numeric value.");
        }
        input.close();
    }
}
```

---

### 33. Prime Factors

Find all prime factors of a given number.

**Practice Link:** [GFG: Print all Prime Factors](https://www.geeksforgeeks.org/print-all-prime-factors-of-a-given-number/)

```java
import java.util.Scanner;

public class PrimeFactors {
    public static void findFactors(int n) {
        for (int div = 2; div * div <= n; div++) {
            while (n % div == 0) {
                System.out.print(div + " ");
                n /= div;
            }
        }
        if (n > 1) System.out.print(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findFactors(n);
        sc.close();
    }
}
```

---

### 34. Handshakes Problem

Calculate maximum handshakes among N people using the formula **n × (n−1) / 2**.

**Practice Link:** [GFG: Number of Handshakes](https://www.geeksforgeeks.org/handshaking-lemma-and-interesting-tree-properties/)

```java
import java.util.Scanner;

public class HandshakeCalculator {
    public static int calculateMaxHandshakes(int n) {
        if (n < 2) return 0;
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int totalHandshakes = calculateMaxHandshakes(n);
            System.out.println("Maximum handshakes: " + totalHandshakes);
        } else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}
```

---

### 35. Quadrant Selection

Given coordinates (x, y), find which quadrant they lie in.

**Practice Link:** [GFG: Program to Find Quadrant](https://www.geeksforgeeks.org/program-to-find-the-quadrant-of-a-given-coordinate/)

```java
import java.util.Scanner;

public class QuadrantSelection {
    public static String getQuadrant(int x, int y) {
        if (x > 0 && y > 0) return "Quadrant 1";
        if (x < 0 && y > 0) return "Quadrant 2";
        if (x < 0 && y < 0) return "Quadrant 3";
        if (x > 0 && y < 0) return "Quadrant 4";
        if (x == 0 && y == 0) return "Origin";
        if (x == 0) return "On Y-axis";
        return "On X-axis";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X coordinate: ");
        int x = sc.nextInt();
        System.out.print("Enter Y coordinate: ");
        int y = sc.nextInt();
        System.out.println("The point is: " + getQuadrant(x, y));
        sc.close();
    }
}
```

---

### 36. Sum of Digits

Calculate the sum of all digits in a number.

**Practice Link:** [LeetCode 258: Add Digits](https://leetcode.com/problems/add-digits/)

```java
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
```

---

### 37. Power of a Number

Calculate a^b without using the `pow()` function.

**Practice Link:** [LeetCode 50: Pow(x, n)](https://leetcode.com/problems/powx-n/)

```java
import java.util.Scanner;

public class PowerCalculator {
    public static long calculatePower(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (a): ");
        int a = sc.nextInt();
        System.out.print("Enter exponent (b): ");
        int b = sc.nextInt();
        long result = calculatePower(a, b);
        System.out.println(a + " raised to the power of " + b + " is: " + result);
        sc.close();
    }
}
```

---

## Category 5: Advanced & Pattern Questions

### 38. Smallest Number of Notes

Find the minimum number of currency notes for a given amount.

**Practice Link:** [GFG: Find minimum number of currency notes](https://www.geeksforgeeks.org/find-minimum-number-of-currency-notes-and-values-that-sum-to-given-amount/)

```java
import java.util.Scanner;

public class MinimumNotes {
    public static void countNotes(int amount) {
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        System.out.println("Currency Count ->");
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                int count = amount / notes[i];
                amount = amount % notes[i];
                System.out.println(notes[i] + " : " + count);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        countNotes(amount);
        sc.close();
    }
}
```

---

### 39. Pyramid Pattern

Print a star pyramid of N levels.

**Practice Link:** [GFG: Programs for printing pyramid patterns](https://www.geeksforgeeks.org/programs-printing-pyramid-patterns-java/)

```java
public class PyramidPattern {
    public static void printPyramid(int n) {
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int levels = 5;
        printPyramid(levels);
    }
}
```

---

### 40. Diamond Pattern

Print a diamond shape using stars.

**Practice Link:** [GFG: Program to print Diamond Shape](https://www.geeksforgeeks.org/program-to-print-diamond-shape/)

```java
public class DiamondPattern {
    public static void printDiamond(int n) {
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        printDiamond(n);
    }
}
```

---

### 41. Pascal's Triangle

Generate the first N rows of Pascal's Triangle.

**Practice Link:** [LeetCode 118: Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)

```java
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            row.add(1); // First element
            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1); // Last element
            triangle.add(row);
        }
        return triangle;
    }

    public static void main(String[] args) {
        int rows = 5;
        List<List<Integer>> result = generate(rows);
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}
```

---

### 42. Matrix Addition / Subtraction

Perform arithmetic on two 2D matrices.

**Practice Link:** [GFG: Program to Add Two Matrices](https://www.geeksforgeeks.org/c-program-to-add-two-matrices/)

```java
public class MatrixArithmetic {
    public static void main(String[] args) {
        int[][] a = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int[][] b = {{1, 3, 4}, {2, 4, 3}, {1, 2, 4}};
        int[][] sum = new int[3][3];

        System.out.println("Sum of matrices:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = a[i][j] + b[i][j]; // Use - for subtraction
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

### 43. Matrix Multiplication

Multiply two matrices (checking for dimension compatibility).

**Practice Link:** [GFG: Program to Multiply Two Matrices](https://www.geeksforgeeks.org/c-program-multiply-two-matrices/)

```java
public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] a = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] b = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

### 44. Transpose of a Matrix

Switch rows and columns of a matrix.

**Practice Link:** [LeetCode 867: Transpose Matrix](https://leetcode.com/problems/transpose-matrix/)

```java
public class MatrixTranspose {
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}};
        int[][] res = transpose(mat);

        for (int[] row : res) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
```

---

### 45. Spiral Traversal

Print matrix elements in spiral order.

**Practice Link:** [LeetCode 54: Spiral Matrix](https://leetcode.com/problems/spiral-matrix/)

```java
import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        if (matrix.length == 0) return res;

        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) res.add(matrix[top][i]);
            top++;

            for (int i = top; i <= bottom; i++) res.add(matrix[i][right]);
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) res.add(matrix[bottom][i]);
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(spiralOrder(matrix));
    }
}
```

---

### 46. Kth Max / Min Element

Find the Kth largest or smallest element in an unsorted array.

**Practice Link:** [LeetCode 215: Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)

```java
import java.util.PriorityQueue;

public class KthElement {
    // Using a Min-Heap for Kth Largest
    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.add(num);
            if (minHeap.size() > k) {
                minHeap.poll(); // Remove the smallest element
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(arr, k));
    }
}
```

---

### 47. Median of Sorted Matrix

Find the median value in a row-wise sorted matrix.

**Practice Link:** [GFG: Median in a row-wise sorted Matrix](https://www.geeksforgeeks.org/median-in-a-row-wise-sorted-matrix/)

```java
public class MatrixMedian {
    // Helper: count elements <= mid in a sorted row (binary search)
    static int countSmallerThanMid(int[] row, int mid) {
        int l = 0, h = row.length - 1;
        while (l <= h) {
            int md = (l + h) >> 1;
            if (row[md] <= mid) {
                l = md + 1;
            } else {
                h = md - 1;
            }
        }
        return l;
    }

    public static int findMedian(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        int low = 1;
        int high = 1000000000; // Assuming max value constraint

        while (low <= high) {
            int mid = (low + high) >> 1;
            int count = 0;
            for (int i = 0; i < r; i++) {
                count += countSmallerThanMid(matrix[i], mid);
            }
            if (count <= (r * c) / 2) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 3, 5},
            {2, 6, 9},
            {3, 6, 9}
        };
        System.out.println("Median of the matrix is: " + findMedian(matrix));
    }
}
```

---

## 🚀 How to Use This Repository

**Clone the repo:**

```bash
git clone https://github.com/yourusername/java-interview-prep.git
```

**Navigate to the directory:**

```bash
cd java-interview-prep
```

**Compile and run any `.java` file:**

```bash
javac FileName.java
java FileName
```

---

## 📈 Study Strategy

- **Understand the Logic** — Don't just memorize the code. Focus on the comments and the underlying algorithm (e.g., two pointers, modulo arithmetic, HashMaps).
- **Time Complexity** — After solving, always ask yourself the Big-O time and space complexity of your solution.
- **Practice on Platforms** — Use the provided LeetCode and GeeksforGeeks links to submit your code and check against edge cases.

---

## 🤝 Contributing

Contributions, issues, and feature requests are welcome! Feel free to check the [issues page](https://github.com/yourusername/java-interview-prep/issues). If you have a more optimized solution for any of the problems, please open a pull request.

---

## 📝 License

This project is open-source and available under the [MIT License](LICENSE).
