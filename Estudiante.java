import java.util.ArrayList;

public class Estudiante extends Persona {
    private int matricula;
    private double promedio;
    private String estado;

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, int matricula, double promedio, String estado) {
        super(nombre, edad);
        this.matricula = matricula;
        this.promedio = promedio;
        this.estado = estado;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Matrícula: " + matricula +
                ", Promedio: " + promedio +
                ", Estado: " + estado;
    }
}
