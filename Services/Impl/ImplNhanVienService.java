/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.NhanVien;
import ViewModels.NhanVienResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplNhanVienService {

    public List<NhanVienResponse> getAll();

    Integer insert(NhanVien nv);

    Integer update(NhanVien nv);

    Integer remove(String id);
}
