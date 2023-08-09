package main.java.com.Taller_POO.Conversor;

public class ConversorMoneda {
    public double cantidad;

    public ConversorMoneda(double cantidad) {
        this.cantidad = cantidad;
    }

    public void convertirPesos() {
        double conversion;
        conversion = cantidad*0.00025;
        System.out.println("Pesos a Dolar es: "+conversion);
        conversion = cantidad*0.00023;
        System.out.println("Pesos a Euros es: "+conversion);
        conversion = cantidad*0.036;
        System.out.println("Pesos a Yenes es: "+conversion);
    }

    public void convertirDolares() {
        double conversion;
        conversion = cantidad*4051.22;
        System.out.println("Dolar a Pesos es: "+conversion);
        conversion = cantidad*0.91;
        System.out.println("Dolar a Euros es: "+conversion);
        conversion = cantidad*143.30;
        System.out.println("Dolar a Yenes es: "+conversion);
    }

    public void convertirEuros() {
        double conversion;
        conversion = cantidad*4441.56;
        System.out.println("Euros a Pesos es: "+conversion);
        conversion = cantidad*1.10;
        System.out.println("Euros a Dolares es: "+conversion);
        conversion = cantidad*157.14;
        System.out.println("Euros a Yenes es: "+conversion);
    }

    public void convertirYenes() {
        double conversion;
        conversion = cantidad*28.26;
        System.out.println("Yenes a Pesos es: "+conversion);
        conversion = cantidad*0.0070;
        System.out.println("Yenes a Dolares es: "+conversion);
        conversion = cantidad*0.0064;
        System.out.println("Yenes a Euros es: "+conversion);
    }
}
