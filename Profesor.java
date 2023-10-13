public class Profesor extends Personas {
    private double sueldo;
    private Curso curso = new Curso();

    public Profesor(String nombre, int edad, int ID, double sueldo, Curso curso) {
        super(nombre, edad, ID);
        this.sueldo = sueldo;
        this.curso = curso;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
