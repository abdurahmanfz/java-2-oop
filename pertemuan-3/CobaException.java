import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CobaException {
  public static void main(String[] args) /* throws FileNotFoundException, IOException */{
    String s1 = "ini sama ga?", s2, s3;
    s2 = s1;
    s3 = new String(s1);

    System.out.println("======== pake '==' =========================");
    if (s1 == s2) {
      System.out.println("objeknya sama. isinya "+s1+" dan "+s2);
    } else {
      System.out.println("objeknya beda. isinya "+s1+" dan "+s2);
    }
    System.out.println("======== pake equals() =========================");
    if (s1.equals(s2)) {
      System.out.println("objeknya sama. isinya "+s1+" dan "+s2);
    } else {
      System.out.println("objeknya beda. isinya "+s1+" dan "+s2);
    }

    System.out.println("======== pake '==' objek baru ==================");
    if (s1 == s3) {
      System.out.println("objeknya sama. isinya "+s1+" dan "+s2);
    } else {
      System.out.println("objeknya beda. isinya "+s1+" dan "+s2);
    }
    System.out.println("======== pake equals() objek baru ==============");
    if (s1.equals(s3)) {
      System.out.println("objeknya sama. isinya "+s1+" dan "+s3);
    } else {
      System.out.println("objeknya beda. isinya "+s1+" dan "+s3);
    }
  }
}