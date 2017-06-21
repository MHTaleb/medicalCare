/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Specialite;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Taleb
 */
@Local
public interface SpecialiteFacadeLocal {

    void create(Specialite specialite);

    void edit(Specialite specialite);

    void remove(Specialite specialite);

    Specialite find(Object id);

    List<Specialite> findAll();

    List<Specialite> findRange(int[] range);

    int count();
    
}
