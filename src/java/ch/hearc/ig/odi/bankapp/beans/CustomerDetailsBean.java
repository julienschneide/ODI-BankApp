/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.bankapp.beans;

import ch.hearc.ig.odi.bankapp.business.Account;
import ch.hearc.ig.odi.bankapp.business.Customer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
@ManagedBean (name = "CustomerDetailsBean")
@RequestScoped
public class CustomerDetailsBean implements Serializable{
    
    Customer customer;

    /**
     * Creates a new instance of CustomerDetailsBean
     */
    public CustomerDetailsBean() {
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    

    
}
