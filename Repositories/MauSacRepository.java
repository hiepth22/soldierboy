/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.MauSac;
import Repositories.Impl.ImplMauSacRepository;
import Ultilities.JDBCHelper;
import ViewModels.MauSacResponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author Soldier Boy
 */
public class MauSacRepository implements ImplMauSacRepository {
    
    @Override
    public List<MauSac> getAll() {
        List<MauSac> ms = new ArrayList<>();
        String sql = "select * from MauSac";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                ms.add(new MauSac(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
            }
            return ms;
        } catch (Exception e) {
        }
        return null;
    }
    
    @Override
    public Integer insert(MauSac ms) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "insert into MauSac(Ma, Ten) values (?,?)";
            Integer row = JDBCHelper.executeUpdate(sql, ms.getMa(), ms.getTen());
            return row;
        } catch (Exception e) {
        }
        return null;
    }
    
    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "delete Mausac where Id =?";
            Integer row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception e) {
        }
        return null;
    }
    
    @Override
    public Integer update(MauSac ms) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        try {
            String sql = "update MauSac set Ma =?, Ten =? where Id =?";
            Integer row = JDBCHelper.executeUpdate(sql, ms.getMa(), ms.getTen(), ms.getId());
            return row;
        } catch (Exception e) {
        }
        return null;
    }
    
}
