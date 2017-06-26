
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Facture;

/**
 *
 * @author Taleb
 */
@Local
public interface FactureFacadeLocal {
    int count();

    void create(Facture facture);

    void edit(Facture facture);

    Facture find(Object id);

    List<Facture> findAll();

    List<Facture> findRange(int[] range);

    void remove(Facture facture);
}


//~ Formatted by Jindent --- http://www.jindent.com
