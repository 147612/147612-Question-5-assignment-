/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairyfamerspayment;

/**
 *
 * @author sa
 */
public class Farmer {
    int id;
    String name;
    int litersOfMilk;
    double payment;

    Farmer(int id, String name, int litersOfMilk) {
        this.id = id;
        this.name = name;
        this.litersOfMilk = litersOfMilk;
        this.payment = 0;
    }

    void calculatePayment(double pricePerLiter) {
        this.payment = this.litersOfMilk * pricePerLiter;
    }
    
}
