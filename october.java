package justforfun;

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
                int num1 = sc.nextInt();
                int Original_num = num1;
                int rev = 0;
                while(num1!=0){
                    int digit = num1 % 10;
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
        }
    }
}