package main.java.com.Taller_POO.ReservasHotel;

public class Reserva {
    public Cliente cliente;
    public Hotel hotel;
    public Habitacion habitacion;

    public Reserva(Cliente cliente, Hotel hotel, Habitacion habitacion) {
        this.cliente = cliente;
        this.hotel = hotel;
        this.habitacion = habitacion;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public void cancelar() {
        habitacion.liberar();
    }
}
