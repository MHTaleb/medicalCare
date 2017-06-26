
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Medicament;

/**
 *
 * @author Taleb
 */
@Local
public interface MedicamentFacadeLocal {
    int count();

    void create(Medicament medicament);

    void edit(Medicament medicament);

    Medicament find(Object id);

    List<Medicament> findAll();

    List<Medicament> findRange(int[] range);

    void remove(Medicament medicament);
}


//~ Formatted by Jindent --- http://www.jindent.com
