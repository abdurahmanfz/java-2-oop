public class Kendaraan {
  private String merek;
  private String warna;
  private int jumlahRoda;

  public String getMerek() {
    return merek;
  }

  public void setMerek(String merek) {
    this.merek = merek;
  }

  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }

  public int getJumlahRoda() {
    return jumlahRoda;
  }

  public void setJumlahRoda(int jumlahRoda) {
    this.jumlahRoda = jumlahRoda;
  }

  protected void maju() {
    System.out.println("Maju dari kendaraan");
    System.out.println(jumlahRoda + " - " + merek + " - " + warna);
  }

  // public Kendaraan(int jumlahRoda, String merek, String warna){
  //   this.jumlahRoda = jumlahRoda;
  //   this.merek = merek;
  //   this.warna = warna;
  // }
}