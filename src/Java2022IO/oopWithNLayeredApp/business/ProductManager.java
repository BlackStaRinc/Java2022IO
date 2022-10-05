package Java2022IO.oopWithNLayeredApp.business;

import Java2022IO.oopWithNLayeredApp.core.logging.Logger;
import Java2022IO.oopWithNLayeredApp.dataAccess.ProductDao;
import Java2022IO.oopWithNLayeredApp.entities.Product;

public class ProductManager {
    private ProductDao productDao;
    private Logger[] loggers;
    
    public ProductManager(ProductDao productDao,Logger[] loggers2) {
        this.productDao = productDao;
        this.loggers = loggers2;
    }

    public void add(Product product) throws Exception{
        if (product.getUnitPrice()<10) {
            throw new Exception("Ürün Fiyatı 10 dan küçük olamaz");
        }
        productDao.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
