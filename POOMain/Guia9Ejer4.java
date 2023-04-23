/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Service.FechaService;
import java.util.Date;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia9Ejer4 {
    public static void main(String[] args) {
        FechaService fs = new FechaService();
        
        Date fecha = fs.fechaNacimiento();
        System.out.println("la fecha de nacimiento es " + fecha);
        
        Date fechaHoy = fs.fechaActual();
        System.out.println("la fecha de hoy es " + fechaHoy);
     
        // 
        fs.diferencia(fechaHoy, fecha);
    }
}
