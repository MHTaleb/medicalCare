
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package beans;

import java.time.LocalDate;

import java.util.List;

import javax.ejb.Local;

import entity.Patient;
import entity.RDV;

/**
 *
 * @author Taleb
 */
@Local
public interface RDVFacadeLocal {
    int count();

    void create(RDV rDV);

    void edit(RDV rDV);

    RDV find(Object id);

    List<RDV> findAll();

    List<RDV> findByDate(LocalDate date);

    List<RDV> findByDateAndPatient(LocalDate date, Patient patient);

    List<RDV> findByValidation(boolean isValid);

    List<RDV> findRange(int[] range);

    void remove(RDV rDV);

    Integer getRDVCountByPatient(Patient p);
}


//~ Formatted by Jindent --- http://www.jindent.com
