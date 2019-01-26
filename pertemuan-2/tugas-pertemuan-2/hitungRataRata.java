import java.util.*;

public class HitungRataRata {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan nilai pertama : ");
    double first = input.nextDouble();
    System.out.print("Masukkan nilai kedua : ");
    double second = input.nextDouble();
    System.out.print("Masukkan nilai ketiga : ");
    double third = input.nextDouble();

    double avg = (first + second + third) / 3;
    if (avg >= 60) {
      System.out.println("Nilai rata-rata anda adalah "+avg+" :D !!");
    } else {
      System.out.println("Nilai rata-rata anda adalah "+avg+" :-( !!");
    }
  }
}