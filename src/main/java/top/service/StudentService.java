package top.service;

import top.model.Student;

import java.util.List;

/**
 * @Description TODO
 * @Author MarsYr
 * @Date 2021/1/25 20:47
 * @Version 1.0
 */

public interface StudentService {
    int addStudent(Student student);
    
    List<Student> QueryAllStudents();
    
}
