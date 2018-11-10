/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg100metros;

/**
 *
 * @author sportak
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Carrera carrera = new Carrera();
        Corredor cor1 = new Corredor(1, carrera);
        Corredor cor2 = new Corredor(2, carrera);
        Corredor cor3 = new Corredor(3, carrera);
        Corredor cor4 = new Corredor(4, carrera);
        Corredor cor5 = new Corredor(5, carrera);
        Corredor cor6 = new Corredor(6, carrera);
        Corredor cor7 = new Corredor(7, carrera);
        Corredor cor8 = new Corredor(8, carrera);
        System.out.println(cor1.toString());

        cor1.start();
        cor2.start();
        cor3.start();
        cor4.start();
        cor5.start();
        cor6.start();
        cor7.start();
        cor8.start();
        carrera.iniciarCarrera();
        cor1.join();
        cor2.join();
        cor3.join();
        cor4.join();
        cor5.join();
        cor6.join();
        cor7.join();
        cor8.join();
       
        carrera.mostrarResultado();

    }

}
