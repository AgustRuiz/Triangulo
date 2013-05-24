/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;

/**
 *
 * @author Agustin Ruiz
 */
public class Triangulo {

    double lado1, lado2, lado3;

    public Triangulo() {
        lado1 = lado2 = lado3 = 0;
    }

    public Triangulo(double _lado1, double _lado2, double _lado3) {
        lado1 = _lado1;
        lado2 = _lado2;
        lado3 = _lado3;
    }
    
    public String evaluar(){
        if(!this.esTriangulo()){
            return "No es un triángulo";
        }else{
            if( lado1 == lado2 ){
                if( lado1 == lado3 ){
                    return "Equilátero";
                }else{
                    return "Isósceles";
                }
            }else{ // lado1 != lado2
                if( lado1 == lado3 ){
                    return "Isósceles";
                }else{
                    if( lado2 == lado3 ){
                        return "Isósceles";
                    }else{
                        return "Escaleno";
                    }
                }
            }
        }
    }

    private boolean esTriangulo() {
        double l1, l2, lMax;

        lMax = lado1;
        if (lado2 > lMax) {
            l1 = lMax;
            lMax = lado2;
        } else {
            l1 = lado2;
        }
        if (lado3 > lMax) {
            l2 = lMax;
            lMax = lado3;
        } else {
            l2 = lado3;
        }
        
        if(lMax<l1+l2)
            return true;
        else
            return false;
    }
}
