package app;

import model.Direccion;
import model.Rut;
import model.Persona;
import model.Empleado;

/**
 * Clase principal del sistema de gestión de la agencia Llanquihue Tour.
 * Crea instancias de las clases del dominio y muestra sus datos por consola.
 *
 * @author Camila
 * @version 1.0
 */
public class Main {

    /** Metodo principal. Punto de inicio de la ejecución del programa. */
    public static void main(String[] args) {

        System.out.println("AGENCIA DE TURISMO LLANQUIHUE TOUR");
        System.out.println("           Bienvenido!");
        System.out.println("---------------------------------------------------------");

        // INSTANCIA 1: PERSONA
        Direccion direccionPersona = new Direccion(
                "Av. Compañía de Jesús 2203", "Santiago", "Región Metropolitana"
        );
        Rut rutPersona = new Rut("20141414-1");

        Persona persona1 = new Persona(
                "María Jesús", "Astudillo",
                "mjesusastudillo@gmail.com",
                direccionPersona, rutPersona
        );

        System.out.println(persona1);
        System.out.println();
        System.out.println("---------------------------------------------------------");

        // INSTANCIA 2: EMPLEADO DE LLANQUIHUE TOUR
        Direccion direccionEmpleado1 = new Direccion(
                "Av. Pdte. Manuel Bulnes 4545", "Punta Arenas", "Región de Magallanes"
        );
        Rut rutEmpleado1 = new Rut("19212121-2");

        Empleado empleado1 = new Empleado(
                "Nicolás", "Sandoval",
                "nicolassandoval@llanquihuetour.cl",
                direccionEmpleado1, rutEmpleado1,
                "Guía Turístico"
        );

        System.out.println(empleado1);
        System.out.println();
        System.out.println("---------------------------------------------------------");

        // INSTANCIA 3: SEGUNDO EMPLEADO DE LLANQUIHUE TOUR
        Direccion direccionEmpleado2 = new Direccion(
                "Calle Benavente 657", "Puerto Montt", "Región de Los Lagos"
        );
        Rut rutEmpleado2 = new Rut("17171717-7");

        Empleado empleado2 = new Empleado(
                "Ivette", "Rodriguez",
                "ivetterodriguez@llanquihuetour.cl",
                direccionEmpleado2, rutEmpleado2,
                "Conductora de Van"
        );

        System.out.println(empleado2);
        System.out.println();
        System.out.println("---------------------------------------------------------");

        // VALIDACIÓN: RUT CON FORMATO INVÁLIDO
        try {
            Rut rutInvalido = new Rut("1-81818181");
        } catch (IllegalArgumentException e) {
            System.out.println("[ERROR AL INGRESAR EL RUT] " + e.getMessage());
        }

        System.out.println("---------------------------------------------------------");
        System.out.println();
        System.out.println("Gracias por preferir la Agencia Llanquihue Tour. Hasta pronto!");
    }
}