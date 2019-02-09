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
public class Main {
    public static void main(String[] args) {
        Person p = new Student("Budi", "Bandung", "Informatika");
        
        System.out.println("Nama    : " + p.getName());
        System.out.println("Jurusan : " + p.getDescription());
        System.out.println("Alamat  : " + p.getAddress());
        
        Dosen d = new Dosen("Nama dosen, MSi", "Alamatnya dirumah");
        d.setHonor(1000);
        d.setTunjangan(2000);
        
        System.out.println("\nNama Dosen : " + d.getName());
        System.out.println("Alamatnya  : " + d.getAddress());
        System.out.println("Gajinya    : " + d.getGaji());
    }
}
