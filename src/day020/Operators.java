package day020;

public class Operators {
    public static void main(String[] args) {
        //Aritmetik Operatörler
        //+,-,*,/,%
        //operand1+operand2
        int t=3+5;
        int x=5;
        int y=3;
        int z=x+y;
        int w=x+7;
        int s=y+kareAl(4);


        System.out.println(t);
        System.out.println(z);
        System.out.println(w);
        System.out.println(s);



        //kk=5,uk=7 cevre->24 cevre: kısa keanrların ve uzun kenarların toplamıdır.


        int outCome=12+6/3;
        System.out.println(outCome);

        //a ve b isimli iki değişken tanımlayınız. Değerleri 8 ve 3 olsun.
        //c değişkenine a ve b'nin toplamıyla a ve b'nin farkının çarpımını atayınız. Sonra ekrana yazdırınız.






    }


    public static int kareAl(int x){
        return x*x;
    }


}
