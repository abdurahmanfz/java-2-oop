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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        Person p;
        Student siswa = new Student();
        Person person = new Person();
        
        Student siswa1 = new Student("nama", "alamat");
        System.out.println("nama siswa1 " + siswa1.getName());
        System.out.println("nama person " + person.getName());
        System.out.println("\n");
        
        person.setName("Nama person dari Main");
        System.out.println("nama siswa1 " + siswa1.getName());
        System.out.println("nama person " + person.getName());
        System.out.println("-=========================-");
        
        p = new Student();
        p = new Teacher();
    }
    
}
