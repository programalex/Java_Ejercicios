/*
 * personas en a la fiesta?
 * Cuántos hombres y cuantas mujeres?
 * Promedio de edades por sexo
 * La edad de la persona más jovenes
 * No se permiten menores de edad
 * Ingresar datos hasta que se ingrese una edad igual a cero
 */
package datosfiestaejer7;

import java.util.Scanner;

/**
 *
 * @author alexander
 */
public class DatosFiestaEjer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
       int edad = 0,totalPersonas,totalMujeres,totalHombres,promEdadH,promEdadM,masJoven;
       double promM,promH ; 
       String sexo = null ;
       
       totalHombres = 0;  
       totalMujeres = 0;
       promEdadH = 0;
       promEdadM = 0;
       masJoven = 10000;
       
       System.out.println("Feliz Alma...");
       Scanner input;
       input = new Scanner(System.in);
       System.out.println("Su edad por favor");
       edad = input.nextInt();
       while (edad !=0){
        if (edad !=0 && edad>=18){
        if (edad<masJoven){
        masJoven=edad;
        }
        }   
        if (edad>=18){
        input = new Scanner(System.in);
        System.out.println("Cual es tu sexo (m) o (f):");
        sexo = input.next();
        while (!"m".equals(sexo)&& !"f".equals(sexo)){
        System.out.println("Sexo invalido");
        input = new Scanner(System.in);
        System.out.println("Cual es tu genero o sexo");
        sexo = input.next();
        }
        if("m".equals(sexo)){
        totalHombres = totalHombres + 1;
        promEdadH = promEdadH + edad;
        input = new Scanner(System.in);
        System.out.println("Cual es tu edad");
        edad = input.nextInt();
                
        }else{
        totalMujeres = totalMujeres + 1;
        promEdadM = promEdadM + edad;
        input = new Scanner(System.in);
        System.out.println("Cual es tu edad");
        edad = input.nextInt();
        }
       }else{
             System.out.println("No hay ingreso para menores de edad");
             input = new Scanner(System.in);
             System.out.println("Cual es tu edad");
             edad = input.nextInt();
               }
       }
       System.out.println("Cantidad total de personas");
       if (totalMujeres > 0){
      promM = promEdadM/totalMujeres;
       }else{
           promM = 0 ;
       }
       if (totalHombres > 0){
           promH = promEdadH/totalHombres;
       }else{
           promH = 0 ;
       }
       System.out.println("Total de personas" + (totalHombres+totalMujeres));
       System.out.println("Total mujeres"+(totalMujeres));
       System.out.println("Total hombres"+(totalHombres));
       if (promEdadM >0){
       System.out.println("Promedio de edad de las mujeres =" + promEdadM);
       }else{
           System.out.println("No hay promedio de edad claro para las mujeres");
       }
       if(promEdadH > 0){
           System.out.println("Promedio de edad de los hombres =" + promEdadH);
       }else{
           System.out.println("No hay promedio de edad claro para los hombres");
       }
       if(masJoven != 10000 && masJoven !=0){
           System.out.println("El mas joven que asistio ala fiesta tiene :"+ masJoven + "años"); 
       }else{
           System.out.println("No hay claridad de la persona mas joven");
       }
       }
       }
    
    
