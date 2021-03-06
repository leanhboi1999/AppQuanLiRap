package model;

import entity.SuatChieu;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import util.Database;

public class SuatChieuModel {

    static Connection con = Database.connect();

    public static ArrayList<SuatChieu> taiTatCa() throws SQLException {
        ArrayList<SuatChieu> arr = new ArrayList<>();
        String sql = "select * from SuatChieu";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new SuatChieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getString(5)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<SuatChieu> timKiem(String masuatchieu) throws SQLException {
        ArrayList<SuatChieu> arr = new ArrayList<>();
        String sql = "SELECT * FROM SUATCHIEU WHERE MASUATCHIEU =" + "'" + masuatchieu + "'";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new SuatChieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getString(5)));
        }
        Database.connect().close();
        return arr;
    }

    public static ArrayList<SuatChieu> timKiem(String startDate, String endDate) throws SQLException {
        ArrayList<SuatChieu> arr = new ArrayList<>();
        String sql = "SELECT * FROM SUATCHIEU WHERE THOIGIANCHIEU>=TO_DATE('" + startDate + "','DD/MM/YYYY') AND THOIGIANCHIEU<=TO_DATE('" + endDate + "','DD/MM/YYYY')";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new SuatChieu(rs.getString(1), rs.getString(2), rs.getString(3), rs.getTimestamp(4), rs.getString(5)));
        }
        Database.connect().close();
        return arr;
    }

    public static int xoaSuatChieu(String masuatchieu) throws SQLException {
        String sql = "DELETE FROM SUATCHIEU WHERE MASUATCHIEU = '" + masuatchieu + "'";
        Statement st = con.createStatement();
        int rs = st.executeUpdate(sql);
        Database.connect().close();
        return rs;
    }

    public static String hienMa() throws SQLException {
        CallableStatement st = con.prepareCall("{? = call ID_SUATCHIEU}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        Database.connect().close();
        return st.getString(1);
    }

    public static boolean them(String maSuatChieu, String tenPhong, String maSuatPhim, String gio, String ngaychieu) throws SQLException {
        //Connection con = Database.connect();
        try {
            con.setAutoCommit(false);
            String tam = ngaychieu + " " + gio;
            String sql = "{call PRO_INSERT_SUATCHIEU(?,?,?,?)}";
            CallableStatement cstmt = con.prepareCall(sql);
            cstmt.setString(1, maSuatChieu);
            cstmt.setString(2, tenPhong);
            cstmt.setString(3, maSuatPhim);
            SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
            cstmt.setTimestamp(4, new Timestamp(df.parse(tam).getTime()));
            cstmt.executeUpdate();
            con.commit();
            return true;
        } catch (Exception e) {
            con.rollback();
            return false;
        }
    }

    public static ArrayList<SuatChieu> taiSuatChieu(String maphim) throws SQLException {
        ArrayList<SuatChieu> arr = new ArrayList<>();
        String sql = "select masuatchieu, maphong, thoigianchieu, sc.trangthai, madinhdang, mangonngu, mahinhthuc from suatchieu sc, suatphim sp, phim p where sc.masuatphim=sp.masuatphim and p.maphim=sp.maphim and p.maphim='" + maphim + "'" + " AND SC.TRANGTHAI LIKE '%CÒN%' ";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()) {
            arr.add(new SuatChieu(rs.getString(1), rs.getString(2), rs.getTimestamp(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7)));
        }
        Database.connect().close();
        return arr;
    }
}
