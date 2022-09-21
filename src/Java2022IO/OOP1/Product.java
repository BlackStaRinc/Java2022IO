package Java2022IO.OOP1;


public class Product {

    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    private double unitPrice;
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    private double discount;
    public double getDiscount() {
        return discount;
    }
    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private String imageUrl;
    public String getImageUrl() {
        return imageUrl;
    }
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
    
    private int unitsInStock;
    public int getUnitsInStock() {
        return unitsInStock;
    }
    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    
}

