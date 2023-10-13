public class Programa extends Departamentos{
    private int nPrograma;

    public Programa(String nombreDepartamento, int nPrograma) {
        super(nombreDepartamento);
        this.nPrograma = nPrograma;
    }

    public int getnPrograma() {
        return nPrograma;
    }

    public void setnPrograma(int nPrograma) {
        this.nPrograma = nPrograma;
    }
}
