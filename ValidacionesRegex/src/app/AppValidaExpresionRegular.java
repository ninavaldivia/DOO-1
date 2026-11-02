/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Scanner;
import model.ExpresionRegular;

/**
 *
 * @author nina
 */
public class AppValidaExpresionRegular {
    public static void main(String[] args){
        String texto;
        String patron;
        Scanner sc= new Scanner(System.in);
        String respPatron;
        String respTexto;
       
        System.out.print("Desea probar ejemplos de patrones? (s/n): ");      
        respPatron= sc.nextLine();

        while (respPatron.toUpperCase().equals("S")){

            System.out.print("Ingrese patrón o Regex:  ");
            patron= sc.nextLine();

            ExpresionRegular er= new ExpresionRegular(patron);
        
            System.out.print("\tDesea probar ejemplos de textos para el patrón? (s/n): ");      
            respTexto= sc.nextLine();

            while(respTexto.toUpperCase().equals("S")){
                System.out.print("\tIngrese texto a validar con el patrón "+ patron+": ");
                texto=sc.nextLine();
                
                if (er.esValido(texto)){
                    System.out.println("\t --> "+texto +" ES valido acorde al patrón "+ er.getPatron());
                }
                else{
                    System.out.println("\t --> "+texto + " No cumple con la regla de validación según en patrón: "+ er.getPatron());
                }
                System.out.print("\tDesea probar más ejemplos con este patrón? (s/n): ");
                respTexto= sc.next();
                sc.nextLine();
            }
        
            System.out.print("Desea probar otros ejemplos de patrones? (s/n): ");      
            respPatron= sc.nextLine();
        }
    }
}
