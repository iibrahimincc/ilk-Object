package metot;

public class MainMetot {
    public static void main(String[] args) {

        ilkkod();
        Cat.bilgilendir();
        Cat cat = new Cat("fatma", "siyah");

        System.out.println(cat.getAdi() + "    " + cat.getRenk());
        cat(cat);

        System.out.println("cat metotunda sayi:" + cat.getRenk() + cat.getAdi());

        System.out.println("--------------");
        Integer testSayisi = 0;
        sayiyiyi10Artır(testSayisi);
        System.out.println("main metotunda sayi:" + testSayisi);


    }


    public static void ilkkod() {
        System.out.println("kod çalısmaya başladı");
    }

    public static void sayiyiyi10Artır(Integer value) {
        value = value + 10;
        System.out.println("sayiyiyi10Artır metotunda sayi:" + value);
    }


    public static void cat(Cat value) {
        System.out.println("cat metotunda sayi:" + value.getRenk() + value.getAdi());

        value.setAdi("boncuk");
        value.setRenk("beyaz");
        System.out.println("cat metotunda sayi:" + value.getRenk() + value.getAdi());
    }


}
