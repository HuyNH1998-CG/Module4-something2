package Model;

public class Product {
    private String name;
    private float price;
    private String category;
    private String desc;
    private String image;

    public Product() {
    }

    public Product(String name, float price, String category, String desc, String image) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.desc = desc;
        this.image = image;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Product(String name, float price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
