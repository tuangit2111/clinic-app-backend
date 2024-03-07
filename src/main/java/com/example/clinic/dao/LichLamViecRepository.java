package com.example.clinic.dao;

import com.example.clinic.entity.BacSi;
import com.example.clinic.entity.LichLamViec;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LichLamViecRepository extends JpaRepository<LichLamViec, Integer> {
    @Query("SELECT b FROM LichLamViec l JOIN BacSi b ON l.bacsi_id = b.id WHERE l.ngaylamviec = :ngaylamviec AND b.chuyenkhoa_id = :chuyenkhoa_id")
    List<BacSi> findIdWithChuyenKhoaAndNgayLamViec(@Param("chuyenkhoa_id") int chuyenkhoa_id, @Param("ngaylamviec") String ngaylamviec);
    @Query("SELECT l.ngaylamviec FROM LichLamViec l WHERE l.bacsi_id = :id")
    List<String> findNgayLamViecById(@Param("id") int id);
}
