package day11;

public class Methods2 {
    public static void main(String[] args) {
        //bir veya daha fazla görevi yerine getirebilen yapılardır. Bir görevi bir methodu çağırarak yaptırabiliriz.
    }   //Nesneye dayalı işlemlere geldiğimizde çok önemli.
        //Metot tasarımını öğreniyoruz bu derste. Bundan sonra verilen problemleri oluşturduğumuz methodlarla hazırlayacağız.
        // SORU:Bir sayının tek olup olmadığını test eden bir method yazınız.
        //Methodun yapısı: public static geri dönmesini istemiyorsak void-geri dönmesini istiyorsak ilkel tipleri int boolan vb.geri değer döndürür.
}       //public static boolean(basitçe yes mi no mu yani geri dönücek(void) bi durum yok)tekMi() {
        //parantez içine ise bazı özel bilgilere ihtiyaç duyuyorsa o bilgileri getirmek için buraya bi değer tanımlaması yapılabilir
        //public static boolean tekMi(int sayi) {
        //boolean result=sayi%2==1 yada !=0 a dersek  burdan bi sonuç dönücek
        //  return result; işlemin sonucunu bana döndür demektir.sayı 5 ise 6/2 kalan 0 ise  6 tekmi cevap false 5 tekmi cevap true
        //SORU:Kişinin kaç yaşında olduğunu hesaplayan bir metod yazınız:
        // bir insanın yaşı ahmet olabilirmi, yaşı 9.8 olabilirmi bunları düşünmemiz lazım metod yazarken
