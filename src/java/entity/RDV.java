
/**
 * This file was generated by the JPA Modeler
 */
package entity;

import java.io.Serializable;

import java.time.LocalDate;

import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import converters.LocalDateConverter;

/**
 * @author Taleb
 */
@Entity
@NamedQueries( {
    @NamedQuery(
        name  = "RVD.findByValidation",
        query = "SELECT r FROM RDV r WHERE r.isValide = :isValid"
    ) , @NamedQuery(
        name  = "RVD.findCountByPatient",
        query = "SELECT COUNT(c.patient.id) FROM RDV c WHERE c.patient.id = :patientId "
    ) , @NamedQuery(
        name  = "RDV.findByPatientAndDate",
        query = "SELECT r FROM RDV r WHERE r.patient.id = :patientID AND r.dateRDV = :dateRDV"
    ) , @NamedQuery(
        name  = "RDV.findByDate",
        query = "SELECT r FROM RDV r WHERE r.dateRDV  = :dateRDV "
    )
})
public class RDV implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long      id;
    @Basic
    @Temporal(TemporalType.DATE)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate dateRDV;
    @Basic
    private String    message;
    @Basic
    private boolean   isValide;
    @OneToOne(targetEntity = Service.class)
    private Service   service;
    @OneToOne(targetEntity = Patient.class)
    private Patient   patient;

    public LocalDate getDateRDV() {
        return this.dateRDV;
    }

    public void setDateRDV(LocalDate dateRDV) {
        this.dateRDV = dateRDV;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isIsValide() {
        return this.isValide;
    }

    public void setIsValide(boolean isValide) {
        this.isValide = isValide;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Service getService() {
        return this.service;
    }

    public void setService(Service service) {
        this.service = service;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
