package main.java.com.Taller_POO.ReservasHotel;

public class Cliente extends Persona {
    private String nombreEmpresa;

    public Cliente(
        String nombreEmpresa,
        String nombre,
        String documentoIdentidad,
        String numeroDocumentoIdentidad
        ) {
        super(nombre, documentoIdentidad, numeroDocumentoIdentidad);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }
}
