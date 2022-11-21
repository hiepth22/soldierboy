/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NhanVien;
import Repositories.Impl.ImplNhanVienRepository;
import Ultilities.JDBCHelper;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soldier Boy
 */
public class NhanVienRepository implements ImplNhanVienRepository {

    @Override
    public List<NhanVien> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<NhanVien> nv = new ArrayList<>();
        String sql = "select * from NhanVien";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                nv.add(new NhanVien(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten"),
                        rs.getString("TenDem"), rs.getString("Ho"), rs.getString("GioiTinh"),
                        rs.getString("NgaySinh"), rs.getString("DiaChi"), rs.getString("SDT"),
                        rs.getString("MatKhau"), rs.getString("IdCH"), rs.getString("IdCV"),
                        rs.getString("IdGuiBC"), rs.getString("TrangThai")));
            }
            return nv;
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer insert(NhanVien nv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "insert into NhanVien(Ma,Ten,TenDem,Ho,GioiTinh,NgaySinh,DiaChi,SDT,MatKhau,TrangThai) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, nv.getMa(), nv.getTen(), nv.getTenDem(), nv.getHo(), nv.getGioiTinh(), nv.getNgaySinh(),
                    nv.getDiaChi(), nv.getSDT(), nv.getMatKhau(), nv.getTrangThai());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer update(NhanVien nv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "update NhanVien set Ma =?, Ten =?, TenDem =?, Ho =?, GioiTinh =?, NgaySinh =?, DiaChi =?, SDT =?, MatKhau =?, TrangThai =? where Id =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, nv.getMa(), nv.getTen(), nv.getTenDem(), nv.getHo(), nv.getGioiTinh(), nv.getNgaySinh(),
                    nv.getDiaChi(), nv.getSDT(), nv.getMatKhau(), nv.getTrangThai(), nv.getId());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "delete NhanVien where Id =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception ex) {
            Logger.getLogger(NhanVienRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
