/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.possystem.user;

/**
 *
 * @author User
 */
public class Rewards extends Account{
    
    private final String rewards;

    public Rewards(String name, double balance, String rewards) {
        super(name, balance);
        this.rewards = rewards;
    }

    public Rewards(String name, String rewards) {
        super(name, 0); // Default balance for Rewards, adjust as needed
        this.rewards = rewards;
    }

    public Rewards(Rewards reward) {
        super(reward.getName(), reward.getBalance());
        this.rewards = reward.rewards;
    }

    public String getRewards() {
        return rewards;
    }

    @Override
    public String toString() {
        return "Rewards{" + "rewards=" + rewards + '}';
    }
    
}
