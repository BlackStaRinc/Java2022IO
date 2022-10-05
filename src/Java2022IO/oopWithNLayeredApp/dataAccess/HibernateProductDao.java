package Java2022IO.oopWithNLayeredApp.dataAccess;

import Java2022IO.oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{

    public void add(Product product){
        System.out.println("Hibernate ile Veritabanına Eklendi...");
    }
}
