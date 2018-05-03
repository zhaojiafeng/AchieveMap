package com.example.demo.Student.mapper;


import com.example.demo.Student.bean.Student;
import com.example.demo.Student.utils.AjaxResult;

import java.util.List;

public interface StudentMapper {
    Integer addStudent(Student student);

    Integer deleteStudent(Student student);

    Integer editStudent(Student student);

    List<Student> findStudent(Student student);
}
