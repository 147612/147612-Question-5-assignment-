/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairyfamerspayment;

import java.util.Scanner;
public class DairyFamersPayment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner scanner = new Scanner(System.in)) {
            FarmerLinkedList farmerList = new FarmerLinkedList();
            FarmerQueue paymentQueue = new FarmerQueue();
            double pricePerLiter = 0.5; // Example price per liter
            
            // Example data
            farmerList.addFarmer(new Farmer(1, "John Doe", 100));
            farmerList.addFarmer(new Farmer(2, "Jane Smith", 150));
            farmerList.addFarmer(new Farmer(3, "Bob Johnson", 200));
            
            // Enqueue farmers for payment
            for (int i = 0; i < farmerList.size(); i++) {
                Farmer farmer = farmerList.getFarmer(i);
                paymentQueue.enqueue(farmer);
            }
            
            // Process payments
            System.out.println("Processing payments...");
            while (!paymentQueue.isEmpty()) {
                Farmer farmer = paymentQueue.dequeue();
                if (farmer != null) {
                    farmer.calculatePayment(pricePerLiter);
                    System.out.println("Farmer ID: " + farmer.id + ", Name: " + farmer.name + ", Payment: $" + farmer.payment);
                }
            }
        }
    }
}
    
    

