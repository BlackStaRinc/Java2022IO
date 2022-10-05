package Java2022IO.oopWithNLayeredApp.dataAccess;

import Java2022IO.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{
    
    public void add(Product product){
        System.out.println("JDBC ile Veritabanına Eklendi...");
    }
    
}
