package Java2022IO.HW18;

public class Main {

    public static void main(String[] args) {
       String mesaj = "Bugün Hava Güzel";
       String yeniMesaj = sehirVer();
       System.out.println(yeniMesaj);
       int sayi =topla(8, 7);
       System.out.println(yeniMesaj + " " + mesaj + " " + sayi + " Derece");
    }
    public static void ekle() {
      System.out.println("Eklendi");
    }
    public static void sil() {
      System.out.println("Silindi");
    }
    public static void guncelle() {
      System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2) {
      return sayi1+sayi2;
    }
    public static String sehirVer() {
      return "Ankara";
    }
    }