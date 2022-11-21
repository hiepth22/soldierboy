/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.DongSP;
import Repositories.DongSPReposiory;
import Repositories.Impl.ImplDongSPRepository;
import Services.Impl.ImplDongSPService;
import ViewModels.DongSPResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class DongSPService implements ImplDongSPService {

    private final ImplDongSPRepository repository = new DongSPReposiory();

    @Override
    public Integer insert(DongSP dsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(dsp);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.remove(id);
    }

    @Override
    public Integer update(DongSP dsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.update(dsp);
    }

    @Override
    public List<DongSPResponse> getAll() {
        List<DongSPResponse> response = new ArrayList<>();
        List<DongSP> dsp = repository.getAll();
        for (DongSP d : dsp) {
            DongSPResponse dspr = new DongSPResponse();
            dspr.setId(d.getId());
            dspr.setMa(d.getMa());
            dspr.setTen(d.getTen());
            response.add(dspr);
        }
        return response;
    }

}
