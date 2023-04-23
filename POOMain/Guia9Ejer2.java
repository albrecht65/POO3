/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.ParDeNumeros;
import Service.ParDeNumerosService;







/**
 *
 * @author gabrielaalbrecht
 */
public class Guia9Ejer2 {
    public static void main(String[] args) {
        
// con metodo static con nombre clase.nombre del metodo se accede.
      
        ParDeNumeros pdn = new ParDeNumeros();
        // muestra los numeros
        ParDeNumerosService.mostrarValores(pdn);
        
        // muestra el mayor de los numeros
        System.out.println("el numero mayor es : "+ ParDeNumerosService.devolverMayor(pdn));
        
        // muestra la potencia de los numeros
        ParDeNumerosService.calcularPotencia(pdn);
        
       // muestra la raiz de los numeros
       ParDeNumerosService.calcularRaiz(pdn);
       
    }
}