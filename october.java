package justforfun;

import java.util.InputMismatchException;
import java.util.Scanner;

    public class october{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter option"+
                "1: prime number"+
                "2: Pallindrome");
        int num = sc.nextInt();
        switch (num){
            case 1:
                if(num%2==0){
                    System.out.println("it is a prime");
                }
                else{
                    System.out.println("it is not a prime number ");
                }
                break;
            case 2:
                Scanner sc1 =new Scanner(System.in);
                System.out.println("enter number to search");
                int num1 = sc1.nextInt();
                int Original_num = num1;
                int rev = 0;
                while(num1!=0){
                    int digit = num1 % 10;package justforfun;

import java.util.Scanner;
import java.util.InputMismatchException;

public class October {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter option:");
        System.out.println("1: Prime number");
        System.out.println("2: Palindrome");
        int option = getValidInput(scanner);
        switch (option) {
            case 1:
                System.out.println("Enter a number to check if it's prime:");
                int number = getValidInput(scanner);
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number");
                } else {
                    System.out.println(number + " is not a prime number");
                }
                break;
            case 2:
                System.out.println("Enter a number to check if it's a palindrome:");
                int palindromeNumber = getValidInput(scanner);
                if (isPalindrome(palindromeNumber)) {
                    System.out.println(palindromeNumber + " is a palindrome");
                } else {
                    System.out.println(palindromeNumber + " is not a palindrome");
                }
                break;
            default:
                System.out.println("Invalid option");
        }
        scanner.close();
    }

    private static int getValidInput(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
                    rev = rev * 10 + digit;
                    num1 = num1 / 10;
                }
                if(Original_num==num1){
                    System.out.println("It is pallindrome");
                }
                else{
                    System.out.println("It is not a pallindrome");
                    //simple just dont worry about this line;
                }
            sc.close();
            }
    }
}