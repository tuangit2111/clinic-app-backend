package com.example.clinic.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "bacsi")
public class BacSi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "chuyenkhoa_id")
    private int chuyenkhoa_id;

    public BacSi() {}

    public BacSi(String name, int chuyenkhoa_id) {
        this.name = name;
        this.chuyenkhoa_id = chuyenkhoa_id;
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

    public int getChuyenkhoa_id() {
        return chuyenkhoa_id;
    }

    public void setChuyenkhoa_id(int chuyenkhoa_id) {
        this.chuyenkhoa_id = chuyenkhoa_id;
    }

    @Override
    public String toString() {
        return "BacSi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chuyenkhoa_id=" + chuyenkhoa_id +
                '}';
    }
}
