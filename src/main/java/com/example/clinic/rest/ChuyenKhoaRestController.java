package com.example.clinic.rest;

import com.example.clinic.entity.ChuyenKhoa;
import com.example.clinic.service.ChuyenKhoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ChuyenKhoaRestController {
    private ChuyenKhoaService chuyenKhoaService;

    @Autowired
    public ChuyenKhoaRestController(ChuyenKhoaService chuyenKhoaService) {
        this.chuyenKhoaService = chuyenKhoaService;
    }
    @GetMapping("/chuyenkhoa")
    public List<ChuyenKhoa> getAll() {
        return chuyenKhoaService.getAll();
    }
    @GetMapping("/findname")
    public String findNameWithId(@RequestParam int id) {
        return chuyenKhoaService.findNameWithId(id);
    }
}
