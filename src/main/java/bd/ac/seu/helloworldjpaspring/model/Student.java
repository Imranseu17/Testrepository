package bd.ac.seu.helloworldjpaspring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student {
    @Id
    private String studentID;
    private String studentName;
    private double studentCgpa;

    public Student() {
    }

    public Student(String studentID, String studentName, double studentCgpa) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentCgpa = studentCgpa;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getStudentCgpa() {
        return studentCgpa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("studentID='").append(studentID).append('\'');
        sb.append(", studentName='").append(studentName).append('\'');
        sb.append(", studentCgpa=").append(studentCgpa);
        sb.append('}');
        return sb.toString();
    }
}
