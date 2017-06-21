/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Patient;
import entity.RDV;
import java.time.LocalDate;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Taleb
 */
@Local
public interface RDVFacadeLocal {

    void create(RDV rDV);

    void edit(RDV rDV);

    void remove(RDV rDV);

    List<RDV> findByDate(LocalDate date);
    
    List<RDV> findByDateAndPatient(LocalDate date, Patient patient);
    
    Integer getRDVCountByPatient(Patient p);
    
    List<RDV> findByValidation(boolean isValid);
    
    RDV find(Object id);

    List<RDV> findAll();

    List<RDV> findRange(int[] range);

    int count();
    
}
