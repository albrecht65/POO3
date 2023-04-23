/*
 *Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá 
contener como atributos, un vector con la palabra a buscar, la cantidad de letras 
encontradas y la cantidad jugadas máximas que puede realizar el usuario
 */
package Entidad;

/**
 *
 * @author gabrielaalbrecht
 */
public class Ahorcado {
  private String[] palabra; // vector palabra a buscar
  private int cantLetras; // cantidad letras encontradas
  private int cantJugadas; // intentos

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int cantLetras, int cantJugadas) {
        this.palabra = palabra;
        this.cantLetras = cantLetras;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getCantLetras() {
        return cantLetras;
    }

    public void setCantLetras(int cantLetras) {
        this.cantLetras = cantLetras;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantLetras=" + cantLetras + ", cantJugadas=" + cantJugadas + '}';
    }
    
}

   
   