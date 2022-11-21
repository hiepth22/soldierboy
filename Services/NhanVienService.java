/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NhanVien;
import Repositories.Impl.ImplNhanVienRepository;
import Repositories.NhanVienRepository;
import Services.Impl.ImplNhanVienService;
import ViewModels.NhanVienResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class NhanVienService implements ImplNhanVienService {

    private final ImplNhanVienRepository repository = new NhanVienRepository();

    @Override
    public List<NhanVienResponse> getAll() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<NhanVienResponse> response = new ArrayList<>();
        List<NhanVien> nv = repository.getAll();
        for (NhanVien n : nv) {
            NhanVienResponse nvr = new NhanVienResponse();
            nvr.setId(n.getId());
            nvr.setMa(n.getMa());
            nvr.setTen(n.getTen());
            nvr.setTenDem(n.getTenDem());
            nvr.setHo(n.getHo());
            nvr.setGioiTinh(n.getGioiTinh());
            nvr.setNgaySinh(n.getNgaySinh());
            nvr.setDiaChi(n.getDiaChi());
            nvr.setSDT(n.getSDT());
            nvr.setMatKhau(n.getMatKhau());
            nvr.setTrangThai(n.getTrangThai());
            response.add(nvr);
        }
        return response;
    }

    @Override
    public Integer insert(NhanVien nv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(nv);
    }

    @Override
    public Integer update(NhanVien nv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.update(nv);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.remove(id);
    }

}
