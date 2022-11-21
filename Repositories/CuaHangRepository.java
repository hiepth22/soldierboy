/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.CuaHang;
import Repositories.Impl.CuaHangRepositoryImpl;
import Ultilities.JDBCHelper;
import ViewModels.CuaHangResponse;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soldier Boy
 */
public class CuaHangRepository implements CuaHangRepositoryImpl {

    @Override
    public List<CuaHang> getAll() {
        List<CuaHang> ch = new ArrayList<>();
        String sql = "select * from CuaHang";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                ch.add(new CuaHang(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)));
            }
            return ch;
        } catch (Exception ex) {
            Logger.getLogger(CuaHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer insert(CuaHang ch) {
        String sql = "insert into CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia) values (?,?,?,?,?)";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, ch.getMa(), ch.getTen(), ch.getDiaChi(), ch.getThanhPho(), ch.getQuocGia());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(CuaHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
        String sql = "delete CuaHang where Ma =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception ex) {
            Logger.getLogger(CuaHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer update(CuaHang ch) {
        String sql = "update CuaHang set Ten =?, DiaChi =?, ThanhPho =?, QuocGia =? where Ma =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, ch.getTen(), ch.getDiaChi(), ch.getThanhPho(), ch.getQuocGia(), ch.getMa());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(CuaHangRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
