package com.example.clinic.service;

import com.example.clinic.dao.ChuyenKhoaRepository;
import com.example.clinic.entity.ChuyenKhoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ChuyenKhoaServiceImpl implements ChuyenKhoaService{
    private ChuyenKhoaRepository chuyenKhoaRepository;
    @Autowired
    public ChuyenKhoaServiceImpl(ChuyenKhoaRepository chuyenKhoaRepository) {
        this.chuyenKhoaRepository = chuyenKhoaRepository;
    }
    @Override
    public List<ChuyenKhoa> getAll() {
        return chuyenKhoaRepository.findAll();
    }

    @Override
    public String findNameWithId(int id) {
        return chuyenKhoaRepository.findNameWithId(id);
    }
}
