package pertemuan4;

import pertemuan4.kendaraan.Kendaraan;

/**
 *
 * @author Fauzan Abdurrahman
 */
public class Main {
    public static void main(String[] args) {
        Kendaraan becak = new Kendaraan();

        becak.setJumlahRoda(2);
        becak.setWarna("Rose Gold");
        becak.setMerek("Honda");
        becak.maju();
    }
}
