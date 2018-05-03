package com.example.demo.Student.controller;

import com.example.demo.Student.bean.Student;
import com.example.demo.Student.service.StudentService;
import com.example.demo.Student.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @ResponseBody
    @RequestMapping("/addStudent")
    public AjaxResult addStudent(Student student) {
        return studentService.addStudent(student);
    }

    @ResponseBody
    @RequestMapping("/deleteStudent")
    public AjaxResult deleteStudent(Student student) {
        return studentService.deleteStudent(student);
    }

    @ResponseBody
    @RequestMapping("/editStudent")
    public AjaxResult editStudent(Student student) {
        return studentService.editStudent(student);
    }

    @ResponseBody
    @RequestMapping("/findStudent")
    public AjaxResult findStudent(Student student) {
        return studentService.findStudent(student);
    }
}
