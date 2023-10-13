public class Personas {
    private String nombre;
    private int edad;
    private int ID;

    public Personas(String nombre, int edad, int ID) {
        this.nombre = nombre;
        this.edad = edad;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
