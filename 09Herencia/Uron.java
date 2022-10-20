
/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Uron extends Animal{
    //aqui deberia de venir String
    String grito;

    public Uron(){

    }

    public Uron(String nombre, String raza, String tipo_alimento, int edad, String grito){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.grito = grito;
    }

    //recibir
    public String getGRITO(){
        return grito;
    }

    //enviar
    public void setGRITO(String grito){
        this.grito = grito;
    }

    //el metodo propio del uron
    public void mostrarUron(){
        System.out.println("El nombre del michi es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "el sonido que emiten es: " + grito);
    }
    
}