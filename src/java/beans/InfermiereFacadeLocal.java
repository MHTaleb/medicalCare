/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Infermiere;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Taleb
 */
@Local
public interface InfermiereFacadeLocal {

    void create(Infermiere infermiere);

    void edit(Infermiere infermiere);

    void remove(Infermiere infermiere);

    Infermiere find(Object id);

    List<Infermiere> findAll();

    List<Infermiere> findRange(int[] range);

    int count();
    
}
