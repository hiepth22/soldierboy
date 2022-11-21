/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.CuaHang;
import ViewModels.CuaHangResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface CuaHangServiceImpl {

    List<CuaHangResponse> getAll();

    Integer insert(CuaHang ch);

    Integer remove(String id);

    Integer update(CuaHang ch);
}
