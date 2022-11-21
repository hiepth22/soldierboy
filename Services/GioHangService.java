/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.GioHang;
import Repositories.GioHangRepository;
import Repositories.Impl.ImplGioHangRepository;
import Services.Impl.ImplGioHangService;
import ViewModels.GioHangResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class GioHangService implements ImplGioHangService {

    ImplGioHangRepository repository = new GioHangRepository();

    @Override
    public List<GioHangResponse> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<GioHangResponse> response = new ArrayList<>();
        List<GioHang> gh = repository.getAll();
        for (GioHang g : gh) {
            GioHangResponse ghr = new GioHangResponse();
            ghr.setId(g.getId());
            ghr.setMa(g.getMa());
            ghr.setNgayTao(g.getNgayTao());
            ghr.setNgayThanhToan(g.getNgayThanhToan());
            ghr.setTenNguoiNhan(g.getTenNguoiNhan());
            ghr.setDiaChi(g.getDiaChi());
            ghr.setSDT(g.getSDT());
            ghr.setTinhTrang(g.getTinhTrang());
            response.add(ghr);
        }
        return response;
    }

    @Override
    public Integer insert(GioHang gh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(gh);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.remove(id);
    }

    @Override
    public Integer update(GioHang gh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.update(gh);
    }

}
