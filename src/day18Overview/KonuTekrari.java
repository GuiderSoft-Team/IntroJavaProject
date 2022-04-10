package day18Overview;

import java.util.Arrays;
import java.util.Scanner;

public class KonuTekrari {
    public static void main(String[] args) {//ARG=>ARGUMENTS
/*        System.out.println("Merhaba Dünya");

            int yas=45;
            double boy=1.67;
            char harf='A';
        System.out.println(yas);
        System.out.println(boy);
        System.out.println(harf);
        char a='\u063C';
        char a=1001;
        char c='?';
        System.out.println(a);
        System.out.println(a);
        System.out.println(c);
        double s= 23d;   //int---->float----->double
        System.out.println(s);

        int n=22 / 7;// 3  =>int 2 değer birbirine bölündüğünde sonuç kesirli ise int'te değer kaybı oluşur.
        float m=22f / 7f;    //3.142857   32 bit yani 4 byte old. için daha sınırlı bir veri alırız.
        double o=22d / 7d;   //3.142857142857143 64 bit yani 8 byte old. için daha büyük bir sayı verir
        System.out.println(n);
        System.out.println(m);
        System.out.println(o);*/
        /* String carName="Volvo";
        int x=5;
        int y=10;
       int z;
        z=x+y;
        System.out.println("z ="+z);
        String _e$_="sent";
        String bilalSafak="Bilal Şafak";
        System.out.println(bilalSafak);
        final int CAPACITY=50;
        final double PI_SAYISI=3.14;// snake tipi
        //PI_SAYISI=3.33; BUNU YAPAMAYIZ ÇÜNKÜ FİNAL OLMUŞ OLDUĞU İÇİN.
        final String DOGUM_YERI="BALIKESİR";
        final String DOGUM_TARIHI="1984";
        int yas=25;
        yas=25;
        yas++;
        yas--;
        System.out.println(yas);
        final int MAX_VALUE=30;
        final int MIN_VALUE=20;*/
        //MAX_VALUE++;  atama yapılamaz.*/
        // /*      final int MAX_OGRENCI_SAYISI=24;
        //        String[] ogrenciAdedi=new String[MAX_OGRENCI_SAYISI];
        //        int[] fizikNotlari=new int[MAX_OGRENCI_SAYISI];
        //        int t=3+5;
        //        int x=5;
        //        int y=3;
        //        int z=x+y;
        //        int w=x+7;
        //        int s=y+kareAl(5);
        //        System.out.println(t);
        //        System.out.println(z);
        //        System.out.println(w);
        //        System.out.println(s);
        //    }
        //    public static int kareAl(int x) {
        //       return x*x;*/  /*int kisaKenar=5;
        //        int uzunKenar=7;
        //        int cevre=kisaKenar+uzunKenar+kisaKenar+uzunKenar;
        //
        //        System.out.println("cevre="+cevre);*/ //dikdörtgen çevre hesaplama /*int x=10;
        //        int y=7;
        //        int z=x%y;
        //        System.out.println(z);*///mod alma /*int outcome=12*3+6/3-6*1;
        //        System.out.println(outcome);
        //
        //         int a=8;
        //        int a=3;
        //        int c=(a+a)*(a-a);
        //        System.out.println(c);
        //
        //        */ //*  ve /  +  -  işlem öncelikleri/*        int sayi1=-5;
        //        int sayi2=+5;//+ operandı yazmaya gerek yok
        //        sayi2=5;//bu kadar yeterli.
        //        int sayi3=-5*3;// dediğimizde tekli operator olarak -'nin önceliği var.
        //        int sayi4=5+2*4;
        //        int sayi5=3+4*4+5*(4+3)-1;
        //
        //        int num1=46;
        //        int num2=90;
        //        int sum=num1+num2;
        //        System.out.println(sum);
        //
        //
        //        System.out.println(sayi5);*///işlem öncelikleri SONNN /*   //formül C=5/9*(F-32)
        //        //formül f=9/5*C+32
        //        double f=95.0;
        //        double c=5.0/9*(f-32);
        //        System.out.println(c);
        //
        //        f=5.0/9*c+32;
        //        System.out.println(f);*/ //fahrenheit ve celcius hesaplama
       /* // 1 mil kaç km eder?  Formülü 1 mil=1,609km

        double mil= 85.0;
        double km=mil*1.609;
        System.out.println("Km ="+km);
*/ //1 mil kaç km eder?

        // dairenin Çevre ve Alan formülü
     /* double r=5.5;
        double c=2*Math.PI*r;
        double a=Math.PI*Math.pow(r,2);//pow(r,2) demek r nin karesi demek  pow(r,4) dersek r nin 4. kuvveti demek
        System.out.println(c);
        System.out.println(a);*/ //Daire alan ve çevre hesaplama
        /*double a=67;
        double a=45;
        double c=56;
        double average=(a+a+c)/3;
        System.out.println(average);

        //hiç değişken tanımlamadan yapabilirmiyiz
        System.out.println("Ortalama (67+45+56)="+(67+45+55)/3.0);//3.0 Dediğimiz için double oldu sonuç.        Ortalama (67+45+56)=55.666666666666664
        System.out.println("Ortalama (67+45+56)="+(67+45+55)/3);//3 Dediğimiz için sonuç int yani yanlış çıktı.  Ortalama (67+45+56)=55

           // int yapmışsak pay yada payda'nın başına (double) yazmalıyız.
           //     yada double yazmıyorsak 3.0 diye yazmalıyız
           //     yada double diye en baştan tanımlamalıyız.
*/ //3 sayının ortalamasını alma double kullanma önemli
        //type conversion(Tip Dönüşümleri)
         /*  int x=6;
        double y=5.6;

        y=x;
        System.out.println(y);     // int x'i double y'ye atamak.  4 bytlık int değerini 8 bytelık double a atanır.
        tam tersini yapsak
        x=y;  //derleyici uyarıyor ki double'ı int'e sığdıramazsın diyor. 8 bytelık double'ı 4 bytelık int'e sığdıramazsın.
        Bölme işlemleri bu yüzden değer kaybına uğruyor.
        Dersen ki ben veri kaybını(küsüratlardan) göz önüne alıyorum sen karışma sorumluluk bana ait dersen
        x=(int) y;
        System.out.println(x);//double y'yi int y'ye çevirmek için x=y olmaz hatalı ama x=(int)y; bölme işlemlerinde bu yüzden
         veri kaybederiz.
       int x=300;
        byte z=(byte)x;
        System.out.println(z);//sonuç 44 çıktı yani ver kaybı oldu hatalı yani.
        int pies=10,people=4;
        double piePerson=pies/people;//   int/int herzaman sonuç int yani tamsayı çıkmayacağı için veri kaybı olabilir. Zaten sonuçta 2.0 çıktı. 2.5 yerine
        System.out.println(piePerson);//  int double' assign ettiğimizde küçüğü büyüğe assign ettiğimizde otomatik yani Widening conversion-Upcasting denilir.

        short s1=5;
        long  t1=32767;//short 32767 ye kadar destekler +1 almaz ama
        //s1=t1;  bu olmaz
        s1=(short)t1;
        System.out.println(s1);

        byte a=6;
        //byte c=a/3;//editör uyarı verdi. a/3 yani 6/3=2 bir integer yani tam sayı çıktı. Otomatik bir widening conversion oluştu.
        int c=a/3;// int çıktğığ için sonuç bunu narrowing conversition daraltma dönüşümü gerçekleştiririz. Manuel yani elle
        System.out.println(c);

        System.out.println(7.9+6.7);//14.600000000000001
        System.out.println((int)7.9+(int)(6.7));//13

        short x=32785;
        short y=60;

        System.out.println(x+y);*///type conversion(Tip Dönüşümleri)
/*       //int x=-7;
       // System.out.println(x);
       // int y=+3;
       //System.out.println(x);// burada x e atama yapmadık onun için x değişmedi assign edilen z değişti.
        //System.out.println("z->"+z);

       // x++;//x=x+1 incremental statement
      ///  System.out.println(x);

       // x--;// x=x-1 decremental statement. Bu bir Statementtır. Bir expression değildir
       // System.out.println(x); //her seferinde 1 birim azaltır. 5 kez yazarsak -5 düşmüş olur.

        int x=3;
        int y=2;
        int z=x+y;
        System.out.println("x ="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);

        int x=2;
        int y=x++;//önce yukarıdan 2 geldi y'ye assign etti. y=2 oldu sonra ++ artırıldı x.x=3 çıkar y=2 oldu
        System.out.println(y);
        //int a=50;
        //a=--a + a++ + a-- + a++;
       /System.out.println("a="+a);

       int a=1;
        a= -a-- + a++/ -a-- *--a;
        System.out.println(a);
        int a=1;
        a= a++/ -a-- * --a;
        System.out.println(a);

            int a=0;
            a=a+3; //a+=3;

        System.out.println(a);*/  //artırma ++ azaltma operatörleri
/*boolean a=5>3;//true
    boolean b=5<3;//false
    boolean c=5!=3;//true
    boolean d=5==3;//false
    boolean e=5<=5;//true
    boolean g=5<5;//false
    boolean h=5>=5;//true
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(g);
        System.out.println(h);


        int firstNumber=65;//true
        int secondNumber=54;//true
        System.out.println(firstNumber>secondNumber);
        System.out.println("1st Number is greater than 2nd Number= "+(firstNumber>secondNumber));
        System.out.println("These two numbers are equal = "+(firstNumber==secondNumber));*/ //(Relational Operators)Kıyaslama operatörleri
        //Logical Operators=Zor durumlarda şartları birleştirmek için kullanılırlar, &,&&,|(alt ve >< tür) ^
        //and operatörü & durumları---> Belirleyici olan false'tur. Biri bile False olsa hepsi false olur.
  /*          boolean res1=false&false;
            boolean res2=true&false;
            boolean res3=false&true;
            boolean res4=true&true;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);
       //   pipe | or operatörü---> Belirleyici olan true'dur. Biri bile True olsa hepsi true olur
        boolean res1=false|false;
        boolean res2=true|false;
        boolean res3=false|true;
        boolean res4=true|true;
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

        //xor ^ operatörü
        boolean res1=false^false;//false  AYNILARI FALSE OLUR.
        boolean res2=true^false;//true  ZITLAR TRUE OLUR.
        boolean res3=false^true;//true
        boolean res4=true^true;//false
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

        //  || SHORT CUT//short circuit(2'li kullanma) operatörü==> yani sona kadar bakmaz bir tanesi bile true ise diğerlerine bakmaz
        boolean res1=false||false;//false                       //bi tane true bulursa işlemi keser gerisine bakmaz
        boolean res2=true||false;//true
        boolean res3=false||true;//true
        boolean res4=true||true;//TRUE
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

         // && SHORT CUT//short circuit(2'li kullanma) operatörü==> yani sona kadar bakmaz bir tanesi bile false ise diğerlerine bakmaz
        boolean res1=false&&false;//false                       //bi tane false bulursa işlemi keser gerisine bakmaz
        boolean res2=true&&false;//false
        boolean res3=false&&true;//false
        boolean res4=true&&true;//TRUE
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        System.out.println(res4);

        System.out.println((5<2)&&(2>=3));  //false  &  ve && aynı true&true true geriye kalan tüm durumlar fals'tur.'
                         //false&&false yani sonuç false

        //Logical değil(not) operatörü !
        boolean res100=true;
        System.out.println(res100);  //sonuç true
        // peki değilini alırsak
        boolean res101=!true; //true değil cevap FALSE çıkar.   !false=true !true=false
        System.out.println(res101);

        5 in Binary karşılığı önce 8 tane 0 koyarız. => 00000000   5 yazmak için 2lik sistemde 00000101=5
        3 ün Binary karşılığı önce 8 tane 0 koyarız. => 00000000   3 yazmak için 2lik sistemde 00000011=3 1*2^0+1*2^1=3

        byte b1=5;
        byte b2=3;
        int r1=b1&b2;
        int r2=b1|b2;
        int r3=b1^b2;
        System.out.println(r1);//1
        System.out.println(r2);//7
        System.out.println(r3);//7
      // /00000101=5  //yukarıdan aşağı her basamağı topla 1 1  =>1 true  1  0 =>0 false  0  0 =>0 false
      // /00000011=3
      //&:00000001=> 1 1 yukarıdan aşağı doğru geri kalan durumlarda hep 0 yani sonuç 1 & operatörüyle
      //|:00000111=> 7=>1+2+4   false(0) |(veya) false(0)=>false(0) geri kalan tüm durumlar true yani 111
      //^:00000110=> 6=>2+4  xor  ^ opertörü sadece zıtlıklar true(1)    aynıları false(0) olur 1 1(0) false  0  0 false(0)
 */ //logical operatörler &  |  !  ^  true false durumları


        //KRİPTOLAMA YAPMA char ile  xor ^ bunun mantığı kriptolama//passwordlar bankalar bunun çok daha karışık haliyle kriptolayıp internete veriyor bunu sadece key anahtarına sahip kişi çözebilir.
      /*  char d1='M';
        char d2='E';
        char d3='S';
        char d4='A';
        char d5='J';

       // int key=5;   // belirli bir anahtarla 5 ile kripto yapıyoruz sonra aynı key ile kriptodan normal eski haline döndürür.
        char c1= (char)(d1^key);// xorlama yapıyoruz. Birbirinin zıttı iki durum true gerisi false olur.
        char c2= (char)(d2^key);
        char c3= (char)(d3^key);
        char c4= (char)(d4^key);
        char c5= (char)(d5^key);
        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.print(c4);
        System.out.print(c5);// ==>H@VDO bu kripto hali bunun tersini alırsak şifre kalkar.

        System.out.println();
        char e1= (char)(c1^key);// xorlama yapıyoruz. Birbirinin zıttı iki durum true gerisi false olur.
        char e2= (char)(c2^key);
        char e3= (char)(c3^key);
        char e4= (char)(c4^key);
        char e5= (char)(c5^key);
        System.out.print(e1);
        System.out.print(e2);
        System.out.print(e3);
        System.out.print(e4);
        System.out.print(e5); //--->MESAJ---> Tersi alınmış hali ile şifre kalkar.*/
        //GÖREV: KLAVYEDEN 5 KARAKTERLİK BİR MESAJ GİRİŞİ YAPILACAK. ELDE EDİLEN MESAJIN KARAKTERLERİ BİR ANAHTAR (7)İLE ŞİFRELENECEK
        //ŞİFRELENEN MESAJ EKRANDA GÖSTERİLECEK
       /* Scanner input=new Scanner(System.in);
        String z=input.next();

        char a1=z.charAt(0);
        char a2=z.charAt(1);
        char a3=z.charAt(2);
        char a4=z.charAt(3);
        char a5=z.charAt(4);
        int key=7;
        char b1= (char)(a1^key);
        char b2= (char)(a2^key);
        char b3= (char)(a3^key);
        char b4= (char)(a4^key);
        char b5= (char)(a5^key);

        System.out.print(b1);
        System.out.print(b2);
        System.out.print(b3);
        System.out.print(b4);
        System.out.print(b5);
        //EķKnJ

        Scanner input=new Scanner(System.in);
        String m=input.next();
        char a=m.charAt(0);
        char a1=m.charAt(1);
        char a2=m.charAt(2);
        char a3=m.charAt(3);
        char a4=m.charAt(4);
        int key=7;
        char s1=(char)(a^key);
        char s2=(char)(a1^key);
        char s3=(char)(a2^key);
        char s4=(char)(a3^key);
        char s5=(char)(a4^key);
        System.out.print(s1);
        System.out.print(s2);
        System.out.print(s3);
        System.out.print(s4);
        System.out.print(s5);

        Scanner io = new Scanner(System.in);

        System.out.print("İlk karakter:");
        char first = io.next().charAt(0);
        System.out.print("İkinci karakter:");
        char second = io.next().charAt(0);
        System.out.print("Üçüncü karakter:");
        char third = io.next().charAt(0);
        System.out.print("Dördüncü karakter:");
        char fourth = io.next().charAt(0);
        System.out.print("Beşinci karakter:");
        char fifth = io.next().charAt(0);
        int key= 13;
        char $1=(char)(first^key);
        char $2=(char)(second^key);
        char $3=(char)(third^key);
        char $4=(char)(fourth^key);
        char $5=(char)(fifth^key);
        System.out.print($1);
        System.out.print($2);
        System.out.print($3);
        System.out.print($4);
        System.out.print($5);



        package academy.learnprogramming;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

        class Main {
            public static char[] encoding(String text) {
                char[] chars = text.toCharArray();
                char[] encoded = new char[5];
                int key = 7;
                for (int a = 0; a < chars.length; a++) {
                    encoded[a] = (char) (key ^ chars[a]);
                }

                return encoded;
            }
            public static void main(String[] args) {
                Scanner input = new Scanner(in);
                out.println("type text with lenght 5");

                out.println(Arrays.toString(encoding(input.nextLine())));


                Scanner input = new Scanner(System.in);
                System.out.println("Nahricht eingeben : ");
                String a = input.next();

                char a1 = 'N';
                char a2 = 'A';
                char a3 = 'L';
                char a4 = 'A';
                char a5 = 'N';

                int key = 7;

                char z1=(char) (a1^key);
                char z2=(char) (a2^key);
                char z3=(char) (a3^key);
                char z4=(char) (a4^key);
                char z5=(char) (a5^key);

                char n1=(char) (z1^key);
                char n2=(char) (z2^key);
                char n3=(char) (z3^key);
                char n4=(char) (z4^key);
                char n5=(char) (z5^key);

                System.out.println("\t");

                System.out.print(n1);
                System.out.print(n2);
                System.out.print(n3);
                System.out.print(n4);
                System.out.print(n5);

                Scanner scan=new Scanner(System.in);
                System.out.println("Beş karakterli bir kelime giriniz: ");
                String kelime= scan.nextLine();
                char a=kelime.charAt(0);
                char a1=kelime.charAt(1);
                char a2=kelime.charAt(2);
                char a3=kelime.charAt(3);
                char a4=kelime.charAt(4);
                int key=7;
                char b1=(char)(a^key);
                char b2=(char)(a1^key);
                char b3=(char)(a2^key);
                char b4=(char)(a3^key);
                char b5=(char)(a4^key);

                String m2=""+b1+b2+b3+b4+b5;

                System.out.println(m2);

        Scanner scan = new Scanner(System.in);
        System.out.println("mesaj giriniz:");
        String m = scan.nextLine();
        String c = "";

        int key = 7;
        for (int i = 0; i < m.length(); i++) {
            c += Character.toString(m.charAt(i) ^ key);
        }
        System.out.println(c);*/
       /* int value=-5;
        int mutlakDeger=value<0?-value:value; // 0'dan küçük ise (-5 ise)value<0? kısmı çalışacak. değilse :value bu kısmı çalışacak
        System.out.println(mutlakDeger);*/ //MUTLAK DEĞERLER
 /* 24.ders      a) if YAPILARI: Programın akışına istinaden talepler doğrultusunda işlemler yapabilme
         2 değişkenimiz var
         int x=20;
          if (x==20) {
             System.out.println("X sayısı 20'ye eşittir");
        Burada kişinin yetişkin olduğunu test ediyoruz.
         int yas=20;
          if (yas>=18) {
              System.out.println("Kişi Yetişkindir");
         Kişi yetişkindiri bulduk ama olmadığı durumları yazmadık şimdi bunu yazalım. 2 durumu denemek için if ve else kullanaırız.
        int yas=17;
         if (yas>=18) {
             System.out.println("Kişi Yetişkindir");
         }else {
             System.out.println("Kişi Yetişkin Değildir");
        }
        //BUDA TAMAM.  Bazende 2 değilde 3 durumu bulmamız gerekir. büyük müdür küçük müdür birde eşitmidir. 3 şart geliyor
        int x=30;
        int y=40;

        if (x>y) {
            System.out.println("X BÜYÜKTÜR");
        }    else if(y>x) {
            System.out.println("X küçüktür");
        }else {
            System.out.println("İkisi birbirine eşittir");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Yaş Giriniz : ");

        int yas = input.nextInt();
        if (yas >= 18) {
            System.out.println("Siz Yetişkinsiniz");
        } else {
            System.out.println("Siz Yetişkin Değilsiniz");

        }


        Scanner input = new Scanner(System.in);
        System.out.print("Yaş Giriniz : ");

        int yas = input.nextInt();

        if (yas < 13) {
            System.out.println("Çocuktur");

        } else if ((13 <= yas) && (yas <= 17)) {
            System.out.println("Ergendir");

        } else {
            System.out.println("Yetişkindir");
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Yaş Giriniz : ");

        int yas = input.nextInt();

        if (yas < 13) {                    //yaş 13 altı ise direk buraya girer. Eğer 13 ve üstü ise bir aşağıya girer
            System.out.println("Çocuktur");

        } else if (yas < 18) {              //yaş 18 altı ise direk buraya girer.
            System.out.println("Ergendir");

        } else {
            System.out.println("Yetişkindir");  // 18 ve üstü ise buraya girer.
        }*/ //if,  if else if else if else istediğin kadar artırabilirsin ama en son else koyacaksın.

        //SWITCH
        //switch VE caseler var. Switchler (tren makası ingilizcede) tren geliyor yön değiştiriyor.
        //İf te conditionun içine girer şarta uymuyorsa diğer şarta girer.
        //Ama Switch'te break herzaman konulmalıdır. Yoksa ifteki gibi eşleşme durumuna bakmaz break yoksa bütün caseleri dolaşır en son karar verir.
        //ifte her bir condition için ayrı blok açıyorduk ama switchte bir blok açılır caseler : ile sıralanır. en son blok kapanır.
        //switchteki default hiçbir seçim ile eşleşmezse çalışır. Mesela 5 değeri versen  Hiçbiriyle Eşleşmedi sonucu çıkar.
//        int secim=1;
//        switch (secim) {
//            case 1:
//                System.out.println("1");
//            case 2:
//                System.out.println("2");
//            case 3:
//                System.out.println("3");
//            default :
//                System.out.println("Hiçbiriyle Eşleşmedi");
//        }
        //       1
        //       2
        //       3
        //       Hiçbiriyle Eşleşmedi
        //sonucu çıktı yani break yazılmadığı için herbirini çalıştırır. Ama hepsine break yazarsan İf gibi
        //çalışır. Yaptığın seçimde durur.

        //Şimdi Break koyup deneyelim.
//        int secim=1;
//        switch (secim) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default :
//                System.out.println("Hiçbiriyle Eşleşmedi");
//                break;
//        }
        // 1 sonucu çıkar sadece.
//görüldüğü üzere break; koyarsan int seçim=1 dediğinde sadece case1'i buluyor bulunca break yapıp kalıyor.

        //Klavyeden girdi alıp Switch kullanarak 4 işlem yapma
/*
        Scanner input=new Scanner(System.in);
        System.out.println("DÖRT İŞLEM");
        System.out.println("-".repeat(15)); //15 tane -----koyar tek tek uğraşmaktan kurtulursun
        System.out.println("1.TOPLAMA : ");
        System.out.println("2.ÇIKARMA : ");
        System.out.println("3.ÇARPMA : ");
        System.out.println("4.BÖLME : ");

        System.out.print("Seçiminiz : ");

        int secim= input.nextInt();

        switch (secim){
            case 1:
                System.out.println("TOPLAMA İŞLEMİ");
                System.out.print("Sayı 1 : ");
                int sayi1=input.nextInt();

                System.out.print("Sayı 2 : ");
                int sayi2=input.nextInt();
                System.out.println("Sayıların Toplamı= "+(sayi1+sayi2)); //  +(sayi1+sayi2) toplama işlemini + ile soldaki Sayıların toplamına concodanete birleştirme yapıyoruz.
                break;
            case 2:
                System.out.println("ÇIKARMA İŞLEMİ");
                System.out.print("Sayı 1 : ");
                sayi1=input.nextInt();

                System.out.print("Sayı 2 : ");
                sayi2=input.nextInt();
                System.out.println("Sayıların Çıkarması= "+(sayi1-sayi2));
                break;
            case 3:
                System.out.println("ÇARPMA İŞLEMİ");
                System.out.print("Sayı 1 : ");
                sayi1=input.nextInt();

                System.out.print("Sayı 2 : ");
                sayi2=input.nextInt();
                System.out.println("Sayıların Çarpması= "+(sayi1*sayi2));
                break;
            case 4:
                System.out.println("BÖLME İŞLEMİ");
                System.out.print("Sayı 1 : ");
                sayi1=input.nextInt();

                System.out.print("Sayı 2 : ");
                sayi2=input.nextInt();
                System.out.println("Sayıların Bölmesi= "+((double)sayi1/sayi2));
                break;
            default:
                System.out.println("Yanlış Seçim Yaptınız!");
                break;*//// HESAP MAKİNESİ
/*
        //1-15 arası sayıların toplamı nedir?
        int toplam=0;
        for (int i = 1; i <=15; i++) {
            toplam=toplam+i;
        }
        System.out.println(("Toplam= "+toplam));
*///1-15 arası sayıların toplamı nedir?  for döngüsü
      /* for (int i = 5; i <=140 ; i+=2) {
            System.out.println("i ="+i);

            for (int i = 5; i <=140 ; i+=2) {
                System.out.println(i+",");*/  // 5 dahil 140 hariç 5-140 arası tek rakamları yazdır
   /*     int toplam=0;
        for (int i = 0; i < 5; i++) {
            toplam+=i;

        }
        System.out.println(toplam);*/ // 0 dan 5 e kadar olan sayıların toplam yukarıda önce toplam değişkeni tanımlıyoruz int toplam=0; gibi.
     /* int toplam=0;
        int sayiAdedi=9;
        for (int i = 0; i < 10; i++) {
            toplam+=i;
        }
        System.out.println("toplam ="+toplam);
        double ortalama=toplam/sayiAdedi;
        System.out.println("ortalama ="+ortalama);

        double a=70;
        double b=80;
        double c=90;
        double ortalama=(a+b+c)/3;
        System.out.println(ortalama);

        //ortalama içim
        double sum=0;
        int count=0;
        for (int i = 0; i <10 ; i++) {
            sum+=i;
            count++;
        }
        System.out.println("Average of the numbers "+(sum/count));*/ //1) for döngüsüyle ortalama  2) (a+b+c)/3; ortalama //count++ olarakda yazılır.
     /* for (int i = 1; i <100 ; i+=2) {
            System.out.println(i);*/
      /*  int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;//2+4=6  çift sayıları i=2..98 sumOfEvenda tutuyoruz toplamı
            } else {
                sumOfOdd += i;//1+3+5=9  tek sayıları i=1...99 sumOfOddda tutuyoruz toplamı
            }
        }
        System.out.println(sumOfOdd);
        System.out.println(sumOfEven);
        int toplam=sumOfEven+sumOfOdd;
        System.out.println("toplam ="+toplam);// odd number verimli i+=2 kod verimsiz kod if(i%2==0){ sumofeven { else { sumofodd  /tek ve çift sayı toplamı
        *///1 den 100 e kadar sayılar ama 100 hariç==even(çift) and odd(tek) number sayıların toplamını göster.
       /* int carpim=1;
        for (int i = 2; i <=10 ; i++) {//kısaca 10! =3628800
            carpim*=i;
        }
        System.out.println("carpim= "+carpim);
        int carpim=1;
        for (int i = 1; i <4 ; i++) {
            carpim*=i;

        }
        System.out.println("3! ="+carpim); //  */ //for döngüsü ile çarpım
        /*System.out.println("Number\tNumberSquare");
        System.out.println("-".repeat(20));
        int number=1;
        for (int i = 1; i <=10; i++) {  //10 dahil deyince i<=10 küçük eşit deriz
            System.out.println(" "+i+"\t\t"+(i*i)); // i yazınca 1-10 arası aşağı doğru sıralar.--\t ile boşluk verdim (i*i) deyince yanına karelerini yazar

           // System.out.println(" "+i+"\t\t"+(i*i)); bunu uzun uzun şöyle () -> yazarız

            System.out.println(i);
            System.out.println("\t\t");
            System.out.println(i*i);  System.out.println(" "+i+"\t\t"+(i*i)); //bunun aynısı ama bu uzun komuta gerek yok.
           // String format lada bunun aynısını yazarız souf
        System.out.println("Number\tNumberSquare");
        System.out.println("------\t-----------".repeat(1));

        for (int i = 1; i <=10; i++) {
            System.out.printf("%d\t\t%d\n",i,i*i);//%d desimal number araya boşluk sonra decimal tamsayıları , i,i*i
        }
     /*  System.out.println("Number\tNumber Squared");
        System.out.println("--".repeat(15));
        for (int i = 1; i <= 10; i++) {
           System.out.println(i + "\t\t" + (i * i));*/// Bir döngüyle 1'den 10'a kadar olan sayıların kendilerini(Number) ve karelerini (Number Squared) gösteren tablo yap.
          /*     //DÖNGÜ ADEDİMİZ BELLİYSE 1-100 GİBİ FOR DÖNGÜSÜ KULLANIRIZ
            //DÖNGÜ ADEDİ BELLİ DEĞİLSE WHİLE DÖNGÜSÜ KULLANIRIZ.

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {        // i sayımızı 1...99 arası mod 3 deyince 3'e kalansız bölünen sayıları getirir.
                System.out.print(i + " ");
            }
        }
        System.out.println();
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0) {        // i sayımızı 1...99 arası mod 5 deyince 3'e kalansız bölünen sayıları getirir.
                System.out.print(i + " ");
            }

        }
        System.out.println();
        for (int i = 1; i < 100; i++) {
            if (i % 15 == 0) {        // i sayımızı 1...99 arası mod 15 deyince 15'e kalansız bölünen sayıları getirir.
                System.out.print(i + " ");
            }
        }//yada
        System.out.println();
        for (int i = 1; i <100 ; i++) {
            if(i%3==0&i%5==0){        // Mantıksal operatörle & ile iki durumu birleştirip yazabiliriz.
                System.out.print(i+" ");*///1-100 arası 1'e 5'e ve herikisine bölünebilen sayıları yazan bir java programı yapınız.
      /*  //MPH=KPH*0,6214 FORMÜLÜ

        System.out.println("KPH\t\tMPH");//KM PER HOUR(Saatte yapılan hız)   VE  ML PER HOUR
        System.out.println("---\t\t---");
        for (int i = 10; i <= 130; i += 10) {   //sayaç isimleri i yerine count sayac herşey olabilir ama uzun olmasın diye dıştaki döngüye i içteki döngüye j denilir.
            double MPH = 0.6214 * i;
            // System.out.println(i+"\t\t"+MPH);//PRİNTLN BİR ALT SATIRA GEÇİRİYOR HEPSİNİ// BÖYLE YAZARSAK KÜSURLARI ÇOK UZATIR.
            System.out.printf("%d\t\t%4.2f\n",i,MPH);// printf komutu aşağıya gitmez \n konulur.kural1- %d desimal i'yi %f float'ı 4.1f yazdık 4 dört haneli.1 ise virgülden sonra sadece 1 basamak olması içindi.
        }*///Saatte yapılan km/saati Mile çevireceğiz. Km'de 10 dan başlatıp 10'ar 10'ar artırıp 130 km da bitireceğiz
  /*      Scanner input=new Scanner(System.in);
        System.out.print("Kaç İşlem Yapmak istersiniz?  : ");
        int count=input.nextInt();
        if(count<1){
            System.err.println("en az bir işlem yapacaksın adamı delirtme");//system.out.println=> out yerine err. yaparsan kırmızı yazar
            System.exit(10);  //System.exit dersen döngüden uyarı mesajıyla birlikte çıkar
        }


        for (int i = 1; i <= count; i++) {  // kaç kez giriş yapacağına şahıs karar verir.

        System.out.print("1.Sayiyi Giriniz : ");
        int n1= input.nextInt();             //sayıyı burda tutarız--klavyeden yani kullanıcıdan alırız.
        System.out.print("2. Sayıyı Giriniz  : ");
        int n2= input.nextInt();

            if(n1>n2) {                             // şart olarak ya büyük ya küçük yada eşittir. Başka seçenek yok.
                System.out.println("1.Sayi Büyüktür.");
            }else if(n2>n1) {
                System.out.println("2.Sayi Büyüktür");
            }else{
                System.out.println("Bu iki Sayi Eşittir");


            }
            System.out.println();
        }
    }*/ //kaç kez giriş yapacağına şahıs karar verir. 2 sayı bibbirinden küçükmü büyükmü eşitmi şartlarından
       /* Scanner input=new Scanner(System.in);
        System.out.println("MULTIPLICATION TABLE FOR NUMBER");
        System.out.println("--".repeat(10));
        System.out.print("1-10 arası bir sayı giriniz : ");
        int sayi=input.nextInt();

        for (int i = 1; i <=10; i++) {
                System.out.println(sayi+"*"+i+"="+(i*sayi));*/// 1-10 arası bir sayi girin klavyeden ve seçtiğin sayı ile i sayacını çarptır.
/*
        for (int i = 0; i < 5; i++) {  //5.sütunlarını dik kısımları (0;0)(0;1)(0;2)(0;3) 0'lar i leri//DIŞ SÜTUN
            for (int j = 0; j < 4; j++) {// 4. satırları 0 ın yanındaki 4 rakam j leri gösterir.//İÇ SÜTUN
                System.out.print("("+i+";"+j+")");
            }
            System.out.println();

        for (int i = 0; i <7; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");

            }
            System.out.println();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <=i; j++) {//j hep sıfır i arıyor her artışışında 1 yıldı daha fazla basıyor.
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < 7; i++) {
            for (int j = 1; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");*/ //  İçiçe döngülere NESTED FOR LOOP DA DENİR. For içinde for döngüsü İ J  GİBİ----While içinde for döngüsüde kullanılırılı
     /*  Scanner input=new Scanner(System.in);

        System.out.println("ÇARPIM TABLOSU");
        System.out.println();
        System.out.println("-".repeat(10));
        System.out.println();
        System.out.print("Bir sayı giriniz:");
        int sayi= input.nextInt();


        for (int i = 1; i <=10 ; i++) {
            System.out.println(sayi+"x"+i+"="+sayi*i);
            for (int i = 0; i < 5; i++) {
            System.out.println("dıştaki yani 0'dan başlayıp 5'e kadar olan döngü");
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.println("içteki yani 0'dan başlayıp 4'e kadar olan döngü");
                System.out.println(i+"*"+j +"="+i*j);
//Dışarıda 5lik döngü içerideki 4 lüğün üzerinden 5 kez geçer. 1.kez 4 tur atar, 2. kez 4 tur atar ...5.kez 4 tur atar
//5 kez * 4 tur= 20 kez dönmüş olur.
      */
   /*   for (int i = 0; i < 7; i++) {//sütun dikey
            for (int j = 0; j <=i; j++) {//satır yatay yazar
                System.out.print("* ");//* dan sonra bir boşluk güzel gözüksün diye

            }
            System.out.println(); //üstü bir satır yazdı çıktı bloktan sonra burada bir enter verip aşağıya indi
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println("#");

           for (int i = 1; i <=7; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(j+" ");

                }
                System.out.println();
           //WHİLE DÖNGÜSÜ
            int sayac=0;          //ÖNCE SAYACIMIZI YAZARIZ KAÇTAN BAŞLAYACAĞINI
            while (sayac<5) {       //SAYAC 5 TEN KÜÇÜK OLDUĞU MÜDDETÇE DÖNDÜR.

                System.out.println("Merhaba");
                sayac++; ile 1 artırdı herseferinde 5 <5 olunca artık döngüden çıkıldı mesajı gelir.
            }
            System.out.println("Döngüden çıkıldı"); //    WHİLE DÖNGÜSÜ

            Scanner input=new Scanner(System.in);         //Çoğu zaman bilemezsin ne kadar dönmen gerektiğini
            while (input.hasNext("A-Z")){  hasNext "yani bir sonrası varmı" demek Klavyeden bir şey girilmişse iş yapıyor yoksa çalışmıyor çıkıp gidiyor.
            çalışıyor bu döngü girilmemişse çalışmıyor. Bu döngüden çıkılıp gidiliyor.
            (A-Z) A'dan Z'ye değerler girilmişse çalışsın girilmemişse çalışmasın çıkıp gitsin.

        Scanner input = new Scanner(System.in);         //Çoğu zaman bilemezsin ne kadar dönmen gerektiğini while kullanılır bu durumda
        while (input.hasNext("[a-zA-Z]+")) {   A veya Z arası bir harf girersem bloğun içine giricek yoksa çıkıp gidicek.
        // rakam girsem yada küçük harf girsem false döner. A-Z arası bir harf girersem TRUE döner ve çalışır.
        Gürhan yazsam çıkar ü burada a-zA-Z arasında yok bir ü harfi bir ASCII kodu değildir.
        //  ileride veri tabanları dosyalardan veri okuma bu tür durumlarda For döngüsünü kullanamayacağız. Çünkü neyin gelip neyin gelmediğini bilmiyoruz.
        //Bu tür TRUE ve FALSE döndüren yöntemleri WHILE içinde kullanıyoruz.Bir veri byte akışı varsa burdan TRUE döner ve buradan işlem yaparsınız.
        //Mesela bir dosya kopyalayacağınız vakit bir dosyanın içeriğini başka bir dosyaya Aynı Windowsdaki gibi
        //ama biz kendimiz yapıcaz javada bunu dosyayı açıp(geri planda RAM'DE) byte byte okuyup sonra onu başka bir dosya üzerine
        //yazıcaz işte bu tür durumlarda While döngülerini kullanıp hala veri geliyorsa döngü devam ediyor. Veri gelmeyip dumuşsa artık veri yoksa
        //iptal edip döngüden çıkıyor.



            System.out.println(input.next()); */ //WHILE DÖNGÜSÜ


        // odd numbers between 5-140 in same line
        // int dayNumber = 17;
/*        switch (dayNumber){
            case 1:
                System.out.println("Pazartesi");break;
            case 2:
                System.out.println("Salı");break;
            case 3:
                System.out.println("Çarşamba");break;
            case 4:
                System.out.println("Perşembe");break;
            case 5:
                System.out.println("Cuma");break;
            case 6:
                System.out.println("Cumartesi");break;
            case 7:
                System.out.println("Pazar");break;
            default:
                System.out.println("Yanlış girildi.");break;
        }*/   // switch() parantez içinde expression alır Blok içinde caselerimiz olur.case1 case2...
        //en so da yazmak istersek bir default yazabiliriz. Her case'in sonuna eğer bir break yazarsak yazmayadabiliriz.
        //Eğer yazmışsak break; o case kendi başınadır sanki bir if şartı gibi oluyor o case kendi başına çalışıyor.
        //Ama break yazmak zorunda değiliz. Eğer caselerin sonuna break yazmazsak nerden giriş yaptıysa sonuna kadar
        // bütün caseleri tek tek dolaşır break'ı yazmazsak. break optionaldir seçiliktir
        // en sona default koymak zorunda değiliz.
        //Caselerin etiketlerini çalışma zamanında-runtime değiştirmiyoruz. Case 1 case A bunlar case etiketleri ve daha dizayn yaparken
        //en başta belirleriz.
        //switch () parantezin içindeki expressiondan saddece bir tane değer gelmesi gerekirki oda case ile eşleşssin-Match olsun.
        //Collection of values dediği yani birden fazla değer gelemez bir tane expression gelir.
        //switch(true){--->switch () parantezi içine boolean Yani TRUE FALSE GELEMEZ. Bu yasak. an numaration gelebilir.

//        char colorCode = 'y';
//        switch (colorCode) {
//            case 'r':
//                int color = 100;  //Burada 3 farklı case var color sadece burada initialized edilmiş.
//                                // Case içindeki diğer yerlerde initialized etmeye gerek yok.
//                                // Bir blokun içinde tanımlanan sadece o blokun içinde geçerli olur. başka bir case içinde tekrar tanımlamaya gerek yok.
//                break;          //blok zaten en üstte ve en altta var.
//                                //ama sorun blokun dışına çıkınca system.out.println(color) bunu compile etmiyor. çünkü int color blok içinde tanımlanmış. bu ise blok dışında
//                                //çözümü en üste blokunda üstünde bir yere  int color='y'; color değişkenini tanımlasaydık sorun olmazdı.
//            case 'b':
//                color = 10;
//                break;
//            case 'y':
//                color = 1;
//                break;
//        }
//        System.out.println(color);// hata burada oluyor.
//        }
        //           boolean opt=true; // boolean opt=1; olmaz TRUE VE FALSE DIŞINDA FARKLI BİR DEĞER ALMAZ.
        //           switch(opt){ //switch () parantez içine bir boolean değeri almaz. bunun yerine String opt="True" desen Switc(true)olurdu bunu boolean olarak almaz String olarak alır. ////SW
/*        switch (dayNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Wrong case");
                break;
        }


        int k1=15;
        int k2=10;

        switch (k1*k2){
            case 15:
                System.out.println("Kargo için uygundur.");




                break;
            case 20:
                System.out.println("Kargo için uygun değil");
                break;
            default:
                System.out.println("Girilen verilerle hesaplama yapılamaz.");*/
//        int secim=1;
//        switch (secim) {
//            case 1:
//                System.out.println("1");
//                break;
//            case 2:
//                System.out.println("2");
//                break;
//            case 3:
//                System.out.println("3");
//                break;
//            default :
//                System.out.println("Hiçbiriyle Eşleşmedi");
//                break;
//        }
     /*
      GOOGLE IN MİLYARLARCA MÜŞTERİSİ VAR-BİZ BUNLARI int x=10; diye gösteremeyiz. Bizim bir yapıya ihtiyacımız var. Aynı tip verileri belirli bir
      // belirli bir index numarası içinde sayıya erişebileceğimiz bir yapıya ihtiyacımız var. Biz böyle bir yapıya array dizi diyoruz.
      // Bu yapı nasıl bildiriliyor tanımlanıyor sorgulanıyor. İçindeki veriye ne maksatla ulaşıyyoruz. Yani sadece okuyabiliyormuyuz
      //yoksa oraya veride kaydedebiliyormuyuz.Çünkü bazen öyle veri yapıları varki sonradan değiştirilemiyor.
      // Array denilen yapı bir referans tiptir. Hafızayı stek ve heap diye ikiye bölmüştük.Tüm primitive tiplerinbulunduğu steak
      //değilde referans tiplerin bulunduğu yani nesnelerin bulunduğu stringlerin bulunduğu yerde tutulur yani heaptedir nesneler.
      yapı
      şöyle bildirilir. Önce tipini belirleriz. Bu dizi paket içinde tamsayımı metinlerimi(Stringleri) kesirli sayıları yada metinleri tutabilirim.
      veya daha gelişmiş tipleride tutabiliriz.
      int[] sayilar; bu bir bildirim  []köşeli parantez operatörü bu artık burda bir dizi array tanımlanacğını gösterir.
      int[] sayilar;
      String[] aylar;
      String[] gunler;
      String[] ogrenciler;  hep çoğul kullanıyoruz. birden çok hepsinde
      double[] agirliklar; birden çok kimsenin kilosunu tutabiliriz. Bu arada bir tanede veri tutabiliriz hep çoğul yapmak zorunda değiliz.
      int[] sayilar; bildirim-deklarationdır. veri tipi(int,char,double) + köşeli parantez[] + değişken ismi--> sayilar arabalar skorlar

        int[] sayilar; bu stek(solda) ve heap(sağda) vardı hafızada.  bu şekilde bildirince stekte bu oluşuyor. int x=5; bu bir binary olarak 00000101 olarak tutuluyor.
       int x=5; stekte bir değer olarak tutuluyor.
       ama int[] sayilar; dizisi bildirimi stekte bir değer olarak tutulmuyor. Bir adres tutuluyor. sayılar değişkeni içindede bir adres tutuluyor.
       Heapteki bir nesnenin adresi stekte sayılar değişkeni içinde tutuluyor.
       sayilar=new int[] sayilar değişkenini heapte new operatörüyle oluşturuyoruz. new operatörü gerekli
        int[] sayilar; bildirimdir. Sadece stektedir. stekteki bu sayılar değişkeni içinde null vardı yani 0 dı bir adress yoktu.
        sayilar=new int[3]; artık initialized edildi.
        bunu şöylede yazabiliriz.
        int[] sayilar=new int[3]; artık 3 elemanlı bir sayilar dizimiz nesne oldu initialized edildi ve heapte. Artık null değil.
                                int veri tipli 3 elemanlı bir nesne oluşturuldu ve bu nesnenin başlangıç adresi stekteki sayılar değişkenine
                                atandı. Steakteki sayılar değişkeni artık null değil bir adres atandı. Null değil.
                                Heapte bir nesne oluşturuluyorsa new operatörü çalışmış demektir. New operatörünün görevlerinden birisi
                                başlangıç değerlerini assign etmek atamaktır.
                                int ın varsayılan değerleri 0'dır. Biz bir atamada bulunmasak da new operatörü onu 0 olarak atar.
                                Bir dizinin elemanlarına index numarasıyla ulaşırız.

      int[] sayilar;


        String[] aylar;
        String[] ağırliklar;      //kiloları belirli bir dizin içinde tutuyoruz.  // 1'de olsa tutulur.


        int[] sayilar; // Steakte şu anda bir adres bulunmuyor. NULL'dür yani boştur. Burda initialized edilmemiş.Sadece bildirimde bulunulmuş
        sayilar=new int[3];  // Artık Heapte 3 elemanlı bir nesne oluşturuldu yani 3 tane 000 oluşturdu new operatörü. Bu nesnenin başlangıç adresi
                            // stackteki sayılar değişkenine assign edildi.
                            //New operatörünün görevlerinden bir tanesi nesneleri oluştururken başlangıç adreslerini
                            //atamasını yapar. Bir dizinin elemanlarına index numarası ile ulaşılır.
    //    sayilar[0]=5;           //sayılar nesnesinin dizisinin 0.ıncı indexindeki yani ilk elemanı 5'tir. 5i sayılar nesnesine assign ettik.
   //     sayilar[1]=7;           //sayılar nesnesinin dizisinin 1.ıncı indexindeki yani ikinci elemanı 7'tir.
   //     sayilar[2]=9;           //sayılar nesnesinin dizisinin 2.ıncı indexindeki yani üçüncü elemanı 9'tir.
    //    sayilar[3]=11;          //böyle bir index yok eleman sayısı zaten 3 bu ise 4. yani olamaz. burdaki hatayı editör,derleyici kimse görmez. Bunu runtime'da çalışma zamanında kullanıcı program kırılınca ancak görür. bu fazla  bu olmaz. çünkü new int(3) 0-1-2=> 3 elemanlı.  bu

        boolean[] booleans=new boolean[3]; //bu assign edilmemiş yani new operatörü false yazdı varsayılanı false çünkü.
        boolean[]=true; desydik assign edilmiş olucaktı ve varsayılan değer false yerine atanan True gelicekti
        int[] sayilar; assign etmediğinde int varsayılan değer 0 'dır. new operatörü otomatik 0 atar sen hiçbir şey yapmasında.
    //  float[] agirliklar=null;-->Null yazmasanda burası zaten null'dur.Ama initialized sıkıntısı olmasın diye burda yalandan null ile initialized edilir.'

        for (int i = 0; i < sayilar.length; i++) {  3<3 diyemez sayilar[3]=11; diyemez. i=0,1,2 için döner sadece.
            System.out.println(sayilar[i]);    //new bunları initialized etmiş sen etmesende, sayilar[0]=5 hepsini sil atamaların
           5 7 9 çıkar                                     //hepsi 0 sıfır çıkacak.
           int[5]sayilar; bildirimde bu şekilde ELEMAN SAYISI yazılmaz.HATA
            int[] sayilar=new int[5]; bu şekilde yazılır. initializedde yazılır eleman sayısı.
            System.out.println(booleans[i]);*///ARRAYS DİZİLER

        // değişken stekte tanımlandıktan sonra onun nesnesi heapte oluşturuluyor. Ve heapte bu nesnenin içindeki verilere
        //   index numarasıyla ulaşabiliyoruz. 6 bölmeli kutucuk (6 elemanlı) ve 0,1,2,3,4,5 totalde 6 elemanlı herbir kutucuğun
        //içerisine bilgi depoluyoruz.
/*
        String[] aylar = {"Ocak", "Şubat", "Mart", "Nisan", "Mayıs", "Haziran", "Temmuz", "Ağustos", "Eylül", "Ekim", "Kasım", "Aralık"};

        System.out.println(aylar[5 + 1 + 2]);
        //Bunun uzun hali aşağıda ayları tutacak bir dizi oluşturmamız gerekmez.
           String[] aylar=new String[12];  // bu 12 elemanın içinde hiçbir değer yok şuanda. dizi bir kez oluşturulursa bunun bir daha eleman sayısını artırma ihtimali yok. 12 13 olamaz.
            aylar[0]="Ocak";  // 0. indexe erişim demek bu
            aylar[1]="Şubat";
            aylar[2]="Mart";
            aylar[3]="Nisan";
            aylar[4]="Mayıs";
            aylar[5]="Haziran";
            aylar[6]="Temmuz";
            aylar[7]="Ağustos";
            aylar[8]="Eylül";
            aylar[9]="Ekim";
            aylar[10]="Kasım";
            aylar[11]="Aralık"; //11. indexte 12. ay olan Aralık var

             VERİYİ YAZDIRMAK İŞLEMEK
            numbers[0]=20;    ==>[0] 0. index köşeli parantez içindeki 0;
            numbers[0]=20;  burda bir assign-atama işlemi var. nasıl int x=5; bir atama işlemiyse buda öyle.
            yani 0 . indexe 20 yi (assign et)ata, koy, yerleştir demek bu.
           numbers[3]=30; 3. indexe 30 değerini ata, koy, yerleştir demek.
            VERİYİ OKUMAK
            System.out.println(numbers[0]);  //20
            System.out.println(numbers[1]);  //0
            System.out.println(numbers[2]);  //0
            System.out.println(numbers[3]);  //30
            System.out.println(numbers[4]);  //0
            System.out.println(numbers[5]);  //0


            İNİTİALİZED ÇEŞİTLERİ
            1) int [] sayilar=new int[5];  5 elemanlı ama elemanlarının içi boş int için 00000 5 tane 0 var
               --int[] sayilar;
               --sayilar=new int[5];
             boolean[] booleans=new boolean[3]; boolean için 3 elemanlı yani 3 kutucukta da FALSE FALSE FALSE var.
            float[] agirliklar=new float[5];   float için 5 elemanlı olarak her bir elemnın içinde 0.0 0.0 0.0 0.0 0.0


            2)int[] sayilar={};   buda bir initialized işlemi. Normalde new operatörüyle yapıyoruz burada yok ama.
                                  New operatörü çok kullanıldığı için gizliye alınmış görünmesede var aslında
           mesela      String str=new String("Ahmet");
                       String str2="Ahmet";   Stringin 2 farklı initialized işlemi
            tip uyumlı olmalı
            int[] sayilar={1,2,3,a,4,5}; bu tip uyumlu değil, sayılar tamam ama arada String a harfi var.

            int[] sayilar={2,3,6,7,0};  artık burada sayilar dizisinin içindeki elemanların hiç birisi 0 değil herbirine bir değer atandı
            new operatörü burda çalıştı. 0 yerine bizim atadığımız değerleri assign etti.
           int[] sayilar={2,3,6,7,0}
           System.out.println(sayilar[0]);

        //TASK
        //1)Günler dizisini oluşturunuz
        //2)Kullanıcıdan aradığı günü isteyiniz
        //3)Dizi içerisinde arayınız.
        //4)Bulunca döngüyü kırınız.
        //5)Döngüden çıkınca gün bulundu mesajı veriniz.


        String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"};
        Scanner input = new Scanner(System.in);
        System.out.println("Aradığınız gün hangisidir? :");
        int gunNo=-1;
        String gun = input.next();



            for (int i = 0; i < gunler.length; i++) {
                if(gun.equalsIgnoreCase(gunler[i])){
                  gunNo=i+1; //sayac 0 dan başladığında sıkıntı olmasın diye 1 den başlatmış oluyoruz.                                      {
                break;
            }

            }
            if(gunNo>0) System.out.println("Aradığınız gun bulundu["+gunNo+"]);
        }
    }
 /*       int x = 1;
        int y = 1;
        if (x++< ++y) {
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.println("Log" + x + ":" + y);

        int[] sayilar={2,3,6,7,0}; //5 elemanlı bir dizi bu
        System.out.println(sayilar[0]);//yazarsan 0.indexteki elemanı bana getir. Oda 2 yi getirir.
        System.out.println(sayilar[1]);
        System.out.println(sayilar[2]);
        System.out.println(sayilar[3]);
        System.out.println(sayilar[4]);
   //     2
   //     3
   //     6
   //     7
   //     0

        System.out.println(sayilar[5]); //bu olmaz çünkü hata veriri index 5 yok en fazla 4 var diye.
       // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
       // at day18Overview.KonuTekrari.main(KonuTekrari.java:1175)*/
    /*     String[] aylar=new String[12];  // bu 12 elemanın içinde hiçbir değer yok şuanda. dizi bir kez oluşturulursa bunun bir daha eleman sayısını artırma ihtimali yok. 12 13 olamaz.
        aylar[0]="Ocak";  // 0. indexe erişim demek bu
        aylar[1]="Şubat";
        aylar[2]="Mart";
        aylar[3]="Nisan";
        aylar[4]="Mayıs";
        aylar[5]="Haziran";
        aylar[6]="Temmuz";
        aylar[7]="Ağustos";
        aylar[8]="Eylül";
        aylar[9]="Ekim";
        aylar[10]="Kasım";
        aylar[11]="Aralık"; //11. indexte 12. ay olan Aralık var
       Scanner input=new Scanner(System.in);
        System.out.print("Lütfen istediğiniz ayın index numarasını giriniz : ");
        int secim=input.nextInt();
        System.out.println("Seçtiğiniz ay "+aylar[secim]); //Lütfen istediğiniz ayın index numarasını giriniz : 0
                                                          // 0.index Seçtiğiniz ay Ocak--->kullanıcı alışkanlıklarına
        //uymuyor 1. ay Ocaktır.  Ama 0.indexte Ocak çıkıyor.

        Scanner input=new Scanner(System.in);
        System.out.print("Kaçıncı Ay [1-12]: ");
        int secim=input.nextInt();
        System.out.println("Seçtiğiniz ay "+aylar[secim-1]); //secim-1 niye yazdık seçimde Ocak ayını istiyorsak
       // 0 indexine ulaşmak için 1. YANİ OCAK AYINI SEÇİCEZ ODA O.indexteki Ocağı seçicek
        Kaçıncı Ay : 1
        Seçtiğiniz ay Ocak
        Scanner input=new Scanner(System.in);
        int secim;
        do{
            System.out.println("Kaçıncı ay[1-12] : ");   //while da hiç çalışmama ihtimali var ama do while da en az bir kere döner.
            secim=input.nextInt();
        }while(secim<1|secim>12);

        System.out.println("Seçtiğiniz ay "+aylar[secim-1]);
        Kaçıncı ay[1-12] :
        0
        Kaçıncı ay[1-12] :
        13
        Kaçıncı ay[1-12] :
        86
        Kaçıncı ay[1-12] :// kulanıcıyı 1-12inin dışında farklı bir seçim yapamaması için do while dögüsü yapıyoruz.
        do döngüsünde bir sefer bile olsa bu döngüye giriş yapıyor. blok içinde kullanıcının girişini sağlıyoruz
                sonra while döngüsünde 1 de küçük veya 12 den büyük şartına göre| operatörü bir kez true gelse true döner yoksa hepsi false döner

      //TASK:
      1)Günler dizisi oluşturunuz.
      2)Kullanıcıdan aradığı günü isteyiniz.
      3)Dizi içerisinde arayınız.
      4)Bulunca döngüyü kırınız.
      5)Döngüden çıkınca aradığınız gün bulundu mesajı veriniz.

       String[] gunler = {"Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"}; //array initializer deniliyor
      Scanner input=new Scanner(System.in);
        System.out.println("Aradığınız Gün hangisidir? : ");
        String gun=input.nextLine(); //kullanıcının girdiği günü gun değişkenine assign ettim.
            int gunNo=0;
        for (int i = 0; i < gunler.length; i++) {   //enfazla bu kadar dönecek bu kadar bile dönmez biz kesicez. for döngüsü günler üzerinde gezinecek
            if(gun.equalsIgnoreCase(gunler[i])){  //gunler dizisinin i inci elemanını gunler[i]= i 0 iken pazartesi 1 iken salı 2 iken çarşamba
                gunNo=i+1;  // primitive tipleri == diye sorgulayablirim ama String bir tipi == diye sorgularsam adreslerinin eşit olup olmadığını sorgular
                            //eğer equals dersem içeriklerinin aynı olup olmadığını sorgular. equalsIgnorCase(harfduyarlılığını önemsemeden eşitmi diye bak) ide ekledikki bir harf bile büyük yada küçük olsa farklı çıkacağı için bunu önemsemez bu komut.
               break;
            }

        }
      System.out.println("Aradığınız gun bulundu! = ["+gunNo+"]");



        for (int i = 0; i < gunler.length; i++) {
            if(gun.equalsIgnoreCase(gunler[i])){       //gunler dizisinin i inci elemanı
                gunNo=i+1; //sayac 0 dan başladığında sıkıntı olmasın diye 1 den başlatmış oluyoruz.                                      {
                break;   // break bu diziyi kırar. 1000000 verimiz var sonuna kadar gidemeyiz. Çok zaman kaybı olur.
            }

        }
        if(gunNo>0) System.out.println("Aradığınız gun bulundu["+gunNo+"]);*/
    /*

    quiz
    1) Makine dili 01010 binary elektrik geçti geçmedi--yüksek seviyeli olmayan dillerden olması lazım oda Assembly dili cevabı
    2) Javada sabit constant yapmak için FİNAL anahtar kelimesini kullanıyoruz. değişmeyen PI sayısı gibi şeylerde kullanırız.
    3)  byte b=0;   // önce 0 b'ye assign edilmiş b : 0 olmuş. b aşağıya iniyor ++önce olmadığı(postfix yada suffix) için int a=b++;
        int a=b++;
        System.out.println(a);//sonuç a:0dır. // b önce sıfır olarak a ya assign edilir sonra artırılır.
         Tam tersi olsaydı int a=++b b:0 önce ++dan dolayı 1 artırılır sonra a ya assign edilirdi. a bu durumda 1 olurdu.
     4)   t=t+i;
          i=i+1; sonuç t+=i++;
          i=i++demek zaten
     5) y=4xkare+2x+5  =>y=4*x*x+2*x+5
     6)  x=x-2;   x-=2;
     7)    int x=0,y=-2;
        System.out.print(Math.min(x,y)); sonuç = -2;
     8) paket adı verilen klasör/dizin adı altında birleştirilen sayfanın en üstünde yer alan "package" day18Overview;
     9)paket oluşturma dersse= package
     programımıza ayrı bir paketi dahil etme derse bu ayrıdır. java utility
     9) Main metodu özel bir metoddur ve herzaman küçük yazılır.
     public static void main(Sring[] args) java programı derlendikten sonra çalıştırılabiliyorsa programın belli bir metodundan çalıştırılmaya başlanır. Bu metodun yazımı;
    10)     Programımıza hazır kütüphane sınıflarını dahil etmek için "import" komutu gerekir
    11) Klavyeden girilen Scanner komutu nextLine()=>bu tüm satırı okur Strinte.    next() buda kullanılır ama tümsatırı okuyamaz
    12) System.out.printf("%x",16); //%x hexal (6lık sistem) olarak yazıyor 16 sayısının hexal% karşılığı 10
        System.out.printf("\n"+"%o",16); // souf formatlı gösterim: %o oktal (8lik sistem)olarak yazıyor 16 sayısının oktal% karşılığı 16yı sürekli 8 e bölerek 20 elde edilir.

        DİZİLER OLUŞTURULUR
        1)TEK BOYUTLU(VEKTÖRLER)       []        (VEKTÖR)
        2)ÇOK BOYUTLU(MULTİDİMENSİON) [][]       (MATRİS)
        3)JAGGED DİZİLER             [][][]



         DİZİLER(BÜTÜN REFERANS TİPLER==DİZİLER=STRİNGLER YANİ NESNELER) STEAKTE TANIMLANIR HEAPTE OLUŞTURULUR VE TUTULUR.
                BÜTÜN PRİMİTİVE TİPLER(DEĞER TİPLERİ) İSE STEAKTE OLUŞTURULUR VE STEAKTE TUTULUR.
           1)Tek boyutlu diziler(VEKTÖRLER);

           int[] orenciYaslari; bildirimde bulundum ama initialized etmedim henüz.
           int[] ogrenciYaslari=new int[5];  initialized etiim 5 elemanlı kümeyi.
            int[] ogrenciYaslari={};      özel bir initializer bu dizi initializer.
            int[] ogrenciYaslari={17,24,14,19,21};  özel bir initializer new operatörü yok ama arka planda çalışır.
            [] tek köşeli parantez varsa bu bir vektördür.

    //TASK
    Öğrencilerin yaşlarını ekranda gösteren bir komut yazınız.

        int[] ogrenciYaslari={17,24,14,19,21};
        System.out.print(ogrenciYaslari);  //[I@58372a00 bu çıkar BU YANLLIŞ---BU BİR NESNE OLD.İÇİN HASHKOD ÇIKAR


             int[] ogrenciYaslari={}  //new operatörü GÖZÜKMEZ AMA-arka planda çalışır array initializer olduğu için sadece bu} donunda ; konulur başka yerde yok.
                   int[] ogrenciYaslari=new int[]; diğer initialized metodu
ELİMİZDE VERİLER ARTTIKÇA ELİMİZDE TUTAMAZ HALE GELİRİZ. ARTIK DEĞİŞKEN GİBİ TUTAMAYIZ.DİZİLERİ KULLANIRIZ.
        //     int[] ogrenciYaslari={17,24,14,19,21}; //5 elemanlı 21 sayısı 4.indexte yer alır.  17 sıfırıncı indexte yer alır.

        //  System.out.print(ogrenciYaslari[0]);  //EĞER NE ARAYACAĞINI SÖYLERSEK--İÇİNDEKİ ELEMANLARA ERİŞEBİLMEK İÇİN DİZİ NUMARASI GİRİLİR.[0] DERSEK 0.İNDEX YANİ 17'Yİ GETİRİR.
        //  System.out.print(ogrenciYaslari[1]); // Birinci indexteki elemanı göster->24

        //DİZİNİN HEPSİNİ AYNI SATIRDA EKRANA NASIL BASTIRIRIZ
        //     for (int i = 0; i <ogrenciYaslari.length; i++) {
        //        System.out.print(ogrenciYaslari[i]+" "); //17 24 14 19 21  sonucu çıkar.
        //      }
        //TASK VERİLEN YAŞ BİLGİLERİNE GÖRE YAŞ ORTALAMASINI BULUN.

       int toplam=0;  //initialized etmezsem hata verir erişemez. toplamada etkisiz eleman 0  onun için bunu veririz.
        int[] ogrenciYaslari = {17, 24, 14, 19, 21, 23};  //ogrenci yaslarını tutan bir dizim var.
        for (int i = 0; i < ogrenciYaslari.length; i++) {
            System.out.print(ogrenciYaslari[i] + " ");
            toplam+=ogrenciYaslari[i]; // indexin içindeki öğrenci yaşlarını 1 er 1er toplama ekliyorum
            //ilk döngüde i [0] 17'yi getirdi sonra [1] 24'ü getirdi17+24=41 sonra +14=55+19=74+21=95/5=19.0
        }
        System.out.println();
        double ort=toplam/(double)ogrenciYaslari.length; //2 tane int değer var böldüğümüzde veri kaybederiz. onun için bölmedeki iki işlemden birine (double yazarız)
        System.out.println(toplam);
        System.out.printf("ort =%5.2f",ort);

        //TASK BURADAKİ ÖĞRENCİLERİN YAŞI EN BÜYÜK OLANI NASIL BULURUZ.

        int toplam=0;  //initialized etmezsem hata verir erişemez. toplamada etkisiz eleman 0  onun için bunu veririz.
        int[] ogrenciYaslari = {17, 24, 14, 19, 21, 23};  //ogrenci yaslarını tutan bir dizim var.
        for (int i = 0; i < ogrenciYaslari.length; i++) {
            System.out.print(ogrenciYaslari[i] + " ");
            toplam+=ogrenciYaslari[i]; // indexin içindeki öğrenci yaşlarını 1 er 1er toplama ekliyorum
            //ilk döngüde i [0] 17'yi getirdi sonra [1] 24'ü getirdi17+24=41 sonra +14=55+19=74+21=95/5=19.0


        }
        System.out.println();
        double ort=toplam/(double)ogrenciYaslari.length; //2 tane int değer var böldüğümüzde veri kaybederiz. onun için bölmedeki iki işlemden birine (double yazarız)
        System.out.println(toplam);
        System.out.printf("ort =%5.2f",ort);

        int enBuyuk=ogrenciYaslari[0];
        for (int i = 0; i < ogrenciYaslari.length; i++) {
            if(ogrenciYaslari[i]>enBuyuk) {
                enBuyuk = ogrenciYaslari[i];

            }
        }
        System.out.println();
        System.out.println("En Büyük Yaş ="+enBuyuk);
    }

   System.out.println();
    double ort=toplam/(double)ogrenciYaslari.length; //2 tane int değer var böldüğümüzde veri kaybederiz. onun için bölmedeki iki işlemden birine (double yazarız)
        System.out.println(toplam);
        System.out.printf("ort =%5.2f",ort);
             // TASK
        //1) Sayilar isminde bir tamsayı dizisi tanımlayınız.
        //2) Array initializer {} kullanarak 7,24,45,3,56 sayılarını giriniz.
        //3) Dizi içerisindeki en küçük sayıyı bulan Java kodunu yazınız.

        int[] sayilar={-70000,24,-20,45,3,56,-500};
        int enKucuk=sayilar [0];
        for (int i = 0; i < sayilar.length; i++) {
                    if(sayilar[i]<enKucuk){     //if herzaman bloklu kullanın. ";" kullanma çünkü herşeyi statement'a çevirir.
                        enKucuk=sayilar[i];

                    }
        }
        System.out.println("enKucuk sayi= "+ enKucuk);

    int enKucuk=ogrenciYaslari[0];
        for (int i = 0; i < ogrenciYaslari.length; i++) {
        if(ogrenciYaslari[i]<enKucuk) {
            enKucuk = ogrenciYaslari[i];
        }
    }
        System.out.println();
            System.out.println("En Küçük Yaş ="+enKucuk);

        //     int[] ogrenciYaslari={17,24,14,19,21};//5 elemanlı dizinin en son indeksi 0 1 2 3 4  _4 tür.
//       System.out.println(ogrenciYaslari);//[I@58372a00 bu hash kodu çıkar
//        System.out.println(ogrenciYaslari[0]);  //17 sonucu çıkar

      int[] ogrenciYaslari={17,24,14,19,21};
        for (int i = 0; i < ogrenciYaslari.length; i++) {  //length 5 tir.
            System.out.println(ogrenciYaslari[i]);//bütün 5 elemanı göster dedim



        //    double ort=(17+24+14+19+21)/5.0;
        //  System.out.println(ort);

        int toplam=0;
        double ortalama=0.0;
        for (int i = 0; i < ogrenciYaslari.length; i++) {
            toplam=toplam+ogrenciYaslari[i];


        System.out.println(toplam);
        ortalama=toplam/ (double)ogrenciYaslari.length;
        System.out.printf("ortalama =%5.2f",ortalama);

        int enBuyuk=ogrenciYaslari[0];//0.ıncı indeksdeki 17'yi şimdilik en buyuk sayiya atadık.
        for (int i = 0; i < ogrenciYaslari.length; i++) {
            if(ogrenciYaslari[i]>ogrenciYaslari[0]){
            enBuyuk=ogrenciYaslari[i];



        }
        System.out.println("En Büyük Yaş : "+ enBuyuk);


        int[] sayilar = {7, 24,-52, 45, 3, 56};
        int sayilarEnKucuk = sayilar[0];
        for (int i = 0; i < sayilar.length; i++) {  //length 5 tir.
            System.out.println(sayilar[i]);//bütün 5 elemanı göster dedim
            if (sayilar[i] < sayilarEnKucuk) {
                sayilarEnKucuk=sayilar[i];

            }
        }
        System.out.println("sayilarEnKucuk = " + sayilarEnKucuk);

        //TASK:   ELİMİZDE HAZIR NOT YOKSA O ANDA GİRİLİYORSA NOTLAR
        //      1)Öğrenci notlarını tutan notlar dizisini tanımlayınız.
        //      2) 5 öğrenci için new operatörü ile initialize ediniz.
        //      3) Klavyeden 5 öğrencinin notlarını giriniz.
        //      4)Tüm notları bir satırda aralarında boşluk olacak şekilde listeleyiniz.

                int [] notlar=new int[5]; //0 0 0 0 0   ŞU ANDA ELİMİZDE 5 TANE 0 VAR
                Scanner input=new Scanner(System.in);
                System.out.println("NOT GİRİŞİ" );
        System.out.println("--".repeat(15));
        for (int i = 0; i < notlar.length; i++) {

            System.out.print(i+1+"."+"Öğrencinin Notunu Giriniz : ");
              notlar[i]=input.nextInt();


        }
        for (int not:notlar) { //notlar dizisi içindeki herbir not için dön demek bu--foreach döngüsü
            System.out.print(not+" ");

        }

        Scanner input = new Scanner(System.in);
        System.out.println("Ogrenci Not [1-5] : ");
        int not = input.nextInt();
        int[] notlar = new int[5];
        {

            System.out.print("1.Öğrenci Notu : ");
            notlar[0] = input.nextInt();
            System.out.print("2.Öğrenci Notu : ");
            notlar[1] = input.nextInt();
            System.out.print("3.Öğrenci Notu : ");
            notlar[2] = input.nextInt();
            System.out.print("4.Öğrenci Notu : ");
            notlar[3] = input.nextInt();
            System.out.print("5.Öğrenci Notu : ");
            notlar[4] = input.nextInt();

            for (int i = 0; i < notlar.length; i++) {
                System.out.print(notlar[i] + " ");
            }
        }
         DİZİLER OLUŞTURULUR
        1)TEK BOYUTLU(VEKTÖRLER)       []        (VEKTÖR)
        2)ÇOK BOYUTLU(MULTİDİMENSİON) [][]       (MATRİS)
        3)JAGGED DİZİLER             [][][]

        2) BOYUTLU DİZİLER

        A) NASIL İNİTİALİZED EDİLİYOR
                int[][] notlar=new int[][]

                2 dersimiz var Fizik ve Kimya --3 de Öğrencimiz var
                a-) int[][] notlar=new int[3][2]; böyle initialized edebiliriz.
                b-) initilazer kullanarak da initialized edbiliriz , ama bu sefer initializer içinde initializer kullanıcaz
                int[][] notlar={
                        {80,70}, // 0.elemandır. 80 burda[0][0]  70[0][1]
                        {80,80}, //ikinci öğrencinin fizik ve kimya notları 80[1][0]  80[1][1]
                        {75,90}====>int[][] notlar=new int[2][3];       75[2][0]     90[2][1]
                         }
        int[][] notlar={
                {50,70}, // 0,0=50;
                {80,80}, //1 elemanın 0'ıncı dizisi=80
                {75,90}
        };
        System.out.println(notlar[0][0]);
        System.out.println(notlar[1][0]);
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {
                System.out.print(notlar[i][j]+" ");
            }
            System.out.println(notlar[i]);
        int[][] notlar={
                {80,70}, // 0.dizi. 80 burda[0][0]  70[0][1]
                {20,80}, //1.dizi    ikinci öğrencinin fizik ve kimya notları 20[1][0]  80[1][1]
                {75,90}  //2.dizi ====>int[][] notlar=new int[3][2];       75[2][0]     90[2][1]
                 };
       // System.out.println(notlar[2][1]);
        //dizinin içinde gezmek ve i inci elemanını görmek istersem
        System.out.println("Fizik\tKimya");
        for (int i = 0; i < notlar.length; i++) {
            for (int j = 0; j < notlar[i].length; j++) {   //--- notlar[i].length  notlar dizisinin i inci elemanının uzunluğu kadar dön demek


                System.out.print(notlar[i][j]+"\t\t");
            }
            //tablo şeklinde olmasını istersek
            System.out.println();
           // Fizik 	Kimya
          //  80		70
          //  20		80
          //  75		90
        }*///28.gün
  /*      for (int i = 2; i >-1 ; i--) {
switch(i){
    case 0:
        System.out.println("K");
    case 1:
        System.out.println("L");
    case 2:
        System.out.println("M");
}countDigit(58);
            //KLAVYEDEN GİRİLEN BİR SAYININ KAÇ HANELİ OLDUĞUNU HESAPLAYAN JAVA KODUNU YAZINIZ.
            Scanner input=new Scanner(System.in);
            System.out.print("Bir sayı giriniz =");
            int number=input.nextInt();
            /*int num=number;
            number=number>0?number:-number;
            int count=0;
            do {
                count++;
            }while((number/=10)>0);
            System.out.printf("%d sayısı %d basamaklıdır.",number,countDigit(number));
        }
    public static int countDigit(int number){
        number=number>0?number:-number;
        int count=0;
        do {
            count++;
        }while((number/=10)>0);
        return count;

        System.out.println(String.format("%s %d %5.2f kg","Ahmet",56,78.3));*/
        //TASK
        // Verilen bir sayının her bir basamağını ayrı ayrı bir dizi içerisine yerleştiren bir metod yazınız.
        //NOT: DİZİNİN ELEMAN SAYISI,sayının basamak adedinden bir fazla olmalıdır.
        //Dizinin ilk elemanı
      /*  public static int[] getDigits(int number){
            int[] digits=new int[countDigit(number)+1];
            digits[0]=number>=0?0:1;
            number=number>0?number:-number;

            for (int i = digits.length-1; i >0; i--) {
                digits[i]=number%10;
                number/=10;
            }

            return digits;
        }
        public static int countDigit(int number){
            number=number>0?number:-number;
            int count=0;
            do {
                count++;
            }while ((number/=10)>0);
            return count;
        }*/

//TASK:
        //Verilen bir tamsayının binary olarak gösterilmesini yapan Java programını yazınız.
      /*  public static int[] getDigits(int number){
            int[] digits=new int[countDigit(number)+1];
            digits[0]=number>=0?0:1;
            number=number>0?number:-number;

            for (int i = digits.length-1; i >0; i--) {
                digits[i]=number%2;
                number/=2;
            }

            return digits;
        }
        public static int countDigit(int number){
            number=number>0?number:-number;
            int count=0;
            do {
                count++;
            }while ((number/=10)>0);
            return count;
        }*/

      /*  static public void binaryDonustur;(int sayi){
            int binary[] = new int[40];
            int index = 0;
            while(sayi > 0){
                binary[index++] = sayi%2;
                sayi = sayi/2;
            }
            for(int i = index-1;i >= 0;i--){
                System.out.print(binary[i]);
            }
        }

        public static void main(String a[]){

            System.out.print("1234: ");
            binaryDonustur(1234);
            System.out.print("\n18: ");
            binaryDonustur(18);
            System.out.print("\n");
        }
    }*/
        //29.gün
        //KLAVYDEN GİRİLEN BİR SAYININ (pozitif-negatif)KAÇ HANELİ OLDĞUNU HESAPLAYAN BİR JAVA KODU YAZINIZ.
      /*  Scanner input=new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz: ");
        int number=input.nextInt();     // sayı elimizde artık
        int num=number; //NİYE YAPTIK AŞAĞIDA NUMBER'I HERDEFASINDA 10 A BÖLDÜKÇE KAYBEDİYORDUK ONUN İÇİN NUM'A ATADIK BAŞTAN.
        int sayim=0;
     //  for (int i = 0; i < sayim.; i++) {//for da belirli döngü var ama burda belirsiz sen ne girersen o rakam olacağı için for döngüsü olmaz!!!
      //while döngüsüde şart ile başladığı için beni sıkıntıya sokar.
      //do while döngüsü kullanırız. do ile blok içine kolayca gireriz. bir seferliğine bile olsa
      do {
          sayim++; //while'ı yazıp buraya geldik ve her defasında sayimi 1 artırdık
        }while((number/=10)<0); //sayinin 10 a her bölümünde bir basamak ilerler en sonundaki digit kaybolur ve en son kaç basamak varsa buluruz.ör:1453/10 dersen 3 ü kaybederiz 145 kalır. 10 a bölersek 14 kalır  10 a bölersek 1.4 çıkmaz 1 çıkar. 1/10=0çıkar ve burdaki şart sağlanmayacak döngüden çıkar 0<0 olmayacağı için. herseferinde sayim++
        System.out.printf("%d sayısı %d basamaklıdır.",num,sayim); //num sayısı sayim basamaklıdır //number değişkenini kaybettik
         üzerinde işlem yaptığımız için onu yukarıda int num=number değişkenine atarız.

        //TASK:VERİLEN BİR SAYININ KAÇ BASAMAKLI OLDUĞUNU YAZINIZ.
      Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı Giriniz : ");
        int number= input.nextInt();
        int num=number;
        number=number>0?number:-number; //mutlak değerini aldım. - de girsek sorun yok artık.
        int count=0;

        do {
            count++;
        }while((number/=10)>0);

        System.out.printf("%d sayısı %d basamaklıdır.",num,count);*/  //BU METODSUZ HALİ


        // Metodla yazmak istersek bir kere yazıcaz metodu ve 1000lerce kere kullanıcaz.
        //bu bir metod;
 /*   }
        public static int countDigit(int number){
        number=number>0?number:-number;
        int count=0;           COUNT ÖNCE 0 DI
        do {     //
            count++;     O OLAN COUNT BURDA 1 ARTTI.
        }while((number/=10)>0);    1 BURDA ŞARTI TAŞIMADIĞI İÇİN ÇIKTI GİTTİ
            return count;               BURDA ÇIKAN COUNT GERİ YUKARI DÖNDÜRÜLDÜ.
//METODLA YAZILMIŞ HALİ:
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayı Belirtiniz: ");
        int number = input.nextInt();


        System.out.printf("%d sayısı %d basamaklıdır.",number,countDigit(number));
        printf in kullanımı String.format("Bir Metin")  Place holder dediğimiz %s %d %x %o %f %t
        String.format(%s,%d,%5.2f kg,"Ahmet",56,78,3);  SIRASIYLA % LER BİTTİKTEN SONRA KARŞILIĞI NE GELİYORSA ONU YAZARIZ
        %s "Ahmet"  gibi
        String.format ın aynısı printf yani souf System.out.printf içinde geçerli
        Strin.format şu şekilde gösterilir.
        System.out.println(String.format("%s,%d yaşında,%5.2f kg","Bilal",37,106.30));
        System.out.printf("%s,%d yaşında,%5.2f kg","Bilal",37,106.30);  2si de aynıdır formatlıdır. şuna gerek kalmıyor +" "+" "+"="
        }çok düzenli ve formatlıdır.
    public static int countDigit(int number){

        number=number>0?number:-number;
        int count=0;
        do {
            count++;
        }while((number/=10)>0);
        return count;*/
        //Verilen bir sayının her bir basamağını ayrı ayrı bir dizi içerisine yerleştiren bir metod yazınız.
        //   Not:dizinin eleman sayısı sayının basamak adedinden bir fazla olmalıdır. Dizinin ilk elemanı
        //             sayının işaretini tutmalıdır. dizinin basamak sayısı 2 eleman yani index sayısı 3 olucak
        //         Pozitif ise 0, negatif ise 1 olacaktır.

     /*   Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı Giriniz : ");
        int number= input.nextInt();

int[] myDigits=getDigit(number);
        System.out.println(Arrays.toString(myDigits));

    }
      public static int[] getDigit(int number){//  önceki countDigit()ti      getDigit herbir basamağı algetir demek
        int[] digits=new int[countDigit(number)+1];//içerde bir dizi oluşturalım. sayı belli değilse new int[] kullanıcaz initializer kullanamayız.
          //countDigit aşağıda mesela 30 aşağıda 2 haneliydi. Burada ise countDigit(number+1) 2+1=3 haneli olacak.
        digits[0]=number>0?0:1;  //Pozitif ise 0, negatif ise 1 olacaktır. demiştik--> dizinin 0.indeksi yani ilk basmağı sayı eksi ise 1 değilse 0 gösterecek.
        number=number>0?number:-number;

         for(int i =digits.length-1; i >0; i--) {
            digits[i]=number%10;
            number/=10;
          }
          return digits;
      }

        public static int countDigit(int number){

        number=number>0?number:-number;
        int count=0;
        do {
            count++;

        }while((number/=10)>0);
        return count;*/


        //TASK: Verilen bir tamsayının binary olarak gösterimini yapan Java Programını yazınız.
        //%2 ALINACAK BİR DE TERSTEN YAZMA OLAYINA DİKKAT EDİNİZ.

   /*      final int NUMBER_OF_BITS=8;  //32(int) 64(long)LE uğraşmamak için 8 bit(byte) alalım. İstersek 32 veya 64 te yaparız. bize kalmış.
        int[] binary=new int[NUMBER_OF_BITS]; //ŞEKLİNDE BİT OLUŞTURALIM YUKARIDA 8 İSE 8 İ BİNARY DİZİNE EKLEYELİM//8 elemanlı yaptık
        //NUMBER_OF_BITS işaret biti nedir? 8bitlik birbyte verisi binaryde ilk 7 biti  toplam 8 adet sıralanışı sağdan sola doğru(tamsayı veri tiplerinde) 01234567 burada [0]. indexteki bit İŞARET BİTİ number of bittir. 1234567 ise sayı tutulur.  işaret biti 0 ise pozitif sayı 1 ise negatifi temsil eder.
        int number=5; //mesela elimizde 5 sayısı var bunu nasıl binarye çevirebiliriz.
        binary[0]=number>0?0:1;  //yani binary dizisinin 0.indeksine yani soldan ilk rakamına 5 ise 0 -5 ise 1 değerini vermiş olduk.
      //15 pozitif olduğu için binary[0] binaryinin ilk dizisinin içine 0 ı atıyoruz. -eksi olsaydı  ozaman 1 atardı.
        // DÖNGÜYÜ TERSTEN YAZARIZ YOKSA TAKLA ATIYOR RİVERSE'ÜNÜ ALMIŞ OLURUZ.//sayıyı 2 ye böl böl böl sonra resten al hepsini
//döngüyü tersten alma demek soldan sağa doğru gitmesi için ilk bölümden kalan en sağa yerleştirilir.
        for (int i = binary.length-1(8 çıkar uzunluk bunu 1 azaltırsa index0 dan başaladığı için uyumlu hale getiririr); i>0 ; i--) {  //i>0 zaten 0. indexte işare biti var orayı kapatmış oluruz.onun içiin 1 den başlattık//sayıyı 2 ye böl böl böl sonra resten al hepsini
            //binary.length-1 yani 7.index ensağdaki sonuncu index olur. i>=0 demeyeceğiz dersek bunu  binary[0]=number>0?0:1;kaybederiz.
           binary[i]=number%2;    //binary dizisinin i inci elemanının number--(5)%2 demiş olduk kalan 1 dir.Bunu alıp en sondaki 7. indexe yazarız.
      //  5%2 kalan 1-->7 indexe yazılır. number/2 de 5/2=2 dir 2.5 olmaz. sonra 2%2 kalan 0 buda 6. indexe yazılır. 2/2=1 1%2=1dir bunuda 5.indexe yazdık.1/2=0dır bunu 4. indexe yazdık işaret bitine kadar000 gider. sonuç 00000101 dir.
            number=number>=0?number:-number; //mutlak değer aynı zamanda Math.abs sınıfıda aynısı abs=absolute
            // Sonuncu yani Ensağdaki 7. index 1 oldu artık.
            number/=2;  //bu sayıyı 2'ye bölüp numberın içine atıyoruz ki her döngüde bir küçüğüne ulaşsın.1453 5/2=2 dir 2.5 olmaz.int bölmesi  0,5 kaybolur.
             }              //Hatırlarsan 1453/10=145 145/10=14 14/10=1 1/10=0 dı. Aynı işlem burdada var.

        System.out.println(Arrays.toString(binary));
           Scanner input = new Scanner(System.in);
            System.out.print("lütfen bir sayı giriniz :");
            int number = input.nextInt();


            System.out.println(sayac(number));
            for (int i = 0; i < basamakString(number).length ; i++) {
                System.out.print(basamakString(number)[i]);

            }
        }
        public static int sayac(int number) {
            int sayıKullanılan = number;
            int sayac =0;
            while (sayıKullanılan>0){
                sayıKullanılan /=10;
                sayac++;
            }
            return sayac;
        }
        public static int[] basamakString(int number){
            int[]basamakString1=new int[sayac(number)];
            for (int i = basamakString1.length-1; i>0 ; i--) {
                basamakString1[i]= number %10;
                number /= 10;
            }
            return basamakString1;*/

        }
    }








