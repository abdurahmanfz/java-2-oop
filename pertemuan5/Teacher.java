/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan5;

/**
 *
 * @author Fauzan Abdurrahman
 */
public class Teacher extends Person {

    public Teacher(String name, String address) {
        super(name, address);
    }

    public Teacher() {
        System.out.println("=== teacher constructor ===");
    }
    
}
