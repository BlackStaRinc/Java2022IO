package Java2022IO.HW20;

public class Main {

    public static void main(String[] args) {
     CustomerManager cManager = new CustomerManager();
     CustomerManager cManager2 = new CustomerManager();
     cManager.Add();
     cManager.Remove();
     cManager.Update();
     
     //value
     int sayi1 = 10;
     int sayi2 = 20;
     sayi2 = sayi1;
     sayi1 = 30;
     System.out.println(sayi2);

     int[] sayilar1 = new int[]{1,3,23};
     int[] sayilar2 = new int[]{2,5,7};
     sayilar2 = sayilar1;
     sayilar1[0] = 10;
     System.out.println(sayilar2[0]);
    }
    }