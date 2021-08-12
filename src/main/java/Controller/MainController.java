package Controller;

import Service.StudentManage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import Model.Classroom;
import Model.Student;

@Controller
public class MainController {
    StudentManage studentManage = new StudentManage();
    @RequestMapping("/home")
    public String home(ModelMap model){
        model.addAttribute("students",studentManage.list);
        return "/WEB-INF/views/index.jsp";
    }
    @GetMapping("/create")
    public String showCreate(ModelMap model){
        model.addAttribute("classroom",studentManage.classrooms);
        return "/WEB-INF/views/create.jsp";
    }
    @PostMapping("/create")
    public String create(@ModelAttribute Student student){
        studentManage.save(student);
        return "redirect:/home";
    }
    @GetMapping("/edit")
    public String showEdit(ModelMap model,@RequestParam int index){
        model.addAttribute("student",studentManage.list.get(index));
        model.addAttribute("classroom",studentManage.classrooms);
        return "/WEB-INF/views/edit.jsp";
    }
    @PostMapping("/edit")
    public String edit(@RequestParam int index, @ModelAttribute Student student){
        studentManage.edit(student,index);
        return "redirect:/home";
    }
    @RequestMapping("/delete")
    public String delete(@RequestParam int index){
        studentManage.delete(index);
        return "redirect:/home";
    }
}
