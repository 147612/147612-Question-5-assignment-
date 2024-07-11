/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairyfamerspayment;

import java.util.LinkedList;
public class FarmerLinkedList {
    private final LinkedList<Farmer> farmers;

    FarmerLinkedList() {
        this.farmers = new LinkedList<>();
    }

    void addFarmer(Farmer farmer) {
        this.farmers.add(farmer);
    }

    Farmer getFarmer(int index) {
        return (index >= 0 && index < this.farmers.size()) ? this.farmers.get(index) : null;
    }

    int size() {
        return this.farmers.size();
    
}
}
