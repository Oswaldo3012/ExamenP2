import java.util.ArrayList;

public class Profesor extends Persona {
    private String departamento;
    private double salario;
    private String estado;
    private ArrayList<Curso> cursos;

    public Profesor() {
        cursos = new ArrayList<>();
    }

    public Profesor(String nombre, int edad, String departamento, double salario, String estado) {
        super(nombre, edad);
        this.departamento = departamento;
        this.salario = salario;
        this.estado = estado;
        cursos = new ArrayList<>();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Departamento: " + departamento +
                ", Salario: " + salario +
                ", Estado: " + estado;
    }
}
