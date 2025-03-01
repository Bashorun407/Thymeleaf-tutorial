package com.bashenterprise.thymeleaf.controller;

import com.bashenterprise.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    //Handler method to handle variable-expression request
    @GetMapping("/variable-expression")
    public String variableExpression(Model model){

        Student student = new Student(
                "Olusheyi",
                "olusheyi@gmail.com",
                "ADMIN",
                "Male"
        );

        model.addAttribute("student", student);

        return "variable-expression"; //the return string must be the same as the
        //html file name. Otherwise, an error will be generated.
    }

    //Handler method to handle selection expression
    //http://localhost:8080/selection-expression

    @GetMapping("/selection-expression")
    public String selectionExpression(Model model){

        Student student = new Student(
                "Bolaji",
                "bolaji429@gmail.com",
                "CLASS_REP",
                "Male"
        );

        model.addAttribute("student", student);
        return "selection-expression";
    }

    //handler method to handle message expressions request
    //http://localhost:8080/message-expression
    @GetMapping("/message-expression")
    public String messageExpression(){
        return "message-expression";
    }

    //handler method to handle link expressions request
    //http://localhost:8080/link-expression
    @GetMapping("/link-expression/{id}")
    public String linkExpression(Model model){

        model.addAttribute("id", 1);
        return "link-expression";
    }

    //handler method to handle fragment expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("/students")
    public String allStudents(Model model){
        Student ade = new Student("Ade", "adex@gmail.com", "admin", "male");
        Student bisi = new Student("Bisi", "bizzygee@gmail.com", "captain", "female");
        Student wande = new Student("Wande", "wandy@gmail.com", "treasurer", "female");
        Student segun = new Student("Segun", "segunz@gmail.com", "finance", "male");

        List<Student> students = new ArrayList<>();
        students.add(ade);
        students.add(bisi);
        students.add(wande);
        students.add(segun);

        model.addAttribute("students", students);

        return "students";
    }

    //repeating the method above
    @GetMapping("/students_list")
    public String getAllStudents(Model model){
        Student student1 = new Student("Busayo", "buzy@gmail.com", "deputy", "female");
        Student student2 = new Student("Alani", "alanz@gmail.com", "finance", "male");
        Student student3 = new Student("Funke", "funky@gmail.com", "health", "female");
        Student student4 = new Student("Gbenga", "gbengz@gmail.com", "sport", "male");
        Student student5 = new Student("Adunni", "adunza@gmail.com", "president", "female");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        model.addAttribute("students", students);
        return "students_list";
    }
}
