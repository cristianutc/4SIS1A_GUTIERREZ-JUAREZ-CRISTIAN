/*
 * 
 * vamos aver como poder hacer instancias para la
 * entrada y salida de informacion de un programa en
 * java
 */
class EntradaDeTexto{
    //metodo principal

    public static void main (String[] args){
    //estructura basica
    //declaracion de variables
    String nombre;
    //mensaje para el usuario
    System.out.println("porfavor introduce tu nombre: ");
    //ln es salto de linea
nombre = System.console().readLine();

//tenemos que concatenar los elementos

System.out.println("hola "+
nombre+"Bienvenido a la tronadera T_T");
    }

}
