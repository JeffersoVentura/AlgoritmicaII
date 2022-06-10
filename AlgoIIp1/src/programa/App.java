/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import Modelo.Alumno;
import Modelo.AlumnoArreglo;

/**
 *
 * @author OCA-UIE
 */
public class App {
    
    public static void main(String[] args) {
        AlumnoArreglo alumnos = new AlumnoArreglo(5);
        Alumno alumno = new Alumno("1900200", "Juan Perez");
        if (alumno.calcularPromedio(12.5f, 14.7f)){
            System.out.println(alumno);
        }else{
            System.out.println("No se han ingresado notas validas");
        }
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println(alumnos.agregar(alumno));
        System.out.println("Imprimiendo los alumnos del arreglo");
        System.out.println(alumnos);
        
    }
}
