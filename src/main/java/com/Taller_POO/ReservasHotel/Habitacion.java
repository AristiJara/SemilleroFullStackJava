package main.java.com.Taller_POO.ReservasHotel;

public class Habitacion {
    private int numero;
    private boolean reservada;
    private Cliente cliente;

    public Habitacion(int numero) {
        this.numero = numero;
        this.reservada = false;
        this.cliente = null;
    }

    public boolean ocupar(Cliente cliente) {
        if (!reservada) {
            this.reservada = true;
            this.cliente = cliente;
            return true;
        }
        return false;
    }

    public void liberar() {
        reservada = false;
        cliente = null;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservada() {
        return reservada;
    }

    public Cliente getOcupante() {
        return cliente;
    }
}
