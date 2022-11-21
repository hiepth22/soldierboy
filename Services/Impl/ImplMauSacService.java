/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.Impl;

import DomainModels.MauSac;
import ViewModels.MauSacResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface ImplMauSacService {

    public List<MauSacResponse> getAll();

    Integer insert(MauSac ms);

    Integer remove(String id);

    Integer update(MauSac ms);
}
