public class Paciente {

    private int id;
    private String nombreCompleto;

    public Paciente(int id, String nombreCompleto) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
    }

    // Getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    // Método para dar de alta un paciente
    public static void darDeAltaPaciente(int id, String nombreCompleto) {
        Paciente nuevoPaciente = new Paciente(id, nombreCompleto);
        // Aquí se debería implementar la lógica para almacenar al paciente en una base de datos o en otra estructura de datos.
        System.out.println("Se ha dado de alta al paciente: " + nuevoPaciente.getNombreCompleto());
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        darDeAltaPaciente(1, "Juan Perez");
        darDeAltaPaciente(2, "Carlos Gomez");
        darDeAltaPaciente(3, "Ana López");
    }
}
