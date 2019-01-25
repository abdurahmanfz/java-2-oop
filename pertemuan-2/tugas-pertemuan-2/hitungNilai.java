import java.util.*;

public class hitungNilai {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String message;
    System.out.print("Masukkan Nilai (A - E) : ");
    String n = input.next();

    switch (n) {
      case "A":
        message = "Excelent";
      break;

      case "B":
        message = "Good Job!";
      break;

      case "C":
        message = "Study Harder!!!";
      break;
    
      default:
        message = "Sorry, you failed";
      break;
    }

    System.out.println(message);
  }
}