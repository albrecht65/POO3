/*
 Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, 
en paquete Servicios, que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el 
objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. 
Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia 
de años entre una y otra (edad del usuario).

 */
package Service;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class FechaService {
    
    Scanner sc = new Scanner(System.in);
    
    
    public Date fechaNacimiento(){
        System.out.println("Ingrese el dia su nacimeinto");
        int dia =sc.nextInt();
        System.out.println("Ingrese el mes de su nacimiento");
        int mes = sc.nextInt();
        System.out.println("Ingrese el anio de su nacimiento");
        int anio = sc.nextInt();
        
        Date fecha = new Date(anio-1900, mes-1, dia);
        return fecha;
        
    }


    public Date fechaActual(){
       Date fechaHoy = new Date ();
        return fechaHoy;
    }
    
    public void diferencia(Date fH, Date fN){
        
        System.out.println("la edad es " + (fH.getYear() - fN.getYear()));
    
        
        
    }
}    



