package Services;

import DomainModels.KhachHang;
import Repositories.Impl.ImplKhachHangRepository;
import Repositories.KhachHangRepository;
import Services.Impl.ImplKhachHangService;
import ViewModels.KhachHangResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class KhachHangService implements ImplKhachHangService {

    private final ImplKhachHangRepository repository = new KhachHangRepository();

    @Override
    public Integer insert(KhachHang kh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(kh);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.remove(id);
    }

    @Override
    public Integer update(KhachHang kh) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.update(kh);
    }

    @Override
    public List<KhachHangResponse> getAllKhachHang() {
        List<KhachHangResponse> response = new ArrayList<>();
        List<KhachHang> kh = repository.getAllKhachHang();
        for (KhachHang k : kh) {
            KhachHangResponse khr = new KhachHangResponse();
            khr.setId(k.getId());
            khr.setMa(k.getMa());
            khr.setTen(k.getTen());
            khr.setTenDem(k.getTenDem());
            khr.setHo(k.getHo());
            khr.setNgaySinh(k.getNgaySinh());
            khr.setSdt(k.getSdt());
            khr.setDiaChi(k.getDiaChi());
            khr.setThanhPho(k.getThanhPho());
            khr.setQuocGia(k.getQuocGia());
            khr.setMatKhau(k.getMatKhau());
            response.add(khr);
        }
        return response;
    }
}
