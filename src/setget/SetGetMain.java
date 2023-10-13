package setget;

import Test.Araba;

public class SetGetMain {
    public static void main(String[] args) {
        ArabaSetGet araba1=new ArabaSetGet();

        araba1.setMarka("opel");
        araba1.setRenk("yeşil");
        araba1.setModel("corsa");

        System.out.println(araba1.getMarka()+ araba1.getRenk()+araba1.getModel());


        Araba araba2  = new Araba();
        System.out.println("///// İlk Araç /////");
        araba2.renk = "Beyaz";
        araba2.kapilar = 4 ;
        araba2.tekerlekler = 4;
        araba2.motor = "16V";
        araba2.model = "Renault";
        System.out.println("Araç Modeli :" + araba2.model);
        System.out.println( "Araç Rengi :" + araba2.renk);
        System.out.println("Araç Kapı Sayısı  :" + araba2.kapilar);
        System.out.println("Araç Teker Sayısı :" + araba2.tekerlekler);
        System.out.println("Araç Motor Gücü :" + araba2.motor);
    }
}
