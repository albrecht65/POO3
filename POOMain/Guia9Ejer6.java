/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOMain;

import Service.CursoService;

/**
 *
 * @author gabrielaalbrecht
 */
public class Guia9Ejer6 {
    
    public static void main(String[] args) {
        CursoService curs = new CursoService();
        
       // curs.cargarAlumnos();
        curs.crearCurso();
        curs.calcularGananciaSemanal();
    }
}
