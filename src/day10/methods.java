package day10;

public class methods {
    public static void main(String[] args) {
            // 1000 tane yinelenen tekrarlanan yapılar varsa gerektiğinde onu çağırsam daha verimli olmazmı
        //Bir veya daha fazla görevi komutu birbiri peşi sıra yapan yapıları çağırmaya Method, Fonksiyon diyebiliriz.
        //main yazarsın altına main methodunun altında birçok komutu yerine getirir.
        //public static void main      Burada main methoduna başka hangi seviyeden erişebileciğin Public anahtar kelimesidir.
        //public kapsamı en geniş methoddur.
        //static sonra gelicez
        //void bi iş yapar ve geriye döndürmez. yanında parantez olan yapıların hepsi methoddur.
        //methodun gövdesi(içinde statementler var yapılmasını istediğimiz statementler)iki blok arasıdır.
        //Kendi metodumuzu main metodunun altında yazarız.
        //
        //METHODLARLA ÇOK UZUN GEREKSİZ ZAMAN ALICI TEKRAR EDEN YAPILAR YERİNE
        //KENDİMİZ BİR METOT OLUŞTURABİLİRİZ
        //public static void topla() {
        //
        // yazdığın anda en yukarıya çık t yaz topla diye main methodu gibi bir metot ortaya çıkar
        //public static void topla( buraya parametre denir) {    istersem parantez içine int x1, int x2
        //çağırırken oraya çağırdığımız verilere arguament deniyor.---->topla(3,5);
        //artık elimizde ne zaman toplama yapmak istesek 2 satırlık bir yapı methot var artık işe
        //scope'un içinde nerede olursa olsun erişebiliriz.
        //Bundan sonra main methodu bir tek olucak
        //DÖRT İŞLEM YAPABİLEN TEK BİR METHOD YAPICAZ.
        //Bir method önce deklare edilmeli, bildirilmeli. Derleyiciye int sayi=7 bildirmde bulunuyoruz
        // int olan 4 bytelık 7 sayısını hafızanda tut diyoruz.
        //Bir veya daha çok işi yapabilecek methodlarımız var
        // 1.)
//
        //
        // 2 tam sayıyı toplayan bir method yazınız. Sonuç ekranda iki sayının toplamı 25'dir şeklinde gösterilsin.
        // Operatör şurada int toplam=5+7; operator 5+7 topladı ama ekrana basmadı. Bunun için bir method deklare
        //etmeliyiz. Oluşturmalıyız.
        // public static void ikiSayıyıTopla(){    ----->Methodları emir kipinde yazarız herzaman.Yada evlimi bekar mı vb.
        // } artık methodumuzu deklare etti.bildirdik.
        // ******main methodunu sadece java sanal makinesi çağırır. Altta c:...java.exe yazar
        //main methoda diğer methodları çağırır.
        //  yukarıda i ye bassan yazdığımız ikisayıyı topla metodunu çağırır. Çağırmazsan gelmez unutma
        // iki yazınca hemen gelir ve toplamayı yapıp aşağıya yazar.
        //Ama burada sadece 5+7 toplayan bir method oluştu. buna ihtiyacım yok.
        //Bana lazım olan 2 tam sayıyı toplayabilen bir methoda ihtiyacım var.
        //Bizim görev verdiğimiz method herhangibir veriye ihtiyacı varsa parametrenin içinde bilgi veriyoruz
        //EĞER BİLGİYE İHTİYACI YOKSA() Bu parametrenin içine hiçbir şey yazmıyoruz.
        //public static void ikiSayiyiTopla(int a,int b){       int a int b parametredir ama aynı zamanda yerl deişkendir.
        // int a,b; bunun gibi local variabledır.  () bu parametrelere int a, int b veri tipini belirtmemiz lazım
        //int a,b olmaz.
        //public static void ikiSayiyiTopla(int a,int b){ int a ve int b gibi iki değer istiyor
        //      int toplam=a+b;
        // sout(String.format("İki sayının toplamı %d.",toplam));
        //bildirimde bulunmayı sadece method yazarken yapabiliriz
        //yukarıya sadece değerler verilebilir bildirimde bulunulamaz. ikiSayiyiTopla(x,y)
        //ikiSayiyiTopla(x,y) burada x ve y'ye sadece uyumlu bir veri geçebiliriz. ınt yerine float yazamayız.
        //Blokun içinde olan blokun içinde kalır. Blokun dibindeki method parametreleri BLOKUN içinde olmasada
        //bloka dahildir.
        //Methodun ihtiyaç duyduğu bilgiler parametre,  yukarıda değerlerin yanında ki ()arguman deniyor.
        //parametrelerle argumanların uyumundan bahsedildi.        //parametrelere uygun arguman(değerlerim) geliştirmeliyiz.
        //void herhangibir değer döndürmeyen herhangibir sonucu olmayan
        //public static void ikiSayiyiTopla(int a,int b)
        //Herbir problemi bundan sonra oluşturacağımız bir methodla çözücez.








    }
}
