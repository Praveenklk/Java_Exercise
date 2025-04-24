import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.Style;

import java.awt.*;
import java.text.NumberFormat;


public class first {
    public static void main(String[] args) {
        int age = 20;
        System.out.println( age);
        Date now = new Date();
        System.out.println(now);

        Point point1 = new Point(1,2);
        Point point2 = point1;
        point1.x=6;
        System.out.println( point2.x);

        //String

        String message = "Hey " + "praveen";  //Strings are mutable , we can't change once its stored
        System.out.println(message.length());
        System.out.println(message.replace("Hey", "Hello"));// here we are just changing the value for once if we call the message on 
                                                                                //next line it will shows "Hey Praveen" we can 't  change the string value
        System.out.println(message.toUpperCase().trim());//trim used to remove extra white space

        String Value = "Hello \"praveen\"";  //It is used to add the double code in our code
        String Windows = "C:\\Windows\\Praveen";
        System.out.println(Windows);
        System.out.println(Value);

       

        // This is the Older method

        int [] numbers = new int[5];
        numbers[0]=1;
        numbers[2]=43;
        System.out.println(numbers);  // in this line it will shows the object value that stroes on that array
        System.out.println(Arrays.toString(numbers));//In this line we convered that into a string value

    

       int [] numbers2 = {2, 53, 32, 63, 54}; // once we add in that array we can't add or delete any value\
       Arrays.sort(numbers2); // it will shows that in Asenting order of the value
       System.out.println(Arrays.toString(numbers2));
       System.out.println(numbers.length);

       

       int [][] parameter = {{1,5, 6}, {4,9, 54}};// two dimentsional Array
       System.out.println(Arrays.deepToString(parameter));

       String firstValue = "1";
       int y =Integer.parseInt(firstValue) + 3; // If we want to conver the string into integer we need to use the parseInt method to conver that value
       System.out.println(y);

    NumberFormat currency = NumberFormat.getCurrencyInstance(); // These Method convert Numbers into currency Formet
    String result = currency.format(356433445.431);
    System.out.println(result); // Output: $356,433,445.43

    Scanner collect =new Scanner(System.in);
    System.out.print("Name: ");
    String name = collect.nextLine().trim();
    System.out.println("You are "+ name);


    // Mortage calculation method

    Scanner scanner = new Scanner(System.in);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        // Get Principal
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        // Get Annual Interest and calculate monthly interest
        System.out.print("Annual Interest Rate (%): ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        // Get loan period in years and calculate number of payments
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        // Mortgage calculation formula
        double mortgage = principal 
                          * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) 
                          / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        // Print the result formatted as currency
        System.out.printf("Mortgage: ₹%.2f%n", mortgage);

        scanner.close();

    Scanner newvalue = new Scanner(System.in);

    System.out.print("Enter a Number : ");

    int finalValue = newvalue.nextInt();


    if(finalValue % 3==0 && finalValue % 5==0)
        System.out.println("FizzBuzz");

    else if(finalValue % 3 == 0)
        System.out.println("Fizz");

    else if(finalValue % 5 == 0)
        System.out.println("Buzz");

    

    else
        System.out.println(finalValue);
    
   

    }

}