package com.example.clinic.service;

import com.example.clinic.entity.BacSi;
import com.example.clinic.entity.LichLamViec;

import java.util.List;

public interface LichLamViecService {
    LichLamViec save(LichLamViec newLichLamViec);
    List<BacSi> bsid(int chuyenkhoa_id, String ngaylamviec);
    List<String> findLichLamViecById(int id);
}
