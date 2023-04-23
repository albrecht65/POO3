/*
 Método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos 
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información 
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese 
el nombre de cada alumno.
Método crearCurso(): el método crear curso, le pide los valores de los atributos 
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto Curso. 
En este método invocamos al método cargarAlumnos() para asignarle valor al atributo alumnos
Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia 
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas 
por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la 
semana que se repite el encuentro.




 */
package Service;

import Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class CursoService {
   
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Curso cur = new Curso();
    String Alumnos [] = new String[5];
   
    
    public void cargarAlumnos(){
        for (int i = 0; i <cur.getAlumnos().length ; i++) {
           System.out.println("Ingrese el nombre del alumnos");

         Alumnos[i] = sc.next();
        }        
        cur.setAlumnos(Alumnos);
       System.out.println("los alumnos son " + Arrays.toString(Alumnos));
    }

    public void crearCurso(){
//        System.out.println("ingresar el nombre curso");
//        String nombre =sc.nextLine();
//        System.out.println("Ingresar la cantidad de horas por dia");
//        int horasDias =sc.nextInt();
//        System.out.println("Ingresar de dias por semana");
//        int horasSemana = sc.nextInt();
//        System.out.println("Ingresar el turno. T o M");
//        String turno = sc.next();
//        System.out.println("Ingrese el precio por hora");
//        double precioHora = sc.nextDouble();
//        cargarAlumnos();
//        
//        // LLENAR EL VECTOR CON EL OBJETO CURSO. 
//        Curso cur = new Curso(nombre, horasDias, horasSemana, turno,  precioHora,Alumnos);
//        
         //otra opcion. 
        cargarAlumnos();
        System.out.println("ingresar el nombre curso");
        cur.setNombreCurso(sc.next());
        System.out.println("Ingresar la cantidad de horas por dia");
        cur.setCantidadHorasPorDia(sc.nextInt());
        System.out.println("Ingresar de dias por semana");
        cur.setCantidadDiasPorSemana(sc.nextInt());
        System.out.println("Ingresar el turno. T o M");
        cur.setTurno(sc.next());
        System.out.println("Ingrese el precio por hora");
        cur.setPrecioPorHora(sc.nextDouble());
//      
        // muestra datos del curso.
        System.out.println("Los datos del curso son "+ cur.toString());    
        }
//    
    public void calcularGananciaSemanal(){
        
    System.out.println("la ganancia semanal es " + (cur.getCantidadHorasPorDia() * Alumnos.length
            *cur.getPrecioPorHora() * cur.getCantidadDiasPorSemana()));

//} 
}
}

    

