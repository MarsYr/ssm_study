package top.service.impl;

import org.springframework.stereotype.Service;
import top.dao.StudentDao;
import top.model.Student;
import top.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author MarsYr
 * @Date 2021/1/25 20:49
 * @Version 1.0
 */

@Service
public class StudentServiceImpl implements StudentService {
    
    @Resource
    private StudentDao studentDao = null;
    
    public StudentDao getStudentDao() {
        return studentDao;
    }
    
    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }
    
    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }
    
    @Override
    public List<Student> QueryAllStudents() {
        return studentDao.selectStudents();
    }
}

