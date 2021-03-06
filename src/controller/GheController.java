package controller;

import entity.Ghe;
import java.sql.SQLException;
import java.util.ArrayList;
import model.GheModel;

public class GheController {

    public static ArrayList<Ghe> taiTatCa(String masuatchieu) throws SQLException {
        return GheModel.taiTatCa(masuatchieu);
    }

    public static boolean them() throws SQLException {
        int kq = GheModel.them();
        if (kq > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int giave(String masuatchieu) throws SQLException {
        return GheModel.giave(masuatchieu);
    }

    public static boolean themVe(String mave, String masuatchieu, String manhanvien, String mahoivien, String maghe, int giave) throws SQLException {
        return GheModel.themVe(mave, masuatchieu, manhanvien, mahoivien, maghe, giave);
    }

    public static String hienMa() throws SQLException {
        return GheModel.hienMa();
    }

    public static Ghe timKiemGhe(String maphong, int soghe) throws SQLException {
        return GheModel.timKiemGhe(maphong, soghe);
    }
}
