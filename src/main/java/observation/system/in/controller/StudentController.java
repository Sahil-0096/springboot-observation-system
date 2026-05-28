package observation.system.in.controller;

import observation.system.in.beans.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // return single repsonse of json.
    @GetMapping("students")
    public Student getStudent(){
        Student student = new Student("Yadav", "Sahil", 1);
        return student;
    }

    // return list of response in json using arraylist.
    @GetMapping("students-list")
    public List<Student> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Yadav", "Sahil", 1));
        students.add(new Student("Yadav", "Vipul", 2));
        students.add(new Student("Yadav", "Ajay", 3));
        return students;
    }

    // using path variable.
    @GetMapping("students/{last-name}/{first-name}/{id}")
    public Student getStudent(@PathVariable("last-name") String studentSurname, @PathVariable("first-name") String studentName, @PathVariable("id") int studentId){
        return new Student(studentSurname, studentName, studentId);
    }

        /*
        | Type        | Full Form                 | Purpose                |
        | ----------- | ------------------------- | ---------------------- |
        | DTO         | Data Transfer Object      | Data transfer          |
        | DAO         | Data Access Object        | DB access              |
        | VO          | Value Object              | Immutable value holder |
        | BO          | Business Object           | Business logic         |
        | POJO        | Plain Old Java Object     | Simple Java object     |
        | Entity      | JPA Entity                | DB table mapping       |
        | VO          | View Object               | UI/View data           |
        | TO          | Transfer Object           | Similar to DTO         |
        | Form Object | Form Binding Object       | Form data capture      |
        | Model       | MVC Model                 | UI data                |
        | Mapper      | Entity ↔ DTO conversion   | Data transformation    |
        | Projection  | Partial DB fetch          | Optimized queries      |
        | Record      | Immutable DTO alternative | Modern Java DTO        |
    */

    // @PathVariables -- if variable provide in URI then it treat as value i.e. /value/value
    // @RequestParam
}

