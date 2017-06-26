
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Medecin;

/**
 *
 * @author Taleb
 */
@Local
public interface MedecinFacadeLocal {
    int count();

    void create(Medecin medecin);

    void edit(Medecin medecin);

    Medecin find(Object id);

    List<Medecin> findAll();

    public Medecin findByUserNameAndPasswort(String userName, String password);

    List<Medecin> findRange(int[] range);

    void remove(Medecin medecin);
}


//~ Formatted by Jindent --- http://www.jindent.com
