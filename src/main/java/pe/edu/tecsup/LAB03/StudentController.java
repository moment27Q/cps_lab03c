package pe.edu.tecsup.LAB03;

public class StudentController {

    // 👤 Usuario 1: Inicializar datos
    public String initStudents() {
        return "Estudiantes inicializados ✅";
    }

    // 👤 Usuario 3: Buscar por ID
    public String getStudentById(int id) {
        return "Mostrando estudiante con ID: " + id;
    }
}
