package Arrays_First;

public class ArrayGiris {
    public static void main(String[] args) {
        //Array/diziler: Biz belli veri tipinden değerleri depoladığımız bir liste gibi düşünebilirsiniz.
        //int veri tipinde n değerleri bir yerde Stringleri bir yerde depolayabiliriz.
        //Biz daha önce bir tane int değer tanımladığımızda sadece bir tane değer taşıyordu.ör:
        int x=5; // dediğimizde int veri tipinden bir a değişkeni oluşturuyoruz içine 5 literalini atıyoruz..
        //Burda sadece 1 veri depolanırken Arrayler sayesinde biz 10,20 30 1000 istediğimiz kadar veri depolayabiliriz.

        //int[] a; // int array cinsinden bir tane a referansımız olmuş oluyor. Yani bellekte bir yeri gösteren bir a referansımız olmuş oluyor.
    //    double [] b;// bu b bizim double cinsinden arrayimizin referansı oluyor.
        //ama burada ben 10 tane 20 tane elemanı olan bir değer tanımlamak istiyorum demedik yani 10 tane değeri depolamak istiyorum demedik.
       // Şimdi ben int cinsinden 10 tane değer depolamak istyorumu şöyle söyleriz.
     //   int[] a=new int[10] ;// yani bellekte 10 elemanlı bir int depolayacak kadar yer açılıyor(10 kutucuk açılıyor içini sen dolduruyorsun) ve a referansımız bu yeri direk gösteriyor demektir.
        //Burasını tanımladıktan sonra ekstra bir yer kutucuk açılmıyor. 11.değerin herneyse onu gösteremiyorsun.
        //İşte bellekte böyle bir işlem yaptığımızda 10 tane yer açılıyor biz bu 10 elemanlı yere nasıl erişebilirim.
        //Yani bu arrayin 5. bölümüne nasıl erişebilirim.
        //Arrayler indexlerden oluşuyor. Biz 5. bölüme indexlerden ulaşırız. İndexler 0,1,2,3..şeklinde gider.
        //Yani bizim arrayimizin ilk elemanı bizim 0. indeximiz olur. indexler eleman sayısından herzaman 1 eksik olur.
        //Bizim arrayimizin 2. elemanı bizim 1. indeximiz olur.
        //10. eleman ise indeximizin 9. elemanı olmuş olur.
        // 6.elemanımız 5. indexte bulunur.
    //    Şöyle birşey diyelim. a referansındaki indeximizin 5. yani 6. elemanına ben bir değer eklemek istiyorum. 5. indexte depolamak istiyorum yani
      //ARRAYLERİN MANTIĞI  a[5]=32; // a referansın gösterdiği yere git ve bunun 5. indexine 32 sayısını(değerini) koy diyorum.
        //a[9]=50; arrayimizin a referansının gösterdiği yere git ve arrayimizin 9. indexinin yani 10.elemanına 50 değerini ver.
        //Bunları böyle tek tek vermek çok zaman kaybı onun için;
        //Değerleri tek seferde şöyle atarız
  //      int[] a={1,2,3,4,5,6,7,8,9,10};  // burada sistem diyorki int cinsinden a referansının gösterdiği yerde 10 eleman girebilecek bir yer açılmış (k)
        //    10 tane ayrı ayrı yer açayım ve a referansı bunu göstersin. İstediğin kadar yer açabilirsin.
 //       int[] b={30,40,50,60,70}; //arrayimiz 5 uzunluğunda oldu içinede bu değerler girildi.
        //bunun ilk indexi yani 0 hangisidir?
 //       System.out.println(b[0]); //b referansının gösterdiği yerde  index 0 30'dur.'
 //       System.out.println(b[5]); // ArrayIndexOutOfBoundsException: yani arrayin indexini aştın mesajı gelir.

 //       int[] c=new int[5]; // Bana 5 eleman koyabileceğim bir yer ayır ben daha sonra bu değerleri gireceğim demektir.




    }
}
