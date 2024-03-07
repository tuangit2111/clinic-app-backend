package com.example.clinic.rest;

import com.example.clinic.entity.BacSi;
import com.example.clinic.entity.LichLamViec;
import com.example.clinic.service.LichLamViecService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/llv")
public class LichLamViecRestController {
    private LichLamViecService lichLamViecService;
    @Autowired
    public LichLamViecRestController(LichLamViecService lichLamViecService) {
        this.lichLamViecService = lichLamViecService;
    }
    @PostMapping("/add")
    public LichLamViec addLichLamViec(@RequestBody LichLamViec newLichLamViec) {
        newLichLamViec.setId(0);
        LichLamViec dbLichLamViec = lichLamViecService.save(newLichLamViec);
        return dbLichLamViec;
    }
    @GetMapping("/findbs")
    public List<BacSi> findBacSi(@RequestParam int id, @RequestParam String ngaylamviec) {
        return lichLamViecService.bsid(id, ngaylamviec);
    }

    @GetMapping("/findnlv")
    public List<String> findNgayLamViecById(@RequestParam int id) {
        return lichLamViecService.findLichLamViecById(id);
    }
}
