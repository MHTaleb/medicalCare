/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Patient;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Taleb
 */
@Local
public interface PatientFacadeLocal {

    void create(Patient patient);

    void edit(Patient patient);

    void remove(Patient patient);

    Patient find(Object id);
    
    Patient findByUserId(Object id);

    List<Patient> findAll();

    List<Patient> findRange(int[] range);

    int count();
    
}
