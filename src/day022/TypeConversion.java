package day022;

public class TypeConversion {
    public static void main(String[] args) {
        System.out.println(7.9+6.7);
        System.out.println((int) 7.9+(int) 6.7);


        System.out.println();
        System.out.println((int) (7.3+6.7));
        System.out.println( 7.3+6.7);

        System.out.println();

        System.out.println((double) (7)/2);

        System.out.println();
        System.out.println((int) (7.8+(double) (15)/2));

        System.out.println();

        short sayi1=50;
        short sayi2=60;

        short toplam=(short) (sayi1+sayi2);
        System.out.println(toplam);

    }
}
