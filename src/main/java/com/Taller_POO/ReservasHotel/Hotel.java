package main.java.com.Taller_POO.ReservasHotel;
import java.util.ArrayList;
import java.util.List;

public class Hotel {
    private String nombre;
    private List<Habitacion> habitaciones;

    public Hotel(String nombre) {
        this.nombre = nombre;
        this.habitaciones = new ArrayList<>();
    }

    public String getNombre() {
        return this.nombre;
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public List<Habitacion> listarHabitacionesDisponibles() {
        List<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion habitacion : habitaciones) {
            if (!habitacion.isReservada()) {
                disponibles.add(habitacion);
            }
        }
        return disponibles;
    }
}
