package Controller;

import Service.ProductManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import Model.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    ProductManager productManager = new ProductManager();
    @RequestMapping("/home")
    public String home(ModelMap model){
        model.addAttribute("products", productManager.list);
        return "/index";
    }
    @GetMapping("/create")
    public String showCreate(ModelMap model){
        model.addAttribute("product",new Product());
        model.addAttribute("category", productManager.categories);
        return "/create";
    }
    @PostMapping("/create")
    public String create(Product product){
        productManager.save(product);
        return "redirect:/home";
    }
    @GetMapping("/edit{index}")
    public String showEdit(ModelMap model,@PathVariable int index){
        model.addAttribute("product", productManager.list.get(index));
        model.addAttribute("category", productManager.categories);
        return "/edit";
    }
    @PostMapping("/edit{index}")
    public String edit(@PathVariable int index, Product product){
        productManager.edit(product,index);
        return "redirect:/home";
    }
    @RequestMapping("/delete{index}")
    public String delete(@PathVariable int index){
        productManager.delete(index);
        return "redirect:/home";
    }
    @RequestMapping("/search")
    public String search(@RequestParam String name, Model model){
        List<Product> tosearch = new ArrayList<>();
        for(Product product : productManager.list){
            if (product.getName().equals(name)){
                tosearch.add(product);
            }
        }
        model.addAttribute("product",tosearch);
        return "/viewsearch";
    }
}
