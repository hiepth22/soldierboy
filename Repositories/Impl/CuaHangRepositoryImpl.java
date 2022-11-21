/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories.Impl;

import DomainModels.CuaHang;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface CuaHangRepositoryImpl {

    List<CuaHang> getAll();

    Integer insert(CuaHang ch);

    Integer remove(String id);

    Integer update(CuaHang ch);
}
