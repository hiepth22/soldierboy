/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSP;
import Repositories.Impl.ImplChiTietSPRepository;
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
public class ChiTietSPRepository implements ImplChiTietSPRepository {

    @Override
    public List<ChiTietSP> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<ChiTietSP> ctsp = new ArrayList<>();
        String sql = "select * from ChiTietSP";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                ctsp.add(new ChiTietSP(rs.getString("Id"), rs.getString("IdSP"), rs.getString("IdNsx"), rs.getString("IdMauSac"), rs.getString("IdDongSP"), rs.getInt("NamBH"), rs.getString("MoTa"), rs.getInt("SoLuongTon"), rs.getDouble("GiaNhap"), rs.getDouble("GiaBan")));
            }
            return ctsp;
        } catch (Exception ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer insert(ChiTietSP ctsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "Insert into ChiTietSP(NamBH, MoTa, SoLuongTon, GiaNhap, GiaBan) values (?,?,?,?,?)";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, ctsp.getNamBH(), ctsp.getMoTa(), ctsp.getSoLuongTon(), ctsp.getGiaNhap(), ctsp.getGiaBan());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer update(ChiTietSP ctsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "update ChiTietSP set NamBH =?, MoTa =?, SoLuongTon =?, GiaNhap =?, GiaBan =? where Id =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, ctsp.getNamBH(), ctsp.getMoTa(), ctsp.getSoLuongTon(), ctsp.getGiaNhap(), ctsp.getGiaBan(), ctsp.getId());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "delete ChiTietSP where Id =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception ex) {
            Logger.getLogger(ChiTietSPRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
