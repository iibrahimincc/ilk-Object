package metot;

public class Cat {

    private String adi;

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    private String renk;

    public Cat(String adi, String renk) {
        this.adi = adi;
        this.renk = renk;
    }

    public String getAdi() {
        return adi;
    }

    public String getRenk() {
        return renk;
    }

    public static void bilgilendir() {
        System.out.println("bu sınıf kedi ile ilgili bilgileri  tutar");
    }
}
