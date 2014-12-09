/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.cspnet.firstspringmvc.web;

import it.cspnet.firstspringmvc.model.Utente;
import it.cspnet.firstspringmvc.servizi.Servizi;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContext;

/**
 *
 * @author CSP
 */

@Controller
public class LoginController {
    @Autowired
    private Servizi servizi;
    
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String login(@ModelAttribute("utente") Utente utente) {
        return "index";
    }
    
    @RequestMapping(value = "/index", method = RequestMethod.POST) 
    public String login(HttpServletRequest req, @Valid @ModelAttribute("utente") Utente utente, BindingResult result) {
        // logica di login
       if (result.hasErrors()) {
           return "index";
       }
        
       Utente utenteInDb = servizi.login(utente);
       if (utenteInDb != null) {
            req.getSession().setAttribute("utenteindb", utenteInDb);
            return "logged";
       } else {
            RequestContext ctx = new RequestContext(req);
            String messageFromBundle = ctx.getMessage("login.error");
           req.setAttribute("messaggio", messageFromBundle);
           return "index";
       }
    } 

    public void setServizi(Servizi servizi) {
        this.servizi = servizi;
    }
    
    
}
