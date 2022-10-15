package Java2022IO.KodlamaIOSimulateCourse.entities;

public class Category {
    public Category(){
        
    }
    
    private int id;
    private String categoryName;
    
    public Category(int id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
