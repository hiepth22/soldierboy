/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChiTietSP;
import Repositories.ChiTietSPRepository;
import Repositories.Impl.ImplChiTietSPRepository;
import Services.Impl.ImplChiTietSPService;
import ViewModels.ChiTietSPResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class ChiTietSPService implements ImplChiTietSPService {

    private ImplChiTietSPRepository repository = new ChiTietSPRepository();

    @Override
    public List<ChiTietSPResponse> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<ChiTietSPResponse> response = new ArrayList<>();
        List<ChiTietSP> ctsp = repository.getAll();
        for (ChiTietSP ct : ctsp) {
            ChiTietSPResponse ctspr = new ChiTietSPResponse();
            ctspr.setId(ct.getId());
            ctspr.setNamBH(ct.getNamBH());
            ctspr.setMoTa(ct.getMoTa());
            ctspr.setSoLuongTon(ct.getSoLuongTon());
            ctspr.setGiaNhap(ct.getGiaNhap());
            ctspr.setGiaBan(ct.getGiaBan());
            response.add(ctspr);
        }
        return response;
    }

    @Override
    public Integer insert(ChiTietSP ctsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(ctsp);
    }

    @Override
    public Integer update(ChiTietSP ctsp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.update(ctsp);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.remove(id);
    }

}
