package com.belajar.spring.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sukenda on 29/07/18.
 * Project belajar-spring
 */
public class Mahasiswa implements Serializable {

    private int id;

    private String name;

    private String address;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