//       //metotlar emir kipi olucak -public static int calculateAge() yazdığında aşağıya return yazmassan missing return yazar
        //return 0; yazarsan neolursan ol o methodu çağırır. bugünlük hatasız çalışsın diye yazılan bir durum normalde yazılır
        //public static int calculateAge(int birthYear,int currentYear) {
        // int age=currentYear-birthYear;
        // return age; methodlar çağırılmadan gelmez ma 'yı çağırdığımızda main method geldiği gibi burda ca yazdığımızda
        //calculate gelir. bizden iki değer ister doğum tarihi ve içinde bulunduğumuz yıl
        //aktif yılı bulmak için int aYil=LocalDateTime.now().getYear(); now şimdi şu anda demek
        // NUMBERS
        // BİR GÖREV TANIMI: VERİLEN 2 SAYIDAN BÜYÜK OLANI TESPİT EDEN METHOT YAZINIZ. bir problemin çözümünü bir methoda nasıl yansıtacağımızı öğrenicez
        // ÖNCE ELİMİZDE 2 SAYI OLACAK DOUBLE İNT FLOAT OLABİLİR.
        //İNT VERİYORSAK İNT GELİR.
        //public satatic int getMax(int x,int y) return 0; dediğimizde methodumuz HATASIZ çalışır artık
        //int max diye bir değişken tanımlayalım int max=x; maximimuma x değerini atadım. return max;
        //if(y>max) { max=y;
        //30>5 den büyükse bu true dönücek ve çalışıcak.
        // yukarıda metodu çağırdığımızda gelen parantez içine argumant denilir. ama değişken tanımlayamayız.
        //methodu tasarladığımız yerde ise () içinde parametre olur değer tanımlama yapılan yerdir.
        //bizim yazdığımız metod sadece bizim işimiz problemimizi kolaylaştırmak için yazarız. Zaten mevcut bir sürü kütüphane var.
        //Nesneye dayalı yazılıma geçince kendi tiplerimizi oluşturucaz
        // void dersen yazdığın methodda geri dönüş alamaz ve 5 ile çarpamazsın. ama void yazmadığında ise
        // dönüş alır ve istediğimiz sayıyı yazar. voidin içinede +getmax(x,y) yazarsak yine void yokmuş gibi geri dönüş alabiliriz.
        //TAM TERSİ / BİR GÖREV TANIMI: VERİLEN 2 SAYIDAN KÜÇÜK OLANI TESPİT EDEN METHOT YAZINIZ.
        //public satatic int getMin(int x,int y) return 0; RETURN 0 DERSEK DAHA HENÜZ DERLENME(tamamlanma) AŞAMASINDA OLACAĞI İÇİN böyle yazarsak çalışır vaziyette yani derlenebilir halde bırakmalıyız etrafta kırmızılıklar olmasın
        //int min=a; küçük olan budur diye varsayıyoruz sonra if(b<min) { min=b; return min; deyip küçük sayıyı geri döndürürüz.
        //a ya 10 dedik  b ye 5 dedik a ya küçük demiştikif te doğru olduğunu gördü true aldı sonra yoluna devam etti min b oldu yani doğru sonucu verdi ve returnden 5 olarak döndü
        //sout yaptık ("KüçükSayı =" +küçükSayi) ama "sout yaptık ("KüçükSayı =" +getMin(a:10, b:5)); buna call statement da denir çağrılan ifadede denir.
        // ("KüçükSayı ="getMin(a:10, b:5); kendi başına bir statementtır. küçük sayi stringine getmin integer değerine concodanate(birleştirdik) yaptık
        //return null yada " " ile string bir yazı değeri döndürebiliriz.   int bir değer varsa return 0; doğru çalışır.
        //metoda göre returnun önündeki ifade uyumlu olmalı kısaca.
        //ÖRNEK: YOL PROBLEMİ ---MESAFE HESAPLAYAN BİR METOT YAZINIZ
        //public static int calculateDistance(int speed,int time-içinde bize lazım olan parametreleri koyduk)----->camel metoduyla yazarız. Metod ve değişken isimlendirmelerinde kesinlile camel notasyonuyla---sınıf isimlendirmeleri ise pascal notasyonu Kelimelerin sadece baş harfi büyük
        //int distance=speed*time artık çarpımın sonucu elimizde yani distance içine saklandı.
        //return distance;
        //Bir sayinin kuvvetini alan bir metod yazınız.
        //public static int kareAl(int sayi)
        //int kare=sayi*sayi yerine (çünkü hafızada gereksiz fazladan yer kaplamaması için) return sayi*sayi diyebiliriz
        //public static int kuvvetAl(int sayi, int us) bir sayının küpünü alabilmek için
        //int carpim=1;
        //for(int i=0; i<us , i++){ carpim *=sayi;//carpim=carpim*sayi; demek } return carpim;
        //yukarıya çıarsak int result=kuvvetAal(sayi: , us:);
        //sout("Result = "+result)
        //CALCULATOR SON 20 DAKİKA//////KONUMUZ METODLARIN OVERLOAD EDİLMESİ
        //YENİ SINIF AÇTIK.
        //toplama yapan bir hesap makinemiz var ---public static int add(int x,int y) { return x+y;
        //kullanıcıya int topla diyor topluyor peki double ve float yapılarıda topla desem ne ismi veririm
        //public static double add(double x,double y) { return x+y; oldu ve çağırdığımız int metodun içinde kesirli double
        //yazarsak ne olucak tip uyuşmazlığı olur.Kullanıcı bir arayüz ister tamsayı topla için ayrı
        //kesirli sayı topla için ayrı birşeyle uğraşmak istemez. Hepsinin içinde olduğu integer double istediğim her
        //tipte veriyi girebilmeliyiz.Bunun bir yolu var tek metodumuz var hangi tip bir sayı olursa olsun toplayacak bir metod yazıyoruz.
        ////// public static double add(int x, int y) yazamayız hata var. EĞER BENİM METODLARIMIN İMZASI BİRBİRİNDEN FARKLI OLURSA
        // İSTEDİĞİM KADAR AYNI İSİMDE METOD YAZABİLİRİM. İKİ VEYA DAHA FAZLA METODUN PARAMETRE TİPLERİ VE VEYA PARAMETRE ADETLERİ
        // BİRBİRİNDEN FARKLI İSE METOTLARIN İMZALARI BİRBİRİNDEN FARKLIDIR DENİR. BU ŞEKİLDE AYNI İSİMDE
        //İSTENİLDİĞİ KADAR METOT YAZILABİLİR. Bu durum metotların overload (aşırı yükleme) edilmesidir.
        //Metotların dönüş tipleri imzadan sayılmaz. int x , int y ve  double x double y ikiside imzası yani doble ve int farklı olması
        //birşey ifade etmez. topla() metodunu çağır tam sayıyla yada kesirli sayıyla toplama
        // 4.3 ile 5 i topladık double ile tam sayı sonuç double çıkacaktır.double int ten büyüyük olduğu için double onu otomatik alır.
        //DERS RECEP HOCA:
        // Bize gelen qa'ye gelen user story olarak geliyor. Tesk riskleri yazarız. SERVER İS DOWN çalışmıyor
        // Bu bozulursa cloud server'a geçebiliriz
        //1.118 birinci günden başlar aftter deploy -sorumluluk neleri kapsar
        //scope kısmıı var test approach da kimin nereyi test edeceği yazar 2 kişi önyüzü test iki kişi
        //arka planı test eder.2 kişide arayüzü test eder.2 kişi API iki kişi uı iki kişi DATABASE DB'Yİ TEST EDER.
        //Test environment pasaportlar usernameler test data dır bunların hepsi cira ile çalışıyorsanız
        //orada test datası olur. soru test planının içinde ne olur ne olmaz ama bunun dışında test planının içinde test datası olmaz, parola arayüz pasaport olmaz
        //pass/fail criteria testler neden geçti neden geçmedi bu kriterleri belirlememiz gerekiyor.
        //Entry/exit criteria ise sizin sisteme girebilecek yetkiniz olmalı ki siz test etmeye uygun bir ortamınız var mı
        //system authantification is confirmed olmalı.
        //dummy(tester için verilen şifre kullanıcı için verilen şifrelerle dummy fake bir kitleyle uğraşırız gerçek müşteri bilgileriyle uğraşmayız bilgi sızabilme ihtimaline karşı) data bunu unutma:gerçek userların yerini alıp test etmenizi istemez çünkü bu büyük bir risktir.
        //çoğu yer test planını bile göstermez. Çünkü iki haftalık
        //Test planıyla test execution(uygulaması) uyuşması lazım. Test report yazmak çok zordur.
        //team lead burda sorumluluk onda- cira diye birşey yok log yapıyorsunuz kaçsaat orada geçirdiniz bun sunuyorsunuz.
        //Deliverable yaptığınız işlemleri yazdığınız yer
        //test case'in içinde kaç test var -2-UI,API,DB,-KAÇ TANESİ FAİL OLDU% 4-5 NEDEN FAİL OLDUĞU SÖYLENMEZ-KAÇ TANESİ GEÇTİ
        //FAİL OLAN TEST CASE NEDEN FAİL OLDU BUNLARI YAZIYORUZ ÇÜNKÜ SORUYORLAR
        //the example of traceability table= iki tane user a oluşturacağınız bütün ihtimalleri yazarsınız. ben size apı test yapın
        // bu da test takip tablosu test case'in id'si öncelik priorty önem seviyesi medium mu high mı bunu belirtiriz.
        //gürhan hoca 12.gün::
        //Method dediğimiz şey kod tekrarı yapmamak için, tekrar tekrar kullanılabilen istenildiğinde geri değer döndürebilen yapılardır yapılan bir şey.
        //Mesela methodlardan önce bir karenin alanını almayı öğrenmiştik. Ama 10 tane karenin alanını
        //hesaplama bu bizim günlerimizi aylarımızı alır. Methodlar ise matematikteki fonksiyonlar gibidir
        //Fonksiyonlarda bilinen seğerler verilerek bilinmeyeni bulmaya çalışıyoruz.
        //Methodun içindeki parametrelerin içine bilinen değerleri veriyoruz ve bilinmeyeni istiyoruz.
        //Methodu çağırıyoruz. Emir komutu ile çalışır. showmassage mesajı göster. getMax maximumu getir.
        // Otomatik kod oluşturacaz.
        //bir geri dönüş yazmışsak return yazmak zorundayız.
        //void ise geri dönüş yapılmayacak yani return yazmamıza gerek yok
        //overload--aynı isimle birden fazla kod yazabilme yeteneğidir. Normalde int x=5 int=7 olamaz deklare edilemez ama değer verilebilir int x=5 sonra x=7 olur ama deklare edilemez.  edilmesi başka bir kullanıcının yadırgamaması-anormal bir kod yazımı olmaması-standart kurallara uyulması
        //gerekiyor.Bu programdada toplumsal bir Sözleşmemiz var 3+5 tede topla olmalı 2.5+4.5 tede aynı topla komutu olmalı
        //int x int y ise sonuc topla  doble x double y aynı isimle birbirinden farklı
        //public static double add(double x,double y) { imza farklıysa sorun yok ama aynı imza ise sorun çıkarıyor.
        //metodların imzası dönüşle ilgili değil kesinlikle parametrelerin içindeki değerlerle alakalı
        //SORU: 4 İŞLEM YAPABİLEN HESAP MAKİNESİ
        //public static int cikar(int x,int y) {
        //return x-y; int result=cıkar(5,2) double result2=cıkar(int)8,9manuel convertion yaptım,(int)7.3
        //double isimli yeni bir sınıf oluştur dedi sistem bize buna overload işlemi deniliyor.
        //Calculator sınıfı 4 işlemi yaparken internetten bilgi çekmemeli. Solid prensibi hepsi kısaltma-Herbir sınıfın bir görevi olmalı demek
        //prensiblere uygun olmalı. Methodun tek bir görevi olmalı topla derken çıkartma olmamalı
        //SICAKLIK DÖNÜŞÜMÜ İÇİN METHOD TASARLAYIN
        //public static int convertFahrenheitToCelcius(){ return type süslü parantez ise methodun gövdesidir.
        //30*1.8+32=86
        //(86-32)/1.8=30 virgül varsa int döndüremez. Double döndürebilir.
        //public static double convertFahrenheitToCelcius(){ ise result da double olmalı double result=(grade-32)/1.8; bu çok riskli veri kaybı olur. ayrıca bu verimlibir kod değil.
        //return (grade-32)/1.8; yazarsak bu verimli bir kod olur. Hafızada yer çok almaz.
        //fahrenheit'ı celcius'a çevirirken hep tam sayı girdik bunu kesirli bir ifadeyle nasıl yazabiliriz
        //metodların overload yönteminde tamamen bir politika ile bunu çözebiliriz. Şu ana kadar int 'ı konuyu daha iyi anlamak için yazdık


        //ARRAYS(DİZİLER)---12.GÜN-PART2 PROGRAMLAMADA YENİ BİR AŞAMAYA GEÇİYORUZ.
        //Şu ana kadar bir veriyi hafızda tutarken ilkel tiplerle yaptık.
        //intsayi1=5; int sayi2=7.......int sayi100=75 bu zor.
        //Artık biraz şekil değişiyor. arraysde ise bu veriler ilkel tipler gibi değil arka plandaki uygulamalar farklı
        //ilkel tiplerden kurtulup gelişmiş tiplere doğru geçiyoruz artık..Birden fazla veriyi aynı anda aynı TİPTEKİ VERİYİ
        //HAFIZADA BELİRLİ BİR ŞEKİLDE DOĞRUDAN YADA SIRAYLA YADA FARKLI BİR SIRAYLA HAFIZADA TUTUYORUZ.
        //Nasıl deklare ederiz dizileri önce tip int[] scores; burada int var ama buradaki int ilkel değil
        //int [] scores; String[] names; Students[]students; herzaman bu yolu kullanın. ama int scores[] şeklindede yazılabilir
        //Arrays(dizi) nasıl tanımlanır deklare edilir. Mesela int elimizde 5 tane sayı var. int [] sayilar;
        //Elimde beş tane futbolcu ismi var. bunu nasıl tutabiliriz String[] futbolcular; günleri tutmak istersek String gun1=pazartesi demiyoruz
        //String[] days; yazıcaz artık. bunların hepsi birer bildirim(deklarasyon). Bu verileri bildirdikten sonra bunu nasıl atama yapıyoruz
        //şöyle int[]=new int[5]; bu 5 tane sayı tutucam demek
        //String[] futbolcular=new String[3]; şimdi initialized ettik.
        //Java için ayrılan hafıza sembolize ediliyor Hafızanın soluna STACK(YIĞIN)-- SAĞINA HEAP(ÖBEK) İkiside aynı anlamda
        //Stackte mesela intx=5; değişkeni Stackte x adı verildi. bu x int olduğu için hafızanın stack bölümünde 32 bit yani 32 adet 0000...00101 olarak yazıyor
        //x değişkeni 4 byte 32 bit 0000..00101 ilk 0 dan başlıyor ta 101 e kadar gelip 5 'i okuyuo ekrana getiriyor
        //sayilar dizisine geldiğimizde 5'i tuttuğu gibi bir değer tutulmuyor ama ADRES TUTULUR.
        //HEAP bölgesinde bir alan açılır 20 byte büyüklüğünde ve bunun başlangıç adresi mesela ff00 getirilir stacke yapıştırılır
        //değer tutulmaz adres tutulur denilen yere yapışır başlangıç adresi---yani stackte bir adres bulur ve bu başlangıç adresidir
        //size of int*5 eleman sayısı kadar. integer değeri 4 byte*örnekte new int[5] =4*5=20 bytelik
        //artık adres tipler veya object veya referans yani gelişmiş tipler denir. Heap artık nesne,object,referans tip denir.
        //artık steakte bir x verisi bulamayacak ama bir heap BAŞLANGIÇ ADRESİ BULUCAK.
        //Sonra bu bağ kopunca sanal makinenin bir atık makinesi var o gelip HEAP İLE STACK arasında bağları kopan verileri siler
        //buradaki [] içine sayı girmiyoruz int[] scores; isimli bir değişken bildirmiş deklare etmiş---sonra scores=new int[4]; ile initialized edildi.
        //6 SAYİMİZ VAR AMA ELEMAN 0 DAN BAŞLIYOR DİZİLER. 0.ELEMAN 1.ELEMAN....5.ELEMAN OLMAK ÜZERE TOPLAM 6 ELEMAN OLUR.EN SON ELEMAN DİZİNİN UZUNLUĞUNUN 1 EKSİĞİDİR.
        //N-1 ELEMENT ELEMAN-
        //sayilar[0]=15; sayılar 0.element 15'tir. indexim 0'dan başlıyor. derleyici yukarıda yazan 5.elemandan sonra 6.eleman yazsan hata vermez. Burada insiyatif sizde ama çalıştırınca hata verir.ama sayılar 6 için yer yok
        //derleyemez sistem derlenemeyen sistem çalışmaz int[] sayilar=new int[5]; dedin ama sayilar[5]=23;diyemezsin sistem bunu yazamaz okuyamaz çünkü buna yer yok hafızada öyle bir bilgi yok
        //Bu sayılara nasıl erişebiliriz. sayilar[1]=24 yani 1. indexteki eleman hafızada 2.elemandır. sout la çalıştırsan 24 olarak çıkarır.
        //tek tek değilde hepsine erişmek istesem for döngüsüyle getirebiliriz
        //for(int i=0; i<5; i++) i<sayilar.length (.)operatörünü kullanıp bir nesnenin özelliklerine ulaşmak için kullanılır. Ama { i<=5 diyemeyiz çünkü 6. eleman varmış gibi davranır ve hata verir.
        //  sout(sayilar[i]); dersek i inci eleman sayilar[3] 4. eleman denir. toplam=toplam+sayilar[i];
        // bu sayı dizlerinin ortalamasını nasıl alabiliriz.--->double ort=toplam/sayilar.length; int i int e bölmekten korkun çünkü küsuratlı çıkarsa veri kaybı oluyor. Bunun için ikisinden birini doubleye çevir.
        //double ort=(double) toplam/sayilar.length birini doubleye çevirirsek
        //
        //12.ders RECEP HOCA DÜN TEST PLANINDA UYULMASI GEREKEN KURALLARI ÖĞRENDİK-TEST PLANINI OLUŞTURDUK TOPLAM 4 SAYFA
        //TEST PLANINI TEAM LEAD OLUŞTURUYOR TEAM LEAD PRODUCT OWNER LA KONUŞUR VE MODİFY EDER SON ŞEKLİNİ VERİR. VE ÜYELERE ŞU TARİHE KADAR BUNU BİTİR DİYOR. ŞİRKETLERİN WİKİPEDİA GİBİ CONFLUNSE BİR TOOL ŞİRKETLERİN YAZIŞMALARI ŞİFRELERİ TEST PLANLARI
        //HERŞEY ORADA BULUNUR. BAZENDE PAYLAŞMAZLAR.SÖZLÜ OLARAK TA SÖYLERLER BAZEN.
        //BİR TAKIM İÇİN EN ZOR KISIM TEST CASE OLUŞTURMAKTIR. BİR TEST CASEDE NE OLUR? TEST CASE'İ OLUŞTURMADAN
        //BİR ŞEYİ TEST ETMEDEN ÖNCE O SİTEYLE İLGİLİ BİLGİNİZ OLMASI LAZIM. SİZE BİR USER STORY VERİLİR: AS AN USER I SHOULD LOG IN DASHBOARD
        //Requirement Analysis            User Story    As a User I should able to log in
