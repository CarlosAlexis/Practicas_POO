/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract7;

/**
 *
 * @author Carlitoos
 */
public class Eva1_pract7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor = 5;
        String cade = "Hola";
        Prueba obj = new Prueba();
        
        System.out.println("Valor = " + valor);
        System.out.println("Cadena = " + cade);
        System.out.println("Objeto = " + obj);
    }
    
}


class Prueba {
    public void saludar(){
        System.out.println("Hola mundo");
    }
}