/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.KhachHang;
import ViewModels.KhachHangResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplKhachHangService {

    List<KhachHangResponse> getAllKhachHang();

    Integer insert(KhachHang kh);

    Integer remove(String id);

    Integer update(KhachHang kh);
}
