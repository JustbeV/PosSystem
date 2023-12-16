/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.possystem.user;

import com.possystem.services.Utilities;

/**
 *
 * @author User
 */
public class Account {
    
     private final String name; //customer name
    private final double balance; //customers balance
    
    Utilities uti=new Utilities();
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public Account(Account acc) {
        this.name = acc.name;
        this.balance = acc.balance;
    }
    public Account(){
        this.name="";
        this.balance=0;
    }


    public String getName() {
        return name;
    }

    public int getBalance() {
        return (int) balance;
    }

    @Override
    public String toString() {
        return "Account[" + "name= " + name + ", balance=" + balance + ']';
    }
    
    
}
