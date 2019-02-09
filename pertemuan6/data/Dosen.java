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
public class Dosen extends Pegawai {
    private long honor = 0;
    private long tunjangan = 0;

    public Dosen(String name, String address) {
        super(name, address);
    }

    public void setHonor(long honor) {
        this.honor = honor;
    }

    public void setTunjangan(long tunjangan) {
        this.tunjangan = tunjangan;
    }    
    
    @Override
    public long getGaji() {
        return honor + tunjangan;
    }
    
    @Override
    public String getDescription() {
        return super.getName() + " adalah dosen"; //To change body of generated methods, choose Tools | Templates.
    }
}
