package day18Overview;

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

                System.out.println(i+",");
        int toplam=0;
        for (int i = 0; i < 5; i++) {
            toplam+=i;

        }
        System.out.println(toplam);
        int carpim=1;
        for (int i = 2; i <=10 ; i++) {//kısaca 10! =3628800
            carpim*=i;

        }
        System.out.println("carpim= "+carpim);
        int carpim=1;
        for (int i = 1; i <4 ; i++) {
            carpim*=i;

        }
        System.out.println("3! ="+carpim); //for döngüsü
        //1 den 100 e kadar sayılar ama 100 hariç==even(çift) and odd(tek) number sayıların toplamını göster.

      int sumOfOdd = 0;
        int sumOfEven = 0;
        for (int i = 1; i <6 ; i++) {
            if (i % 2 == 0) {
                sumOfEven += i;//2+4=6
            } else {
                sumOfOdd += i;//1+3+5=9
            }
        }
           System.out.println(sumOfEven);
           System.out.println(sumOfOdd);
       System.out.println("Number\tNumber Squared");
        System.out.println("--".repeat(15));
        for (int i = 1; i <= 10; i++) {
           System.out.println(i + "\t\t" + (i * i));


            //MPH=KPH * 0,6214  MİLE PER HOUR =Kilometre Per Hour * 0,6214

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç kez işlem yapılacak? ");
        int count = input.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("Birinci sayi Nedir?");
            int n1 = input.nextInt();
            System.out.print("İkinci Sayi Nedir?");
            int n2 = input.nextInt();
            if (n1 > n2) {
                System.out.print("1. Sayi Büyüktür");
            } else if (n2 > n1) {
                System.out.print("2. Sayı Büyüktür");
            } else {
                System.out.print("İki Sayı BirBirine eşittir");
            }
            System.out.println();

       Scanner input=new Scanner(System.in);

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


      for (int i = 0; i < 7; i++) {//sütun dikey
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
                sayac++;
            }
            System.out.println("Döngüden çıkıldı"); //    WHİLE DÖNGÜSÜ

            Scanner input=new Scanner(System.in);
            while (input.hasNext("A-Z")){
                System.out.println(input.next());*/
       // odd numbers between 5-140 in same line


    }

}



























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
        }*/

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




