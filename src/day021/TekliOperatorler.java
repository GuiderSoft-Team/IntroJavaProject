package day021;

public class TekliOperatorler {
    public static void main(String[] args) {
        //00000000 00000000 00000000 00000000
/*        int x=7;
        System.out.println(x);
        int y=-3;

        int z=x+1;
        System.out.println(x);
        System.out.println("z->"+z);

        x++; //x=x+1; //incremental statement

        ++x;
        System.out.println(x);
        x--; //bu bir statement'dır. Expression değildir. En sonunda assignment yapılır.


        --x;
        System.out.println(x);*/

        //++ ve -- operatörleri değişkenlerin solunda veya sağında kullanılabilir. Solda olursa prefix adı verilir.
        //Sağında kullanılırsa postfix veya suffix adı verilir.
        //Birlikte kullanıldığı değişkenin değerini "her durumda" ++ bir birim artırır, -- bir birim azaltır.

/*
        int x=3;
        int y=2;
        int z=++x +y;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        System.out.println("z: "+z);
        System.out.println();

        int a=50;
        a=--a + a++ + a-- + a++;
        System.out.println(a);
        System.out.println();

*/


        int a=1;
        a=-a-- + a++ / -a-- * --a;
        System.out.println(a);



    }
}
