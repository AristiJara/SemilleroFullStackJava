import java.util.Scanner;
import main.java.com.Taller_POO.Conversor.ConversorMoneda;

public class Convertidor {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        int opc;
        double dinero;
        do{
            System.out.println("\nBienvenido al Convertidor:");
            System.out.println("Ingrese cantidad de dinero:");
            dinero = scanner.nextDouble();
            System.out.println("\nMoneda de la cantidad ingresada:");
            System.out.println("1. Pesos");
            System.out.println("2. Dolar");
            System.out.println("3. Euros");
            System.out.println("4. Yen");
            System.out.println("5. Salir");
        
            opc = scanner.nextInt();
        
            switch(opc){
                case 1:
                    ConversorMoneda convertir1 = new ConversorMoneda(dinero);
                    convertir1.convertirPesos();
                    break;
                case 2:
                    ConversorMoneda convertir2 = new ConversorMoneda(dinero);
                    convertir2.convertirDolares();
                    break;
                case 3:
                    ConversorMoneda convertir3 = new ConversorMoneda(dinero);
                    convertir3.convertirEuros();
                    break;
                case 4:
                    ConversorMoneda convertir4 = new ConversorMoneda(dinero);
                    convertir4.convertirYenes();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }while(opc !=5);
    }
}
