package com.example.clinic.service;

import com.example.clinic.dao.LichLamViecRepository;
import com.example.clinic.entity.BacSi;
import com.example.clinic.entity.LichLamViec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LichLamViecServiceImpl implements LichLamViecService{
    private LichLamViecRepository lichLamViecRepository;
    @Autowired
    public LichLamViecServiceImpl(LichLamViecRepository lichLamViecRepository) {
        this.lichLamViecRepository = lichLamViecRepository;
    }
    @Override
    @Transactional
    public LichLamViec save(LichLamViec newLichLamViec) {
        return lichLamViecRepository.save(newLichLamViec);
    }

    @Override
    public List<BacSi> bsid(int chuyenkhoa_id, String ngaylamviec) {
        return lichLamViecRepository.findIdWithChuyenKhoaAndNgayLamViec(chuyenkhoa_id, ngaylamviec);
    }

    @Override
    public List<String> findLichLamViecById(int id) {
        return lichLamViecRepository.findNgayLamViecById(id);
    }
}
