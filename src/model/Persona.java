package model;

/**
 * Clase base que representa a cualquier persona vinculada a Llanquihue Tour.
 * Superclase de {@link Empleado}. Contiene composición con {@link Direccion} y {@link Rut}.
 *
 * @author Camila
 * @version 1.0
 */
public class Persona {

    // ATRIBUTOS PRIVADOS
    private String nombre;
    private String apellido;
    private String correo;
    private Direccion direccion;
    private Rut rut;

    /**
     * Crea una instancia de Persona con todos sus datos.
     */
    public Persona(String nombre, String apellido, String correo, Direccion direccion, Rut rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.direccion = direccion;
        this.rut = rut;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Rut getRut() {
        return rut;
    }

    public void setRut(Rut rut) {
        this.rut = rut;
    }

    /**
     * Retorna una representación legible de la persona.
     */
    @Override
    public String toString() {
        return "Datos Personales:" +
                "\n  Nombre    : " + nombre + " " + apellido +
                "\n  " + rut.toString() +
                "\n  Correo    : " + correo +
                "\n  Dirección : " + direccion.toString();
    }
}