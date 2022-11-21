/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.ChucVu;
import ViewModels.ChucVuResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplChucVuService {

    public List<ChucVuResponse> getAllChucVu();

    Integer insert(ChucVu cv);

    Integer remove(String id);

    Integer update(ChucVu cv);
}
