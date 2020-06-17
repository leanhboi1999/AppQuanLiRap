/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author leanh
 */
public class SuatChieu {

    private String masuatchieu;
    private String maphong;
    private String masuatphim;
    private Date thoigianchieu;
    private String trangthai;
    private String tenphong;
    private String ngonngu;

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public String getNgonngu() {
        return ngonngu;
    }

    public void setNgonngu(String ngonngu) {
        this.ngonngu = ngonngu;
    }

    public String getDinhdang() {
        return dinhdang;
    }

    public void setDinhdang(String dinhdang) {
        this.dinhdang = dinhdang;
    }

    public String getHinhthuc() {
        return hinhthuc;
    }

    public void setHinhthuc(String hinhthuc) {
        this.hinhthuc = hinhthuc;
    }

    public String getPhong() {
        return phong;
    }

    public void setPhong(String phong) {
        this.phong = phong;
    }

    public String getTenphim() {
        return tenphim;
    }

    public void setTenphim(String tenphim) {
        this.tenphim = tenphim;
    }
    private String dinhdang;
    private String hinhthuc;
    private String phong;
    private String tenphim;
    

    public String getMasuatchieu() {
        return masuatchieu;
    }

    public void setMasuatchieu(String masuatchieu) {
        this.masuatchieu = masuatchieu;
    }

    public String getMaphong() {
        return maphong;
    }

    public void setMaphong(String maphong) {
        this.maphong = maphong;
    }

    public String getMasuatphim() {
        return masuatphim;
    }

    public void setMasuatphim(String masuatphim) {
        this.masuatphim = masuatphim;
    }

    public Date getThoigianchieu() {
        return thoigianchieu;
    }

    public void setThoigianchieu(Date thoigianchieu) {
        this.thoigianchieu = thoigianchieu;
    }

    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public SuatChieu() {
    }

    public SuatChieu(String masuatchieu, String maphong, String masuatphim, Date thoigianchieu, String trangthai) {
        this.masuatchieu = masuatchieu;
        this.maphong = maphong;
        this.masuatphim = masuatphim;
        this.thoigianchieu = thoigianchieu;
        this.trangthai = trangthai;
    }

    public SuatChieu(String masuatchieu, String maphong, String masuatphim, Date thoigianchieu, String trangthai, String tenphong, String ngonngu, String dinhdang, String hinhthuc, String phong, String tenphim) {
        this.masuatchieu = masuatchieu;
        this.maphong = maphong;
        this.masuatphim = masuatphim;
        this.thoigianchieu = thoigianchieu;
        this.trangthai = trangthai;
        this.tenphong = tenphong;
        this.ngonngu = ngonngu;
        this.dinhdang = dinhdang;
        this.hinhthuc = hinhthuc;
        this.phong = phong;
        this.tenphim = tenphim;
    }
}
