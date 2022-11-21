/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Repositories.Impl.ImplKhachHangRepository;
import Ultilities.JDBCHelper;
import ViewModels.KhachHangResponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Soldier Boy
 */
public class KhachHangRepository implements ImplKhachHangRepository {

    @Override
    public List<KhachHang> getAllKhachHang() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<KhachHang> kh = new ArrayList<>();
        String sql = "select * from KhachHang";

        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                kh.add(new KhachHang(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("TenDem"),
                        rs.getString("Ho"), rs.getString("NgaySinh"), rs.getString("Sdt"), rs.getString("DiaChi"),
                        rs.getString("ThanhPho"), rs.getString("QuocGia"), rs.getString("MatKhau")));
            }
            return kh;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer insert(KhachHang kh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "insert into KhachHang(Ma, Ten, TenDem, Ho, NgaySinh, Sdt, DiaChi, ThanhPho, QuocGia, MatKhau) values (?,?,?,?,?,?,?,?,?,?)";
            Integer row = JDBCHelper.executeUpdate(sql, kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(), kh.getNgaySinh(),
                    kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau());
            return row;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "delete KhachHang where Id = ?";
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer update(KhachHang kh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "update KhachHang set Ma =?, Ten =?, TenDem =?, Ho =?, NgaySinh =?, Sdt =?, DiaChi =?,"
                    + "ThanhPho =?, QuocGia =?, MatKhau =? where Id =?";
            Integer row = JDBCHelper.executeUpdate(sql, kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(),
                    kh.getNgaySinh(), kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau(), kh.getId());
            return row;
        } catch (Exception e) {
        }
        return null;
    }

//    public List<KhachHang> getAllKhachHang() throws Exception {
//        List<KhachHang> kh = new ArrayList<>();
//        String sql = "select * from KhachHang";
//
//        ResultSet rs = JDBCHelper.executeQuery(sql);
//        while (rs.next()) {
//            kh.add(new KhachHang(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("TenDem"),
//                    rs.getString("Ho"), rs.getString("NgaySinh"), rs.getString("Sdt"), rs.getString("DiaChi"),
//                    rs.getString("ThanhPho"), rs.getString("QuocGia"), rs.getString("MatKhau")));
//        }
//        return kh;
//    }
//
//    public Integer insert(KhachHang kh) throws Exception {
//        String sql = "insert into KhachHang(Ma, Ten, TenDem, Ho, NgaySinh,"
//                + " Sdt, DiaChi, ThanhPho, QuocGia, MatKhau) values (?,?,?,?,?,?,?,?,?,?)";
//        Integer row = JDBCHelper.executeUpdate(sql, kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(), kh.getNgaySinh(),
//                kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau());
//        return row;
//    }
//
//    public Integer remove(String id) throws Exception {
//        String sql = "delete KhachHang where Id = ?";
//        Integer row = JDBCHelper.executeUpdate(sql, id);
//        return row;
//    }
//
//    public Integer update(KhachHang kh) throws Exception {
//        String sql = "update KhachHang set Ma =?, Ten =?, TenDem =?, Ho =?, NgaySinh =?, Sdt =?, DiaChi =?,"
//                + "ThanhPho =?, QuocGia =?, MatKhau =? where Id =?";
//        Integer row = JDBCHelper.executeUpdate(sql, kh.getMa(), kh.getTen(), kh.getTenDem(), kh.getHo(),
//                kh.getNgaySinh(), kh.getSdt(), kh.getDiaChi(), kh.getThanhPho(), kh.getQuocGia(), kh.getMatKhau(), kh.getId());
//        return row;
//    }
}