//    Product Owner Creates    Feature1I should able to log in as a driver
//Feature2 I should able to log in as a manager
//AC (Acceptance Criteria)1I should see Dashboard
//AC (Acceptance Criteria)1I should see  Log Out Button
//ACCEPTANCE CRİTERİA: PRODUCT OWNER HAZIRLIYOR. FEATURE 1 VE 2 BİZE GELİNCE ŞEKİLLENİYOR.-->CRİTERİADA
//BELİRTİLEN HUSUSLARIN SINIRLARI NEYSE ONU YAPMALIYIZ.
//HEM NEGATİF-HEM POSİTİF TEST YAPMAM LAZIM--CİRA İLE ÇALIŞIYORSAN TEST CASELERİ CİRADA OLUŞTURURSUN.
//BİR TEST CASE'İN ÖNKOŞULU ÖN HAZIRLIKLARINI YAPMALIYIZ.İSMİ OLUCAK.HER TESTCASE'İN BİR ID'Sİ OLUR.
//DESCRİPTİON BU TEST CASE'İN NEYİ TEST ETTİĞİNİ BELİRTMEMİZ GEREKİR. ÖNEM DERECESİ VARDIR.
//LOW-MEDİUM-HİGH ÖNEM DERECELERİ VAR. BİR SENARYO İLE BİRÇOK TEST YAPABİLİYORSAK BUNUN ÖNEM DERECESİ ARTAR.
//HİÇBİR ŞİRKET TESTDATALARINI BURAYA TEST DATALARINI PASSWORDUNU BURAYA KOYMAZ.TEST CASE BİRBİRİNE ZİNCİR GİBİ BAĞLIDIR.
//environment set up bütün sistemi test case'i test etmeden önce çevreyi kolaçan etmeniz lazım.veb sitesinin linki bilgisayarınızı oluşturmak
//Bug life cycle-hata bulma süreci-önce defect ticket oluşturuyorsunuz. sonra developer assign atıyorsun.
//deferred beklemeye almak-benim test case'im var
//13.ders Gürhan Hoca:::::::::::::::::::::::::::::::::::::::::::::::::::::::::
//dizilerde bildirimde bulunmak: int[] numbers; bu deklare etmek, bildirimde bulunmak
//dizilerde initialize etmek new operatörüyle yapılır.  int[] numbers=new int[5]; bildirimde bulunup initialized etmiş olduk.
//for int i=0; i<numbers.lenght;i++) { nesnelerin içinde ilk atamalar oldu. lenght fieldddır.
// sout(numbers[i]); deyince ilk 5 tane 0 ataması yapılır. int tiple yazmışsam i 0 çıkar. boolean yazmışsam true yada faalsedur.
//int x; bir değer verdin ama initialized etmedim. hata mesajı alırım
//numbers[0]=15; new operatörü sen yazmasanda atama yapar. ilkel olmayan bir tip initialized edildiği zaman içerisinde bulunan
//ilkel tiplerin varsayılan değerleri atanır.->için demek  int->0, double->0.0 , boolean->false
//int[]numbers={3,5,7,9,11} bu şekliyle initialized edilebilir. YA SÜSLÜ PARANTEZLE YADA NEW OPERATÖRÜYLE YAPILIR İNİTİALİZED.
//int[] numbers=new int[5];
//   numbers[0]=3;
//   numbers[1]=5;
//   numbers[2]=7;
//   numbers[3]=9;
//   numbers[4]=11; bu şekildede initialized ediliyor. Burdada new operatorü çalışıyor ama gözükmüyor. New olmadan bir nesne initialized edilmez.
//for int i=0; i<numbers.lenght;i++) { nesnelerin içinde ilk atamalar oldu. lenght fieldddır.
// sout(numbers[i]); yazınca 3 5 7 9 11 çıkar.
//int a=4; bu ilkel tipler stackte saklanır
//int[] numbers=new int[5]; ilkel olmayan tipler-->heapte saklanır
//String isim=new Scanner()System-->heapte saklanır. Scanner i=new Scanner (System.in);--->heapte saklanır.
//Başlangıçta dizi kaç elamanla oluşturulmuşsa(eleman sayısı"01234-5 elemanlı--bu eleman sayısı değişmez(değişedebilir ama şimdilik böyle bilin)--değiştirmeye çalışırsan 10 elemana çıkarsan hepsi 0 oluyor
// numbers= newint[10];bunun anlamı heapte 10 elemanlı yeni bir sayı oluşturuldu demektir eskiFF00 ADRESİ GİTTİ FF100 GELDİ.. 5 ELEMENTLİ HEAPDEKİ DOSYANIN BAŞLANGIÇ ADRESİYLE BAĞI KOPTU 5 HEAPTE ÇÖPE GİTTİ.
// 10 ELEMANLI YENİ NESNENİN FF100 ADRESİ BAĞLANTISI GELDİ BUNUN YERİNE") öyle devam eder değiştirilemez. Ama elemanları değiştirilebilir.
//RASTGELE SAYILAR DAHA ÖNCE GÖRMÜŞTÜK. RANDOM
//RASTGELE 10 SAYI ÜRETİNİZ BUNLARI EKRANDA GÖSTERİNİZ. Sayılar 0-100 aralığında olsun
//int[]rastgeleNumbers={} BÖYLE EDEMEYİZ
//int[]rastgeleNumbers=new int[10]; BÖYLE EDEbiliriz new operatörü rastgele sayıları hemen atar.
//10 elemanlı bir dizi oluşturdum. heapte değeri 0.
//for int i=0; i<numbers.lenght;i++){
 //       rastgeleNumbers[i]=Math.random()// 0 ile 1 arası bir sayı üretiriz. 0,3378794561gibi
 //       for (int i=0; i<rastgeleNumbers.lenght; i++)
 //toplama yapmak=>  int[]rastgeleNumbers=new int[10];int toplam=0; sout("rastgeleNumbers[i]+" "); sout("Toplam ="+toplam);
