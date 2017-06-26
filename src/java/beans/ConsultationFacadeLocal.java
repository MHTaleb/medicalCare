
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Consultation;

/**
 *
 * @author Taleb
 */
@Local
public interface ConsultationFacadeLocal {
    int count();

    void create(Consultation consultation);

    void edit(Consultation consultation);

    Consultation find(Object id);

    List<Consultation> findAll();

    List<Consultation> findRange(int[] range);

    void remove(Consultation consultation);
}


//~ Formatted by Jindent --- http://www.jindent.com
