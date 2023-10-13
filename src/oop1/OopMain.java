package oop1;

public class OopMain {

    public static void main(String[] args) {
        System.out.println("oop1 kodu calıstı");
        // Test.Araba araba1  = new Test.Araba();
        ArabaOop1 araba1 = new ArabaOop1();
        ArabaOop1 araba2 = new ArabaOop1();
        ArabaOop1 araba3 = new ArabaOop1();

        //  araba1.marka="Opel";
        araba1.renk = "kırmızı";
        araba1.model = "2023";
        araba1.vitesSayisi = 7;
        araba1.setMarka("Opel");

        System.out.println(araba1.getMarka());
        araba1.setMarka("audi");
        System.out.println(araba1.getMarka());

        araba2.setMarka("volkswogan");
        araba3.setMarka("nissan");

        System.out.println("1. " + araba1.getMarka());
        System.out.println("2. " + araba2.getMarka());
        System.out.println("3. " + araba3.getMarka());


    }
}
