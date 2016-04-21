// Auteur : Julien Schneider
// Version : 1.1

package ch.hearc.ig.odi.bankapp.business;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int number;
        private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
        private String lastname;
        private List<Account> accounts;
	/**
	 * 
	 * @param number
	 */
	public Customer(int number,String firstname, String lastname) {
            this.number = number;
            this.firstname = firstname;
            this.lastname = lastname;
            accounts = new ArrayList();
	}
       
        public Customer(int number) {
            this.number = number;
            accounts = new ArrayList();
	}

	public int getNumber() {
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {
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

	/**
	 * 
	 * @param account
	 */
	public void addAccount(Account account) {
            accounts.add(account);
	}

}