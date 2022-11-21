/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.NSX;
import Repositories.NSXRepository;
import Services.Impl.NSXServiceImpl;
import ViewModels.NSXResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public class NSXService implements NSXServiceImpl {

    NSXRepository repository = new NSXRepository();

    @Override
    public List<NSXResponse> getAllNSX() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        List<NSXResponse> response = new ArrayList<>();
        List<NSX> nsx = repository.getAllNSX();
        for (NSX n : nsx) {
            NSXResponse nsxr = new NSXResponse();
            nsxr.setId(n.getId());
            nsxr.setMa(n.getMa());
            nsxr.setTen(n.getTen());
            response.add(nsxr);
        }
        return response;
    }

    @Override
    public Integer insert(NSX nsx) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.insert(nsx);
    }

    @Override
    public Integer update(NSX nsx) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.update(nsx);
    }

    @Override
    public Integer remove(String id) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return repository.remove(id);
    }

}
