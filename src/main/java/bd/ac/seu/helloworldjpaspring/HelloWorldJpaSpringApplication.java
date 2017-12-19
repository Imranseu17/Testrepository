package bd.ac.seu.helloworldjpaspring;

import bd.ac.seu.helloworldjpaspring.model.Student;
import bd.ac.seu.helloworldjpaspring.repository.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class HelloWorldJpaSpringApplication {

	@Autowired
	private Studentrepository studentrepository;

	public static void main(String[] args) {

		SpringApplication.run(HelloWorldJpaSpringApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args ->{

//			studentrepository.save(new Student("3265","Imran Khan",
//					3.36));
//			studentrepository.save(new Student("3275","Rakib Hasan Sabbir",
//					3.16));
//			studentrepository.save(new Student("3285","Farhana Akther",
//					3.06));
//
//			studentrepository.findAll().forEach(System.out::println);
//
//			System.out.println(studentrepository.findOne("3265"));
//
//			System.out.println(studentrepository.findByStudentName("Imran Khan"));
//
//			studentrepository.findAllByStudentCgpaGreaterThanEqual(3.1).
//					forEach(System.out::println);

		};
	}
}
