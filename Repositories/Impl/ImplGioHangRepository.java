/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories.Impl;

import DomainModels.GioHang;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplGioHangRepository {

    List<GioHang> getAll();

    Integer insert(GioHang gh);

    Integer remove(String id);

    Integer update(GioHang gh);

}
