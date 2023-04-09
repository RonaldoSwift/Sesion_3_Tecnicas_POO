/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructores;

/**
 *
 * @author La Clave
 */
public class Empleado {
    private String nombre;
    private int edad;
    private String departamento;
    
public Empleado(
    String nombre, 
    int edad,
    String departamento){
        
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }
    
//PATRON FACTORI
/*Metodo statico que me va a permitir tener un empleado en base
a otro utilizando su constructor*/
//Patrones de diseño de constructores
public static Empleado copiaEmpleado(Empleado empleadoOld){
        return new Empleado(
                empleadoOld.getNombre(),
                empleadoOld.getEdad(),
                empleadoOld.getDepartamento()
        );
    }

public String getNombre() {
        return nombre;
    }

public void setNombre(String nombre) {
        this.nombre = nombre;
    }

public int getEdad() {
        return edad;
    }

public void setEdad(int edad) {
        this.edad = edad;
    }

public String getDepartamento() {
        return departamento;
    }

public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
public String getTextoImprimir(){
        return "Nombre:"
                + this.nombre
                +"\nEdad: "
                + getEdadComoTexto()
                +"\nDepartamento: "
                +this.departamento
                +"\n-------------";
    }
    
public String getEdadComoTexto(){
        String edadTexto = Constructores.convertirATexto(edad);
        return edadTexto;
    }
    
    
}
