package day024;

import java.util.Scanner;

public class SwitchUsage {
    public static void main(String[] args) {
/*        int secim=3;
        switch (secim){
            case 1:
                System.out.println("Birinci seçildi.");
                break;
            case 2:
                System.out.println("İkinci seçildi.");
                break;
            case 3:
                System.out.println("Üçüncü seçildi.");
                break;
            default:
                System.out.println("Varsayılan seçim.");
                break;
        }*/

        Scanner input=new Scanner(System.in);
        System.out.println("Dört İşlem");
        System.out.println("-".repeat(15));
        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");
        System.out.println();
        System.out.print("Seçiminiz: ");

        int secim=input.nextInt();



        switch (secim){
            case 1:
                System.out.println("Toplama işlemi");
                System.out.print("Sayı 1:");
                int sayi1=input.nextInt();

                System.out.print("Sayı 2:");
                int sayi2=input.nextInt();
                System.out.println("Sayıların toplamı = "+(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Çıkarma İşlemi");

                break;
            case 3:
                System.out.println("Çarpma İşlemi");
                break;
            case 4:
                System.out.println("Bölme İşlemi");
                break;
            default:
                System.out.println("Yanlış Seçim yaptınız.");
                break;
        }




    }
}
