/*
Método inicializarA recibe un arreglo por parámetro y lo inicializa con números aleatorios.
Método mostrar recibe un arreglo por parámetro y lo muestra por pantalla.
Método ordenar recibe un arreglo por parámetro y lo ordena de mayor a menor.
Método inicializarB copia los primeros 10 números del arreglo A en el arreglo B. 
Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B, mostrar A y B.

 */
package Service;

import java.util.Arrays;

/**
 *
 * @author gabrielaalbrecht
 */
public class ArregloService {

    public void inicializarA(double ArregloA[]) {
        for (int i = 0; i < ArregloA.length; i++) {
            ArregloA[i] = Math.random() * 30;
        }

    }

    public void mostrar(double ArregloA[]) {
        System.out.println("el contenido del arreglo es " + Arrays.toString(ArregloA));
    }

    public void ordenar(double ArregloA[]) {
        Arrays.sort(ArregloA);
        

    }

    public void inicializarB(double ArregloB[], double ArregloA[]) {

        for (int i = 0; i < 10; i++) {
            ArregloB[i] = ArregloA[i];

        }
        Arrays.fill(ArregloB, 10, 20, 0.5);

    }

}
