package day023;

public class Ornekler {
    public static void main(String[] args) {
        char d1='M';
        char d2='E';
        char d3='S';
        char d4='A';
        char d5='J';

        int key=5;

        char c1=(char) (d1^key);
        char c2=(char) (d2^key);
        char c3=(char) (d3^key);
        char c4=(char) (d4^key);
        char c5=(char) (d5^key);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c4);
        System.out.print(c5);

        char m1=(char) (c1^key);
        char m2=(char) (c2^key);
        char m3=(char) (c3^key);
        char m4=(char) (c4^key);
        char m5=(char) (c5^key);

        System.out.println();
        System.out.print(m1);
        System.out.print(m2);
        System.out.print(m3);
        System.out.print(m4);
        System.out.print(m5);

    }
}
