/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.possystem.user;

/**
 *
 * @author User
 */
public class Checking extends Account{
    
    //now this service charge is like a vat or tax.
    private double serviceCharge=.15;

    public Checking(String name, double balance, double serviceCharge) {
        super(name, balance);
        this.serviceCharge =- serviceCharge; //processing part
        //now it calculates the service charge to the balance
        
        //this.serviceCharge =- balance;
        
        
    }

    public Checking(String name, double serviceCharge) {
        super(name,0); // Default balance for Checking, adjust as needed
        this.serviceCharge = serviceCharge;
    }

    public Checking(Checking check) {
        super(check.getName(), check.getBalance());
        this.serviceCharge = check.serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    @Override
    public String toString() {
        return "Checking{" + "serviceCharge=" + serviceCharge + '}';
    }

    
}
