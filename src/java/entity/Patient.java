
/**
 * This file was generated by the JPA Modeler
 */
package entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Taleb
 */
@Entity
public class Patient extends Personne implements Serializable {
    @Column(unique = true)
    @Basic
    private String numero_patient;

    public String getNumero_patient() {
        return this.numero_patient;
    }

    public void setNumero_patient(String numero_patient) {
        this.numero_patient = numero_patient;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
