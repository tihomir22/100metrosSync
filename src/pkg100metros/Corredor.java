/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100metros;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sportak
 */
public class Corredor extends Thread {

    private int numDorsal;
    private long velocidad;
    private Carrera car;

    @Override
    public void run() {
        while (true) {
            if (this.car.isTriggerStart() == true) {
                System.out.println("El corredor " + this.getName() + " empieza a correr");
                break;
            }
        }
        try {
            Thread.sleep((long) this.velocidad);
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.car.getListaCorredores().add(this);
        System.out.println("He terminado " + this.getName() + " " + (long) System.currentTimeMillis());
    }

    public Corredor(int numDorsal, Carrera car) {
        this.setName("corredor" + numDorsal);
        this.numDorsal=numDorsal;
        this.velocidad = (long) ((Math.random() * ((11000 - 9000) + 1)) + 9000);
        this.car = car;
    }

    public int getNumDorsal() {
        return numDorsal;
    }

    public void setNumDorsal(int numDorsal) {
        this.numDorsal = numDorsal;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(long velocidad) {
        this.velocidad = velocidad;
    }

    public Carrera getCar() {
        return car;
    }

    public void setCar(Carrera car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Corredor{" + "numDorsal=" + numDorsal + ", velocidad=" + velocidad + ", car=" + car + '}';
    }

}
