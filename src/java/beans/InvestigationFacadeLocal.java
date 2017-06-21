/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Investigation;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Taleb
 */
@Local
public interface InvestigationFacadeLocal {

    void create(Investigation investigation);

    void edit(Investigation investigation);

    void remove(Investigation investigation);

    Investigation find(Object id);

    List<Investigation> findAll();

    List<Investigation> findRange(int[] range);

    int count();
    
}
