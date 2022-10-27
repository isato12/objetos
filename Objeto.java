public class Objeto {
    public static void main(String[] args) {
        // objeto de coche
        ModeloCoche volkswagenSedan = new ModeloCoche(null, "2", "160", "rojo");
        volkswagenSedan.verInformacion();

        ModeloCoche volkswagenGolf = new ModeloCoche();
        volkswagenGolf.verInformacion();

        // objeto de motocicleta
        ModeloMotocicleta yamahar6 = new ModeloMotocicleta();
        yamahar6.setModelo("Yamaha R6");
        yamahar6.setCilindrada("600");
        yamahar6.setColorMoto("ROjo");
        yamahar6.setVelocidadMax("220");
        System.out.println(yamahar6.getModelo());
        System.out.println(yamahar6.getCilindrada());
        System.out.println(yamahar6.getColorMoto());
        System.out.println(yamahar6.getVelocidadMax());
        

    }
}

/**
 * Coche
 */
class ModeloCoche {
    String modelo;
    String numeroPuertas;
    String velocidadMax;
    String velocidad;
    String colorCoche;

    // constructor que solicita parametros
    public ModeloCoche(String modelo, String numeroPuertas, String velocidadMax, String colorCoche) {
        this.modelo = modelo;
        this.numeroPuertas = numeroPuertas;
        this.velocidadMax = velocidadMax;
        this.colorCoche = colorCoche;

    }

    // constructor que tiene parametros por default
    public ModeloCoche() {
        modelo = "No se ingreso el modelo";
        numeroPuertas = "No se ingreso el numero de puertas";
        velocidadMax = "No se ingreso el numero de la velocidadInicial";
        colorCoche = "No se ingreso el color";

    }

    // metodo que muestra información
    public void verInformacion() {
        System.out.println("Coche modelo: " + this.modelo);
        System.out.println("numero de puertas: " + this.numeroPuertas);
        System.out.println("velocidad máxima: " + this.velocidadMax);
        System.out.println("color: " + this.colorCoche);
    }

}

/**
 * Motocicleta
 * Los getters y setters sirven para encapsular nuestros objetos de forma que
 * los podamos poner de tipo privados pero de esta manera podemos acceder a
 * ellos desde fuera de la clase
 */
class ModeloMotocicleta {

    public ModeloMotocicleta(String modelo, String cilindrada, String velocidadMax, String velocidad,
            String colorMoto) {
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.velocidadMax = velocidadMax;
        this.velocidad = velocidad;
        this.colorMoto = colorMoto;
    }

    public ModeloMotocicleta() {
        this.modelo = "No se introdujo el dato";
        this.cilindrada = "No se introdujo el dato";
        this.velocidadMax = "No se introdujo el dato";
        this.velocidad = "No se introdujo el dato";
        this.colorMoto = "No se introdujo el dato";
    }

    private String modelo;

    // getters y setters
    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    private String cilindrada;

    // getters y setters
    public String getCilindrada() {
        return this.cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    private String velocidadMax;

    // getters y setters
    public String getVelocidadMax() {
        return this.velocidadMax;
    }

    public void setVelocidadMax(String velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    private String velocidad;

    // getters y setters
    public String getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    private String colorMoto;

    // getters y setters
    public String getColorMoto() {
        return this.colorMoto;
    }

    public void setColorMoto(String colorMoto) {
        this.colorMoto = colorMoto;
    }

}
