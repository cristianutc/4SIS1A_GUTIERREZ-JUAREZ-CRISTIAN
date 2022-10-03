/*
4SIS1A_GUTIERREZ JUAREZ CRISTIAN
Deberán de realizar el programa de convolución discreta
 para ello el usuario deberá de ingresar dos matrices 
 unidimensionales de máximo 17 elementos, comprendidos 
 entre -4 a 12 el programa debe de poder repetirse y debe
  de validar las entradas de los datos 
  */
  import java.util.Scanner;
  
  public class Convolacion {
    public static void main(String args[]){
    Scanner entrada = new Scanner (System.in);
    int a1[]=new int[4];
     int a2[]=new int[4];
    int a3[]=new int[100];
    int op;
    //reflejo
    do{
        System.out.println("\n\n convolciondiscreta\n\n");
        System.out.println("señal x(n)");

        for(int i=0;i<a1.length; i++){
            System.out.println("ingrese los datos del x(n): ");
            a1[1]=entrada.nextInt();

        }
        System.out.println("el areglo esta: ");
        for(int i:a1){
            System.out.println("* elemento:"+a1[i]);
        }
        System.out.println("señal h(n");
        for(int i=0;i<a2.length; i++){
            System.out.println("ingrese los datos del señal h(n): ");
            a2[i]=entrada.nextInt();
        }
        System.out.println("el arreglo es: ");
        for(int i:a2){
            System.out.println("* elemeto: "+a2[i]);
        }
        int j=0;
        for(int i=0; i<1; i++){
            a3[0] = (a1[0]*a2[0]);
            j++;
            a3[j] = (a1[1]*a2[1]);
            j++;
            a3[2] = (a3[0]+a3[1]);
            j++;
            a3[j] = (a1[0]*a2[2]);
            j++;
            a3[j] = (a1[1]*a2[1]);
            j++;
            a3[j] = (a1[2]*a2[0]);
            j++;
            a3[0] = (a1[0]*a2[0]);
            j++;
            a3[2] = (a3[3]+a3[4]+a3[5]);
            j++;
            a3[j] = (a1[0]*a2[3]);
            j++;
            a3[j] = (a1[1]*a2[2]);
            j++;
            a3[j] = (a1[2]*a2[1]);
            j++;
            a3[j] = (a1[3]*a2[0]);
            j++;
            a3[j] = (a3[6]+a3[2]+a3[6]+a3[9]);
            
            a3[j] = (a1[1]*a2[3]);
            j++;
            a3[j] = (a1[2]*a2[2]);
            j++;
            a3[j] = (a1[3]+a3[1]);
            
            a3[4] = (a3[10]+a3[11]+a3[12]);
            
            a3[j] = (a1[2]*a2[3]);
            j++;
            a3[j] = (a1[3]*a2[2]);
            j++;

            a3[5] = (a3[13]+a3[14]);
            a3[6] = (a1[3]+a3[3]);
        }
        System.out.print("el resul, es: y(n): ");
        for(int i=0; i<6; i++){
            System.out.print(a3[i]);
            System.out.println(",");
        }
        System.out.println("repetir op");
        System.out.println("1.si o 2.no");
        System.out.println("ingrese la opcion: ");
        op = entrada.nextInt();
    }while(op !=2);

  }
}
