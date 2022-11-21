/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.DongSP;
import ViewModels.DongSPResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplDongSPService {

    public List<DongSPResponse> getAll();

    Integer insert(DongSP dsp);

    Integer remove(String id);

    Integer update(DongSP dsp);
}
