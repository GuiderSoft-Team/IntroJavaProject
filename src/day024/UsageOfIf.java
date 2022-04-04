package day024;

import java.util.Scanner;

public class UsageOfIf {
    public static void main(String[] args) {
/*        if(true) {
            System.out.println("Kod çalıştı.");
            System.out.println("İkinci komut çalıştı.");
        }*/
/*
        int x=20;
        if (x==20){
            System.out.println("X sayısı 20'ye eşittir.");
        }*/

/*        int yas=18;
        if (yas>=18){
            System.out.println("Kişi yetişkindir.");
        }else {
            System.out.println("Kişi yetişkin değildir.");
        }*/

/*        int x=30;
        int y=30;
        if (x>y){
            System.out.println("X Büyüktür.");
        }else if(x<y) {
            System.out.println("X küçüktür.");
        }else {
            System.out.println("İkisi de eşittir.");
        }*/


        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas=input.nextInt();
        if (yas<13){
            System.out.println("Çocuktur.");
        }else if (yas<18) {
            System.out.println("Ergendir.");
        }else {
            System.out.println("Yetişkindir.");
        }


    }
}
