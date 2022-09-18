package Java2022IO.HW10;

public class Main {

    public static void main(String[] args) {
        String[][] cities = new String[3][3];

        cities[0][0] = "Kırklareli";
        cities[0][1] = "İstanbul";
        cities[0][2] = "Bursa";
        cities[1][0] = "Ankara";
        cities[1][1] = "Karaman";
        cities[1][2] = "Nevşehir";
        cities[2][0] = "Ordu";
        cities[2][1] = "Giresun";
        cities[2][2] = "Artvin";
        for (int i = 0; i <= 2; i++) {
            System.out.println("---------------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(cities[i][j]);
            }
        }
       }
    }