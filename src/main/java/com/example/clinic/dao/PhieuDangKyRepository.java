package com.example.clinic.dao;

import com.example.clinic.entity.BacSi;
import com.example.clinic.entity.PhieuDangKy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PhieuDangKyRepository extends JpaRepository<PhieuDangKy, Integer> {
    @Query("SELECT DISTINCT u.thoigiankham FROM PhieuDangKy u")
    List<String> findAllThoiGianKham();

    @Query("SELECT u FROM PhieuDangKy u WHERE u.thoigiankham = :thoigiankham")
    List<PhieuDangKy> findByThoiGianKham(@Param("thoigiankham") String thoigiankham);
}
