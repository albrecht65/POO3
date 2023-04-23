/*
 Crear los métodos de A – B -M (Alta – Baja – modificación ) que manipulen los 
objetos de este tipo.
 Crear una lista de 20 alumnos (hacer uso del constructor que recibe parámetros , 
para no hacer carga manual de los datos)
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
apellido de forma ascendente.
 Ordenar y mostrar la lista de alumnos ordenados por orden alfabético según su 
nombre de forma descendente.
 Con un alumno especifico (suponiendo que no existen dos alumnos con el mismo 
nombre y apellido), mostrar por pantalla su edad. Considerar, el manejo de fechas, 
utilizando el atributo fecha de nacimiento.
 Crear listas paralelas de Alumnos, según la nacionalidad.
 */
package Service;

import Entidad.Alumnos;
import java.util.ArrayList;

/**
 *
 * @author gabrielaalbrecht
 */
public class AlumnosService {
 
    ArrayList <String> nomina = new ArrayList <>();
    
    
   public void A(){
    nomina.add("Juan");
    nomina.add("Pedro");
    nomina.add("Juana");
    nomina.add("Luis");
    nomina.add("Ricardo");
    nomina.add("Maria");
    nomina.add("Jose");
    nomina.add("Trixie");
    nomina.add("Pablo");
    nomina.add("Agustin");
    nomina.add("Eduardo");
    nomina.add("Pluto");
    nomina.add("Juanpi");
    nomina.add("Luisa");
    nomina.add("Ramon");
    nomina.add("Maria Julia");
    nomina.add("Jose Luis" );
    nomina.add("Tomas");
    nomina.add("Camila");
    nomina.add("Ignacio");
        System.out.println("la lista esta conformada "+nomina);
   }
   public void B(){
       
   }
   
   public void M(){
       
   }
    
}
