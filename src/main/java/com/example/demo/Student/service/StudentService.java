package com.example.demo.Student.service;

import com.example.demo.Student.bean.Student;
import com.example.demo.Student.utils.AjaxResult;

public interface StudentService {

    AjaxResult addStudent(Student student);

    AjaxResult deleteStudent(Student student);

    AjaxResult editStudent(Student student);

    AjaxResult findStudent(Student student);
}
