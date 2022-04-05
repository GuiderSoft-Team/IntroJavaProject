package day18Overview;

import java.util.Scanner;

public class Silinecek {
    public static void main(String[] args) {

        //MPH=KPH * 0,6214  MİLE PER HOUR =Kilometre Per Hour * 0,6214
/*
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
            System.out.println();*/

/*        Scanner input=new Scanner(System.in);

        System.out.println("ÇARPIM TABLOSU");
        System.out.println();
        System.out.println("-".repeat(10));
        System.out.println();
        System.out.print("Bir sayı giriniz:");
        int sayi= input.nextInt();


        for (int i = 1; i <=10 ; i++) {
            System.out.println(sayi+"x"+i+"="+sayi*i);*/
    /*    for (int i = 0; i < 5; i++) {
            System.out.println("dıştaki yani 0'dan başlayıp 5'e kadar olan döngü");
            System.out.println();
            for (int j = 0; j < 4; j++) {
                System.out.println("içteki yani 0'dan başlayıp 4'e kadar olan döngü");
                System.out.println(i+"*"+j +"="+i*j);*/


   /*     for (int i = 0; i < 7; i++) {//sütun dikey
            for (int j = 0; j <=i; j++) {//satır yatay yazar
                System.out.print("* ");//* dan sonra bir boşluk güzel gözüksün diye

            }
            System.out.println(); //üstü bir satır yazdı çıktı bloktan sonra burada bir enter verip aşağıya indi*/
        /*for (int i = 0; i < 6; i++) {
            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            System.out.println("#");*/

            for (int i = 1; i <=7; i++) {
                for (int j = 1; j <=i; j++) {
                    System.out.print(j+" ");

                }
                System.out.println();
            }
        }
    }


















