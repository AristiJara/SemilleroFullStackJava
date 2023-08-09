import java.util.Scanner;

import main.java.com.Taller_POO.Operadores.Calculadora;

public class CalculadoraSimple {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opc;
        float num1,num2;
        do{
            System.out.println("\nBienvenido a Calculadora Simple");
            System.out.println("Ingrese número 1:");
            num1 = scanner.nextFloat();
            System.out.println("Ingrese número 2:");
            num2 = scanner.nextFloat();
            System.out.println("Ingrese la opercación que desea realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
        
            opc = scanner.nextInt();
        
            switch(opc){
                case 1:
                    Calculadora Operacion1 = new Calculadora(num1, num2);
                    Operacion1.suma();
                    break;
                case 2:
                    Calculadora Operacion2 = new Calculadora(num1, num2);
                    Operacion2.resta();
                case 3:
                    Calculadora Operacion3 = new Calculadora(num1, num2);
                    Operacion3.multiplicacion();
                    break;
                case 4:
                    Calculadora Operacion4 = new Calculadora(num1, num2);
                    Operacion4.division();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(opc !=5);
    }
}
