import java.util.*;

public class nilaiTerbesar {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double satu, dua, tiga, maxValue;
    System.out.print("number 1 = ");
    satu = input.nextDouble();
    System.out.print("number 2 = ");
    dua = input.nextDouble();
    System.out.print("number 3 = ");
    tiga = input.nextDouble();

    double maxValueTemp = satu > dua? satu:dua;
    maxValue = maxValueTemp > tiga? maxValueTemp:tiga; 
    System.out.println("Nilai Tertinggi = "+ maxValue);
  }
}
