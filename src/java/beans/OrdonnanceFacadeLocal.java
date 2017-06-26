
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Ordonnance;

/**
 *
 * @author Taleb
 */
@Local
public interface OrdonnanceFacadeLocal {
    int count();

    void create(Ordonnance ordonnance);

    void edit(Ordonnance ordonnance);

    Ordonnance find(Object id);

    List<Ordonnance> findAll();

    List<Ordonnance> findRange(int[] range);

    void remove(Ordonnance ordonnance);
}


//~ Formatted by Jindent --- http://www.jindent.com
