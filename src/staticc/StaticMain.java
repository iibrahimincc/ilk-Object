package staticc;

public class StaticMain {
    public static void main(String[] args) {

        ArabaStatic arabaStatic1= new ArabaStatic();
        ArabaStatic arabaStatic2= new ArabaStatic();

        arabaStatic1.setMarka("opel");
        ArabaStatic.arabaSayisi+=1;
        System.out.println(ArabaStatic.arabaSayisi);

        arabaStatic2.setMarka("nissan");
        ArabaStatic.arabaSayisi+=1;
        System.out.println(ArabaStatic.arabaSayisi);


    }
}
