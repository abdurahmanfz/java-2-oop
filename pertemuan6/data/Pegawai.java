/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.stmikamik.data;

/**
 *
 * @author Fauzan Abdurrahman
 */
public abstract class Pegawai extends Person {

    public Pegawai(String name, String address) {
        super(name, address);
    }
    
    public abstract long getGaji();
    
}
