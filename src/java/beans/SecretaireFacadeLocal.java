
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Secretaire;

/**
 *
 * @author Taleb
 */
@Local
public interface SecretaireFacadeLocal {
    int count();

    void create(Secretaire secretaire);

    void edit(Secretaire secretaire);

    Secretaire find(Object id);

    List<Secretaire> findAll();

    public Secretaire findByUserNameAndPSW(String userName, String password);

    List<Secretaire> findRange(int[] range);

    void remove(Secretaire secretaire);
}


//~ Formatted by Jindent --- http://www.jindent.com
