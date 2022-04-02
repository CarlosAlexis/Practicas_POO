/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract13;

/**
 *
 * @author Carlitoos
 */
public class Automovil {
    private String modelo;
    private String marca;
    private int año;
    
    

    public void setMarca(String marca) {
        this.marca = marca;
    }
   
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }
    
}
