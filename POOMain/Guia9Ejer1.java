/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Cadena;
import Service.CadenaService;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia9Ejer1 {
    public static void main(String[] args) {
        // variable es un del tipo cadena y guarda todo lo que tenga la clase
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        String letra; 
        String frase1;
        String caracter;
        Cadena cadenabis;
        
        CadenaService cads = new CadenaService();
        cadenabis = cads.ingresarFrase();
        System.out.println(cadenabis.toString());
        cads.mostrarVocales(cadenabis);
        cads.invertirFrase(cadenabis);
        System.out.println(" ");
        
        System.out.println("Ingrese la letra a buscar");
        letra = sc.next();
        cads.vecesRepetido(cadenabis, letra);
        
        System.out.println("Ingrese otra frase");
        frase1 = sc.next();
        cads.compararLongitud(cadenabis, frase1);
    
        cads.unirFrases(cadenabis, frase1);
        
        System.out.println("Ingrese caracter a reemplazar");
        caracter = sc.next();
        
        cads.reemplazar(cadenabis, caracter);
        
        System.out.println("Ingrese una letra para saber si la frase la contiene");
        letra = sc.next();
        System.out.println(cads.contiene(cadenabis, letra));
        
        
}       
    
}
