package day023;

public class LogicalOps {
    public static void main(String[] args) {
        //& -and  (shift+6),| -or (alt+<>),^ -xor (shift+3 ve space)
        //&& -and          ,|| -or  --->shortcut veya short circuit

        //önce true ve false literalleriyle kullanalım
        //and operatörünün (&) kullanımı
        boolean res1=false & false;//false
        boolean res2=true & false;//false
        boolean res3=false & true;//false
        boolean res4=true & true;//true

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

        System.out.println();

        //or operatörünün kullanımı
        boolean res5=false | false;//false
        boolean res6=true | false;
        boolean res7=false | true;
        boolean res8=true | true;

        System.out.println(res5);
        System.out.println(res6);
        System.out.println(res7);
        System.out.println(res8);

        System.out.println();

        //xor (^) kullanımı

        boolean res10=false ^ false;
        boolean res20=true ^ false;
        boolean res30=false ^ true;
        boolean res40=true ^ true;

        System.out.println(res10);
        System.out.println(res20);
        System.out.println(res30);
        System.out.println(res40);

        System.out.println();

        boolean res100=!false;
        boolean res200=!true;

        System.out.println(res100);
        System.out.println(res200);

        System.out.println();
        //xor örnek

        //5: 00000101--->1x2^0+0x2^1+1x2^2=5
        //3: 00000011--->1x2^0+1x2^1=3
        //&: 00000001----->1
        //|: 00000111------>7
        //^: 00000110------>6

        byte b1=5;
        byte b2=3;

        int r1=b1&b2;
        int r2=b1|b2;
        int r3=b1^b2;
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);




    }
}
