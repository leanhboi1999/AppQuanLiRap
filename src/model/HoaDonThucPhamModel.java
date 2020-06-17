/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Database;
import entity.HoaDonThucPham;

/**
 *
 * @author Lenovo
 */
public class HoaDonThucPhamModel {
    public static ArrayList<HoaDonThucPham> taiTatCa() throws SQLException {
        ArrayList<HoaDonThucPham> arr = new ArrayList<>();
        String sql = "select * from hdthucpham";
        ResultSet rs = Database.callQuery(sql);
        while(rs.next()) {
             arr.add(new HoaDonThucPham(rs.getString(1), rs.getString(2),rs.getInt(3),rs.getString(4)));
        }
        return arr;
    }
    
}
