package com.example.clinic.rest;

import com.example.clinic.entity.PhieuDangKy;
import com.example.clinic.service.PhieuDangKyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/phieudangky")
public class PhieuDangKyRestController {
    private PhieuDangKyService phieuDangKyService;
    @Autowired
    public PhieuDangKyRestController(PhieuDangKyService phieuDangKyService) {
        this.phieuDangKyService = phieuDangKyService;
    }
    @PostMapping("/add")
    public PhieuDangKy addPhieuDangKy(@RequestBody PhieuDangKy newPhieuDangKy) {
        newPhieuDangKy.setId(0);
        PhieuDangKy dbPhieuDangKy = phieuDangKyService.save(newPhieuDangKy);
        return dbPhieuDangKy;
    }
    @GetMapping("/getall")
    public List<PhieuDangKy> getAll() {
        return phieuDangKyService.getAll();
    }
    @DeleteMapping("/deletebyid")
    public void deleteById(int theId) {
        phieuDangKyService.deleteById(theId);
    }

    @GetMapping("/gettgk")
    public List<String> getAllThoiGianKham() {
        return phieuDangKyService.findAllThoiGianKham();
    }

    @GetMapping("/getbytgk")
    public List<PhieuDangKy> getByThoiGianKham(@RequestParam String thoigiankham) {
        return phieuDangKyService.findByThoiGianKham(thoigiankham);
    }
}
