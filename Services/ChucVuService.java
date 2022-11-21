/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChucVu;
import Repositories.ChucVuRepository;
import Repositories.Impl.ImplChucVuRespository;
import Services.Impl.ImplChucVuService;
import ViewModels.ChucVuResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class ChucVuService implements ImplChucVuService {

    ImplChucVuRespository respository = new ChucVuRepository();

    @Override
    public Integer insert(ChucVu cv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return respository.insert(cv);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return respository.remove(id);
    }

    @Override
    public Integer update(ChucVu cv) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return respository.update(cv);
    }

    @Override
    public List<ChucVuResponse> getAllChucVu() {
        List<ChucVuResponse> response = new ArrayList<>();
        List<ChucVu> cv = respository.getAllChucVu();
        for (ChucVu c : cv) {
            ChucVuResponse cvr = new ChucVuResponse();
            cvr.setId(c.getId());
            cvr.setMa(c.getMa());
            cvr.setTen(c.getTen());
            response.add(cvr);
        }
        return response;
    }

}
