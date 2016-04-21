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
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */

@ManagedBean(name = "customerBean")
//@Named
@RequestScoped
public class CustomerBean {
    
    @Inject Services services;

    public CustomerBean() {
             
    }
    public List<Customer> getCustomers() {
        return services.getCustomersList();
    }    
    
}
