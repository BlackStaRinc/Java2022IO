package Java2022IO.HW8;

public class Main {

    public static void main(String[] args) {

       String ogrenci1 = "Ayşe";
       String ogrenci2 = "Fatma";
       String ogrenci3 = "Hayriye";
       String ogrenci4 = "Hamza";
       
       System.out.println(ogrenci1);
       System.out.println(ogrenci2);
       System.out.println(ogrenci3);
       System.out.println(ogrenci4);

       System.out.println("---------------------------");

       String[] ogrenciler = new String[3];

       ogrenciler[0] = "Ayşe";
       ogrenciler[1] = "Fatma";
       ogrenciler[2] = "Hayriye";
       ogrenciler[3] = "Hamza";
       
       for (int i = 0; i < ogrenciler.length; i++) {
        System.out.println(ogrenciler[i]);
       }

       for (String ogrenci:ogrenciler) {
        System.out.println(ogrenci);
       }
    }
    }