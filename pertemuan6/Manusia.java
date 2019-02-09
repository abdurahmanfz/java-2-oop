/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.stmikamik;

/**
 *
 * @author Fauzan Abdurrahman
 */
public class Manusia extends MakhlukHidup{
    @Override
    public void berjalan() {
        // implementasi method abstract harus dioverride
        System.out.println("Manusia berjalan dengan dua kaki"); //To change body of generated methods, choose Tools | Templates.
    }    

    @Override
    public void makan() {
        System.out.println("Manusia makan dengan tangan...");
        // super.makan(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
