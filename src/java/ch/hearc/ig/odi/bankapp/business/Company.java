/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hearc.ig.odi.bankapp.business;

/**
 *
 * @author silvio.gutierre
 */
public class Company extends Customer{
    
    private String companyName;
    private String phone;
    private String fax;

    public Company(int number) {
        super(number);
    }

    public Company(String phone, String fax, int number, String companyName) {
        super(number);
        this.phone = phone;
        this.fax = fax;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    
    
    
}
