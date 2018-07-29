package com.belajar.spring.belajarspring.dao.impl;

import com.belajar.spring.belajarspring.dao.StudentDAO;
import com.belajar.spring.belajarspring.entity.MataKuliah;
import com.belajar.spring.belajarspring.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project belajar-spring
 */

@Repository
public class StudentDAOImpl implements StudentDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Student save(Student param) {
        String sql = "INSERT INTO table_students (name, address) VALUES (?, ?)";
        final KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(con -> {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, param.getName());
            ps.setString(2, param.getAddress());
            return ps;
        }, keyHolder);

        param.setId(keyHolder.getKey().intValue());
        return param;
    }

    @Override
    public Student update(Student param) {
        return null;
    }

    @Override
    public int delete(Student param) {
        return 0;
    }

    @Override
    public List<Student> find() {
        String sql = "SELECT * FROM table_students";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
    }

    @Override
    public Student findById(int id) {
        return null;
    }

    @Override
    public List<MataKuliah> findMataKuliahByStudent(int id) {
        return null;
    }
}
