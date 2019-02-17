/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.stmikamikbdg.tugas3;

/**
 *
 * @author Fauzan Abdurrahman
 */
public class Manajer extends Employee{
    private String bonus;
    
    public Manajer(String name, String address, String salary) {
        super(name, address, salary);
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public String getSalary() {
        int totalGaji = Integer.parseInt(bonus) + Integer.parseInt(salary);
        return String.valueOf(totalGaji);
    }
    
}
