/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.DongSP;
import Repositories.Impl.ImplDongSPRepository;
import Ultilities.JDBCHelper;
import ViewModels.DongSPResponse;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Soldier Boy
 */
public class DongSPReposiory implements ImplDongSPRepository {

    @Override
    public List<DongSP> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<DongSP> dsp = new ArrayList<>();
        String sql = "Select * from DongSP";
        try {
            ResultSet rs = JDBCHelper.executeQuery(sql);
            while (rs.next()) {
                dsp.add(new DongSP(rs.getString("Id"), rs.getString("Ma"), rs.getString("Ten")));
            }
            return dsp;
        } catch (Exception ex) {
            Logger.getLogger(DongSPReposiory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer insert(DongSP dsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "insert into DongSP(Ma, Ten) values (?, ?)";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, dsp.getMa(), dsp.getTen());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(DongSPReposiory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "delete DongSP where Id =?";
        Integer row;
        try {
            row = JDBCHelper.executeUpdate(sql, id);
            return row;
        } catch (Exception ex) {
            Logger.getLogger(DongSPReposiory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public Integer update(DongSP dsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        String sql = "update DongSP set Ma =?, Ten =? where Id =?";
        try {
            Integer row = JDBCHelper.executeUpdate(sql, dsp.getMa(), dsp.getTen(), dsp.getId());
            return row;
        } catch (Exception ex) {
            Logger.getLogger(DongSPReposiory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
