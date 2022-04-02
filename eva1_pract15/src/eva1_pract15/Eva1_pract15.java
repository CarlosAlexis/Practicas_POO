/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract15;
import java.util.Scanner;
/**
 *
 * @author Carlitoos
 */
public class Eva1_pract15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Que formula quieres utilizar?");
        System.out.println("1.- Celsius a Fahrenheit");
        System.out.println("2.- Celsius a Kelvin ");
        System.out.println("3.- Fahrenheit a Celsius");
        System.out.println("4.- Fahrenheit a kelvin");
        System.out.println("5.- Kelvin a Celsius");
        System.out.println("6.- Kelvin a Fahrenheit");
        
        byte form =leer.nextByte();
        
        System.out.println("Ingresa el valor a convertir:");
        double temp= leer.nextDouble();
        
        switch(form){
            case 1: FormulasTemp.cel_Fah(temp);
            break;
            case 2: FormulasTemp.cel_Kel(temp);
            break;
            case 3: FormulasTemp.fah_Cel(temp);
            break;
            case 4: FormulasTemp.fah_Kel(temp);
            break;
            case 5: FormulasTemp.kel_Cel(temp);
            break;
            case 6: FormulasTemp.kel_Fah(temp);
            break;
                  }
    }
    
}

class FormulasTemp{
    
     public static void cel_Fah(double valor){
         System.out.println((valor*9/5) + 32);
     }
     
     public static void cel_Kel(double valor){
         System.out.println(valor+273.15);
     }
     
     public static void fah_Cel(double valor){
         System.out.println((valor-32)*5/9);
     }
     
     public static void fah_Kel(double valor){
         System.out.println((((valor-32)*5/9))+273.15);
     }
     
     public static void kel_Cel(double valor){
         System.out.println(valor-273.15);
     }
     
     public static void kel_Fah(double valor){
         System.out.println((((valor-273.15)*9/5))+32);
     }
     
}