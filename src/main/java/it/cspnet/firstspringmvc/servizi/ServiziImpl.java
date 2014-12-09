/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.cspnet.firstspringmvc.servizi;

import it.cspnet.firstspringmvc.model.Utente;
import it.cspnet.firstspringmvc.repository.UtenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CSP
 */
@Service("servizi")

public class ServiziImpl implements Servizi{
    
    @Autowired
    private UtenteRepository utenteRepository;

    public void setUtenteRepository(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }
    
    @Override
    public Utente login(Utente utente) {
       return utenteRepository.findOne(utente.getUserName());
    }
    
}
