/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.possystem.services;

import com.possystem.user.Account;

/**
 *
 * @author User
 */
public class Utilities {
    
    //if how many he order it will be plus to rewards.
    //example (order * rewards) + qty 
    public static int uti(int qty,int order, int rewards) {
        int serve =  qty;
        
        for (int i = qty; i <= order; i++) {
            serve += rewards;
        }

        return serve;
    }
}
