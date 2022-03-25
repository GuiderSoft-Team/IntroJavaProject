package calisma;

import java.awt.*;
import java.io.NotActiveException;
import java.util.Scanner;

public class examples {


    public static void main(String[] args) {

   /*}
    public  static <str> String  FrequencyOfChars(String str) {

        Scanner input=new Scanner("HARF GİRİNİZ : ");
        String Harf=input.nextLine();
        String nonDup = (" ");
        for(int i=0; i < str.length(); i++)
            if(!nonDup.contains(""+str.charAt(i)))nonDup+= ""+str.charAt(i);
        String expectedResult = "";for( int j=0;j < nonDup.length(); j++) {
            int count = 0;
            for(int i=0; i < str.length(); i++) {
                if(str.charAt(i) == nonDup.charAt(j))count++;
            }expectedResult +=nonDup.charAt(j)+"" + count;
        }return expectedResult;
            }
        }*/
    /*   public static final int UCGENİN_IC_ACILARI=180 ;
       String gecersizMesaj="gecersiz bir ucgendir";*/
        // public static void main(String[] args) {

       /* Scanner input=new Scanner(System.in);
        System.out.print("Lütfen isminiz giriniz: ");
        String isim=input.nextLine();
        System.out.println("Merhaba "+isim);*/
       /* Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı Giriniz: ");
        int sayi = input.nextInt();
        if (sayi % 2 == 0) {
            System.out.println("Sayıniz Çift Sayıdır.");
        } else {
            System.out.println("Sayınız tek sayıdır.");*/
/*        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        int sayi2 = input.nextInt();
        if (sayi1 > sayi2) {
        System.out.println("Birinci Sayı Büyüktür!");
    }else if(sayi2>sayi1){
            System.out.println("İkinci Sayı Büyüktür!");
        }else {
            System.out.println("İki sayi eşittir!");
        }*/

        /*System.out.println("Sayi\tKaresi\t\tKüpü");
        for (int i = 1; i <=10 ; i++) {
            if (i%2!=0) continue;
            System.out.print(i);
            System.out.print("\t\t");
            System.out.print(i * i);
            System.out.print("\t\t\t");
            System.out.println(i * i * i);*/

/*        System.out.println("Geometrik Şekli Seçiniz!!!");
        System.out.println("1.Kare");
        System.out.println("2.Dikdörtgen");
        System.out.println("3.Daire");
        System.out.print("Geometrik Şekli Seçiniz : ");

        Scanner input=new Scanner(System.in);
        int secim=input.nextInt();
        double alan,cevre;
        switch (secim){
            case 1:
                System.out.print("Kenar uzunluğu :");
                int kenar=input.nextInt();
                alan=Math.pow(kenar,2);
                cevre=4*kenar;
                System.out.println("Alan = "+ alan);
                System.out.println("Cevre = "+cevre);
                break;
            case 2:
                System.out.print("Uzun Kenar :");
                int uzunKenar=input.nextInt();
                System.out.print("Kısa Kenar :");
                int kısaKenar=input.nextInt();
                alan=uzunKenar*kısaKenar;
                cevre=2*(uzunKenar+kısaKenar);
                System.out.println("Alan = "+ alan);
                System.out.println("Cevre = "+cevre);

                break;
            case 3:
                System.out.print("Lütfen yarıçap uzunluğu giriniz :");
                int yariCap=input.nextInt();
                alan=Math.PI*Math.pow(yariCap,2);
                cevre=2*Math.PI*yariCap;
                System.out.println(String.format("Alan = %5.2f", alan));
                System.out.println(String.format("Cevre = %5.2f", cevre));
                break;
            default:
                System.out.println("Yanlış Seçim ");*/

       /* Scanner input=new Scanner(System.in);
        System.out.print("1.Sayi  : ");
        int sayi1=input.nextInt();
        System.out.print("2.Sayi  : ");
        int sayi2= input.nextInt();
        System.out.print("3.Sayi  : ");
        int sayi3=input.nextInt();

        int enBuyuk=sayi1;

        if(sayi2>enBuyuk) {
            enBuyuk=sayi2 ;
        }
        if(sayi3>enBuyuk) {
            enBuyuk =sayi3;
        }
        System.out.println("En Büyük Sayı : "+enBuyuk);*/


  /*      Scanner input=new Scanner(System.in);

        System.out.println("Üçgenin İç Açıları Toplamını Giriniz");

        System.out.print("A AÇISI : ");
        int a=input.nextInt();
        if (a<=0){
            System.out.println("gecersiz bir ucgendir"); //Burada geçersiz bir ucgendir deyip,
            System.exit(-1);//programdan yandaki komutla çıkıcaz

        }
        System.out.print("B AÇISI : ");
        int b=input.nextInt();

        System.out.print("C AÇISI : ");
        int c=input.nextInt();

        int IcAcilariToplamı=a+b+c;
        if(IcAcilariToplamı==UCGENİN_IC_ACILARI) {
            System.out.println("Ucgen gecerlidir");
        }else {
            System.out.println("gecersiz bir ucgendir");
        }*/
/*        int number = 0;
        while (number < 5) {
            System.out.println("Hello");
            number++;*/

/*        int i = 0;
        while (i < 5) {
            System.out.println("Hello");
            i+=1;
        }*/
        // int i=1, toplam=0;
        //  while (i<=10) {


        //  i++;

        //  toplam=toplam+i;
        //  }
        // System.out.println("toplam ="+toplam);

/*        int i=0, toplam=0;	//	i--1   2   3    4    5      6      7         8       9     10   11
        while (i++<=10) {		//t--0  1   3    6    10   15     21     28     36    45     55     65

            System.out.print("i->"+i);
            toplam=toplam+i;
            System.out.println("t->"+toplam);

        }
        System.out.println();
        System.out.println("toplam ="+toplam);*/
      /*  int i = 1, toplam = 0;
        while (i <=100) {
            toplam = toplam + i; //toplam +=i;
            System.out.println("i->"+i);
            i++;
            if (toplam > 50) {
                break;
            }
            System.out.println("Toplam =" + toplam);
        }*/
  /*      Scanner input=new Scanner(System.in);
        int sayi,toplam=0;
        do {
            System.out.print("Bir Sayı Giriniz : ");
           sayi=input.nextInt();
           toplam +=sayi;

        }while(sayi!=0);
        System.out.println("toplam ="+toplam);*/
        /*Scanner input=new Scanner(System.in);
        int not1,not2,not3,not4,not5;
        int toplam=0;
        System.out.print("1.ÖĞRENCİNİN FİZİK DERSİ NOTU : ");
        not1=input.nextInt();
        System.out.print("2.ÖĞRENCİNİN FİZİK DERSİ NOTU : ");
        not2=input.nextInt();
        System.out.print("3.ÖĞRENCİNİN FİZİK DERSİ NOTU : ");
        not3=input.nextInt();
        System.out.print("4.ÖĞRENCİNİN FİZİK DERSİ NOTU : ");
        not4=input.nextInt();
        System.out.print("5.ÖĞRENCİNİN FİZİK DERSİ NOTU : ");
        not5=input.nextInt();

        toplam=not1+not2+not3+not4+not5;
        int ortalama=toplam/5;
        System.out.println("Ortalama ="+ortalama);*/




  /*      Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Dönüşüm Uygulaması");
        System.out.println("___");
        System.out.println("1. Santigrat - Fahrenheit : ");
        System.out.println("2. Fahrenheit - Santigrat : ");
        System.out.println();
        System.out.print("Seçim : ");
        int secim = input.nextInt();

        for ( int i = 2; i < secim; i++) {
            System.out.println("Yanlış seçim yaptınız.");
            break;
        }

        System.out.print("Sıcaklığı giriniz : ");
        int sicaklik = input.nextInt();

        switch (secim) {
            case 1 -> {
                double fahrenheit = sicaklik * 1.8 + 32;
                System.out.println(sicaklik + " C --> " + fahrenheit + " F");
            }
            case 2 -> {
                double santigrat = (sicaklik - 32) / 1.8;
                System.out.println(sicaklik + " F --> " + santigrat + " C");

            }
            default -> System.out.println("Yanlış seçim yaptınız.");

        }

*/
/*
            Scanner input=new Scanner(System.in);
        System.out.println("Öğrenci Fizik Ders Notları [0-100] ");

        double toplam=0;//Toplam yazdığımızda herzaman dikkat edelim. toplam bazen double kesirli çıkabilir ve veri kaybedebiliriz. Double herzaman garanti olur
        int ogrenciSayisi=5;//öğrenci adedimiz belli döngü adedi bellidurumlarda forda whileda kullanılır. hafızaya aldık initialized ettik.
        int not;
        double ortalama;
        for (int i = 1; i <=ogrenciSayisi ; i++) { //küçük 5 öğrenci sayısından küçük isedön
            System.out.print(i+". Öğrencinin Ders Notu :");//i inci yani birinci 2inci
           not =input.nextInt();

            toplam=toplam+not; //küsüratlı çıkıcak durumlarda herhangi birisini ya yukarıda double tanımlamamız gerekir.
                                //ama biz zaten tedbirimizi baştan aldık ve double tanımladık.
        }
        ortalama=toplam/ogrenciSayisi;
        System.out.println(String.format("Ortalama =%5.2f",ortalama));*/
//SORU: Klavyeden girilen bir sayının mutlak değerini alınız. 5 ise 5 tir. -5 ise +5 olarak çıkar.

        //  Scanner input=new Scanner(System.in);
        //System.out.print("Bir sayı giriniz : ");
       /*   int sayi=input.nextInt();//int içinde -2milyardan +2 milyara kadar sayı tutabiliriz.
        int md=sayi;///mutlak değer yazarsak |-5|=5 çıkar.///sadece int sayi; deseydik aşağıdasayi=-sayi deyince -5 girsen|5|=5 çıkıcaktı -5 olmayacaktı mutlak değer içinde
        if (sayi<0) {
            md=-sayi;//eksi operatörü daha önce çıkarma için kullnılmıştı.Şimdi - operatörü ise sayıyı negatife çevirir.

        }
        System.out.println("|"+sayi+"|"+"="+md);*/
      /*  int sayi=input.nextInt();
        int md=sayi<0?-sayi:sayi;///demek eğer benim sayim sayi<0 0dan küçük ise(?) -sayidır.  (:) değil ise +sayıdır
                                 //?-->ise   :-->değilse; -->o kadar if yerine bunu kullandık.
                                    //sayi<0? burası true ise md ye ata demek burası false ise : sonrasını md'ye assign et demektir.
                                    //  sayim -5<0 ise bu doğru ise-5 çarpı -sayı= +5 olarak md'ye assign edilir.
                                    // sayım +5 ise sayi<0? false olur : sağındaki +sayi kısmına gelerek yine positif olarak md'ye atanır.
                                    // her iki durumda da pozitif çıkar.
        System.out.println("|"+sayi+"|"+"="+md);*/
       /* Scanner input=new Scanner(System.in);
        System.out.print("NOTU GİRİNİZ [1-100] : "); //NOTU KLAVYEDEN OKUDUK ŞİMDİK.
        int not=input.nextInt();
        String notharf=not<60?"FF":not<70?"DD":not<80?"CC":not<90?"BB":not<=100?"AA":"Gecersiz";                                            //BUNUN EKRANDA HARF OLARAK OKUMAK İSTİYORUZ TERNARY'E İHTİYACIMIZ VAR.
        System.out.println("NOT"+"-->" +notharf);*/
       /* for (int i = 1; i <=10; i++) {
            for (int j = 1; j <=10; j++) {
                System.out.print(i+"*"+j+"="+(i*j)+"\t");

            }
            System.out.println();
*/
/*Scanner input=new Scanner(System.in);
        System.out.print("Lütfen bir not giriniz : ");
        int not=input.nextInt();
        if(not<0) {
            System.err.println("Bu not Girilemez");
            System.exit(-1);
        }*/
        /*int birinciSayi=5;
        int ikinciSayi=1;
        //1) buikisini kıyaslamak istersek (Relational operators)
        //2)İkinci Sayının negatif olmaması gerekiyorsa kuralı getirmişsek
        if(birinciSayi>ikinciSayi&ikinciSayi>=0) {
            System.out.println("İşlem Geçerli Olsun");//Bu kural sağlanıyorsa bir mesaj verelim.
        }else {
            System.out.println("Geçersiz");//diğer durumlarda geçersiz olsun.
        }//işlem geçersiz neden dolayı geçersiz==>birinciSayi>ikinciSayi ise burdan FALSE gelir. & operatörlerinde TRUE&TRUE DIŞINDA TÜM OLASILIKLAR FALSETUR.
        //Burada ilk durum false geldiği için false döner. ikinci durum 7>=0ise true dur ama ikisininde true gelmesi lazımdı.
        //or | pıpe operatöründe ise BİRTEK FALSE | FALSE durumunda FALSE olur. Diğer herdurumda TRUE DÖNER.
        // == MANTIKSAL-LOGİCAL DURUMLAR--> SONUCU TRUE YADA FALSE DÖNER BAŞKA BİR SEÇİM YOK.*/

/*

        for (int i = 0; i <5; i++) { //enbasit haliyle bir initialized işlemi yapıyoruz. Bir sayacımız var conditionumuz var
            //kaç defa dönmek istiyorsak i<5 bu conditionumuza onu yazıyoruz. 0'dan başladı dönmeye i<5 oluncaya kadar dön diyoruz enson 6 olduğunda dönme artık demektir bu.
            //i++ burası incremental statementtı. buras artışı sağlıyordu. i++ yada i+1de yazabiliriz.
            System.out.println((i+1)+". Merhaba");//i inci merhaba yani 5 defa merhaba yaz demek
*/
        /*for (int i = 0; i <5 ; i++) {  //aynı blokun içinde aynı scope'un içinde aynı isimli iki değişken deklare edemiyorduk.
            for (int j = 0; j <5 ; j++) {//int i deklare edilmiş bildirilmiş tekrar i diyemeyiz. onun için j diyoruz diğer değişkene.
                System.out.print("*\t");
            }
            System.out.println();
        }*/
      /*      int sayac=1;
            int toplam=0;
            while(sayac<=5){
                toplam=toplam+sayac;
                sayac++;
            }
        System.out.println("Toplam ="+toplam);*/
       /* do{
            //statement olur blok içinde;
        }while(condition olur küçüktür büyüktür); //do while'ın while'dan 2 farkı var.1) do while'ın conditionu aşağıda olur. sonunda ise ; olur ama sadece whileda ;olmaz { olur.
                                                // 2) while'da işlem başlamadan condition yerine gelmiyorsa bloğun içine giremez
                                                //ama do da eli mahkum içeri girer şart aşağıda şarta ulaşana kadar bloğun içine girer çünkü şartı başta kontrol etmiyorum. sonra şart oluşmuyorsa işlem orada sona erer.
                                                //while ile do while arasında en bariz fark şartın yukarıda olması
                                                //while da() {
                                                //do while() ; farklar bunlardır*/

       /* String dogName="rover";
                int dogWeight=23;
                if(dogWeight>20) {
                    System.out.println(dogName+" says WOOF WOOF");
                }else {
                    System.out.println(dogName+" says woof woof");
                }*/
   /*         cıkar(5,9);
            cıkar(9,8);
            topla(5,6);
            topla(7,8);
        }
    public static void topla(int sayi1,int sayi2) {

        int toplam=sayi1+sayi2;
        System.out.println("Toplam ="+toplam);
    }
    public static void cıkar(int sayi3,int sayi4) {
    int cıkar=sayi3-sayi4;
        System.out.println("Cıkar ="+cıkar);*/


       /* ikiSayiyiTopla(5,6);

    }
        public static void ikiSayiyiTopla(int sayi1,int sayi2){

            int toplam= sayi1+sayi2;
            System.out.println("toplam ="+toplam);
            System.out.println(String.format("İki sayının toplamı %d.",toplam));*/

        /*ikiSayiyiTopla(9,4);
        System.out.println("Toplam = ");
        }

        public static void ikiSayiyiTopla(int a,int b) {

            int toplam=a+b;
            System.out.println("Toplam ="+toplam);
        }*/


    }
}



