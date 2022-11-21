/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories.Impl;

import DomainModels.NSX;
import ViewModels.NSXResponse;
import java.util.List;

/**
 *
 * @author Soldier Boy
 */
public interface NSXRespositoryImpl {

    List<NSX> getAllNSX();

    Integer insert(NSX nsx);

    Integer update(NSX nsx);

    Integer remove(String id);
}
