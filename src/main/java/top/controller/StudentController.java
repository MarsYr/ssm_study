package top.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import top.model.Student;
import top.service.StudentService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description TODO
 * @Author MarsYr
 * @Date 2021/1/25 20:52
 * @Version 1.0
 */

@Controller
@RequestMapping("/student")
public class StudentController {
    
    @Resource
    private StudentService studentService = null;
    
    @RequestMapping("/addStudent.do")
    public ModelAndView addStudent(Student student) {
        ModelAndView mv = new ModelAndView();
        
        int result = studentService.addStudent(student);
        
        String tips = "注册失败！";
        if (result > 0) {
            tips = "学生:" + student.getName() + "注册成功！";
        }
        
        mv.addObject("tips", tips);
        mv.setViewName("result");
        return mv;
    }
    
    //响应ajax请求
    @RequestMapping("/findStudents.do")
    @ResponseBody
    public List<Student> findStudents() {
        
        List<Student> students = studentService.QueryAllStudents();
        
        return students;
    }
}

