package com.example.clinic.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "lichlamviec")
public class LichLamViec {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int Id;
    @Column(name = "bacsi_id")
    private int bacsi_id;
    @Column(name = "ngaylamviec")
    private String ngaylamviec;
    @Column(name = "ghichu")
    private String ghichu;
    public LichLamViec() {}

    public LichLamViec(int bacsi_id, String ngaylamviec, String ghichu) {
        this.bacsi_id = bacsi_id;
        this.ngaylamviec = ngaylamviec;
        this.ghichu = ghichu;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getBacsi_id() {
        return bacsi_id;
    }

    public void setBacsi_id(int bacsi_id) {
        this.bacsi_id = bacsi_id;
    }

    public String getNgaylamviec() {
        return ngaylamviec;
    }

    public void setNgaylamviec(String ngaylamviec) {
        this.ngaylamviec = ngaylamviec;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    @Override
    public String toString() {
        return "LichLamViec{" +
                "Id=" + Id +
                ", bacsi_id=" + bacsi_id +
                ", ngaylamviec='" + ngaylamviec + '\'' +
                ", ghichu='" + ghichu + '\'' +
                '}';
    }
}
