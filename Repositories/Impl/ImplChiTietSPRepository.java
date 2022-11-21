/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories.Impl;

import DomainModels.ChiTietSP;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplChiTietSPRepository {

    List<ChiTietSP> getAll();

    Integer insert(ChiTietSP ctsp);

    Integer update(ChiTietSP ctsp);

    Integer remove(String id);
}
