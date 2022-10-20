
/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Cuyo extends Animal {
    //aqui deberia de venir String
    String chillido;

    public Cuyo(){

    }

   
    public Cuyo(String nombre, String raza, String tipo_alimento, int edad, String chillido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.chillido = chillido;
    }

    //recibir
    public String getCHILLIDO(){
        return chillido;
    }

    //enviar
    public void setCHILLIDO(String chillido){
        this.chillido = chillido;
    }

    //el metodo propio del cuyo
    public void mostrarCuyo(){
        System.out.println("El nombre del cuyito es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su chillido es: " + chillido);
    }




    
}