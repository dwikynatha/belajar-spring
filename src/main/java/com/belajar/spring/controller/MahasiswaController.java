package com.belajar.spring.controller;

import com.belajar.spring.entity.Mahasiswa;
import com.belajar.spring.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MahasiswaController {

    @Autowired
    private MahasiswaService service;

    //mengganti mapping dari /students menjadi /mahasiswa
    @GetMapping(value = "/mahasiswa")
    public List<Mahasiswa> mahasiswa() {
        return service.find();
    }

    @GetMapping(value = "/mahasiswa/{id}")
    public Mahasiswa findById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }

    //menambah GetMapping untuk tampilan join
    @GetMapping(value = "/join")
    public List<Mahasiswa> join() { return service.find(); }

    @PostMapping(value = "/mahasiswa")
    public String save(@RequestBody Mahasiswa mahasiswa) {
        Mahasiswa data = service.save(mahasiswa);
        if (data.getId() == 0) {
            return "Gagal insert data";
        } else {
            return "Insert data berhasil";
        }
    }

    @PutMapping(value = "/mahasiswa")
    public String update(@RequestBody Mahasiswa mahasiswa) {
        Mahasiswa data = service.update(mahasiswa);
        if (data.getId() == 0) {
            return "Gagal update data";
        } else {
            return "Update data berhasil";
        }
    }

    @DeleteMapping(value = "/mahasiswa/{id}")
    public String delete(@PathVariable("id") Integer id) {
        int data = service.delete(new Mahasiswa(id));
        if (data == 0) {
            return "Gagal delete data";
        } else {
            return "Delete data berhasil";
        }
    }
}
