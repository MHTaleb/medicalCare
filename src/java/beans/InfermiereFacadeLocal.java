
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Infermiere;

/**
 *
 * @author Taleb
 */
@Local
public interface InfermiereFacadeLocal {
    int count();

    void create(Infermiere infermiere);

    void edit(Infermiere infermiere);

    Infermiere find(Object id);

    List<Infermiere> findAll();

    List<Infermiere> findRange(int[] range);

    void remove(Infermiere infermiere);
}


//~ Formatted by Jindent --- http://www.jindent.com
