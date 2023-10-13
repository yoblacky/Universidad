public class Curso extends Programa {
    private int aforo;
    private String nombreCurso;

    public Curso(String nombreDepartamento, int aforo, String nombreCurso) {
        super(nombreDepartamento);
        this.aforo = aforo;
        this.nombreCurso = nombreCurso;
    }

    public int getAforo() {
        return aforo;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }
}
