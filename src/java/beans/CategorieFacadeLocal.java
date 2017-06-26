
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Categorie;

/**
 *
 * @author Taleb
 */
@Local
public interface CategorieFacadeLocal {
    int count();

    void create(Categorie categorie);

    void edit(Categorie categorie);

    Categorie find(Object id);

    List<Categorie> findAll();

    List<Categorie> findRange(int[] range);

    void remove(Categorie categorie);
}


//~ Formatted by Jindent --- http://www.jindent.com
