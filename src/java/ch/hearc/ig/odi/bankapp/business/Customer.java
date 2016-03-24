// Auteur : Julien Schneider
// Version : 1.1

package ch.hearc.ig.odi.bankapp.business;

import java.util.ArrayList;
import java.util.List;


public abstract class Customer {

	private int number;
        private List<Account> accounts;
	/**
	 * 
	 * @param number
	 */
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