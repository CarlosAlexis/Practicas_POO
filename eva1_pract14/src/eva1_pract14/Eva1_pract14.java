/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_pract14;

/**
 *
 * @author Carlitoos
 */
public class Eva1_pract14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INSTANCIAR LA CLASE
        /*FormulasMatematicas misFor=new FormulasMatematicas();
        double area=misFor.calcularAreaCirculo(100);
        System.out.println("Area del circulo: "+area);*/
        double area=FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area del circulo: "+area);
        double areaT=FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area de triangulo: "+areaT);
        FormulasMatematicas miObj=new FormulasMatematicas();
        miObj.imprimirMensaje();
    }
    
}

class FormulasMatematicas{
    static int valor=100;
    //AREA CIRCULO:
    public static double calcularAreaCirculo(double radio){
        double area;
        area=3.1416*radio*radio;
        return area;
    }
    public static double calcularAreaTriangulo(double base, double altura){
        double area;
        area=(base*altura)/2;
        return area;
    }
    
    public void  imprimirMensaje(){
        System.out.println("Hola mundo");
    }
}