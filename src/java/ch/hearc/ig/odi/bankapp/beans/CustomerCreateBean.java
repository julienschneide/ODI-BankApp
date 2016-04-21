/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.bankapp.beans;

import ch.hearc.ig.odi.bankapp.services.Services;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
@ManagedBean(name = "AClient")
@RequestScoped
public class CustomerCreateBean {

    @Inject Services services;
    
    private int number;
    private String firstname;
    private String lastname;
    
    /**
     * Creates a new instance of CustomerCreateBean
     */
    public CustomerCreateBean() {
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstName) {
        this.firstname = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastName) {
        this.lastname = lastName;
    }
    
    public String ajouterClient(){
        services.saveCustomer(this.number, this.firstname, this.lastname);
        return "Success";
    }

}
