package Java2022IO.HW21;

public class Main {
    public static void main(String[] args) {

        DortIslem dortIslem = new DortIslem();
        int topla = dortIslem.Topla(3, 4);
        int cikar = dortIslem.Cikar(7, 2);
        int bol = dortIslem.Bol(10, 2);
        int carp = dortIslem.Carp(7, 2);

        System.out.println(topla);
        System.out.println(cikar);
        System.out.println(bol);
        System.out.println(carp);
        
    }
    }