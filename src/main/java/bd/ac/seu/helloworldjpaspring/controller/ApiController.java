package bd.ac.seu.helloworldjpaspring.controller;

import bd.ac.seu.helloworldjpaspring.model.Student;
import bd.ac.seu.helloworldjpaspring.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ApiController {
    @Autowired
    private Studentrepository studentrepository;

    @RequestMapping("students")
    public List<Student> findallStudents(){
        return studentrepository.findAll();

    }

    @RequestMapping(value = "student/{studentID}")
    public Student getOnestudent(@PathVariable String studentID){
      return studentrepository.findOne(studentID);
    }

    @RequestMapping(value = "student",method = RequestMethod.POST)
    public  Student addStudent(@RequestParam String studentID,
                               @RequestParam String studentName,
                               @RequestParam double studentCgpa){
     Student student  = new Student(studentID,studentName,studentCgpa);
     studentrepository.save(student);

        return student;
    }

}
