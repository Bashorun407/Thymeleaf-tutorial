package com.bashenterprise.thymeleaf.controller;

import com.bashenterprise.thymeleaf.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
