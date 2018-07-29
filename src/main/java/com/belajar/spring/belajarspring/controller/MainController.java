package com.belajar.spring.belajarspring.controller;

import com.belajar.spring.belajarspring.dao.StudentDAO;
import com.belajar.spring.belajarspring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project belajar-spring
 */

@RestController
public class MainController {

    @GetMapping(value = "/")
    public String home() {
        return "Belajar spring boot";
    }
}
