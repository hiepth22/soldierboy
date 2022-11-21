/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.SanPham;
import ViewModels.SanPhamResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplSanPhamService {

    List<SanPhamResponse> getAllSanPham();

    Integer insert(SanPham sp);

    Integer remove(String id);

    Integer update(SanPham sp);
}
