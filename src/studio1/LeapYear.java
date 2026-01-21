package studio1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("What is the year you would like to check?");
         int inputYear = in.nextInt();
         boolean divisByFour = (inputYear % 4 == 0);
         boolean divisByHundred = (inputYear % 100 != 0);
         boolean divisByFourHundred = (inputYear % 400 == 0);
         System.out.println(divisByFour);
         System.out.println(divisByHundred);
         System.out.println(divisByFourHundred);
         boolean isLeapYear = ((divisByFour) && (divisByHundred)) || (divisByFourHundred);
         System.out.println(inputYear + " is a leap year: " + isLeapYear);


    }

}
