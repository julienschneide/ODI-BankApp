/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.bankapp.beans;

import java.util.Locale;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
@ManagedBean
@SessionScoped
public class HomeBean {
    
    private Locale locale = FacesContext.getCurrentInstance().getViewRoot().getLocale();
  
    /**
     * Creates a new instance of HomeBean
     */
    public HomeBean() {
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
    
}
