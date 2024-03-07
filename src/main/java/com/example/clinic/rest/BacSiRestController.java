package com.example.clinic.rest;

import com.example.clinic.entity.BacSi;
import com.example.clinic.service.BacSiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/bs")
public class BacSiRestController {
    private BacSiService bacSiService;
    @Autowired
    BacSiRestController(BacSiService bacSiService) {
        this.bacSiService = bacSiService;
    }
    @GetMapping("")
    List<BacSi> getById(@RequestParam Integer id) {
        return bacSiService.getByChuyenKhoa(id);
    }
    @GetMapping("/all")
    public ResponseEntity<Page<BacSi>> getBacSi(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Page<BacSi> bsPage = bacSiService.findAll(page, size);
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Page-Number", String.valueOf(bsPage.getNumber()));
        headers.add("X-Page-Size", String.valueOf(bsPage.getSize()));

        return ResponseEntity.ok()
                .headers(headers)
                .body(bsPage);
    }
    @GetMapping("/getbyidv2")
    public ResponseEntity<Page<BacSi>> getBacSiById(@RequestParam int id,@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        Page<BacSi> bsPage = bacSiService.getByChuyenKhoaV2(id, page, size);
        HttpHeaders headers = new HttpHeaders();
        headers.add("X-Page-Number", String.valueOf(bsPage.getNumber()));
        headers.add("X-Page-Size", String.valueOf(bsPage.getSize()));

        return ResponseEntity.ok()
                .headers(headers)
                .body(bsPage);
    }}