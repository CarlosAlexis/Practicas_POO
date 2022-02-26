/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eval1_prac4;

/**
 *
 * @author Carlitoos
 */
public class Eval1_prac4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        automovil carro1 = new automovil ();
        carro1.setModelo("Mustang");
        System.out.println("El modelo del auto es " + carro1.getModelo());
        carro1.setAño(1967);
        System.out.println("El año de lanzamiento del auto fue: " + carro1.getAño());
        carro1.setColor("Gris");
        System.out.println("El color del auto es: " + carro1.getColor());
        carro1.setMarca("Ford");
        System.out.println("La marca que lanzó el carro fue: " + carro1.getMarca());
    }
    
}

class automovil {

    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;
    
    
    //MARCA
    public void setMarca (String valor){
        marca = valor;
    }
    public String getMarca(){
        return marca;
    }
    
    //MODELO
    public void setModelo (String valor){
        modelo = valor;
    }
    public String getModelo(){
        return modelo;
    }
    
    //TIPO
    public void setTipo (String valor){
        tipo = valor;
    }
    public String getTipo(){
        return tipo;
    }
    
    //AÑO
    public void setAño (int valor){
        año = valor;
    }
    public int getAño(){
        return año;
    }
    
    //COLOR
    public void setColor (String valor){
        color = valor;
    }
    public String getColor(){
        return color;
    }
    
    //PRECIO
    public void setPrecio (double valor){
        precio = valor;
    }
     public double getPrecio(){
        return precio;
    }
}