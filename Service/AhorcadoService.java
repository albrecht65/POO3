/*
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima. 
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del vector. 
Después ingresa la palabra en el vector, letra por letra, quedando cada letra de
la palabra en un índice del vector. Y también, guarda la cantidad de jugadas 
máximas y el valor que ingresó el usuario.
Método longitud(): muestra la longitud de la palabra que se debe encontrar. 
Nota: buscar como se usa el vector.length.
Método buscar(letra):  este método recibe una letra dada por el usuario y busca 
si la letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
Método encontradas(letra):  que reciba una letra ingresada por el usuario y 
muestre cuantas letras han sido encontradas y cuántas le faltan. Este método 
además deberá devolver true si la letra estaba y false si la letra no estaba, 
ya que, cada vez que se busque una letra que no esté, se le restará uno a sus oportunidades.
Método intentos(): para mostrar cuántas oportunidades le queda al jugador.


 */
package Service;

import Entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gabrielaalbrecht
 */
public class AhorcadoService {

    Scanner sc = new Scanner(System.in);
    Ahorcado ah = new Ahorcado();
    int contJugadas = 0;

    public void crearJuego() {
        String letra;
        System.out.println("Ingrese la palabra");
        String palabra = sc.next();
        System.out.println("la longitud de la palabra es " + longitud(palabra));

        String[] vector1 = new String[palabra.length()];

        System.out.println("Ingrese la cantidad de jugadas");
        ah.setCantJugadas(sc.nextInt());

        // el nuevo vector va alojar la palabra descompuesta
        for (int i = 0; i < longitud(palabra); i++) {
            vector1[i] = palabra.substring(i, i + 1);
        }
        ah.setPalabra(vector1);
        //NO PIDE IMPRESION PERO LO PUSE PARA VER QUE SALGA BIEN
        //System.out.println(Arrays.toString(ah.getPalabra()));

    }

    public int longitud(String palabra) {
        // el parametro del metodo es la palabra que ingrese en crear juego.
        return palabra.length();

    }

    public void buscar() {

        int contador = 0; // cuenta los aciertos
       
        do {
            contJugadas++;
            System.out.println("Ingrese la letra ");
            String letra = sc.next();

            // en vez del do/while se podria usar otro for hasta la cantidad de 
            // intentos.
            boolean bandera = false;
            
            for (int i = 0; i < ah.getPalabra().length; i++) {
                if (letra.equalsIgnoreCase(ah.getPalabra()[i])) {
                    bandera = true;
                   contador++;
                   ah.setCantLetras(contador);
                   
                }
            }
            // el uso del boolean permite que pueda dar distintos mensajes segun
            //corresponda.
            // VER PORQUE UNA VEZ QUE ENTRA AL BANDERA TRUE NO SALE A PESAR QUE LETRA NO COINCIDE
            if (bandera == true) {
                System.out.println("La letra " + letra + "  pertenece a la palabra");
                encontradas(letra);
                intentos(contJugadas);
                
            } else {
                System.out.println("La letra " + letra + " NO pertenece a  la palabra");
                encontradas(letra);
                intentos(contJugadas);
            }

            if (contador == ah.getPalabra().length) {
                System.out.println("Ha encontrado la palabra");
                break;
            }
        } while (ah.getCantJugadas() != contJugadas);

    }

    public void encontradas(String letra) {

        int restantes = ah.getPalabra().length - ah.getCantLetras();
        System.out.println("Numeros de letras (encontradas y faltantes) " + ah.getCantLetras() + "," + restantes);

    }

    public void intentos(int contJugadas) {
        if ((ah.getCantJugadas() - contJugadas) == 0) {
            System.out.println("Lo sentimmos no tiene mas intentos");
        } else {
            System.out.println("ud. tiene " + (ah.getCantJugadas() - contJugadas) + " intentos restantes");
        }
    }

    public void juego() {
        crearJuego();
        buscar();

    }
}
