package Java2022IO.HW19;

public class Main {

    public static void main(String[] args) {
       String mesaj = "Bugün Hava Güzel";
       String yeniMesaj = sehirVer();
       System.out.println(yeniMesaj);
       int sayi =topla(8, 7);
       System.out.println(yeniMesaj + " " + mesaj + " " + sayi + " Derece");
       int toplam = topla2(1,2,3,4,6,7,8,9);
       System.out.println(toplam);
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
    public static int topla2(int... sayilar) {
      int toplam = 0;
      for (int sayi : sayilar) {
        toplam+=sayi;
      }
      return toplam;
    }
    }