public class Main {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("Carlos", 20, 1001, 8.5, "Activo");
        Estudiante e2 = new Estudiante("Ana", 22, 1002, 9.2, "Activo");
        Estudiante e3 = new Estudiante("Luis", 21, 1003, 7.8, "No Activo");

        Profesor p1 = new Profesor("Pedro", 45, "Sistemas", 1200, "Activo");
        Profesor p2 = new Profesor("Maria", 39, "Matemáticas", 1500, "Activo");
        Profesor p3 = new Profesor("José", 50, "Física", 1800, "No Activo");

        Curso c1 = new Curso(1, "POO", 5, p1);
        Curso c2 = new Curso(2, "Cálculo", 4, p2);
        Curso c3 = new Curso(3, "Física", 3, p3);

        c1.agregarEstudiante(e1);
        c1.agregarEstudiante(e2);

        c2.agregarEstudiante(e2);
        c2.agregarEstudiante(e3);

        c3.agregarEstudiante(e1);
        c3.agregarEstudiante(e3);

        p1.agregarCurso(c1);
        p2.agregarCurso(c2);
        p3.agregarCurso(c3);

        System.out.println("=== CURSOS ===");
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println("\n=== PROFESORES ===");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("\n=== ESTUDIANTES ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
