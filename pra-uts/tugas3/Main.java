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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manajer boss = new Manajer("Budiman", "Jl. Banda", "18000000");
        Staff staff1 = new Staff("Ahmad", "Cikutra Baru", "5500000");
        Staff staff2 = new Staff("Mulyati", "Cidurian Selatan", "4500000");
        
        boss.setBonus("8000000");
        System.out.println("Nama    : " + boss.getName());
        System.out.println("Alamat  : " + boss.getAddress());
        System.out.println("Gaji    : " + boss.getSalary());
        
        System.out.println("=========================================");
        System.out.println("Nama    : " + staff1.getName());
        System.out.println("Alamat  : " + staff1.getAddress());
        System.out.println("Gaji    : " + staff1.getSalary());
        
        System.out.println("=========================================");
        System.out.println("Nama    : " + staff2.getName());
        System.out.println("Alamat  : " + staff2.getAddress());
        System.out.println("Gaji    : " + staff2.getSalary());
        
    }
    
}
