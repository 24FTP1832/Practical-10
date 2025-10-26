package Practical10;

import java.util.Scanner;

public class IsPalindromeReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 900 + 100); // Random number between 100–999

        System.out.print("Enter the reverse of " + number + ": ");
        int userInput = input.nextInt();

        while (userInput < 100 || userInput > 999) {
            System.out.print("Please enter a 3-digit reverse number of " + number + ": ");
            userInput = input.nextInt();
        }

        int reversed = reverse(number);
        boolean result = isPalindrome(userInput, reversed);

        System.out.println("The digit " + userInput + " is palindrome of " + number + " is " + result + ".");
    }

    public static int reverse(int number) {
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(int userInput, int reversed) {
        return userInput == reversed;
    }
}