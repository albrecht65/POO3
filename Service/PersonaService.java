/*
 Crear una clase PersonaService, en el paquete servicio, con los siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona 
a crear. Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de 
fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si 
la persona es menor que la edad consultada o false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
package Service;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class PersonaService {
    Scanner sc = new Scanner(System.in);
    
   Persona p = new Persona ();
    
    public Persona crearPersona(){
        System.out.println("ingrese el nombre del usuario");
        p.setNombre(sc.nextLine());
        System.out.println("ingrese la fecha nacimiento : dia/mm/yyyy");
        int dia = sc.nextInt();
        int mes = sc.nextInt();
        int anio = sc.nextInt();
        Date fechaNac = new Date(anio-1900, mes-1, dia);
        p.setFechaNacim(fechaNac);
        return p;
        
    }
    public int calcularEdad(Date fN, Date fechaActual){
       //al metodo calcularEdad se le pasan parámetros
     //para calcualar la edad, en este caso edadNac y fa (fecha actcual)   
        int edadNac = fN.getYear();
        int fa = fechaActual.getYear();
        int edad = fa -edadNac;
        System.out.println("La edad de la persona es: " + edad);
        return edad;
        
        
    }
    
    public boolean menorQue(Persona p, int edad){
        System.out.println("Ingrese la edad a consultar");
        int edadConsultada = sc.nextInt();
        return edadConsultada < edad;
        // en vez de usar return el IDE sugirio esta linea
    }
    
    public void mostrarPersona(){
        System.out.println("los datos de la persona son "+p.toString());    
        
    }
    
    
}
