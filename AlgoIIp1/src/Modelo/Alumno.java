/*
Dada la clase Alumno, con los atributos:código, nombre, promedio final. Definir un arreglo
de alumnos en una clase con 
métodos, para permitir: ingresar y agregar por código cuando éste
no existe, además mostrar los alumnos ingresados
 */
package Modelo;

public class Alumno {
    private String codigo;
    private String nombre; 
    private float promedio;

    public Alumno(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    
    public boolean calcularPromedio(float notaparcial, float notafinal) {
        boolean result = false;
        if (notaparcial > 0.0 && notafinal >0.0){
            this.promedio = (notaparcial + notafinal)/2;
            result = true;
        } 
        return result;
    }

    @Override
    public String toString() {
        return  codigo +'\t'+nombre + '\t'+promedio +'\n';
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    
    
    
}
