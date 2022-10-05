package Java2022IO.oopWithNLayeredApp;

import Java2022IO.oopWithNLayeredApp.core.logging.*;
import Java2022IO.oopWithNLayeredApp.business.ProductManager;
import Java2022IO.oopWithNLayeredApp.core.logging.DatabaseLogger;
import Java2022IO.oopWithNLayeredApp.core.logging.FileLogger;
import Java2022IO.oopWithNLayeredApp.core.logging.MailLogger;
import Java2022IO.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import Java2022IO.oopWithNLayeredApp.entities.Product;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone XS",55);
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
        
        ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
        productManager.add(product1);
    }
    
}

