package com.example.clinic.service;

import com.example.clinic.dao.BacSiRepository;
import com.example.clinic.entity.BacSi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BacSiServiceImpl implements BacSiService{
    private BacSiRepository bacSiRepository;
    @Autowired
    public BacSiServiceImpl(BacSiRepository bacSiRepository) {
        this.bacSiRepository = bacSiRepository;
    }
    @Override
    public List<BacSi> getByChuyenKhoa(int id) {
        return bacSiRepository.findWithChuyenKhoa(id);
    }

    @Override
    public Page<BacSi> getByChuyenKhoaV2(int id, int page, int size) {
        Pageable pageRequest = createPageRequestUsing(page, size);
        List<BacSi> allBacSi = bacSiRepository.findWithChuyenKhoa(id);
        int start = (int) pageRequest.getOffset();
        int end = Math.min((start + pageRequest.getPageSize()), allBacSi.size());
        List<BacSi> pageContent = allBacSi.subList(start, end);
        return new PageImpl<>(pageContent, pageRequest, allBacSi.size());
    }

    private Pageable createPageRequestUsing(int page, int size) {
        return PageRequest.of(page, size);
    }
    @Override
    public Page<BacSi> findAll(int page, int size) {
        Pageable pageRequest = createPageRequestUsing(page, size);
        List<BacSi> allBacSi = bacSiRepository.findAll();
        int start = (int) pageRequest.getOffset();
        int end = Math.min((start + pageRequest.getPageSize()), allBacSi.size());
        List<BacSi> pageContent = allBacSi.subList(start, end);
        return new PageImpl<>(pageContent, pageRequest, allBacSi.size());
    }
}
