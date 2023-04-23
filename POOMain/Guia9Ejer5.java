/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Entidad.Persona;
import Service.PersonaService;
import java.util.Date;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia9Ejer5 {
    public static void main(String[] args) {
        
        
        PersonaService ps = new PersonaService();
        // crea fecha actual 
        Date fA = new Date();
        // se guarda en el objeto p los datos para traer los datos de Personas Service.
        Persona p = ps.crearPersona();
        
        int edadCalculada = ps.calcularEdad(p.getFechaNacim(), fA);
        System.out.println("la edad es menor " + ps.menorQue(p, edadCalculada));     
        ps.mostrarPersona();
    }
    

    
}
        

