package day06;

public class BitwiseOperators {
    public static void main(String[] args) {
        //Bitwise Operators
        // &,|,^,~,<<,>>,>>>
        //            76543210
        int x=64;   //01000000
        int y=7;    //00000011
        int r=x&y;  //00000000
        int r2=x|y; //00001111

        int sayi=128;//01000000
        sayi=sayi>>1;
        y=y>>1;

        System.out.println(r);
        System.out.println(r2);
        System.out.println(sayi);
        System.out.println(y);
        y=y<<2;
        System.out.println(y);
    }
}
