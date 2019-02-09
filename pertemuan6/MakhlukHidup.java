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
public abstract class MakhlukHidup {
    public void bernapas() {
        System.out.println("Makhluk hidup bernapas...");
    }
    
    public void makan() {
        System.out.println("Makhluk hidup makan...");
    }
    
    //method ini harus diimplementasikan di subclass nya
    public abstract void berjalan();
}
