package com.belajar.spring.belajarspring.dao;

import com.belajar.spring.belajarspring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project belajar-spring
 */
public interface StudentDAO extends BaseDAO<Student> {
}
