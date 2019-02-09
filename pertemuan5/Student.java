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
public class Student extends Person {
    public Student() {
        super("Nama dari super", "Alamat dari super");
        System.out.println("Inside Student: Constructor");
    }

    public Student(String name, String address) {
        super(name, address);
    }

    @Override
    public String getName() {
        System.out.println("Override dari student");
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
