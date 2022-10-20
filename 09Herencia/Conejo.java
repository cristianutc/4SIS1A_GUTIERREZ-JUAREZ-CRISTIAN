
/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Conejo extends Animal{
    //aqui deberia de venir String
    String tipo_de_sonido;

    public Conejo (){

    }

    public Conejo (String nombre, String raza, String tipo_alimento, int edad, String tipo_de_sonido){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.tipo_de_sonido = tipo_de_sonido;
    }

    //recibir
    public String getTIPO_DE_SONIDO(){
        return tipo_de_sonido;
    }

    //enviar
    public void setTIPO_DE_SONIDO(String tipo_de_sonido){
        this.tipo_de_sonido = tipo_de_sonido;
    }

    //el metodo propio del conejo
    public void mostrarConejo(){
        System.out.println("El nombre del conejito es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "Su sonido que emite es: " + tipo_de_sonido);
    }




    
}