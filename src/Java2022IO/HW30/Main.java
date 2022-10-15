package Java2022IO.HW30;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new SqlServerCustomerDal());
        customerManager.add();
    }
}