/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.bankapp.business;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author silvio.gutierre
 */
public class Bank {
    
    private int number;
    private String name;
    private List<Customer> customers;
    private List<Account> accounts;
    
    public Bank(int number, String name){
        this.number = number;
        this.name = name;
        customers = new ArrayList();
        accounts = new ArrayList();
    }
    
    public Account getAccountByNumber(String number){
        Account r_account = null;
        boolean found = false;
        int i = 0;
        while(i<accounts.size() && !found){
            if(accounts.get(i).getNumber().equals(number)){
                r_account = accounts.get(i);
                found = true;
            }
            i++;
        }
        return r_account;
    }
    
    public Customer getCustomerByNumber(int number){
        Customer r_customer = null;
        boolean found = false;
        int i = 0;
        while(i<customers.size() && !found){
            if(customers.get(i).getNumber() == number){
                r_customer = customers.get(i);
                found = true;
            }
            i++;
        }                
        return r_customer;
    }
    
    
    
    public void addCompany(String phone, String fax, int number, String companyName){
        customers.add(new Company(phone,fax,number,companyName));
    }
    
    public void addIndividual(int number, String fn, String ln,Date birthDate, String email){
        customers.add(new Individual(number, fn, ln, birthDate, email));
    }
    
    public void addAccount(String number, String name, double rate, Customer customer){
        Account n_account = new Account(number,name,rate,customer);
        accounts.add(n_account);
        customer.addAccount(n_account);
    }

    public Customer addCustomer(int i, String firstname, String lastname) {
        Customer temp = new Customer(i, firstname, lastname);
        customers.add(temp);
        return temp;
    }

    public List getCustomers() {
        return customers;
    }
    
}
