/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.stmikamikbdg.tugas1;
import java.util.*;

/**
 *
 * @author Fauzan Abdurrahman
 */
public class Main {

    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        
        int x1, y1, r1;
        String cord1;
        
        int x2, y2, r2;
        String cord2;
        
        System.out.print("Masukkan x dan y C1 (x, y) : ");
        cord1 = input.nextLine();
        x1 = Integer.parseInt(cord1.split(",")[0]);
        y1 = Integer.parseInt(cord1.split(",")[1]);
        System.out.print("Masukkan r : ");
        r1 = Integer.parseInt(input.nextLine());
        
        System.out.print("Masukkan x dan y C2 (x, y) : ");
        cord1 = input.nextLine();
        x2 = Integer.parseInt(cord1.split(",")[0]);
        y2 = Integer.parseInt(cord1.split(",")[1]);
        System.out.print("Masukkan r : ");
        r2 = Integer.parseInt(input.nextLine());
        
        System.out.println("\n");
        
        int gap = (int) Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        
        if (gap >= (r1 + r2)) {
            System.out.println("Kedua lingkaran tidak berhubungan");
        } else if (gap < (r1 + r2)) {
            if ((r1 < r2) && 
                    (((x1 + r1 <= x2 + r2) && 
                    (x1 - r1 >= x2 - r2) && 
                    (y1 + r1 <= y2 + r2) && 
                    (y1 - r1 >= y2 - r2)))
            ) {
                System.out.println("Lingkaran 1 berada didalam Lingkaran 2");
            } else if ((r1 > r2) && 
                    (((x1 + r1 >= x2 + r2) && 
                    (x1 - r1 <= x2 - r2) && 
                    (y1 + r1 >= y2 + r2) && 
                    (y1 - r1 <= y2 - r2)))
            ) {
                System.out.println("Lingkaran 2 berada didalam Lingkaran 1");
            } else {
                System.out.println("Kedua lingkaran saling beririsan");
            }
        }
    }
}
