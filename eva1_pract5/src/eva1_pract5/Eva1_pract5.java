/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract5;

/**
 *
 * @author Carlitoos
 */
public class Eva1_pract5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    
    computadora comp1 = new computadora();
    
    comp1.setAño(2015);
    comp1.setMarca("HP");
    comp1.setPrecio(13000.00);
    comp1.setProce("AMD RYZEN");
    comp1.setVerWin(11);
    
    System.out.println("Año: " + comp1.getAño());
    System.out.println("Marca: " + comp1.getMarca()); 
    System.out.println("Procesador: " + comp1.getProce());
    System.out.println("Precio NETO: $" + comp1.getPrecio());
    System.out.println("Versión de windows: " + comp1.getVerWin());
    System.out.println("Precio total: &" + (comp1.getPrecio() + comp1.getPrecio() * 0.16));
    }  
}

class computadora {
private String marca;
private String proce;
private int año;
private int vWindows;
private double precio;


//Marca

public void setMarca (String valor){
        marca = valor;
    }
    public String getMarca(){
        return marca;
    }

//Tarjeta gráfica
    
public void setProce (String valor){
        proce = valor;
    }
    public String getProce(){
        return proce;
    }

//Año
public void setAño (int valor){
        año = valor;
    }
    public int getAño(){
        return año;
    }

//Version de Windows
public void setVerWin (int valor){
        vWindows = valor;
    }
    public int getVerWin(){
        return vWindows;
    }
    
//Precio
public void setPrecio (double valor){
        precio = valor;
    }
    public double getPrecio(){
        return precio;
    }
}
