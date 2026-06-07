package model;

/**
 * Representa el RUT chileno de una persona.
 * Valida que el formato sea correcto (XXXXXXXX-Y).
 *
 * @author Camila
 * @version 1.0
 */
public class Rut {

    // ATRIBUTO PRIVADO
    private String numero;

    /**
     * Crea un RUT validando su formato.
     * Si el formato es incorrecto lanza {@link IllegalArgumentException}.
     */
    public Rut(String numero) {
        if (!numero.matches("[0-9]+-[0-9kK]")) {
            throw new IllegalArgumentException(
                    "RUT inválido: '" + numero + "'. Inténtelo nuevamente con el formato XXXXXXXX-Y."
            );
        }
        this.numero = numero;
    }

    /**
     * @return El RUT en formato XXXXXXXX-Y.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Retorna una representación legible del RUT.
     */
    @Override
    public String toString() {
        return "RUT: " + numero;
    }
}