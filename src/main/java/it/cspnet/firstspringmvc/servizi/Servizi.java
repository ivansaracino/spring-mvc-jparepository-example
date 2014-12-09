/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.cspnet.firstspringmvc.servizi;

import it.cspnet.firstspringmvc.model.Utente;

/**
 *
 * @author CSP
 */
public interface Servizi {
    public Utente login(Utente utente);
}
