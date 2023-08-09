package main.java.com.Taller_POO.ReservasHotel;

class Persona {
    private String nombre;
    private String documentoIdentidad;
    private String numeroDocumentoIdentidad;

    public Persona(String nombre, String documentoIdentidad, String numeroDocumentoIdentidad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public String getNumeroDocumentoIdentidad() {
        return numeroDocumentoIdentidad;
    }
}
