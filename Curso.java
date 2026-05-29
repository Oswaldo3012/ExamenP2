import java.util.ArrayList;

public class Curso {
    private int codigo;
    private String nombre;
    private int creditos;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        estudiantes = new ArrayList<>();
    }

    public Curso(int codigo, String nombre, int creditos, Profesor profesor) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        estudiantes = new ArrayList<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    @Override
    public String toString() {
        return "Código: " + codigo +
                ", Nombre: " + nombre +
                ", Créditos: " + creditos +
                ", Profesor: " + profesor.getNombre();
    }
}
