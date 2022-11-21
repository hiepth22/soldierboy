/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.SanPham;
import Repositories.Impl.ImplSanpPhamRepository;
import Ultilities.JDBCHelper;
import ViewModels.SanPhamResponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soldier Boy
 */
public class SanPhamRepository implements ImplSanpPhamRepository {

    @Override
    public List<SanPham> getAllSanPham() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<SanPham> sp = new ArrayList<>();
        String sql = "select * from SanPham";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                sp.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            return sp;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer insert(SanPham sp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "INSERT INTO [dbo].[SanPham]\n"
                + "           ([Ma]\n"
                + "           ,[Ten])\n"
                + "     VALUES\n"
                + "           (?,?)";
        Integer row;
        try {
            row = JDBCHelper.executeUpdate(sql, sp.getMa(), sp.getTen());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(SanPhamRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "delete SanPham where Id =?";
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer update(SanPham sp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "update SanPham set Ma =?, Ten =? where Id =?";
            Integer row = JDBCHelper.executeUpdate(sql, sp.getMa(), sp.getTen(), sp.getId());
            return row;
        } catch (Exception e) {
        }
        return null;
    }

//    public List<SanPham> getAllSanPham() throws Exception {
//        List<SanPham> sp = new ArrayList<>();
//        String sql = "select * from SanPham";
//        ResultSet rs = JDBCHelper.executeQuery(sql);
//        while (rs.next()) {
//            sp.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3)));
//        }
//        return sp;
//    }
//
//    public Integer insert(SanPham sp) throws Exception {
//        String sql = "insert into SanPham(Ma, Ten) values (?,?)";
//        Integer row = JDBCHelper.executeUpdate(sql, sp.getMa(), sp.getTen());
//        return row;
//    }
//
//    public Integer update(SanPham sp) throws Exception {
//        String sql = "update SanPham set Ma =?, Ten =? where Id =?";
//        Integer row = JDBCHelper.executeUpdate(sql, sp.getMa(), sp.getTen(), sp.getId());
//        return row;
//    }
//
//    public Integer remove(String id) throws Exception {
//        String sql = "delete SanPham where Id =?";
//        Integer row = JDBCHelper.executeUpdate(sql, id);
//        return row;
//    }
}
