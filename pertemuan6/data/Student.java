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
public class Student extends Person{
    private String jurusan;

    public Student(String jurusan, String name, String address) {
        super(name, address);
        this.jurusan = jurusan;
    }

    @Override
    public String getDescription() {
        return "Mahasiswa jurusan " + jurusan;
    }
}
