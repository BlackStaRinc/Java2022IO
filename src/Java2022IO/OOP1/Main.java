package Java2022IO.OOP1;


public class Main {
    public static void main(String[] args) {
        String mesaj = "Vade Oranı";
        Product product1 = new Product();
        //Set
        product1.setName ("Delolo Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount (7);
        product1.setUnitsInStock(3);
        product1.setImageUrl ("KahveMakinesi1.jpg");


        Product product2 = new Product();
        //Set
        product2.setName ("Philips Kahve Makinesi");
        product2.setUnitPrice(8687);
        product2.setDiscount (8);
        product2.setUnitsInStock(4);
        product2.setImageUrl ("KahveMakinesi2.jpg");

        Product product3 = new Product();
        //Set
        product3.setName ("Delolo Kahve Makinesi");
        product3.setUnitPrice(6666 );
        product3.setDiscount (10);
        product3.setUnitsInStock(5);
        product3.setImageUrl ("KahveMakinesi3.jpg");


        Product[] products = {product1,product2,product3};

        for (Product product : products) { 
            System.out.println(product.getName()+" "+product.getUnitPrice());
        }

        IndividualCustomer iCustomer = new IndividualCustomer();
        iCustomer.setId(1);
        iCustomer.setPhone("05335555555");
        iCustomer.setCustomerNumber("123123123");
        iCustomer.setFirstName("Hamza");
        iCustomer.setLastName("Aliaskeroğulları");

        
        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("JavaIO");
        corporateCustomer.setPhone("053465649879");
        corporateCustomer.setTaxNumber("1111111111");
        corporateCustomer.setCustomerNumber("654665");

        Customer[] customers = {iCustomer,corporateCustomer};
    }
    
}

