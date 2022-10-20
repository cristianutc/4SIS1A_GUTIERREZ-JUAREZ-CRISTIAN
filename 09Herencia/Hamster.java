
/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Hamster extends Animal{
    //aqui deberia de venir String
    String sonido;

    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, String sonido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.sonido = sonido;
    }

    //recibir
    public String getSONIDO(){
        return sonido;
    }

    //enviar
    public void setSONIDO(String sonido){
        this.sonido = sonido;
    }

    //el metodo propio del hamster
    public void mostrarHamster(){
        System.out.println("El nombre del Hamster es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "el sonido que emiten es: " + sonido);
    }




    
}