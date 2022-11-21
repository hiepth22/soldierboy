/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.ChiTietSP;
import ViewModels.ChiTietSPResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplChiTietSPService {

    List<ChiTietSPResponse> getAll();

    Integer insert(ChiTietSP ctsp);

    Integer update(ChiTietSP ctsp);

    Integer remove(String id);
}
