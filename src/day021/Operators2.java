package day021;

public class Operators2 {
    public static void main(String[] args) {
/*        int num1=46;
        int num2=90;
        int sum=num1+num2;
        System.out.println(sum);*/


        //C = 5/9 x (F-32)
        //F=9/5 x C+32

        double f=95.0;
        double c=5.0/9*(f-32);
        System.out.println(c);


        f=9.0/5*c+32;

        System.out.println(f);


        double m=85.0;
        double k=m*1.609;

        System.out.println(k);


        double r=5.5;
        double p=2*Math.PI*r;
        double a=Math.PI*Math.pow(r,2);
        System.out.println("Çevre = "+Math.round(p));
        System.out.println("Çevre = "+p);
        System.out.println("Alan = "+Math.round(a));
        System.out.println("Alan = "+a);

        //67,45,56 sayılarının ortalamasını ekrana yazdıran bir program yazınız.


        System.out.println("Ortalama (67+45+55) = "+(67.0+45+55)/3);
//        System.out.println("Ortalama (67+45+55) = "+(67+45+55)/3); yanlış

        double s=7.0/3;
        System.out.println(s);


    }
}
