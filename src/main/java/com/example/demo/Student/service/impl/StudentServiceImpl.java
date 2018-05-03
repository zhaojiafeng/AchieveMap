package com.example.demo.Student.service.impl;

import com.example.demo.Student.bean.Student;
import com.example.demo.Student.mapper.StudentMapper;
import com.example.demo.Student.service.StudentService;
import com.example.demo.Student.utils.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public AjaxResult addStudent(Student student) {
        return new AjaxResult(studentMapper.addStudent(student));
    }

    @Override
    public AjaxResult deleteStudent(Student student) {
        return new AjaxResult(studentMapper.deleteStudent(student));
    }

    @Override
    public AjaxResult editStudent(Student student) {
        return new AjaxResult(studentMapper.editStudent(student));
    }

    @Override
    public AjaxResult findStudent(Student student) {
        return new AjaxResult(studentMapper.findStudent(student));
    }
}
