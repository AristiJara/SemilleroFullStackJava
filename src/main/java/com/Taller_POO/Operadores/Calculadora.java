package main.java.com.Taller_POO.Operadores;

public class Calculadora {
    public float numero1;
    public float numero2;

    public Calculadora(float numero1,float numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public void suma() {
        float suma;
        suma = numero1+numero2;
        System.out.println("La suma es: "+suma);
    }

    public void resta() {
        float resta;
        resta = numero1-numero2;
        System.out.println("La resta es: "+resta);
    }

    public void multiplicacion() {
        float multiplicar;
        multiplicar = numero1*numero2;
        System.out.println("La multiplicación es: "+multiplicar);
    }

    public void division() {
        float division;
        division = numero1+numero2;
        System.out.println("La división es: "+division);
    }
    
}
