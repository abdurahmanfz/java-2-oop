public class CobaOverloading {
  //coba overloading method
  public void print() {
    System.out.println("Kosong");
  }

  public void print(double eGrade, double mGrade, double sGrade) {
    // System.out.println("Name\t\t\t: "+ name);
    System.out.println("Math Grade\t\t: "+ mGrade);
    System.out.println("English Grade\t: "+ eGrade);
    System.out.println("Science Grade\t: "+ sGrade);
  }
}