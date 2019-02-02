package Tugas;

import java.util.*;

/**
 *
 * @author Fauzan Abdurrahman
 */
public class EntryBukuAlamat {
    private String alamat = new String();
    private String nama = new String();
    private String telp = new String();
    private String email = new String();

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTelp() {
        return telp;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void showAll() {
        System.out.println(this.getNama() + " \t " + this.getAlamat() + " \t " + this.getTelp() + " \t " + this.getEmail());
    }
}
