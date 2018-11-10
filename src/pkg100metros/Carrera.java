/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100metros;

import java.util.ArrayList;

/**
 *
 * @author sportak
 */
public class Carrera {

    private boolean triggerStart;
    private ArrayList<Corredor> listaCorredores = new ArrayList<>();

    public Carrera() {
        this.triggerStart = false;
    }

    public void iniciarCarrera() throws InterruptedException {
        System.out.println("Preparados");
        Thread.sleep(1000);
        System.out.println("Listos");
        Thread.sleep(1000);
        System.out.println("Ya!");
        this.triggerStart = true;
    }

    public void mostrarResultado() {
        System.out.println("");
        for (int i = 0; i < this.listaCorredores.size(); i++) {
            System.out.println("El corredor numero " + i + " es " + this.listaCorredores.get(i).toString());
        }
    }

    public synchronized boolean isTriggerStart() {
        return triggerStart;
    }

    public void setTriggerStart(boolean triggerStart) {
        this.triggerStart = triggerStart;
    }

    public ArrayList<Corredor> getListaCorredores() {
        return listaCorredores;
    }

    public void setListaCorredores(ArrayList<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

}
