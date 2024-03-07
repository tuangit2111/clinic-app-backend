package com.example.clinic.dao;

import com.example.clinic.entity.BacSi;
import com.example.clinic.entity.ChuyenKhoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ChuyenKhoaRepository extends JpaRepository<ChuyenKhoa, Integer> {
    @Query("SELECT u.name FROM ChuyenKhoa u WHERE u.id = :id")
    String findNameWithId(@Param("id") int id);
}
