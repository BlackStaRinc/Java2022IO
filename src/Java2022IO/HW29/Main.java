package Java2022IO.HW29;

public class Main {
    public static void main(String[] args) {
        CustomerManager cManager = new CustomerManager();
        cManager.bDatabaseManager = new MySqlDatabaseManager();
        cManager.getCustomers();
    }
}