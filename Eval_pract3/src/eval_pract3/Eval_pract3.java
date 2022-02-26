/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_pract3;

/**
 *
 * @author Carlitoos
 */
public class Eval_pract3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona per1 = new persona();
        per1.setId("11223344");
        per1.setEdad(20);
        per1.setNombre("Pedro");
        System.out.println("El nombre del alumno es: " + per1.getNombre());
        System.out.println("El id del alumno es: " + per1.getId());
        System.out.println("La edad del alumno es de: " + per1.getEdad() + " años");
        
    }
    
}
class persona{
private String id;
private String nombre;
private int edad;


//Para leer y modificar los atributos se utiliza el método de lectura y escirtura

//escribir = get    

public String getId (){
    
    return id;
}

public String getNombre (){
    
    return nombre;
}

public int getEdad () {
    
    return edad;
} 

//asignar = set

public void setId (String valor){
    
    id = valor;
}

public void setNombre (String valor){
    
    nombre = valor;
}

public void setEdad (int valor) {  
    edad = valor;
}
}      