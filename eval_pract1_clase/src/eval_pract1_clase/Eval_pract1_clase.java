/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval_pract1_clase;

/**
 *
 * @author Carlitoos
 */
public class Eval_pract1_clase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Como crear un pbjeto en Java
        //Instanciacion: crear un objeto
        persona estudiante = new persona();
        estudiante.id = "21550238";
        estudiante.edad = 19;
        estudiante.nombre = "Chimbombin";
        estudiante.imprimirdatos();
        System.out.println("El año de nacimiento del alumno es: " + estudiante.calcularAñoNac());
        
        System.out.println("    ");
        
        persona estudiante2 = new persona ();
        estudiante2.id = "21550508";
        estudiante2.edad = 25;
        estudiante2.nombre = "Ricardo Gutierrez";
        estudiante2.imprimirdatos();
        System.out.println("El año de nacimiento del alumno es: " + estudiante2.calcularAñoNac() );
        
        
    }
     
}
class persona {
   String nombre;
   String id;
   int edad;
   
void imprimirdatos(){
    System.out.println("El nombre del alumno es: " + nombre );
    System.out.println("El id del alumno es: " + id);
    System.out.println("La edad del alumno es: " + edad);
}

int calcularAñoNac(){
    int añoNac   = 2022 - edad;
    return añoNac;
}
 }