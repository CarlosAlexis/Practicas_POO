/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract17;

/**
 *
 * @author Carlitoos
 */
public class Eva1_pract17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Persona per1 = new Persona();
        System.out.println("Nombre: " + per1.getNombre());
        System.out.println("Edad: " + per1.getEdad());
        
    }
    
}


class Persona{
    private String nombre;
    private int edad;
    
    
    //CONSTRUCTOR
    public Persona() {
        System.out.println("CREANDO OBJETO...");   
        nombre = "Juan Perez";
        edad = 100;
        System.out.println("PERSONA CREADA CON EXITO");
    }
    
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }
    
    
}