package Controller;

import Service.ProductManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import Model.Product;
import Model.Category;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {
    ProductManager productManager = new ProductManager();
    @RequestMapping("/home")
    public ModelAndView home(ModelMap model){
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("products",productManager.list);
        modelAndView.addObject("category",productManager.categories);
        return modelAndView;
    }
    @GetMapping("/create")
    public ModelAndView showCreate(ModelMap model){
        ModelAndView modelAndView = new ModelAndView("/create");
        model.addAttribute("product",new Product());
        model.addAttribute("category", productManager.categories);
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView create(Product product){
        productManager.save(product);
        return new ModelAndView("redirect:/home");
    }
    @GetMapping("/edit{index}")
    public ModelAndView showEdit(ModelMap model,@PathVariable int index){
        ModelAndView modelAndView = new ModelAndView("/edit");
        model.addAttribute("product", productManager.list.get(index));
        model.addAttribute("category", productManager.categories);
        return modelAndView;
    }
    @PostMapping("/edit{index}")
    public ModelAndView edit(@PathVariable int index, Product product){
        productManager.edit(product,index);
        return new ModelAndView("redirect:/home");
    }
    @RequestMapping("/delete{index}")
    public ModelAndView delete(@PathVariable int index){
        productManager.delete(index);
        return new ModelAndView("redirect:/home");
    }
    @RequestMapping("/search")
    public ModelAndView search(@RequestParam String name, Model model){
        ModelAndView modelAndView = new ModelAndView("/viewsearch");
        List<Product> tosearch = new ArrayList<>();
        for(Product product : productManager.list){
            if (product.getName().equals(name)){
                tosearch.add(product);
            }
        }
        modelAndView.addObject("product",tosearch);
        return modelAndView;
    }
    @GetMapping("/createCategory")
    public ModelAndView showCreateCat(){
        ModelAndView modelAndView = new ModelAndView("/createCategory");
        modelAndView.addObject("category",new Category());
        return modelAndView;
    }
    @GetMapping("/editCat{index}")
    public ModelAndView showEditCat(@PathVariable int index){
        ModelAndView modelAndView = new ModelAndView("/editCategory");
        modelAndView.addObject("category", productManager.categories.get(index));
        return modelAndView;
    }
    @GetMapping("/deleteCat{index}")
    public ModelAndView deleteCat(@PathVariable int index){
        productManager.deleteCat(index);
        return new ModelAndView("redirect:/home");
    }
    @PostMapping("/createCategory")
    public ModelAndView createCat(Category category){
        productManager.saveCat(category);
        return new ModelAndView("redirect:/home");
    }
    @PostMapping("/editCat{index}")
    public ModelAndView editCat(@PathVariable int index, Category category){
        productManager.editCat(category,index);
        return new ModelAndView("redirect:/home");
    }
}
