// Para practicar la encapsulación:

// Crear clase Persona.

// Crear variables las privadas edad, nombre y telefono de la clase Persona.

// Crear gets y sets de cada propiedad.

// Crear un objeto persona en el main.

// Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.
public class Ejercicio {
    public static void main(String[] args) {
        Persona empleadoUno = new Persona();
        empleadoUno.setNombre("Isai Torres Saucedo");
        empleadoUno.setEdad(38);
        empleadoUno.setTelefono("5544558767");

        System.out.println("Nombre empleado: " + empleadoUno.getNombre());
        System.out.println("Edad del empleado: " + empleadoUno.getEdad());
        System.out.println("Telefono del empleado: " + empleadoUno.getTelefono());
    }
}

/**
 * Persona
 */
class Persona {
    private String nombre;
    private int edad;
    private String telefono;

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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
