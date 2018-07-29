package com.belajar.spring.belajarspring.service;

import com.belajar.spring.belajarspring.dao.StudentDAO;
import com.belajar.spring.belajarspring.dao.impl.StudentDAOImpl;
import com.belajar.spring.belajarspring.entity.Student;
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
