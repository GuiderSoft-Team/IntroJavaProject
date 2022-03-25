package calisma;

public class Dog {
    private String breed;
    private String size;
    private int age;
    private String color;// İLERİDE private Color.JAVA.AWT; GÖRÜCEZ
    //yazmasakta metodumuz var. conctraktor=>kurucu metot.
    //new operatörü sınıfın ismiyle aynı olan ve görünmeyen new projesiyle yukarıdaki hepsini
    //initialized eder.// dog metodunu
    public Dog(String b,String s,int a,String c){  //BU KURUCU METOT. PRİVATE YAPTIĞIM İÇİN
        breed=b;
        size=s;
        age=a;
        color=c;
    }
    public Dog() {

    }
}
