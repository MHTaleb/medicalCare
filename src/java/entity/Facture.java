/**
 * This file was generated by the JPA Modeler
 */
package entity;

import converters.LocalDateConverter;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Taleb
 */
@Entity
public class Facture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String numeroSerie;

    @Basic
    private long montant;

    @Basic
    @Temporal(TemporalType.DATE)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate date;

    @Basic
    private boolean valider;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroSerie() {
        return this.numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public long getMontant() {
        return this.montant;
    }

    public void setMontant(long montant) {
        this.montant = montant;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isValider() {
        return this.valider;
    }

    public void setValider(boolean valider) {
        this.valider = valider;
    }

}
