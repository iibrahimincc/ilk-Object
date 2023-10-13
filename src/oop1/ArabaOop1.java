package oop1;

public class ArabaOop1 {
    /**
     * Java Access Modifiers
     * Değişkenin erişim kısıtını ayarlar
     * public : Bulunduğu paketin ve sınıfın dışındaki başka paketler ve sınıflardan erişilebilir.
     * protected : Farklı paketlerden erişim sağlanamaz.
     * default : Programda herhangi bir belirleyici mevcut olmadığı takdirde metodun ya da sınıfın erişim belirleyicisi default olur. Bu takıyı alan metotlar alt sınıftan ve bulunduğu paketten erişilebilir.
     * private : Yalnızca bulunduğu sınıftan erişilebilir.
     */
    public String renk;
    protected String  model;
    Integer vitesSayisi;
    private String marka;

    //sınıf değişkeni değerini döndürür.
    public String getMarka() {
        return marka;
    }

    //atama parametreden alınan değer sınıf değişkenine atanır.
    public void setMarka(String marka) {
        this.marka = marka;
    }
}
