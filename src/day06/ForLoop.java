package day06;

public class ForLoop {
    public static void main(String[] args) {
/*
        for(int i=0;i<5;i++){
            System.out.println("Merhaba");
        }
*/
        //Soru; 1'den 10'a kadar olan sayıların toplamını bulan java programını yazınız.
        //=,+=,-=...
        //i     -->1 2 3 4 5 6 7 8 9 10 11
        //toplam-->0 1 3 6 10 15 21 28 36 45 55
/*
        int toplam=0;
        for (int i = 1; i <=10 ; i++) {
            toplam=toplam+i;
        }
        System.out.println("Toplam = "+toplam);
*/

        //1'den 100'e kadar olan çift sayıların toplamını bulan Java programı yazınız.
        //int sum=0;
/*        for (int i = 2; i <=100 ; i=i+2) {
            sum +=i; //sum=sum+i;
        }*/

/*        for (int i = 1; i <=100 ; i++) {
            if (i%2==0){
                sum=sum+i;
            }
        }

        System.out.println(sum);*/


        //1'den 5'e kadar olan sayıların çarpımını bulan Java programı yazınız.
        //carpim    ->1 1 2 6 24 120
        //i         ->1 2 3 4 5 6
/*        int carpim=1;

        for (int i = 1; i <=5 ; i++) {
            carpim=carpim*i;
        }
        System.out.println("Çarpım = "+carpim);*/

/*
        int carpim=1;
        for (int i = 5; i >=1 ; i--) {
            carpim *=i;
        }
        System.out.println("Çarpım = "+carpim);*/


        for (;;){
            System.out.println("Merhaba");
        }

    }
}
