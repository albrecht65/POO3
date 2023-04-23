/*
 Crea una clase Alumnos, donde tendrá como Atributos el nombre, apellido, la 
nacionalidad y su fecha de nacimiento. La nacionalidad podrá ser ARGENTINA – 
CHILENA – VENEZOLANA solamente.

 */
package Entidad;

import java.util.Date;

/**
 *
 * @author gabrielaalbrecht
 */
public class Alumnos {
    
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fechaNacimiento;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, String nacionalidad, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
