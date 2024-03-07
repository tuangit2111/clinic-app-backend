package com.example.clinic.service;

import com.example.clinic.entity.BacSi;
import org.springframework.data.domain.Page;

import java.util.List;

public interface BacSiService {
    List<BacSi> getByChuyenKhoa(int id);
    Page<BacSi> getByChuyenKhoaV2(int id, int page, int size);
    Page<BacSi> findAll(int page, int size);
}
