/**
 * This file was generated by the JPA Modeler
 */
package entity;

import converters.LocalDateConverter;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Basic;
import javax.persistence.Convert;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Taleb
 */
@Embeddable
public class InfoPersonnel implements Serializable {

    public InfoPersonnel() {
    }

    public InfoPersonnel(String nom, String prenom, String adresse, String tel, boolean sexe, LocalDate date_naissance) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.tel = tel;
        this.sexe = sexe;
        this.date_naissance = date_naissance;
    }

    
    
    public boolean equals(InfoPersonnel o) {
        return this.toString().equals(o.toString());

    }

    @Override
    public String toString() {
        return "InfoPersonnel{" + "nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", tel=" + tel + ", sexe=" + sexe + ", date_naissance=" + date_naissance + '}';
    }

    @Basic
    private String nom;

    @Basic
    private String prenom;

    @Basic
    private String adresse;

    @Basic
    private String tel;

    @Basic
    private boolean sexe;

    @Basic
    @Temporal(TemporalType.DATE)
    @Convert(converter = LocalDateConverter.class)
    private LocalDate date_naissance;

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public boolean isSexe() {
        return this.sexe;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public LocalDate getDate_naissance() {
        return this.date_naissance;
    }

    public void setDate_naissance(LocalDate date_naissance) {
        this.date_naissance = date_naissance;
    }

}
