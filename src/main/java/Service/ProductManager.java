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
        list.add(new Product("Apple",500, categories.get(0).getCategory()));
        list.add(new Product("Water melon", 1000, categories.get(0).getCategory()));
        list.add(new Product("Pineapple",750, categories.get(0).getCategory()));
        list.add(new Product("Salmon",5000, categories.get(1).getCategory()));
        list.add(new Product("Tuna",10000, categories.get(1).getCategory()));
        list.add(new Product("Whale",100000, categories.get(1).getCategory()));
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
}

