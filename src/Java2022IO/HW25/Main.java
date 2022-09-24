package Java2022IO.HW25;

public class Main {
    public static void main(String[] args) {
        //OgretmenKrediManager oKrediManager = new OgretmenKrediManager();
        //oKrediManager.Hesapla();

        KrediUI kUi = new KrediUI();
        kUi.KrediHesapla(new AskerKrediManager());
    }
}