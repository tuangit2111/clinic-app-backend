package com.example.clinic.service;

import com.example.clinic.dao.PhieuDangKyRepository;
import com.example.clinic.entity.PhieuDangKy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PhieuDangKyServiceImpl implements PhieuDangKyService{
    private PhieuDangKyRepository phieuDangKyRepository;
    @Autowired
    public PhieuDangKyServiceImpl(PhieuDangKyRepository phieuDangKyRepository) {
        this.phieuDangKyRepository = phieuDangKyRepository;
    }
    @Override
    @Transactional
    public PhieuDangKy save(PhieuDangKy newPhieuDangKy) {
        return phieuDangKyRepository.save(newPhieuDangKy);
    }

    @Override
    public List<PhieuDangKy> getAll() {
        return phieuDangKyRepository.findAll();
    }

    @Override
    @Transactional
    public void deleteById(int theId) {
        phieuDangKyRepository.deleteById(theId);
    }

    @Override
    public List<String> findAllThoiGianKham() {
        return phieuDangKyRepository.findAllThoiGianKham();
    }

    @Override
    public List<PhieuDangKy> findByThoiGianKham(String thoigiankham) {
        return phieuDangKyRepository.findByThoiGianKham(thoigiankham);
    }
}
