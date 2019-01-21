package com.belajar.spring.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;


@Getter
@Setter
public class Mahasiswa implements Serializable {

    private int id;

    private String name;

    private String address;

    private List<KRS> krs;

    public Mahasiswa() {
    }

    public Mahasiswa(int id) {
        this.id = id;
    }

    public Mahasiswa(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Mahasiswa(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
