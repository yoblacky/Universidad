public class Alumno extends Personas {
    private double mensualidad;
    private Curso curso = new Curso();

    public Alumno(String nombre, int edad, int ID, double mensualidad, Curso curso) {
        super(nombre, edad, ID);
        this.mensualidad = mensualidad;
        this.curso = curso;
    }

    public double getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(double mensualidad) {
        this.mensualidad = mensualidad;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
