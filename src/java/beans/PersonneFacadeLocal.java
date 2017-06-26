
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Personne;

/**
 *
 * @author Taleb
 */
@Local
public interface PersonneFacadeLocal {
    int count();

    void create(Personne personne);

    void edit(Personne personne);

    Personne find(Object id);

    List<Personne> findAll();

    List<Personne> findRange(int[] range);

    void remove(Personne personne);
}


//~ Formatted by Jindent --- http://www.jindent.com
