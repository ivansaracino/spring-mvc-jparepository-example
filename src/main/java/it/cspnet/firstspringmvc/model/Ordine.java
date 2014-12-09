/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.cspnet.firstspringmvc.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.ManyToAny;

/**
 *
 * @author CSP
 */
@Entity
@Table(name = "ORDINI")
public class Ordine implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_ORDINE")
    private int idORdine;
    
    @Column(name = "DATA_ORDINE")
    private Date dataOrdine;
    @Column(name = "VALORE_ORDINE")
    private float valoreOrdine;

    public int getIdORdine() {
        return idORdine;
    }

    public void setIdORdine(int idORdine) {
        this.idORdine = idORdine;
    }

    public Date getDataOrdine() {
        return dataOrdine;
    }

    public void setDataOrdine(Date dataOrdine) {
        this.dataOrdine = dataOrdine;
    }

    public float getValoreOrdine() {
        return valoreOrdine;
    }

    public void setValoreOrdine(float valoreOrdine) {
        this.valoreOrdine = valoreOrdine;
    }
    
    @ManyToOne
    private Utente utente;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.idORdine;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ordine other = (Ordine) obj;
        if (this.idORdine != other.idORdine) {
            return false;
        }
        return true;
    }

    public Utente getUtente() {
        return utente;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }
    
    
}
