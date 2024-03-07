package com.example.clinic.service;

import com.example.clinic.entity.PhieuDangKy;

import java.util.List;

public interface PhieuDangKyService {
    PhieuDangKy save(PhieuDangKy newPhieuDangKy);
    List<PhieuDangKy> getAll();
    void deleteById(int theId);
    List<String> findAllThoiGianKham();
    List<PhieuDangKy> findByThoiGianKham(String thoigiankham);
}
