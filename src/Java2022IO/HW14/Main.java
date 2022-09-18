package Java2022IO.HW14;

public class Main {

    public static void main(String[] args) {
        int number = 28;
        int total = 0;

        for (int i = 0; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
      if (total == number) {
        System.out.println("Mükemmeldir");
      } else {
        System.out.println("Mükemmel Değildir");
      }
    }
    }