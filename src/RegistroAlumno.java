import main.java.com.Taller_POO.RegistroAlumnos.Alumno;
import main.java.com.Taller_POO.RegistroAlumnos.SistemaAlumnos;


public class RegistroAlumno {
    public static void main(String[] args) throws Exception {
        double[] calificaciones = {5, 3.5, 3, 2.5, 2.8};
        Alumno alumno1 = new Alumno("Aristides", 23, calificaciones);
        Alumno alumno2 = new Alumno("Enrique", 43, calificaciones);
        SistemaAlumnos sistemaAlumnos1 = new SistemaAlumnos();
        sistemaAlumnos1.agregarAlumno(alumno1);
        sistemaAlumnos1.agregarAlumno(alumno2);
        double promedioCalificaciones = sistemaAlumnos1.calcularPromedio(alumno1);
        double[] nuevasCalificaciones = {4, 5, 4.5};
        sistemaAlumnos1.asignarCalificaciones("Enrique", nuevasCalificaciones);
        sistemaAlumnos1.mostrarAlumnos();
    }
}
