package Java2022IO.HW22;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(12346, "Laptop", "Lenovo Laptop", 8008, 6, "Mavi");
    //    product.setName("Laptop");
    //    product.setId(12346);
    //    product.setDescription("Lenovo Laptop");
    //    product.setPrice(8008);
    //    product.setStockAmount(6);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());

    }
    }