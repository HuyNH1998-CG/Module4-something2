package Service;

import Model.Classroom;
import Model.Student;

import java.util.ArrayList;

public class StudentManage {
    public ArrayList<Student> list = new ArrayList<>();
    public ArrayList<Classroom> classrooms = new ArrayList<>();
    public StudentManage(){
        classrooms.add(new Classroom("C04"));
        classrooms.add(new Classroom("C03"));
        list.add(new Student("Nam","2000-05-03","HaNoi","0123456789","Nam@Gmail.com", classrooms.get(0).getClassName()));
        list.add(new Student("Tuan","2000-01-23","HaNoi","0123487894","Tuan@Gmail.com", classrooms.get(0).getClassName()));
        list.add(new Student("Hung","2000-06-13","HaNoi","0145678384","Hung@Gmail.com", classrooms.get(0).getClassName()));
        list.add(new Student("Toan","2000-02-25","HaNoi","0378964134","Toan@Gmail.com", classrooms.get(1).getClassName()));
        list.add(new Student("Manh","2000-12-31","HaNoi","0123486783","Manh@Gmail.com", classrooms.get(1).getClassName()));
        list.add(new Student("Quan","2000-08-14","HaNoi","012348763","Quan@Gmail.com", classrooms.get(1).getClassName()));
    }
    public void save(Student student){
        list.add(student);
    }
    public void edit(Student student,int index){
        list.set(index,student);
    }
    public void delete(int index){
        list.remove(index);
    }
}

