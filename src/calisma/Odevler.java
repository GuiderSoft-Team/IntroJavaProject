package calisma;

public class Odevler {
    public class EqualSumChecker {
        //TODO: Please open the readme.txt file and answer 5th question.
    }
    public static void main(String[] args) {

        int[][] inputs = {{1, 1, 1}, {1, 1, 2}, {1, -1, 0}, {5, 5, 10}};

        for (int i = 0; i < inputs.length; i++) {
            System.out.println(hasEqualSum(inputs[i][0], inputs[i][1], inputs[i][2]));
        }
    }

    private static boolean hasEqualSum(int fNum, int sNum, int tNum) {
        if (fNum + sNum == tNum) return true;
        return false;
    }
}
 /*30  src/LeapYear.java
@@ -1,4 +1,32 @@
public class LeapYear {
    //TODO: Please open the readme.txt file and answer 4th question.
    public static void main(String[] args) {

        int[] inputs = {1700, 1800, 1900, 2100, 2200, 2300, 2500, 2600,
                1600, 2000, 2400,
                -1600, 1600, 2017, 2000};

        for (int input : inputs) {
            System.out.println(isLeapYear(input));
        }
    }

    private static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}
 22  src/MegaBytesConverter.java
@@ -1,3 +1,21 @@
public class MegaBytesConverter {
    //TODO: Please open the readme.txt file and answer 3rd question.
}
    public static void main(String[] args) {

        int[] inputs = {2500,-1024,5000};

        for (int input:inputs) {
            printMegaBytesAndKiloBytes(input);
        }
    }

    private static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megaBytes=kiloBytes/1024;
        int remainingKiloBytes=kiloBytes%1024;

        if(kiloBytes<0){
            System.out.println("\"Invalid Value\" because parameter is less than 0.");
        }else{
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainingKiloBytes+" KB");
        }
    }
}

        import java.util.Random;

public class SpeedConverter {
    //TODO: Please open the readme.txt file and answer 1st and 2nd questions.
    public static void main(String[] args) {
        Random rand = new Random();

        double[] inputs = {1.5, 10.25, -5.6, 25.42, 75.114};

        for (double input : inputs) {
            printConversion(input);
        }

    }

    private static long toMilesPerHour(double kilometersPerHour) {

        double milesPerHour = kilometersPerHour / 1.609;

        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(milesPerHour);
        }
    }

    private static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid value");
            ;
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }*/
// public class EqualSumChecker {
//     //TODO: Please open the readme.txt file and answer 5th question.
//
//     public static void main(String[] args) {
//         System.out.println(hasEqualSum(2,2,4));
//         System.out.println(hasEqualSum(1,2,5));
//     }
//     public static boolean hasEqualSum (int a,int b,int c){
//         if((a+b)==c){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }
//
//public class LeapYear {
//    //TODO: Please open the readme.txt file and answer 4th question.
//    public static void main(String[] args) {
//        System.out.println(isLeapYear(1700));
//        System.out.println(isLeapYear(1600));
//    }
//    public static boolean isLeapYear(int year){
//
//        if(year>=1 && year<=9999){
//            if(year%4==0){
//                if(year%100==0){
//                    if(year%400==0){
//                        System.out.println("This year is a leap year and it has 366 days ");
//                        return true;
//                    }else {
//                        System.out.println("This year is not a leap year.Since it has 365 days ");
//                    }
//                }else return false;
//            }else return false;
//        }
//        return false;
//    }
//}
// 16  src/MegaBytesConverter.java
//@@ -1,3 +1,17 @@
//public class MegaBytesConverter {
//    //TODO: Please open the readme.txt file and answer 3rd question.
//
//    public static void main(String[] args) {
//        printMegaBytesAndKiloBytes(2000);
//    }
//    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//
//        int kb=kiloBytes%1024;
//        int mb=kiloBytes/1024;
//
//        if(kiloBytes<0){
//            System.out.println("INVALID VALUE");
//        }else {
//            System.out.println(kiloBytes+"KB = "+mb+" MB and "+kb+" KB");
//        }
//    }
//}
//
//
//public class SpeedConverter {
//    //TODO: Please open the readme.txt file and answer 1st and 2nd questions.
//
//    public static void main(String[] args) {
//        System.out.println(toMilesPerHour(-5));
//        printConversion(25.42);
//    }
//
//    public static long toMilesPerHour (double kilometersPerHour){
//        long roundedValue=Math.round(kilometersPerHour/1.609);
//        if(roundedValue>=0){
//            return roundedValue;
//        }else{
//            return -1;
//        }
//    }
//    public static void printConversion(double kilometersPerHour){
//
//
//        if(kilometersPerHour<0){
//            System.out.println("INVALID VALUE");
//        }else{
//            System.out.println(kilometersPerHour+"km/h = "+toMilesPerHour(kilometersPerHour)+" mi/h");
//        }
//    }

//public class LeapYear {
//    //TODO: Please open the readme.txt file and answer 4th question.
//
//    public static void main(String[] args) {
//        System.out.println(isLeapYear(1700));
//        System.out.println(isLeapYear(1600));
//    }
//    public static boolean isLeapYear(int year){
//        if(year>=1 && year<=9999){
//            if(year%4==0){
//                if(year%100==0){
//                    if(year%400==0){
//                        System.out.println("This year is a leap year and it has 366 days ");
//                        return true;
//                    }else {
//                        System.out.println("This year is not a leap year.Since it has 365 days ");
//                    }
//                }else return false;
//            }else return false;
//        }
//        return false;
//    }
//}

