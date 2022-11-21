/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories.Impl;

import DomainModels.NhanVien;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplNhanVienRepository {

    public List<NhanVien> getAll();

    Integer insert(NhanVien nv);

    Integer update(NhanVien nv);

    Integer remove(String id);
}
