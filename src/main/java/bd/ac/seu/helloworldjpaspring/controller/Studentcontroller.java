package bd.ac.seu.helloworldjpaspring.controller;

import bd.ac.seu.helloworldjpaspring.model.Student;
import bd.ac.seu.helloworldjpaspring.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
public class Studentcontroller {
    @Autowired
    Studentrepository studentrepository;

    @RequestMapping(value = "/")
    public String handleIndex(){

        return "index";
    }



    @RequestMapping(value = "/test")
    @ResponseBody
    public String handleIndexwithName(@RequestParam String name){
        return "HELLO , "+name+" !";
    }



    @RequestMapping(value = "/student/{studentID}")
    public String getOnestudent(@PathVariable String studentID,Model model){
       model.addAttribute("student",studentrepository.findOne(studentID)) ;
       return "student";
    }

//    @RequestMapping(value = "/student")
//    public String getOnestudentprofile(@RequestParam String studentID,Model model){
//        model.addAttribute("student",studentrepository.findOne(studentID)) ;
//        return "student";
//    }


    @RequestMapping(value = "/insert_student")
    @ResponseBody
    public  String insertStudent(@RequestParam String studentID,
                                 @RequestParam String studentName,@RequestParam double studentCgpa){
        studentrepository.save(new Student(studentID,studentName,studentCgpa));

        return "Student_inserted";
    }

    @RequestMapping(value = "/students")
    public String getAllStudents(Model model){
        model.addAttribute("studentCount",studentrepository.count());
        model.addAttribute("students",studentrepository.findAll());
        model.addAttribute("student0",studentrepository.findAll().get(0));
        return "students";

    }



}
