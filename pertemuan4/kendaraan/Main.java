// import Kendaraan;

public class Main {
  //Latihan overloading method
  public static void main(String[] args) {
    // Mobil sedan = new Mobil();
    // Kendaraan motor = new Kendaraan(2, "Honda", "Gold");
    Kendaraan becak = new Kendaraan();

    becak.setJumlahRoda(5);

    // System.out.println("Motor : ");
    // motor.maju();
    becak.maju();

    // System.out.println("Mobil : ");
    // sedan.gas();
    // sedan.start();
    // sedan.gantiGigi(2);
    // sedan.gas();
    // sedan.gantiGigi(3);
    // sedan.gas();
    // sedan.rem();
    // sedan.stop();
    // sedan.gas();
  }
}