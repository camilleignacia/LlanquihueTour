package model;

/**
 * Representa la dirección de una persona vinculada a Llanquihue Tour.
 * Se utiliza mediante composición en la clase {@link Persona}.
 *
 * @author Camila
 * @version 1.0
 */
public class Direccion {

    // ATRIBUTOS PRIVADOS
    private String calle;
    private String ciudad;
    private String region;

    /**
     * Crea una dirección con todos sus datos.
     */
    public Direccion(String calle, String ciudad, String region) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
    }

    // GETTERS Y SETTERS (accesores y mutadores)

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Retorna una representación legible de la dirección.
     */
    @Override
    public String toString() {
        return calle + ", " + ciudad + ", " + region;
    }
}