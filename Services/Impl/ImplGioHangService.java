/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.GioHang;
import ViewModels.GioHangResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplGioHangService {

    List<GioHangResponse> getAll();

    Integer insert(GioHang gh);

    Integer remove(String id);

    Integer update(GioHang gh);
}
