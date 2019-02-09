/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.ac.stmikamik.tugas;

/**
 *
 * @author Fauzan Abdurrahman
 */
public class Circle extends Shape {

    @Override
    public String getName() {
        return "Namanya bentuknya adalah Lingkaran";
    }

    @Override
    public String getArea() {
        return "Area nya adalah phi * diameter";
    }
    
}
