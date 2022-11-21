/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioHang;
import Repositories.Impl.ImplGioHangRepository;
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
public class GioHangRepository implements ImplGioHangRepository {

    @Override
    public List<GioHang> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<GioHang> gh = new ArrayList<>();
        String sql = "select * from GioHang";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                gh.add(new GioHang(rs.getString("Id"), rs.getString("IdKH"), rs.getString("IdNV"), rs.getString("Ma"),
                        rs.getString("NgayTao"), rs.getString("NgayThanhToan"), rs.getString("TenNguoiNhan"),
                        rs.getString("DiaChi"), rs.getString("Sdt"), rs.getInt("TinhTrang")));
            }
            return gh;
        } catch (Exception ex) {
            Logger.getLogger(GioHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer insert(GioHang gh) {
        String sql = "insert into GioHang(Ma, NgayTao, NgayThanhToan, TenNguoiNhan, DiaChi, Sdt, TinhTrang) values (?,?,?,?,?,?,?)";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, gh.getMa(), gh.getNgayTao(), gh.getNgayThanhToan(), gh.getTenNguoiNhan(),
                    gh.getDiaChi(), gh.getSDT(), gh.getTinhTrang());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(GioHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "delete GioHang where Id =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception ex) {
            Logger.getLogger(GioHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer update(GioHang gh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "update GioHang set Ma =?, NgayTao =?, NgayThanhToan =?, TenNguoiNhan =?, DiaChi =?, Sdt =?, TinhTrang = ? where Id =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, gh.getMa(), gh.getNgayTao(), gh.getNgayThanhToan(), gh.getTenNguoiNhan(),
                    gh.getDiaChi(), gh.getSDT(), gh.getTinhTrang(), gh.getId());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(GioHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
