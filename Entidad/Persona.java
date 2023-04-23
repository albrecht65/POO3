/*
 Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre 
y una fecha de nacimiento (Tipo Date), constructor vacío, constructor parametrizado, 
get y set. 
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author gabrielaalbrecht
 */
public class Persona {
    private String nombre;
    private Date fechaNacim;

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacim) {
        this.nombre = nombre;
        this.fechaNacim = fechaNacim;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacim() {
        return fechaNacim;
    }

    public void setFechaNacim(Date fechaNacim) {
        this.fechaNacim = fechaNacim;
    }

    


    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", fechaNacim=" + fechaNacim + '}';
    }

    
    
}
