package com.belajar.spring.service;

import com.belajar.spring.dao.StudentDAO;
import com.belajar.spring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project belajar-spring
 */
@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public List<Student> find(){
        return studentDAO.find();
    }
}
