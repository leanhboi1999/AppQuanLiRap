/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author leanh
 */
public class ThucPham {

    private String mathucpham;
    private String tenthucpham;
    private float dongia;
    private int soluong;
    private int trangthai;

    public ThucPham(String mathucpham, String tenthucpham, int dongia, int soluong, int trangthai) {
        this.mathucpham = mathucpham;
        this.tenthucpham = tenthucpham;
        this.dongia = dongia;
        this.soluong = soluong;
        this.trangthai = trangthai;
    }

    public ThucPham(String mathucpham, String tenthucpham, int trangthai) {
        this.mathucpham = mathucpham;
        this.tenthucpham = tenthucpham;
        this.trangthai = trangthai;
    }

    public ThucPham() {
    }

    public String getMathucpham() {
        return mathucpham;
    }

    public void setMathucpham(String mathucpham) {
        this.mathucpham = mathucpham;
    }

    public String getTenthucpham() {
        return tenthucpham;
    }

    public void setTenthucpham(String tenthucpham) {
        this.tenthucpham = tenthucpham;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(float dongia) {
        this.dongia = dongia;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

}
