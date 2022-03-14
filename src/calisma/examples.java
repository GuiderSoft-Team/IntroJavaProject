package calisma;

import java.util.Scanner;

public class examples {
    public static void main(String[] args) {

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

        System.out.println("Geometrik Şekli Seçiniz!!!");
        System.out.println("1.Kare");
        System.out.println("2.Dikdörtgen");
        System.out.println("3.Daire");
        System.out.print("Geometrik Şekli Seçiniz : ");

        Scanner input=new Scanner(System.in);
        int secim=input.nextInt();
        double alan,cevre;
        switch (secim){
            case 1:
                System.out.print("Karenin kenar uzunluğu :");
                int kenar=input.nextInt();
               int Alan=kenar*kenar;
               int Cevre=4*kenar;
                System.out.println("Alan = "+ Alan);
                System.out.println("Cevre = "+Cevre);
                break;
            case 2:
                System.out.print("Uzun Kenar :");
                int uzunKenar=input.nextInt();
                System.out.print("Kısa Kenar :");
                int kısaKenar=input.nextInt();
                Alan=uzunKenar*kısaKenar;
                Cevre=2*(uzunKenar+kısaKenar);
                System.out.println("Alan = "+ Alan);
                System.out.println("Cevre = "+Cevre);

                break;
            case 3:
                System.out.print("Lütfen yarıçap uzunluğu giriniz :");
                int yariCap=input.nextInt();
                alan=Math.PI*Math.pow(yariCap,2);
                cevre=2*Math.PI*yariCap;
                System.out.println("Alan = "+ alan);
                System.out.println("Cevre = "+cevre);
                break;
            default:

        }

    }
        
}

