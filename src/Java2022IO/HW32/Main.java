package Java2022IO.HW32;

public class Main {
    public static void main(String[] args) {
       ProductManager pManager = new ProductManager();
       Product product = new Product();
       product.price = 10;
       product.name = "Mouse";
       pManager.add(product);

       DatabaseHelper.Crud.create();
    }
}