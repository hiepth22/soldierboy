/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.CuaHang;
import Repositories.CuaHangRepository;
import Repositories.Impl.CuaHangRepositoryImpl;
import Services.Impl.CuaHangServiceImpl;
import ViewModels.CuaHangResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class CuaHangService implements CuaHangServiceImpl {

    public CuaHangRepository repository = new CuaHangRepository();

    @Override
    public List<CuaHangResponse> getAll() {
        List<CuaHang> ch = repository.getAll();
        List<CuaHangResponse> responses = new ArrayList<>();
        for (CuaHang c : ch) {
            CuaHangResponse chr = new CuaHangResponse();
            chr.setMa(c.getMa());
            chr.setTen(c.getTen());
            chr.setDiaChi(c.getDiaChi());
            chr.setThanhPho(c.getThanhPho());
            chr.setQuocGia(c.getQuocGia());
            responses.add(chr);
        }
        return responses;
    }


    @Override
    public Integer insert(CuaHang ch) {
        return repository.insert(ch);
    }

    @Override
    public Integer remove(String id) {
        return repository.remove(id);
    }

    @Override
    public Integer update(CuaHang ch) {
        return repository.update(ch);
    }

}
