package Java2022IO.HW5;

public class Main {

    public static void main(String[] args) {
       int sayi1 = 300;
       int sayi2 = 25;
       int sayi3 = 30;
       int enBuyuk = sayi1;
       if (enBuyuk<sayi2) {
        enBuyuk = sayi2;
       }
       if (enBuyuk<sayi3) {
        enBuyuk = sayi3;
       }
       System.out.println("En Büyük : " + enBuyuk);
    }
}