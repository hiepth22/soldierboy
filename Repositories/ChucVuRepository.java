/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import Repositories.Impl.ImplChucVuRespository;
import Ultilities.JDBCHelper;
import ViewModels.ChucVuResponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Soldier Boy
 */
public class ChucVuRepository implements ImplChucVuRespository {

    @Override
    public List<ChucVu> getAllChucVu() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<ChucVu> cv = new ArrayList<>();
        String sql = "Select * from ChucVu";

        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                cv.add(new ChucVu(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
            }
        } catch (Exception e) {
        }
        return cv;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "delete ChucVu where Id = ?";
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer insert(ChucVu cv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "insert into ChucVu(Ma,Ten) values (?,?)";
            Integer row = JDBCHelper.executeUpdate(sql, cv.getMa(), cv.getTen());
            return row;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer update(ChucVu cv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "update ChucVu set Ma = ?, Ten = ? where Id = ?";
            Integer row = JDBCHelper.executeUpdate(sql, cv.getMa(), cv.getTen(), cv.getId());
            return row;
        } catch (Exception e) {
        }
        return null;
    }
}
