
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Investigation;

/**
 *
 * @author Taleb
 */
@Local
public interface InvestigationFacadeLocal {
    int count();

    void create(Investigation investigation);

    void edit(Investigation investigation);

    Investigation find(Object id);

    List<Investigation> findAll();

    List<Investigation> findRange(int[] range);

    void remove(Investigation investigation);
}


//~ Formatted by Jindent --- http://www.jindent.com
