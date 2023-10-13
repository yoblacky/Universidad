public class Administrador extends Personas {
    private String cargoAdministrativo;

    public Administrador(String nombre, int edad, int ID, String cargoAdministrativo) {
        super(nombre, edad, ID);
        this.cargoAdministrativo = cargoAdministrativo;
    }

    public String getCargoAdministrativo() {
        return cargoAdministrativo;
    }

    public void setCargoAdministrativo(String cargoAdministrativo) {
        this.cargoAdministrativo = cargoAdministrativo;
    }
}
