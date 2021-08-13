package Service;

import Model.Category;
import Model.Product;

import java.util.ArrayList;

public class ProductManager {
    public ArrayList<Product> list = new ArrayList<>();
    public ArrayList<Category> categories = new ArrayList<>();
    public ProductManager(){
        categories.add(new Category("Fruit"));
        categories.add(new Category("Fish"));
        list.add(new Product("Apple",500, categories.get(0).getCategory(),"New Zealand Apple","https://5.imimg.com/data5/ND/GC/MY-22541476/new-zealand-queen-apple-250x250.jpg"));
        list.add(new Product("Watermelon",1000, categories.get(0).getCategory(),"Square watermelon from japan", "https://www.gardeningknowhow.com/wp-content/uploads/2020/11/sliced-cube-watermelon-400x300.jpg"));
        list.add(new Product("Pineapple",750, categories.get(0).getCategory(),"Pineapple from Vietnam","https://460362-1442130-raikfcquaxqncofqfm.stackpathdns.com/wp-content/uploads/2021/02/Pineapple_01-web-800x1200.jpg"));
        list.add(new Product("Salmon",5000, categories.get(1).getCategory(),"Fresh Salmon", "https://upload.wikimedia.org/wikipedia/commons/3/39/Salmo_salar.jpg"));
        list.add(new Product("Tuna",10000, categories.get(1).getCategory(),"Fresh Tuna", "https://biologydictionary.net/wp-content/uploads/2021/01/shutterstock_117425023-1-scaled.jpg"));
        list.add(new Product("Whale",100000, categories.get(1).getCategory(),"Whale","https://www.katlawhalewatching.is/wp-content/uploads/2019/06/blue-whale.png"));
    }
    public void save(Product product){
        list.add(product);
    }
    public void edit(Product product, int index){
        list.set(index, product);
    }
    public void delete(int index){
        list.remove(index);
    }
    public void saveCat(Category category){
        categories.add(category);
    }
    public void editCat(Category category, int index){
        categories.set(index,category);
    }
    public void deleteCat(int index){
        categories.remove(index);
    }
}

