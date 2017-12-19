package bd.ac.seu.helloworldjpaspring.repository;

import bd.ac.seu.helloworldjpaspring.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Studentrepository  extends JpaRepository<Student,String>{
    public  Student findByStudentName(String Name);
    public List<Student> findAllByStudentCgpaGreaterThanEqual(double cgpa);
}
