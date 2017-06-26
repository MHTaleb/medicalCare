
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Service;

/**
 *
 * @author Taleb
 */
@Local
public interface ServiceFacadeLocal {
    int count();

    void create(Service service);

    void edit(Service service);

    Service find(Object id);

    List<Service> findAll();

    List<Service> findRange(int[] range);

    void remove(Service service);
}


//~ Formatted by Jindent --- http://www.jindent.com