//double random=(Math.random)*149+1
//Klavyede belirli sayıda not girişi yapınız
//diziler içinde günleri de tutabiliriz.
//GÜNLERİ YAZINIZ: String[]günler=new String[]  günler metin yani String--2 şekilde initialized edilebilir. 1)new 2)String[]günler={}
//String te " " kullanırız sayı gibi yazamayız.
//String[]günler={"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
//sout("Diziler eleman Sayısı :"+gunler.length); LENGTH FİELD F Sİ VAR SEMBOL OLARAK;
//for(int i=0; i<gunler.length;i++) {


//FOR EACH DÖNGÜSÜ::::C SHARP TA FOREACH DÖNÜŞÜMÜNÜ YAPMAK İÇİN VAR//günler dizisi içindeki herbir String gün için dön demek açıklaması
// for(String gun:günler){ Sout(gun); yazarsan haftanın 7 gününü yazar ekrana---->clean kod yazmayı yani sade anlaşılabilir kod yazmayı önemsiyor.
//lombok kütüphanesi var clean cod için.
//Programlamada arama yapmak, sıralama kodları-algoritmaları çok maliyetlidir. Yıllardır insanlar bunun için uğraşıyor.
//AZ KOD VERİMLİ FAYDALI MALİYETSİZ KODDUR. BİRÇOK İŞLEMCİNİN ÇALIŞMASINA GEREK KALMAZ.
//BİLGİSAYARDA BEDELİNİ ÖDEMEDİĞİNİZ HİÇBİRŞEYİ ALAMIYORSUNUZ. HIZ PERFORMAN İSTİYORSAK GÜVENLİKTEN ÖDÜN VERİYORSUN.
//ASIL İŞİMİZ ARAMA VE SIRALAMA-----
//for ilede arama yapılabilir ama biz farklı bir yöntem deniyelim.
// Araba için     MARKALAR:FORD, MERCEDES,BMW,HONDA,TOYOTA bu markaları bir dizi içinde tutmak istiyoruz
//  ARAÇLARI KULLANICIYA LİSTELEYECEĞİZ
//  String[] carNames={"FORD", "MERCEDES","BMW","HONDA","TOYOTA"};
// double[] carPrizes={20000, 50000,55000,15000,18000} fiyat bilgileri
//int[] carKm={80000,20000,15000,110000} kilometre bilgileri
//ÖNCE ARAÇ İSİMLERİNİ LİSTELEYELİİM. SOUT("ARAC LİSTESİ");SOUT("_________________");
//for(int i=0; i<carNames.length; i++){
// sout((i+1)+" - " carNames[i]); i+1 i nin değerini değiştirmez değerine o anlık 1 ekler(yoksa 0 dan başlayacak) i nin değerini i++ sayacı artırır.
//Listedeki aracı seçip onunla ilgili bilgi alma
//Başa Scanner yazıp ile bir seçim yapıcak.
//sout("Secim : ");
//int secim=input.nexInt();
//sout("Seciminiz : "+carNanmes[secim-1]); secim -1 yamalısın yoksa sistem 0123 gider ama senin seciminde görünen 123 1 fazalasını seçer sistem
//Şimdi seçtiğimiz arabanın fiyat bilgisini getireceğim. sout("Fiyatı :"+carPrizes[secim-1]);
//Şimdi kiometre bilgilerini isteyelim sout("Kaç Km'de? : "+carKm[secim-1]); ama hepsinin sıralamasına dikkat etmeliyiz. sıra farklı olursa farklı bir km ve fiyat gelir
//İLİN ALDIĞI YAĞIŞ MİKTARLARI:
//Mesela ANKARA'nın toplam yağış miktarı
//Önce bir plan yapalım mesela ayları tutucaksam--Önce aylar dizisini oluşturucam. String[] aylar={"Ocak" ,"Şubat","Mart"......}
//Yağış miktarlarını internetten indirdik. ama sayılar hep noktalı yani double kullanacam double[] yagıslar={40.5 ,35.3,.......}
//12 tane ay ve 12 tane yağış miktarı var elimizde. ocak 40.5 karşılığına gelicek şekilde yazıyoruz.
//Yıllık toplam yağış miktarı
//Ençok yağış alan ay
//En az yağış alan ay bu 3 sorumuz var ve bunu nasıl çözebiliriz.
//yağış toplamı için önce double toplam=0.0; for (int i=0; i<yagislar.length; i++){
//    toplam+=yagıslar[i]; Sout(String.format("Toplam yağıs miktarı = %5.1f,toplam")); virgülsüz çıkar.
//Ençok yağış alan ay için biz ne arıyoruz---bir ay ismimi bir listemi, burda 2 iş var 1'i en fazla yağış alan ayı bulabilmek için en fazla yağış miktarı ve onun sıralamadaki ay karşılığını bulacağız. double enFazla=0; yanii Ocak ayıdır
//int enAz=0; yanii Ocak ayıdır. if(yagıslar[i+1]>yagıslar[i]{ enFazla=i+1; i zaten 0 yani ocak ayı idi bu döngü çalışmaz.12 elemanlı bir dizinin en fazla 11.elemanı vardır döngü hata verir.
//
//
//RECEP HOCA:::::13.03.2022
//Fail olan adımların executed(uygulanmış) olması lazım. overlay önyüz. bu executed cirada otomatik olarak bulunuyor.
//Bug life cycle-->bir hatayı bulmak için akış şeması
//Hangi aşamada hata buluyorsan o kişiyi biliyorsun ve oraya assigned atama yapıyorsun. Bu hatayı bulan(detect ticket) değil re-test yapan kapatır hata mesajını
//deferred bekletmek-belirsizlik var dev gidiyor müşteriyle görüşüyor. ya biz bunu hata olarak kabul etmiyoruz diyor. sonra
//duplicate olmak=daha önce aynı hatanın bulunması
//Bunu kitabi soraacaklar-bug life cycle bu şemaya çalış.
//ben olsam bir hatayı bulduğumda iletişim olarak developerla görüşürüm bir hal hatır sorarım
//14.DERS GURHAN HOCA
//BİZİM İÇİN İLK GÜN GÖRDÜĞÜMÜZ KONULARDA GÜNCEL HALA KULLANIYORUZ.
//İNDEX DEĞERİ DEDİĞİ DİZİLERİMİZİN İNDEX SAYISI 0 DAN BAŞLAYIP İÇİNDEKİ ELEMAN SAYISININ 1 EKSİĞİNE KADAR GİDİYOR.
//İNDEX DEĞERİ DEDİĞİ DİZİNİN İÇİNDE 0 DAN BAŞLAYAN SIRALAMA RAKAMLARI VE ONUN KARŞILIĞIDIR.
//
//YENİ KONU FİNDİNGCAR---İSMİ VERİLEN ARABAYI LİSTEDEN BULUP(DİZİ-ARRAY) EKRANDA GÖSTEREN METOT YAZINIZ. saddede bul ve ekranda gösterme yani geri dönüş yok void yok
//Sınıf isimleri javaclasstaki fiil olmaz isimlerden olur. Methodlarda ise topla göster vs. hepsi fiillerden oluşur.
//
//   String[] cars={"TOYOTA","MERCEDES", "FORD","HONDA", "BMW"};
//
//   public static void findCar()  metod bu araba bul listeden. fiil find unutma. elimizde bir dizi olması lazım
//   public static void findCar(String carName,String[] carNames){    2 şey listenin kendisi bide aramak istediği değeri giricez.
//   listenin üstünde dönmek istiyorsam-bunun için index'e ihtiyaç duymuyorsam foreach döngüsünü kullanabiliriz.
// for(String car:carNames){
// if(car==carName){
// sout ("Aradığınız araba bulundu. ["+car+"]");
//
//String car=input.nextLine(); string burada ilkel tip değil.  İLKEL TİPLERE (VALUED TİP) DEĞER TİPLERİDİR. intx=4,y=6; if(x==y) bu ilkel bir değer karşılaştırması
//" ". string eşitmidir ifadesi
//BMW yerine Bmw yazsan bulmuyor büyük-küçük harf duyarlılığı---->bunu çözmek için equalsIgnoreCase yazarsan bu düzelir
//String nesnelerimizin metotları var.
//String mesaj="Bu bir deneme mesajıdır" toUppercase dersen bütün harfleri büyük hale getirir.
//Heriki tarafıda tolower case() yaparsan senin yazdığın ile dizinde bulunan araçların isimlerini küçülttü.
//int sayac=0 bişeyi tespit etmek için; sayac++;yazdık ne yazarsam 5 kez dönüyor yani sonuna kadar döngüyü devam ettiriyor. bulduğum anda bitmesi için
//flag=true;
//break;
// 2.ci aramada buldu. 1 milyarlık bir veri seti var buldu ama 1 milyarın sonuna kadar gider buda time complexity olur.
//son 10 ddakika bir örnek daha yapıyoruz.
//Elimizde String dizisi olsun
//String[]={"Ahmet Dursun", "Hasan ŞAŞ", "İlhan MANSIZ"}
//public static void showValues(String[] values) {--->sadece ekrana yazdıracağım için void kulladım.
//Stringin nesnenin  varsayılan başlangıç değeri null dur. gerbiç kolektör onu alır öğütür. String[] isimler={.....}
//yazdın sonra isimler=new String[5]; yazdın burda farklı bir değişken tanımlayınca bir üsttekinin bağı koptu.
//return yapmak bir nevi break gibi if(values!=null) değerler null değilse çalıştır.
// values varmı steakte values değer varmı yoksa null(boş orası) yani adres yok. adres varsa yani bir nesne varsa null olmaz. Null boş steakte görünüyor.
//if ten sonra tek bir komut çalıştırıyorsak blok koymaya gerek yok. bir kaç komut varsa blok konulur ama herzaman blok koymak gerekir
//break bir yerden çıkmak için kullanılır. return bir yere dönmek için kullanılır
//YENİ KONU
//PUBLİC STATİC VOİD changeValue(int value)  {
// value=5;  if(value==5){ sout("Değişti.");  yukarıya int x=20; kullandığım zaman ilkel tip steak te tutuluyor .sout ("Değer ="+x) changeValue(x); sout ("Değer ="+x) çalıştır değerin değişmediğini görürsün
//int[] sayilar={5,7,9} 3 elemanı var. yazdık sonra PUBLİC STATİC VOİD changeValue(int[] values)  { values[0]=15; if(values[0]==15{sout ("Değişti.")
//Yani metodun içinde olan metodun içinde kaldı.
//metodların overloadı-
//ilkel bir tipi değiştirmeye çalışsan değişmiş gözükür ama değişmez
//ilkel olmayan bir tipte bir veriyi değiştirmeye çalışırsan değişir
//codingbat.com java ile ilgili örnek var çalışma amaçlı
//RECEP HOCA--------------------------------------------------------------------------AGİLE METHODOLOGY--
//14. DERS. BU SÜRECİ KİMSE BAKMASIN BEN SÜRECİN SONUNA KADAR GİDİCEM MÜDAHALE ETMEYİN
//2. GÖRÜŞ İSE bana her zaman müdahale edin. ben hatta işleri ufak parçalara böleyim küçük küçük tamamlayayım.
//waterfall ::: şelale
//agile ::::: ALTINDA FARKLI METADOLOJİLER VAR BİRİ SCRUM
//
//
//
//
//JAVAA15 GÜRHAN HOCA;
//ARRAYSMULTİDİMENSION:Programlama dillerinde birden fazla boyuttan oluşan diziler (array) kullanılabilir. Bu dizilere çok boyutlu dizi (multi dimensional array) ismi verilir.
//KÜÇÜK HATIRLATM DİZİLER ARRAY-Tek boyutlu dizi VEKTÖR. İKİ BOYUTLU DİZİYE MATRİS DİYORUZ
//Bir diziyi nasıl define deklare bildirim ettiğimizi gösterin
//String[] gunler;-->bu bir deklaretion
//gunler=new Strinf[7];
//Ataması ise gunler[0]="Pazartesi";
//.....
//gunler[6]="Pazar"; hepsinin atamasını yapmış olduk.
//Birde kısaca
//String[]gunler={"Pazartesi","Salı",..."Pazar"}
//sout("Eleman Adedi= "+gunler.length);
// ilk elemana String[0] index deki ilk elemana yani 0.ıncı dizi elemana şöyle ulaşırız sout("İlk Eleman Index): "+gunler[0]);
//Son elemana String[0] index deki son elemana yani 6.ıncı dizi elemana şöyle ulaşırız sout("Son Eleman Index): "+gunler[6]);
//for
//for each -->for(String gun:gunler){ sout(gun)---->bunlar vektörlerdi
//ŞİMDİ İSE İŞİ İLERLETİYORUZ. ELİMİZDE BİR TABLO VAR İSİMLER 100'LERCEDE OLABİLİR. VE DERSLERDE VAR.ELİMİZDE TUTMAK İSTEDİĞİMİZ ESAS veri notlardır. Bu veri notlara odaklanıyoruz. Bunlar tam sayı. Buna kısaca ARRAYS 2D 2 BOYUTLU DİZİLER DENİR
//0-100 ARASI İNTdeğerlerden bahsediyoruz. Bir vektör tanımlasak bu notları tutabilirmiyiz. Öğrenci başına fiziği kimyayı ayrı tutmalıyız.
//int[][] notlar={          };   herbir öğrenci için ayrı bir süslü parantez yapıcaz {}{}{}{}{}--->bunu new ilede yapabiliriz ama öğrenmek için bunu görüyoruz.
//int[][] notlar={   {70,60,50},{80,55,75},{75,85,95},{40,60,80}{30,80,50}en sonda virgül yok       };//70,60,50 Ahmetin ders notları,zeynep,ayşe,deniz,görkem
//         M   F  K
//        {70,60,50},
//        {80,55,75},
//        {75,85,95},
//        {40,60,80},
//        {30,80,50}
//        };
//    int[][] notlar_1=new int [5][3]; 15TANE VERİ VAR YUKAARIDA--DİZİMİZ 5 ELEMANLI 5 öğreniye karşılık 3 not
//    notlar_1=[0][0]=70; O.INCI ELEMANIN 0.INCI SATIRI {70,60,50},
//        notlar_1=[0][1]=60; O.INCI ELEMANIN 1.INCI SATIr

    /*double[] toplamlar=new double[3];

    String[] isimler={"Ahmet","Zeynep","Ayşe","Deniz","Görkem"};

    sout("Öğrenci\tMat\tFIZ\tKİM")
    for (int i=0; i<notlar.length; i++) {
    for(int j=0;j<notlar[i].length; i++){
        sout(notlar[i][j]+\t);
        toplamlar[j]+=notlar[i][j];//t=t+s
        }//herbir dersin notu için döndü isimler içinde dönmüş oldu.
    sout();
        }//herbir öğrenci için dönüyor.
        sout();
        sout("Not Ortalamaları :");
        sout("Mat : "+toplamlar[0]/notlar.length));
        sout("Fiz : "+toplamlar[1]/notlar.length));
        sout("Kim : "+toplamlar[2]/notlar.length));

        }
        }
*/
       // so
