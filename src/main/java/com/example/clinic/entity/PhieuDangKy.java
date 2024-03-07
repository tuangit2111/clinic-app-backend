package com.example.clinic.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "phieudangky")
public class PhieuDangKy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "diadiemkham")
    private String diadiemkham;
    @Column(name = "dichvukham")
    private String dichvukham;
    @Column(name = "chuyenkhoa_id")
    private int chuyenkhoa_id;
    @Column(name = "bacsi_id")
    private int bacsi_id;
    @Column(name = "thoigiankham")
    private String thoigiankham;
    @Column(name = "motatinhtrang")
    private String motatinhtrang;
    @Column(name = "hovaten")
    private String hovaten;
    @Column(name = "sodienthoai")
    private String sodienthoai;
    @Column(name = "gmail")
    private String gmail;
    @Column(name = "ngaysinh")
    private String ngaysinh;
    @Column(name = "gioitinh")
    private String gioitinh;
    @Column(name = "quoctich")
    private String quoctich;
    @Column(name = "diachi")
    private String diachi;
    @Column(name = "trangthai")
    private String trangthai;

    public PhieuDangKy() {}

    public PhieuDangKy(String diadiemkham, String dichvukham, int chuyenkhoa_id, int bacsi_id, String thoigiankham, String motatinhtrang, String hovaten, String sodienthoai, String gmail, String ngaysinh, String gioitinh, String quoctich, String diachi, String trangthai) {
        this.diadiemkham = diadiemkham;
        this.dichvukham = dichvukham;
        this.chuyenkhoa_id = chuyenkhoa_id;
        this.bacsi_id = bacsi_id;
        this.thoigiankham = thoigiankham;
        this.motatinhtrang = motatinhtrang;
        this.hovaten = hovaten;
        this.sodienthoai = sodienthoai;
        this.gmail = gmail;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.quoctich = quoctich;
        this.diachi = diachi;
        this.trangthai = trangthai;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDiadiemkham() {
        return diadiemkham;
    }

    public void setDiadiemkham(String diadiemkham) {
        this.diadiemkham = diadiemkham;
    }

    public String getDichvukham() {
        return dichvukham;
    }

    public void setDichvukham(String dichvukham) {
        this.dichvukham = dichvukham;
    }

    public int getChuyenkhoa_id() {
        return chuyenkhoa_id;
    }

    public void setChuyenkhoa_id(int chuyenkhoa_id) {
        this.chuyenkhoa_id = chuyenkhoa_id;
    }

    public int getBacsi_id() {
        return bacsi_id;
    }

    public void setBacsi_id(int bacsi_id) {
        this.bacsi_id = bacsi_id;
    }

    public String getThoigiankham() {
        return thoigiankham;
    }

    public void setThoigiankham(String thoigiankham) {
        this.thoigiankham = thoigiankham;
    }

    public String getMotatinhtrang() {
        return motatinhtrang;
    }

    public void setMotatinhtrang(String motatinhtrang) {
        this.motatinhtrang = motatinhtrang;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public String getSodienthoai() {
        return sodienthoai;
    }

    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }
    @Override
    public String toString() {
        return "PhieuDangKy{" +
                "id=" + id +
                ", diadiemkham='" + diadiemkham + '\'' +
                ", dichvukham='" + dichvukham + '\'' +
                ", chuyenkhoa_id=" + chuyenkhoa_id +
                ", bacsi_id=" + bacsi_id +
                ", thoigiankham='" + thoigiankham + '\'' +
                ", motatinhtrang='" + motatinhtrang + '\'' +
                ", hovaten='" + hovaten + '\'' +
                ", sodienthoai='" + sodienthoai + '\'' +
                ", gmail='" + gmail + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", gioitinh='" + gioitinh + '\'' +
                ", quoctich='" + quoctich + '\'' +
                ", diachi='" + diachi + '\'' +
                ", trangthai='" + trangthai + '\'' +
                '}';
    }
}
