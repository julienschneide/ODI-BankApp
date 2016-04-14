/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.bankapp.presentation;

import ch.hearc.ig.odi.bankapp.business.Customer;
import ch.hearc.ig.odi.bankapp.services.Services;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
@ManagedBean(name = "cList")
@RequestScoped
public class CustomerBean {
    
    private List<Customer> customers = new Services().getCustomers();

    /**
     * Creates a new instance of CustomerBean
     */
    public CustomerBean() {
             
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    
    
}