//debug işlemi böcekten arındırma F8 E basarsan basa basa git o sırada her satırda ki işlemleri tek te görebiliyoruz.
//RAGED YADA JAGGED DİZİLER- Bir tek boyutlu dizi oluştururken [] bir dizi işareti 2boyutluda ise [][] 2 dizi işareti kullandık
//String[][] time=new String[3][];         aylar, günler, mevsimler[3] olmak üzere 3 şeyi tutuyoruz. zaman kavramlarını tutuyoruz[] boş bıraktık doldurmak zorunda değiliz.
//dizinin içinde diziler tutuyoruz.
//time[0]=new String[7];  şimdi tutmaya başladık günler
//time[1]=new String[12];  şimdi tutmaya başladık aylar
//time[2]=new String[4];  şimdi tutmaya başladık mevsimler..Kaç eleman tuttuğumuzu sonradan gösteriyoruz.Dizimizin tipi String
//Atamaları şöyle yapıyoruz.
//time[0][0]="Pazartesi"; böylede yapabiliriz
//time[0][1]="Salı"; böylede yapabiliriz
//time[0][2]="Çarşamba"; böylede yapabiliriz
//time[0][3]="Perşembe"; böylede yapabiliriz
//time[0][4]="Cuma"; böylede yapabiliriz
//time[0][5]="Cumartesi"; böylede yapabiliriz
//time[0][6]="Pazar"; böylede yapabiliriz
//şöylede yapabiliriz. bu normalde ilk initialized da yapılabilir time[0]={...,....,....,....,....,....} onun için burda izin vermiyor derleyici
//String[][] time={     1'e 5 koordinatında haziran var
    /*    {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"},
        {"Ocak","Şubat","Mart","Nisan","mayıs","haziran","temmuz","ağustos","eylül","ekim","kasım","aralık"}
        {"ilkbahar","yaz","sonbahar","kış"}*/
