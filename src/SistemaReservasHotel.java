import main.java.com.Taller_POO.ReservasHotel.Reserva;
import main.java.com.Taller_POO.ReservasHotel.Habitacion;
import main.java.com.Taller_POO.ReservasHotel.Hotel;
import main.java.com.Taller_POO.ReservasHotel.Cliente;

public class SistemaReservasHotel {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Hotel Medellín");
        hotel1.agregarHabitacion(new Habitacion(101));
        hotel1.agregarHabitacion(new Habitacion(102));

        Hotel hotel2 = new Hotel("Hotel Guatapé");
        hotel2.agregarHabitacion(new Habitacion(201));
        hotel2.agregarHabitacion(new Habitacion(202));

        Cliente cliente1 = new Cliente("Empresa A", "Aristides Jaramillo", "cedula", "123456789");
        Cliente cliente2 = new Cliente("Empresa B", "Enrique Golpe", "pasaporte", "1001000");

        Reserva reserva1 = new Reserva(cliente1, hotel1, hotel1.listarHabitacionesDisponibles().get(0));
        reserva1.getHabitacion().ocupar(cliente1);

        Reserva reserva2 = new Reserva(cliente2, hotel2, hotel2.listarHabitacionesDisponibles().get(0));
        reserva2.getHabitacion().ocupar(cliente2);

        Hotel[] hoteles = { hotel1, hotel2 };
        for (Hotel hotel : hoteles) {
            System.out.println("Hotel: " + hotel.getNombre());
            for (Habitacion habitacion : hotel.listarHabitacionesDisponibles()) {
                if (habitacion.isReservada()) {
                    Cliente cliente = habitacion.getOcupante();
                    System.out.println("Habitación " + habitacion.getNumero() + ": " + cliente.getNombre() +
                            " - " + cliente.getTipoDocumentoIdentidad() + cliente.getNumeroDocumentoIdentidad());
                } else {
                    System.out.println("Habitación " + habitacion.getNumero() + ": Disponible");
                }
            }
            System.out.println();
        }
    }
}
