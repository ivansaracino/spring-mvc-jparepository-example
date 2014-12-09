/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.cspnet.firstspringmvc.repository;

import it.cspnet.firstspringmvc.model.Utente;
import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CSP
 */
@Repository("utenteRepository")
public interface UtenteRepository extends JpaRepository<Utente, String>{
    
}
