/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract18;

/**
 *
 * @author Carlitoos
 */
public class Eva1_pract18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Prueba obj=new Prueba();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("Area de un rectangulo de 15*20 "+calcularArea(15,20));
        System.out.println("Area de un rectangulo de 15*20 "+calcularArea(15.0,20.0,1));
        System.out.println("Area de un rectangulo de 15*20 "+calcularArea(15,20.0,1.0));
        System.out.println("Area de un circulo de radio 100 "+calcularArea(100.0));
        System.out.println("Area de un circulo de radio 100 "+calcularArea(100));   
    }
    
    //CALCULA AREA DE RECTANGULO CON 2 PARAMETROS
    public static double calcularArea(double base, double altura){
        return base*altura;
    }
    
    //CALCULA AREA DE TRIANGULO
    public static double calcularArea(double base, double altura, int esTriangulo){
        return (base*altura)/2;
    }
    
    //CALCULA AREA DE TRIANGULO
    public static double calcularArea(int esTriangulo, double base, double altura){
        return (base*altura)/2;
    }
    
    //CALCULA AREA DE UN CIRCULO CON UN DOUBLE
    public static double calcularArea(double radio){
        System.out.println("DOUBLE");
        return Math.PI*Math.pow(radio, 2);
    }
    
    //CALCULAR AREA DE UN CIRCULO CON UN ENTERO
    public static double calcularArea(int radio){
        System.out.println("ENTERO");
        return Math.PI*Math.pow(radio, 2);
    }
    
}

class Prueba{
    
}