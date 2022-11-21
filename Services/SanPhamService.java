/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.SanPham;
import Repositories.SanPhamRepository;
import Services.Impl.ImplSanPhamService;
import ViewModels.SanPhamResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class SanPhamService implements ImplSanPhamService {

    private final SanPhamRepository repository = new SanPhamRepository();

    @Override
    public List<SanPhamResponse> getAllSanPham() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<SanPhamResponse> response = new ArrayList<>();
        List<SanPham> sp = repository.getAllSanPham();
        for (SanPham s : sp) {
            SanPhamResponse spr = new SanPhamResponse();
            spr.setId(s.getId());
            spr.setMa(s.getMa());
            spr.setTen(s.getTen());
            response.add(spr);
        }
        return response;
    }

    @Override
    public Integer insert(SanPham sp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(sp);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.remove(id);
    }

    @Override
    public Integer update(SanPham sp) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.update(sp);
    }
}
