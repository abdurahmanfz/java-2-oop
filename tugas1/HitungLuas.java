// Hitung Luas

public class hitungLuas {
  static int cariLuasPersegiPanjang(int panjang, int lebar) {
    return panjang * lebar;
	}
	
	static int cariLuasLingkaran(int r) {
    return 3.15 * (r * 2);
  }

  public static void main(String[] args) {
    System.out.println("Luas Persegi" + cariLuasPersegiPanjang(5, 3));
    System.out.println("Luas Lingkaran : " + cariLuasLingkaran(4));
  }
}
