/*
 Crear en el Main dos arreglos. El arreglo A de 50 números reales y el arreglo B
de 20 números reales. Crear la clase ArregloService, en el paquete servicio, 
con los siguientes métodos:

 */
package POOMain;

import Service.ArregloService;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia9Ejer3 {
    public static void main(String[] args) {
        
        double ArregloA[] = new double [50]; 
        double ArregloB[] = new double [20];
        
        ArregloService as = new ArregloService();
        
        as.inicializarA(ArregloA);
        as.mostrar(ArregloA);
        as.ordenar(ArregloA);
        as.inicializarB(ArregloB, ArregloA);
        System.out.println("el arreglo A ");
        as.mostrar(ArregloA);
        System.out.println(" ");
        System.out.println("el arreglo B");
        as.mostrar(ArregloB);
        
        
    }
}
