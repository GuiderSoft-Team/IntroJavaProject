package day023;

public class RelationalOps {
    public static void main(String[] args) {
        //<,>,<=,>=,!=,==
        boolean res1=5>3;
        boolean res2=5<3;
        boolean res3=5!=3;
        boolean res4=5==3;

        boolean res5=5>=5;
        boolean res6=5<=5;

/*

        System.out.println("Result = "+res1);
        System.out.println("Result = "+res2);
        System.out.println("Result = "+res3);
        System.out.println("Result = "+res4);
        System.out.println("Result = "+res5);
        System.out.println("Result = "+res6);*/


        int firstNumber=65;
        int secondNumber=65;

        System.out.println("1st Number is greater than 2nd number : "+(firstNumber>secondNumber));
        System.out.println("1st Number is greater than 2nd number or equals : "+(firstNumber>=secondNumber));
        System.out.println("These two numbers are equal : "+(firstNumber==secondNumber));



    }
}
