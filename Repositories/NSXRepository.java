/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.NSX;
import Repositories.Impl.NSXRespositoryImpl;
import Ultilities.JDBCHelper;
import ViewModels.NSXResponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soldier Boy
 */
public class NSXRepository implements NSXRespositoryImpl {

    @Override
    public List<NSX> getAllNSX() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<NSX> nsx = new ArrayList<>();
        String sql = "select * from NSX";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                nsx.add(new NSX(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
            }
            return nsx;
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public Integer insert(NSX nsx) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "insert into NSX(Ma,Ten) values (?,?)";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, nsx.getMa(), nsx.getTen());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(NSXRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer update(NSX nsx) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    String sql = "update NSX set Ma = ?, Ten = ? where Id = ?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, nsx.getMa(),nsx.getTen(),nsx.getId());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(NSXRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    String sql = "delete NSX where Id = ?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql,id);
            return row;
        } catch (Exception ex) {
            Logger.getLogger(NSXRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
