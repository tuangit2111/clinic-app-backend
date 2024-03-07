package com.example.clinic.service;

import com.example.clinic.entity.ChuyenKhoa;

import java.util.List;

public interface ChuyenKhoaService {
    List<ChuyenKhoa> getAll();
    String findNameWithId(int id);
}
