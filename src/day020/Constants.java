package day020;

public class Constants {

    private static final String BIR_DEGISMEZ="Bir metin";


    public static void birMetot(){
        System.out.println(BIR_DEGISMEZ);
    }


    public static void main(String[] args) {
        int yas=20;
        yas=25;
        yas++;

        double piSayisi=3.14;
        final double PI_SAYISI=3.14;//constant

//        PI_SAYISI=3.28; yapılamaz.

        final int MAX_VALUE=30;
        final int MIN_VALUE=-30;

//        MIN_VALUE++; yapılamaz.
        yas--;

        //Bir öğrenci bilgi sisteminde şubelerdeki maksimum öğrenci adedi 24 olacaktır. Dolayısıyla örneğin bir
        //String dizisi veya notları tutacağımız bir int dizi bu 24 sayısını geçmemelidir. Bunun için
        //MAKSIMUM_OGRENCI_ADEDI isminde bir constant tanımlayınız.

        final int MAKSIMUM_OGRENCI_ADEDI=45;
        String[] ogrenciler=new String[MAKSIMUM_OGRENCI_ADEDI];
        int[] fizikNotlari=new int[MAKSIMUM_OGRENCI_ADEDI];




        birMetot();


    }
}
