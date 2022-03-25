package calisma;

public class Kare {
    private double kenar;
    public double getKenar() {
        return kenar;
    }

    public void setKenar(double kenar) {
       if(kenar>0.0){
           this.kenar = kenar;
       }

    }

    //Karenin özelliklerini bilirsem
    //sonra görsellik ekleyeceğim çocuklar için
    //gizli private mı olsun yoksa

    public double alanHesapla() {
        return kenar*kenar;


    }
    public double cevreHesapla(){
        return 4*kenar;
    }
}