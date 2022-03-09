package assignmentsFirstWeek;

import java.net.Socket;

public class Main {



    public static void main(String[] args) {
        //Assignment 1.
        /* Print triangle shown below:

         *
       *   *
      *      *
     *********
         */


        //Answer
        System.out.println("         *");
        System.out.println("       *   *");
        System.out.println("      *      *");
        System.out.println("     *********");




        //Assignment 2.
       /* 1- Declare two variables whose names are first name and last name, in camelCase
        2- Assign the variables your first and last names, as a string
        3- Print in the console, with the concatenation of your variables*/



        //Answer

        String firstName="osman",lastName="bozdag";
        System.out.println(firstName+lastName);



        //Assignment 3.

        /*Write a Java program that will print a sum of two numbers
        Please use variables to store num1,num2,and sum
        Sample output:

        25 + 80 = 105
*/

        //Answer


        int num1=25,num2=80,sum;
        sum=num1+num2;
        System.out.println(sum);



        //Assignment 4
        // Write a Java program that calculates the average of 3 numbers.



        //Answer

        int a=5, b=6;
        double average;
        average=(double) a/b;
        System.out.println(average);




        //Assignment 5
        /*Write a Java program that displays the area and perimeter of a circle that has a radius of
        5.5 using the following formulas:
        perimeter = 2 * radius * 𝜋
        area = radius * radius * 𝜋*/

        //Answer

        final double radius=5.5;
        double perimeter,area;
        perimeter=2*radius*Math.PI;
        area=radius*radius*Math.PI;
        System.out.println("area: "+area+"\n"+"perimeter: "+perimeter);


    }



}
