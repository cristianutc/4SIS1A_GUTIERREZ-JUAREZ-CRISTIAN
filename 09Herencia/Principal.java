import java.util.Scanner;

public class Principal {
    private static Scanner miopcion;

    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            int op;
            do{
                Scanner miopcion = new Scanner(System.in);
    
            //hago la instancia del animal perro
            Perro dog = new Perro();
            Gato cat = new Gato();
            Hamster sonido = new Hamster();
            Conejo tipo_de_sonido = new Conejo();
            Cuyo chillido = new Cuyo();
            Uron grito = new Uron();
            Chita velocidad = new Chita();

            /*Quiero que se cree un menu mediante el cual el usuario pueda ingresar los datos de los animales:
             * 
             * 1.- Perro
             * 2.- Gato
             * 3.- Hamster
             * 4.- Conejo
             * 5.- Cuyo
             * 6.- Uron
             * 7.- Otro
             * 
             * Debera de poder ingresar cada uno de los datos y asi mismo deberan de entregar el diagrama de clases hecho en star uml aplicando la herencia correspondiente y el programa
            */
            System.out.println("Lee las opciones y escoje tu animalito ");
            System.out.println(" 1 perro ");
            System.out.println(" 2 gato ");
            System.out.println(" 3 Hamster");
            System.out.println(" 4 Conejo ");
            System.out.println(" 5 Cuyo ");
            System.out.println(" 6 Uron ");
            System.out.println(" 7 Sorpresa ");
            System.out.println("Digita tu opcion ");
            op = entrada.nextInt();

            switch(op){
                case 1:
                dog.mostrarPerro();
                break;

                case 2:
                cat.mostrarGato();
                break;

                case 3:
                sonido.mostrarHamster();
                break;

                case 4:
                tipo_de_sonido.mostrarConejo();
                break;

                case 5:
                chillido.mostrarCuyo();
                break;

                case 6:
                grito.mostrarUron();
                break;

                case 7:
                velocidad.mostrarChita();
                break;

                default:
            System.out.println(" opcion invalida elija la opciones validas del menu  ");
            break;

        }   
        System.out.println("\n\n\n¿Deseas repetir la lista de animales ?");
        System.out.println("1 si ");
        System.out.println("2 no ");
        op = miopcion.nextInt();
        

        }while(op != 2); 




            }
        }

    }
    