//Bu 2 boyutlu ama tam bir matris oluşumu yok [3][] olduğu için
//bizim time dizimizin eleman sayısı 3 tür. 0.indexteki elemanlarının sayısı 7 birinci indexteki elemanların sayısı 12, 2. indexteki elemanların sayısı 4tür.
//  for (int i=0; i<time.length; i++) {
//    for(int j=0;j<time[i].length; j++){
//        sout(time[i][j]+" ");
//        }
//        sout();
   /*     }           //jagged de eleman sayılarımız eşit değil.

        }sout("("+i+";"+j+")\t")
        }
        sout();*/
//3BOYUTLU SAYILAR 3D ARRAYS
//ÖNCE BİLDİRİMDE BULUNALIM
//int[][][] notlar= {    //önce initialized ediyoruz.
//3 öğrencinin 3 dersteki VİZE VE FİNAL NOTLARI      MAT v F FİZ V F
//2) herbir öğrenci için bir süslü parantez  en dış {  {{70,80}{50,65}{80,85}},//birinci öğrenci                {},                   {}                 }
// int[][][] notlar_1=new int[3][3][2];
// notlar_1[0][0][0]=70;
// notlar_1

//DAY15 RECEP HOCA WATERFALL DE BEN BİR ÜRÜNÜN BİLGİLERİNİ ALICAM BU ÜRÜN ÇIKANA KADAR KİMSE DOKUNMAYACAK KARIŞMAYACAK
//AGİLE DİYOR Kİ BANA HER ADIMDA KÜÇÜK PARÇALARA BÖL DİYOR ÜRETİMİ VE HATALARINDA KÜÇÜK OLMASI VE HER ADIMDA MÜDAHALE
//EDİLMESİNİ İSTİYOR. DÜNYADA BU YAYGIN OLAN BU SİSTEM. YENİLİKLER VARSA YENİLİKLER EKLEYEBİLİRSİN.
//AGİLE 'IN MANTIĞI 12 PRENSİBİ VAR--MÜŞTERİ MEMNUNİYETİ-SOFTWARE ÜRÜNÜN ERKEN KARŞILAYIP SÜREKLİ BU ŞEKİLDE KALIRSAN MÜŞTERİ MEMNUNİYETİ
//ARTAR.2)SİZ HER ZAMAN MÜŞTERİLERİN DEĞİŞİKLİK TALEPLERİNE AÇIK OLMALISIN HATTA BU DEĞİŞİKLİKLER EN SON SAFHADA BİLE OLSA
//3)KÜÇÜK KÜÇÜK PARÇALARA BÖLERSEN SÜREKLİ T
//4)kaçak göçekleri tespit aşaması
//5)projedeki insanların kendinden motorlu olması
//6)bire bir yüzyüze iletişim topluluğun en iyi formu olmalı
//8)ilk maddeyle aynı düşünülebilir
//9)baştan sona projede dikkat yoksa proje çökmeye mahkumdur. bir projeyi başka tool ve applicatıonlarla entegre edilmesi
//cı cd pıpeline
//Basitlik iyidir küçüklük herzaman iyidir. regression test küçük parçaların birbiriyle uyumundan bahsediliyor.
//DAY18
//JAVANIN EN ÖNEMLİ KONUSU OOP OBJECTED ORİENTED PROGRAM
//NESNEYE DAYALI OLMAYAN PROGRAMLAMADA MI VAR EVET.
//1)MAKİNE DİLİ İLE
//ASSEMBLY DİLİ İLE
//3.YÜKSEK SEVİYELİ DİLLER
//    A)YAPISAL PROGRAMLAMA DİLLERİ=Herşey prosedür içinde
//          ---procedure=bu bir metot-return yapmayan metotlar gibi-void gibi
//          ---function = bu da bir metottur(veriler üzerinde işlem yapmak) çağırıldığı yere veri döndürenmetotlar gibi
//    B)NESNEYE DAYALI PROGRAMLAMA DİLLERİ-OOP-OBJECTED ORİENTED PROGRAM
//          ---METOTLAR VE VERİLER BİRLİKTE BİR ÇATININ ALTINDA DURUYOR. BUDA VERİ ÜZERİNDE MANİPULASYON YAPAR. 4 İŞLEM-KIYASLAMA-TERNARY OPERATÖRÜ
//          ---BİZ GERÇEK HAYAT NESNELERİNİ KLAVYE ARABA ELMA NE VARSA-HAYAL ETTİĞİMİZ HERŞEYİ DE DAHİL GERÇEK HAYATTA OLMAYAN ŞEYLERİDE PROGRAMLAYABİLİRİZ. HERŞEYİ
//          ---30-40 YIL ÖNCE JAVADAN ÖNCEDE VARDI.
//          ---METOT METOT YAZSANIZ BİLE O ANKİ KAYNAK KODU YAZDINIZ O ANKİ PROBLEMİ ÇÖZDÜNÜZ. AMA SADECE O PROBLEME HASTIR.
//          ---O ANDA ÇÖZERSİN VE BİTER SONRA YENİ BİR KOD YAZMAN LAZIM. BİR VAKİT İSRAFI OLUYOR. BUNU KİM ÖNLÜYOR. NESNEYE DAYALI PROGRAMLAMA ÇÖZÜYOR.,
//          ---OOP DE İSE TEMİZ KOD VAR.    DONT REPEAT YOURSELF: DRY: AYNI KODLARI TEKRAR TEKRAR YAZDIĞIĞINDA-->
//              maintanence :Bakım  Modification=değişiklik yapma, debugging: Hata ayıklama bunlar zaman harcar, prensiplerine uyarsak
//          ---hiç sıkıntı çekmeyeceğiz.
//          ---Gerçek Hayattaki nesneler: CRM Müşteri İLİŞKİLERİ YÖNTEMLERİ kapıdan adım atar atmaz her aşamada bilişim otamıyla iç içe. çiçeksepeti amazon
//          ---Her nesnenin kendine göre karakteri(özeelikleri yaş,büyüklükleri, color) ve davranışları(uyuma yemek oturma koşma)
//        var. Bunlar Ortak özellikleridir.
//
//
//           KÖPEK NESNENİN ADI BİR SINIF TARZI(CLASS-Mainapp)-->kütüphane yönetim sistemi, bir köpek nesnesi tanımlama DATA MEMBERS; (DEĞİŞKENLER) VE METHOTS
//            NESNENİN BİR PLANINI YAPMALIYIZ. BİNA İÇİN MİMARIN ÇİZDİĞİ PLANI MÜTEAHİT UYGULAR.
//              JAVADA DA İNSTANCE
//kütüphane yönetim sistemi=>elimde bulunan kitapları raflara dizmek istiyorum,kitapların raflara dizilmesini, yerlerinin alınmasını, sonra okunup geri bırakılmasını istiyorum. Ayrıca planda olmayan raf,yazar kitap numaraları bunlar bir class olucak hepsi başlı başına
//          benim dog diye bir sınıfım olmalı. ve datalar oluşturuyorum. Herbir davranış içineklemeler yapıyorum.
//          bir defa otomobil tasarlıyorum rengi markası şuyu buyu yok. Bir kere tanımladıktan sonra max hız, aktif hız, fiziki dünyadaki gibi gerçeklikler, yerin yerçekimi kuvvetini bile hesaba katıyorsun,
//          Bunları bir kere yazıyorsun ve 12'ye çıkıyorsun. önce tasarlıycaksın Class oluşturucaksın.
//
//          ***tasarlayacağımız herbir nesne için main metotu kullanmayacağız.
//          public class Araba { diyoruz artık sınıflarımın içinde main metodu kullanmayacağız.
//          Sadece bir yerde olucak.
//          BÜTÜN NESNELER KALITIM YOLUYLA BÜYÜKLERİNDE ÖZELLİKLER ALIR.YADA ÇOCUKLARINA MİRAS BIRAKIR=>1.KURAL İNHARİTANCE
//          OBJECT DİYE BİR SINIF VAR BÜTÜN SINIFLARIN ATASIDIR.
//          ARABAMIZ ÖZELLİKLERİNİ ATASINIFINDAN ALMIŞ
//          Araba araba1=new Araba();
//          Araba araba2=new Araba(); böyle yüzlerce araba nesnesi yapabiliriz.Bunlar araba1 ve araba2 ortak bir sınıftan yani Araba sınıfından geliyor.
//          public class Araba{
//              String marka;
//              int yas;
//              double silindirHacmi;   Arabamızın 3 tane özelliği var.
//               main metodunun olduğu yerde Araba araba1=new Araba(); Araba Class'a yazdığımız özellikler silindir renk yaş hepsi burada otomatik çıkıyor.
////          Araba araba2=new Araba();   sout yazıp bastırmayacaz o zaman oop'den vazgeçeriz.
//              araba class'ı içine gelicez void bilgileriGoster(){ sout marka silindir hacmi ayrı ayrı yazıp
//              member variable instance variable=> local variable gibi değiller initialized etmeye gerek yok
//              araba class'ı bir kağıt bir şablon => gerçek proje main üzerinde yapılır. new operatörüyle atamaları burada yazarız
//              SINIF CLASS=> BİR ÇİZİM   AMA BİR NESNE ŞABLON LULLANILARAK HER DEFASINDA YENİ VE BİRBİRİNDEN BAĞIMSIZ ÇALIŞIR. BU AYRIM ÖNEMLİ
//              METOTLARI NORMALDE MAİN METODUNUN DIŞINDA TASARLIYORDUK.
//              STATİC OLMASI BİR METOT BİR DEĞİŞKENDE STATİC OLABİLİR. BURDAKİ SINIFTA OLUŞTURULACAK.
//              STATİC NESNE OLMADIĞI İÇİN STATİC YAZILIR.  İNSTANCE(ÖRNEK) OLUŞTURMADAN
//              STATİC NESNELER HİÇBİR NESNEYE BAĞLI DEĞİLDİR.NERDEN ERİŞİLİR NERDEN ERİŞİLEMEZ BUNLARI GÖRÜCEZ.
//              GEOMETRİ PROJESİ YAPICAZ.               İMPORT.JAVA.LANG.*  KÜTÜPHANESİ Bİ BU KODU YAZMASAKTA VAR ZATEN
//              DATA MEMBERS LAR VERİ SAKLAR
//              2.KURAL MUHAFAZA ALTINA ALMA VERİLERİ PUBLİC BİR METOD TANIMLAYACAĞIZ.