Markdown

# Java Coding Interview Questions & Solutions

This repository contains common coding interview questions categorized by topic, along with their Java solutions and links to practice them on platforms like LeetCode and GeeksforGeeks.

---

## [cite_start]Category 1: Basic Number-Based Questions [cite: 1]

### 1. Reverse a Number

[cite_start]Write a program to take an integer and reverse its digits (e.g., 123 to 321). [cite: 2]
**Practice Link:** [LeetCode 7: Reverse Integer](https://leetcode.com/problems/reverse-integer/)

```java
public class ReverseNumber {
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;          // get last digit
            reverse = reverse * 10 + digit; // add digit to reverse
            num = num / 10;                // remove last digit
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
2. Fibonacci Series
Find the Fibonacci series up to the nth term.
Practice Link: LeetCode 509: Fibonacci Number
DOCX

Java
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
3. Greatest Common Divisor (GCD)
Calculate the HCF/GCD of two numbers.
Practice Link: GFG: Program to Find GCD
DOCX

Java
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
        System.out.println("Both numbers are" + num1 + " " + num2);
        int result = gcd(num1, num2);
        System.out.println("Result = " + result);
    }
}
4. Perfect Number
Check if a number is equal to the sum of its proper divisors.
Practice Link: LeetCode 507: Perfect Number
DOCX

Java
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
5. Leap Year
Determine whether a given year is a leap year.
Practice Link: GFG: Check Leap Year
DOCX

Java
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
6. Prime Number
Check if a number is prime or find primes in a range.
Practice Link: LeetCode 204: Count Primes
DOCX

Java
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number till which you want to check the prime");
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
7. Armstrong Number
Check if a number is equal to the sum of its own digits raised to the power of the number of digits.
Practice Link: GFG: Armstrong Numbers
DOCX

Java
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
8. Palindrome Number
Check if a number reads the same forwards and backwards.
Practice Link: LeetCode 9: Palindrome Number
DOCX

Java
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
9. Factorial of a Number
Calculate the product of all positive integers up to n.
Practice Link: GFG: Factorial of a Number
DOCX

Java
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
        System.out.println(" factorial of " + num + " is " + factorial(num));
    }
}
10. Strong Number
Check if the sum of factorials of digits is equal to the number itself.
Practice Link: GFG: Strong Numbers
DOCX

Java
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
        int num = 14222;
        if (strong(num)) {
            System.out.println("The number is Strong");
        } else {
            System.out.println("The number is Not Strong");
        }
    }
}
Category 2: String Manipulation Questions
DOCX

11. Anagram Check
Determine if two strings contain the same characters in the same frequency.
Practice Link: LeetCode 242: Valid Anagram
DOCX

Java
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
        String str2 = "silentefef"; // Example from original code
        if (isAnagram(str1, str2)) {
            System.out.println("They are anagram");
        } else {
            System.out.println("They are not anagram");
        }
    }
}
12. Palindrome String
Check if a string is a palindrome.
Practice Link: LeetCode 125: Valid Palindrome
DOCX

Java
public class Anohter {
    public static boolean isPalindorme(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != (str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        if (isPalindorme(str)) {
            System.out.println("It is palindrome");
        } else {
            System.out.println("not Palindrome");
        }
    }
}
13. Replace Substring
Find and replace a specific substring within a larger string.
Practice Link: GFG: Replace a substring of a string
DOCX

Java
public class ReplaceSubstring {
    public static String replaceWord(String text, String oldWord, String newWord) {
        return text.replace(oldWord, newWord);
    }
    public static void main(String[] args) {
        String text = "I love Java programming";
        String result = replaceWord(text, "Java", "Python");
        System.out.println("Original String: " + text);
        System.out.println("Updated String: " + result);
    }
}
14. Vowel and Consonant Count
Count the number of vowels and consonants in a string.
Practice Link: GFG: Count Vowels and Consonants
DOCX

Java
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
15. Remove Vowels
Create a new string with all vowels removed.
Practice Link: GFG: Remove Vowels from String
DOCX

Java
import java.util.Scanner;
public class RemoveVowels {
    public static String getOnlyConsonants(String input) {
        input = input.toLowerCase();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
                result += input.charAt(i);
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
16. String Reversal
Reverse a string without using built-in library functions.
Practice Link: LeetCode 344: Reverse String
DOCX

Java
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
17. ASCII Value
Find the ASCII value of a specific character.
Practice Link: GFG: Print ASCII Value in Java
DOCX

Java
import java.util.Scanner;
public class AsciiFinder {
    public static int getAsciiValue(char ch) {
        int ascii = (int) ch;
        return ascii;
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
18. Toggle Case
Convert uppercase characters to lowercase and vice versa.
Practice Link: GFG: Toggle Case of a String
DOCX

Java
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
19. Length of String
Calculate string length without using strlen() or .length().
Practice Link: GFG: Find length of string without built-in function
DOCX

Java
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
Category 3: Array-Based Questions
DOCX

20. Largest/Smallest Element
Find the maximum or minimum value in an array.
Practice Link: GFG: Program to find largest element in an array
DOCX

Java
import java.util.Scanner;
public class MaxMin {
    public static void findMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("largest" + max);
        System.out.println("Smallest" + min);
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
21. Second Smallest/Largest
Find the second-place values in an array.
Practice Link: GFG: Find Second Largest Element
DOCX

Java
import java.util.Scanner;
public class SecondBestBoth {
    public static void findSeconds(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array is too small.");
            return;
        }
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
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
        System.out.println("Second Largest: " + secondLargest);
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
22. Reverse an Array
Reverse the order of elements in an array.
Practice Link: GFG: Reverse an Array
DOCX

Java
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
23. Sum of Elements
Calculate the total sum of all elements in an array.
Practice Link: GFG: Program to Find Sum of Elements
DOCX

Java
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
24. Frequency of Elements
Count how many times each element appears.
Practice Link: LeetCode 1636: Sort Array by Increasing Frequency
DOCX


For Sorted Array:
DOCX

Java
public class FrequencySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 4 };
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

For Unsorted Array:
DOCX

Java
import java.util.HashMap;
public class FrequencyHashMap {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1, 4, 2 };
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (freq.containsKey(num)) {
                int oldCount = freq.get(num);
                freq.put(num, oldCount + 1);
            } else {
                freq.put(num, 1);
            }
        }
        for (int key : freq.keySet()) {
            System.out.println(key + " -> " + freq.get(key));
        }
    }
}
25. Symmetric Pairs
Find pairs (a, b) and (c, d) such that a=d and b=c.
Practice Link: GFG: Find all symmetric pairs in an array
DOCX

Java
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
26. Distinct Elements
Count or print all unique elements in an array.
Practice Link: GFG: Count Distinct Elements
DOCX

Java
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
27. Array Rotation
Rotate an array to the left or right by k positions.
Practice Link: LeetCode 189: Rotate Array
DOCX

Java
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
28. Equilibrium Index
Find an index where the sum of elements to the left equals the sum to the right.
Practice Link: LeetCode 724: Find Pivot Index
DOCX

Java
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
Category 4: Intermediate & Logical Questions
DOCX

29. Binary to Decimal Conversion
Convert a binary string to its integer equivalent.
Practice Link: GFG: Binary to Decimal Conversion
DOCX

Java
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
30. Decimal to Binary Conversion
Convert an integer to its binary representation.
Practice Link: GFG: Decimal to Binary Conversion
DOCX

Java
import java.util.Scanner;
public class DecimalToBinary {
    public static String getBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
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
31. Octal to Decimal
Convert octal numbers to decimal.
Practice Link: GFG: Octal to Decimal Conversion
DOCX

Java
import java.util.Scanner;
public class OctalToDecimal {
    public static int getDecimalFromOctal(String octal) {
        int decimal = 0;
        int length = octal.length();
        for (int i = 0; i < length; i++) {
            char digitChar = octal.charAt(i);
            int digit = Character.getNumericValue(digitChar);
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
32. Area of a Circle
Calculate area given the radius.
Practice Link: GFG: Program to Find Area of Circle
DOCX

Java
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
33. Prime Factors
Find all prime factors of a given number.
Practice Link: GFG: Print all Prime Factors
DOCX

Java
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
34. Handshakes Problem
Calculate maximum handshakes among N people (n∗(n−1)/2).
Practice Link: GFG: Number of Handshakes
DOCX

Java
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
35. Quadrant Selection
Given coordinates (x,y), find which quadrant they lie in.
Practice Link: GFG: Program to Find Quadrant
DOCX

Java
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
        String result = getQuadrant(x, y);
        System.out.println("The point is: " + result);
        sc.close();
    }
}
36. Sum of Digits
Calculate the sum of all digits in a number.
Practice Link: LeetCode 258: Add Digits
DOCX

Java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n = n / 10;
        }
        System.out.println("Sum of digits: " + sum);
        sc.close();
    }
}
37. Power of a Number
Calculate a
b
  without using pow() function.
Practice Link: LeetCode 50: Pow(x, n)
DOCX

Java
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
