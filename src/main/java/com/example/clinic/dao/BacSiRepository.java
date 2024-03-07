package com.example.clinic.dao;

import com.example.clinic.entity.BacSi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BacSiRepository extends JpaRepository<BacSi, Integer> {
    @Query("SELECT u FROM BacSi u WHERE u.chuyenkhoa_id = :chuyenkhoa_id")
    List<BacSi> findWithChuyenKhoa(@Param("chuyenkhoa_id") int chuyenkhoa_id);
}
