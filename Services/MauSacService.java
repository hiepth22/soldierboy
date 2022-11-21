/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.MauSac;
import Repositories.MauSacRepository;
import Services.Impl.ImplMauSacService;
import ViewModels.MauSacResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class MauSacService implements ImplMauSacService {

    private final MauSacRepository repository = new MauSacRepository();

    @Override
    public List<MauSacResponse> getAll() {
        List<MauSacResponse> response = new ArrayList<>();
        List<MauSac> ms = repository.getAll();
        for (MauSac m : ms) {
            MauSacResponse msr = new MauSacResponse();
            msr.setId(m.getId());
            msr.setMa(m.getMa());
            msr.setTen(m.getTen());
            response.add(msr);
        }
        return response;
    }

    @Override
    public Integer insert(MauSac ms) {
        return repository.insert(ms);
    }

    @Override
    public Integer remove(String id) {
        return repository.remove(id);
    }

    @Override
    public Integer update(MauSac ms) {
        return repository.update(ms);
    }
}
