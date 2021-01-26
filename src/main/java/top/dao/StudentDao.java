package top.dao;

import top.model.Student;

import java.util.List;

/**
 * @Description TODO
 * @Author MarsYr
 * @Date 2021/1/25 20:42
 * @Version 1.0
 */

public interface StudentDao {
    
    int insertStudent(Student student);
    
    List<Student> selectStudents();
}
