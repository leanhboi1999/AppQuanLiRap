package model;

import entity.Ghe;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import util.Database;

public class GheModel {

    public static ArrayList<Ghe> taiTatCa(String masuatchieu) throws SQLException {
        ArrayList<Ghe> arr = new ArrayList<>();
        String sql = "SELECT SOGHE\n"
                + "    FROM VE,GHE\n"
                + "    WHERE VE.MAGHE=GHE.MAGHE\n"
                + "    AND VE.MASUATCHIEU='" + masuatchieu + "'";
        ResultSet rs = Database.callQuery(sql);
        while (rs.next()) {
            arr.add(new Ghe(rs.getString(1)));
        }
        return arr;
    }
     public static Ghe timKiemGhe(String maphong,int soghe) throws SQLException {
        Connection con = Database.connect();
        String sql = "SELECT * FROM GHE WHERE MAPHONG='" + maphong + "'" + "AND SOGHE='" +soghe+"'";
        ResultSet rs = Database.callQuery(sql);
        rs.next();
        Ghe gh =new Ghe(rs.getString(1), rs.getString(2),rs.getInt(3));
        Database.connect().close();
        return gh;
    }

    public static int them() throws SQLException {
        int row = Database.callQueryInsert("ghe", null);
        return row;
    }
    public static int giave(String masuatchieu) throws SQLException {
    Connection con = Database.connect();
        try {  
        CallableStatement st = Database.connect().prepareCall("{? = call FUNC_GIAVE(?)}");
        st.registerOutParameter(1, Types.INTEGER);
        st.setString(2,masuatchieu);
        st.execute();
        System.out.println(st.getInt(1));
        return st.getInt(1);
        } catch (Exception e) {
            return 0;
        } finally {
            con.close();
        }
    }
    public static String hienMa() throws SQLException {
        CallableStatement st = Database.connect().prepareCall("{? = call ID_VE}");
        st.registerOutParameter(1, Types.VARCHAR);
        st.execute();
        return st.getString(1);
    }
    public static int themVe(String mave,String masuatchieu, String manhanvien, String mahoivien, String maghe, int giave) throws SQLException {
        Connection con = Database.connect();
        String sql = "INSERT INTO VE VALUES (?,?,?,?,?,'',?)";
        PreparedStatement stm = con.prepareCall(sql);
        stm.setString(1, mave);
        System.out.println(mave);
        stm.setString(2, masuatchieu);
        System.out.println(masuatchieu);
        stm.setString(3, manhanvien);
        System.out.println(manhanvien);
        stm.setString(4, mahoivien);
        System.out.println(mahoivien);
        stm.setString(5,maghe);
        System.out.println(maghe);
        stm.setInt(6, giave);
        System.out.println(giave);
        int row = stm.executeUpdate();
        return row;
    }
}
