/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract16;

/**
 *
 * @author Carlitoos
 */
public class Eva1_pract16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ClaseA objA = new ClaseA();
        ClaseB objB = new ClaseB();
        objA.setValorA(100);
        objB.setValorB(0);

        System.out.println("Valor A " + objA.getValorA());
        System.out.println("Valor B " + objB.getValorB());
    }
    
}

class ClaseA {
    private int valorA;
    
    public int getValorA () {
        return valorA;
        
    }
    public void setValorA(int valorA) {
        this.valorA = valorA;  
    }

}

class ClaseB { 
    private int valorB;
    
    public int getValorB() {
        return valorB;
    }

    public void setValorB(int valorB) {
        this.valorB = valorB;
    }

    

    
    
}