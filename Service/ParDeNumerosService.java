/*
 Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá 
además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase 
elevado al menor número. Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package Service;

import Entidad.ParDeNumeros;


/**
 *
 * @author gabrielaalbrecht
 */
public class ParDeNumerosService {
    // SE TRAE POR PARAMETROS LA CLASE DONDE SE ENCUENTRAN ATRIBUTOS Y SE IMPORTA.
    // NO ES NECESARIO CREAR OBJETO AQUI.
    
    public static void mostrarValores(ParDeNumeros pdn){
        System.out.println("los numeros random son "+pdn.getNum1()  + " " + pdn.getNum2() );
       
    }
    
    public static double devolverMayor(ParDeNumeros pdn){
        return Math.max(pdn.getNum1(), pdn.getNum2());
    }
    
    public static void calcularPotencia(ParDeNumeros pdn){
        double mayor;
        double menor;
        mayor = Math.round(Math.max(pdn.getNum1(), pdn.getNum2()));
        menor = Math.round(Math.min(pdn.getNum1(), pdn.getNum2()));
        //System.out.println(mayor + " "+ menor);
        System.out.println("la potencia de los numeros es " + Math.pow(mayor, menor));
        
    }   
    public static void calcularRaiz(ParDeNumeros pdn){
        // forma de escribir el if. 
        double menor = pdn.getNum1() < pdn.getNum2() ? pdn.getNum1() : pdn.getNum2();
        System.out.println("Opcion 1 la raiz del numero es: " +Math.sqrt(menor));
        // otra modalidad de obtener raiz
        double menor1 = Math.min(pdn.getNum1(), pdn.getNum2());
        System.out.println("Opcion 2la raiz del numero menor es : " + Math.sqrt(menor));
        
    }

    
}
