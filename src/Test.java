public class Test {

    public static void main(String[]  args) {

        Araba araba1  = new Araba();
        System.out.println("///// İlk Araç /////");
        araba1.renk = "Beyaz";
        araba1.kapilar = 4 ;
        araba1.tekerlekler = 4;
        araba1.motor = "16V";
        araba1.model = "Renault";

        System.out.println("Araç Modeli :" + araba1.model);
        System.out.println( "Araç Rengi :" + araba1.renk);
        System.out.println("Araç Kapı Sayısı  :" + araba1.kapilar);
        System.out.println("Araç Teker Sayısı :" + araba1.tekerlekler);
        System.out.println("Araç Motor Gücü :" + araba1.motor);


        Araba araba2  = new Araba();
        System.out.println("///// İkinci Araç /////");
        araba2.renk = "Siyah";
        araba2.kapilar = 2 ;
        araba2.tekerlekler = 4;
        araba2.motor = "23V";
        araba2.model = "Opel";

        System.out.println("Araç Modeli :" + araba2.model);
        System.out.println( "Araç Rengi :" + araba2.renk);
        System.out.println("Araç Kapı Sayısı  :" + araba2.kapilar);
        System.out.println("Araç Teker Sayısı :" + araba2.tekerlekler);
        System.out.println("Araç Motor Gücü :" + araba2.motor);

        Araba araba3  = new Araba();
        System.out.println("///// Üçüncü Araç /////");
        araba3.renk = "Füme";
        araba3.kapilar = 4 ;
        araba3.tekerlekler = 4;
        araba3.motor = "32V";
        araba3.model = "BMW";

        System.out.println("Araç Modeli :" + araba3.model);
        System.out.println( "Araç Rengi :" + araba3.renk);
        System.out.println("Araç Kapı Sayısı  :" + araba3.kapilar);
        System.out.println("Araç Teker Sayısı :" + araba3.tekerlekler);
        System.out.println("Araç Motor Gücü :" + araba3.motor);

        Araba araba4  = new Araba();
        System.out.println("///// Dördüncü Araç /////");
        araba4.renk = "Kırmızı";
        araba4.kapilar = 2 ;
        araba4.tekerlekler = 4;
        araba4.motor = "56V";
        araba4.model = "Ford";

        System.out.println("Araç Modeli :" + araba4.model);
        System.out.println( "Araç Rengi :" + araba4.renk);
        System.out.println("Araç Kapı Sayısı  :" + araba4.kapilar);
        System.out.println("Araç Teker Sayısi :" + araba4.tekerlekler);
        System.out.println("Araç Motor Gücü :" + araba4.motor);

    }
}
