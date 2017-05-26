/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Antonio
 */
public class Session {
    
    @RequestMapping(value = "/login")
    public ModelAndView login(ModelMap model, HttpServletRequest request) {
        if(request.isUserInRole("ROLE_ADMIN")){
            return new ModelAndView("AdministradorIH",model);
        }else if(request.isUserInRole("ROLE_USER")){
            return new ModelAndView("perfil",model);
        }
        return new ModelAndView("inicio",model);
    }
    
}
