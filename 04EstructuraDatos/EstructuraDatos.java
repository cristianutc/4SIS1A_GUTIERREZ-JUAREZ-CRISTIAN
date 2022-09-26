/**Vamos a crear los 14 programas dentro de un menu de seleccion de la tarea, comprendido por:
 * 1.- Bono o descuento por edad
 * 2.- Convertir numeros decimales a binarios
 * 3.- convertir temperaturas
 * 4.- Numero de positivos y negativos
 * 5.- Tienda
 * 6.- Area y Perimetro
 * 7.- Tabla
 * 8.- Factorial
 * 9.- Dibujitos
 * 10.- Figura hueca
 * 11.- Patrones
 * 12.- Diamante
 * 13.- Calculadora
 * 14.- Salir
 */

import java.net.SocketTimeoutException;
import java.util.Scanner;
import javax.swing.JOptionPane;

class EstructuraDatos {

    public static void main(String[] args){
        //objetos
        Scanner entrada = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        

        //aqui van a ir las variables
        int opcion, numbinario, total, cantidadprod, nl;
        char letra;
        float precio, resultado=0, compra=0;
        String nombreprod;
        String binario = "";
        double gradof = 0;
        double gradoc = 0;
        int op = 0;
        double factorial=1;
        int num;
        float a2,b2,c2,d2,e2;
        int edad;
        int op12;
        int op3;
        int op13; 
        int suma;
        int resta; 
        int multi; 
        int div; 
        int num1;
        int num2; 
        String nombre; 
        factorial = 1;
        int numero;
        do{
            System.out.println("Bienvenido al programa de las tareas que son para el lunes a las 7 am wiii (n_n)/");
            System.out.println("Por favor elija la opcion deseada: ");
            System.out.println("1.- Descuento por edad ");
            System.out.println("2.- Convertir numero decimal a binario ");
            System.out.println("3.- Conversiones de temperatura ");
            System.out.println("4.- Numeros Positivos y Negativos ");
            System.out.println("5.- Tienda ");
            System.out.println("6.- Area y Perimetro ");
            System.out.println("7.- Tabla ");
            System.out.println("8.- Factorial ");
            System.out.println("9.- Dibujos de codigo ");
            System.out.println("10.- Figura Hueca ");
            System.out.println("11.- Patrones de Codigo ");
            System.out.println("12.- Diamante ");
            System.out.println("13.- Calculadora ");
            System.out.println("14.- Salir ");

            //obtener la respuesta del usuario
            opcion = entrada.nextInt();

            //menu
            switch(opcion){
                case 1:
                System.out.println("ingrese su edad");
                edad = entrada.nextInt();
                if (edad>60){
                    System.out.println("edad: "+edad);
                    System.out.println("su descuento es de 50%");
                }
                    if(edad<21){
                        System.out.println("edad: "+edad);
                        System.out.println("eres mayor de edad:");
                        System.out.println("1 si");
                        System.out.println("2 no");
                        System.out.println("elige la opcion: ");
                        op3 = entrada.nextInt();
                        switch(op3){
                            case 1:
                            System.out.println("el descuento es de: 50%");
                            break;
                            case 2:
                            System.out.println("el descuento es de: 25%");
                            break;
                            default :
                            System.out.println("no valida la respuesta");
                            break;
                        }

                    }
                
                    break;
                case 2:
                    //convertir numero a binario
                    System.out.println("Ingrese un numero positivo entero que desee convertir a binario");
                    numbinario = entrada.nextInt();

                    //tenemos que saber si es positivo
                    if(numbinario > 0){
                        //realizar el algotimo con el mod 2 
                        while(numbinario > 0){
                            if(numbinario%2 == 0){
                                binario ="0" + binario;
                            }else{
                                binario ="1" + binario;
                            }
                            numbinario = (int)numbinario/2;
                        }
                    }else if(numbinario == 0){
                        binario = "0";
                    }else{
                        binario = "No se pudo convertir el numero, ingrese solo positivos";
                    }
                    System.out.println("El numero convertido a binario es: " + binario);
                    break;
                case 3:
                  //convertir temperaturas
                  System.out.println("ecribe 1 si quieres pasar de °c a °f o escribe 2 si quieres pasar de °f a °c");
                  Scanner scanner = new Scanner(System.in);
                  op = scanner.nextInt();
 
                  if(op == 1){
 
                     System.out.println("cuantos °c quieres convertir a °f: ");
                     gradoc = scanner.nextDouble();
                     gradof = (gradoc*9/5)+ 32;
                     System.out.println(gradoc + "°c equivale a" + gradof + "°f");
                     }else if(op == 2){
                     System.out.println("cuantos °f quieres convertir a °c: ");
                     gradof = scanner.nextDouble();
                     gradoc = ((gradof -32)*5/9);
                     System.out.println(gradof + " °f equivale a" + gradoc + "°c");
                     break;
                  }
 
                {
                  }
               
                case 4:
                  //numeros positivos y negativos
                  System.out.println("ingrese 5 numeros diferentes:");
                  a2 = entrada.nextFloat();
                  b2 = entrada.nextFloat();
                  c2 = entrada.nextFloat();
                  d2 = entrada.nextFloat();
                  e2 = entrada.nextFloat();
                  if(a2 > 0){
                    System.out.println("el numero"+ a2 +"es positivo");
                }
                else{
                    System.out.println("el numero"+ a2 +"es negativo");
                }
                if(b2 > 0){
                    System.out.println("el numero"+ b2 +"es positivo");
                }
                else{
                    System.out.println("el numero"+ b2 +"es negativo");
                }
                if(c2 > 0){
                    System.out.println("el numero"+ c2 +"es positivo");
                }
                else{
                    System.out.println("el numero"+ c2 +"es negativo");
                }
                if(d2 > 0){
                    System.out.println("el numero"+ d2 +"es positivo");
                }
                else{
                    System.out.println("el numero"+ d2 +"es negativo");
                }
                if(e2 > 0){
                    System.out.println("el numero"+ e2 +"es positivo");
                }
                else{
                    System.out.println("el numero"+ e2 +"es negativo");
                }
                break;

                case 5:
                System.out.println("Bienvenido a la Tiendita Kawaii");
                System.out.println("Por favor Ingrese ¿cuantos elementos va a comprar?");
                total = entrada.nextInt();

                for(int i = 1; i <= total; i++){
                    System.out.println("Ingresa el nombre del producto");
                    nombreprod = entrada.next();
                    System.out.println("Ingresa el nombre el precio");
                    precio = entrada.nextFloat();
                    System.out.println("Ingresa la cantidad");
                    cantidadprod = entrada.nextInt();
                    resultado = precio * cantidadprod;
                    compra = compra + resultado;
                }
                
                System.out.println("El resultado de la compra es: " + compra);

                    break;
                case 6:
                //area y perimetro
                Scanner sc=new Scanner(System.in);
                System.out.println("ingrese la base: ");
                double b=sc.nextDouble();
                System.out.println("ingrese la altura: ");
                double h=sc.nextDouble();
                double perimetro = b*2 + h*2;
                System.out.println("el perimetro es: "+ perimetro);
                double  area=b*h;
                System.out.println("el area es: "+ area);
                    break;
                case 7:
                    for(int n = 1; n<=10; n++){
                        System.out.println(n + " " +(n*10) + " " + (n*100) + " " +(n*1000) );
                    }
                    break;
                case 8:
                System.out.println("\n\nIngrese un numero positivo que desea factorial");
                numero = entrada.nextInt();
                if(numero>0){
                while(numero != 0){

                    factorial=factorial*numero;
                    numero --;
                }
                System.out.println("El factorial del numero es : " + factorial);
                }else{
                System.out.println("ingrese un numero positivo");
                }
                break;
                 
                case 9:
                 System.out.println("Cuadrado magico kawaii");
                 System.out.println("Ingrese el tamaño del cuadrado");
                 nl = entrada.nextInt();

                 if(nl >= 1 && nl <=20){
                    //que lo imprima
                    for(int i = 1; i <= nl; i++ ){
                        //imprimir filas
                        for(int j = 1; j <= nl; j++){
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                }else{
                    System.out.println("Ingrese solo numeros entre el 1 y 20");
                }
                    break;
                    case 10:
                    do{
                        System.out.println("\n\n");
                        System.out.println("\t\tfigura hueca\n\n");
                        System.out.println("\t\t********************");
                        System.out.println("\t\t**                **");
                        System.out.println("\t\t**                **");
                        System.out.println("\t\t*                  *");
                        System.out.println("\t\t********************");
                        System.out.println("deseas hacer otravez el hueco");
                        System.out.println("1 si");
                        System.out.println("2 no");
                        op13 = entrada.nextInt();

                    }while(op13 != 2);
                    break;
                    case 11:
                    System.out.println("patron sorpresa");
                    System.out.println("1 si");
                    System.out.println("2 no");
                    op13 = entrada.nextInt();
                    switch(op13){
                        case 1:
                        System.out.println("\n**********\n**********\n**********\n**********\n");
                        break;
                        case 2:
                        System.out.println("listo");
                        break;
                        default:
                        System.out.println("opcion invalida");
                        break;

                    }
                         break;
                         case 12:
                         System.out.println("\n\n");
                for (int i = 1; i<=1 ; i++){
                    System.out.println("\t   *** ");//3
                    for(int j=1 ; j<= 1 ; j++){
                        System.out.println("\t  *****");//5
                        for(int y=1; y<=1; y++ ){
                          System.out.println("\t *******");
                          for( int a = 1; a<=1 ; a++){
                            System.out.println("\t*********");
                          }
                          System.out.println("\t *******");   
                        }
                        System.out.println("\t  *****");
                    }
                    for(int x = 1; x <= 1 ; x++){
                        System.out.println("\t  *****");
                    }
                    System.out.println("\t   ***");
                    for(int z=1 ; z<=1; z++){
                        System.out.println("\t    *");
                    } 
                }

                break;
                case 13:
                nombre = JOptionPane.showInputDialog("Ingresa tu nombre "); 
            JOptionPane.showMessageDialog(null,"Hola " + nombre);
            op12 = Integer.parseInt(JOptionPane.showInputDialog("Lee las opciones y escoje la de tu agrado : \n 1 suma \n 2 resta \n 3 multiplicacion \n 4 divicion \n Digita tu opcion : ")); 
            switch(op12){
                case 1 :
                JOptionPane.showMessageDialog(null , "Hola"+ nombre);
                num1 = Integer.parseInt(JOptionPane.showInputDialog( "Ingresa un numero para sumar : ")); 
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa el segundo numero a sumar ")); 
                suma = (num1 + num2); 
                JOptionPane.showMessageDialog(null,"El resultado de la suma es : "+suma );
                break; 
                case 2:
                JOptionPane.showMessageDialog(null,"Hola "+ nombre); 
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero :"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero : ")); 
                resta = num1 - num2; 
                JOptionPane.showMessageDialog(null,"La resultado de la resta es : "+ resta);   
                break; 
                case 3 :
                JOptionPane.showMessageDialog(null, "Hola "+ nombre); 
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero : ")); 
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero : ")); 
                multi = num1 * num2; 
                JOptionPane.showMessageDialog(null,"El resultado de la multiplicacion es : " + multi);  
                break; 
                case 4:
                JOptionPane.showMessageDialog(null , " hola " + nombre ); 
                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero ")); 
                num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa un numero ")); 
                div = num1 / num2; 
                JOptionPane.showMessageDialog(null,"El resultado de la divicion es "+div); 
                break; 
                default:
                JOptionPane.showMessageDialog(null,"opcion invalida"); 
                break; 
            }

                break;
            }

            System.out.println("Deseas repetir el programa, escribe s para si");
            letra = entrada.next().charAt(0);



        }while(letra == 's' || letra == 'S' );

    }
    
}