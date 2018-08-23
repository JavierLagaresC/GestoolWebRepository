/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gestool.ejb;

import com.gestool.models.Empresas;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Usuario
 */
@Local
public interface EmpresasFacadeLocal {

    void create(Empresas empresas);

    void edit(Empresas empresas);

    void remove(Empresas empresas);

    Empresas find(Object id);

    List<Empresas> findAll();

    List<Empresas> findRange(int[] range);

    int count();
    
}
