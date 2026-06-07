package model;

/**
 * Representa a un empleado de la agencia Llanquihue Tour.
 * Hereda de {@link Persona} (relación is-a) y agrega atributos propios.
 *
 * @author Camila
 * @version 1.0
 */
public class Empleado extends Persona {

    // ATRIBUTOS PRIVADOS PROPIOS DEL EMPLEADO
    private String cargo;

    /**
     * Crea una instancia de Empleado con sus datos personales y laborales.
     */
    public Empleado(String nombre, String apellido, String correo,
                    Direccion direccion, Rut rut,
                    String cargo) {
        super(nombre, apellido, correo, direccion, rut);
        this.cargo        = cargo;
    }

    // Getters y Setters

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Retorna una representación legible del empleado,
     * incluyendo los datos heredados de {@link Persona}.
     */
    @Override
    public String toString() {
        return "Datos Empleado:" +
                "\n  Nombre    : " + getNombre() + " " + getApellido() +
                "\n  " + getRut().toString() +
                "\n  Correo    : " + getCorreo() +
                "\n  Dirección : " + getDireccion().toString() +
                "\n  Cargo     : " + cargo;
    }
}