package main.java.com.Taller_POO.RegistroAlumnos;
import java.util.ArrayList;

public class SistemaAlumnos {
    
    public ArrayList<Alumno> alumnos;

    public SistemaAlumnos() { 
        alumnos = new ArrayList<Alumno>();
    }

    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void asignarCalificaciones(String nombre, double[] calificaciones) {
         alumnos.forEach(el -> {
            if (el.nombre == nombre) {
                int dimensionAnteriorCalificaciones = el.calificaciones.length;
                int dimensionNuevaCalificaciones = dimensionAnteriorCalificaciones + calificaciones.length;
                double[] nuevoArrayCalificaciones = new double[dimensionNuevaCalificaciones];
                // Copiar las calificaciones antiguas al nuevo array
                System.arraycopy(el.calificaciones, 0, nuevoArrayCalificaciones, 0, dimensionAnteriorCalificaciones);
                // Agregar las nuevas calificaciones al final del nuevo array
                System.arraycopy(calificaciones, 0, nuevoArrayCalificaciones, dimensionAnteriorCalificaciones, calificaciones.length);
                // Asignar el nuevo array de calificaciones al atributo
                el.calificaciones = nuevoArrayCalificaciones;
            }
         });
        
    }

    public double calcularPromedio(Alumno alumno) {
        float promedio = 0;
        for(int i=0; i<alumno.calificaciones.length; i++) {
            promedio += alumno.calificaciones[i];
        }
        return promedio/alumno.calificaciones.length;
    }

    public void mostrarAlumnos() {
        alumnos.forEach(alumno -> {
            System.out.println("\nnombre: " + alumno.nombre);
            System.out.println("edad: " + alumno.edad);
            System.out.println("calificaciones: ");
            for(int i=0; i<alumno.calificaciones.length; i++) {
                System.out.print(" "+alumno.calificaciones[i]);
            }
        });
    }

    public void mostrarCalificaciones(String nombre) {
        alumnos.forEach(alumno -> {
            if (alumno.nombre == nombre) {
                for(int i=0; i<alumno.calificaciones.length; i++) {
                    System.out.print(" "+alumno.calificaciones[i]);
                }
            }
        });
    }
    
}
