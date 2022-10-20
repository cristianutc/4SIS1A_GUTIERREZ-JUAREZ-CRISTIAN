
/** Para poder aplicar la herencia de una clase, se utiliza la palabra reservada 
 * 
 * extends 
 * 
 * un perro se extiende de un animal
 * animal es la clase padre
 * perro es la clase hija
 */


public class Chita extends Animal{
    //aqui deberia de venir String
    int velocidad;

    public Chita(){

    }

    public Chita(String nombre, String raza, String tipo_alimento, int edad, int velocidad){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.velocidad = velocidad;
    }

    //recibir
    public int getVELOCIDAD(){
        return velocidad;
    }

    //enviar
    public void setVELOCIDAD(int velocidad){
        this.velocidad = velocidad;
    }

    //el metodo propio del chita
    public void mostrarChita(){
        System.out.println("El nombre del chita es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + velocidad);
    }




    
}
