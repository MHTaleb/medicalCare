
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.util.List;

import javax.ejb.Local;

import entity.Patient;

/**
 *
 * @author Taleb
 */
@Local
public interface PatientFacadeLocal {
    int count();

    void create(Patient patient);

    void edit(Patient patient);

    Patient find(Object id);

    List<Patient> findAll();

    Patient findByUserId(Object id);

    List<Patient> findRange(int[] range);

    void remove(Patient patient);
}


//~ Formatted by Jindent --- http://www.jindent.com
