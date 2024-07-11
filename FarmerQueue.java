/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dairyfamerspayment;

import java.util.LinkedList;
public class FarmerQueue {
    private final LinkedList<Farmer> queue;

    FarmerQueue() {
        this.queue = new LinkedList<>();
    }

    void enqueue(Farmer farmer) {
        this.queue.addLast(farmer);
    }

    Farmer dequeue() {
        return this.queue.isEmpty() ? null : this.queue.removeFirst();
    }

    boolean isEmpty() {
        return this.queue.isEmpty();
    }
    
}
