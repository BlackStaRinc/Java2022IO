package Java2022IO.HW28;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator wGameCalculator = new WomanGameCalculator();
        wGameCalculator.hesapla();
        wGameCalculator.gameOver();
        
        GameCalculator gCalculator = new WomanGameCalculator();
    }
}